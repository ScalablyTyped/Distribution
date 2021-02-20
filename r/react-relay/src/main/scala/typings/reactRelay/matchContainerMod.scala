package typings.reactRelay

import typings.react.mod.ComponentType
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matchContainerMod {
  
  @JSImport("react-relay/lib/relay-experimental/MatchContainer", "MatchContainer")
  @js.native
  def MatchContainer[TProps, TFallback](props: MatchContainerProps[TProps, TFallback]): ElementType[TProps] | TFallback | Null = js.native
  
  /* Inlined std.Readonly<{  fallback :TFallback | null | undefined, loader (module : unknown): react.react.ComponentType<TProps>,   match :react-relay.react-relay/lib/relay-experimental/MatchContainer.MatchPointer | react-relay.react-relay/lib/relay-experimental/MatchContainer.TypenameOnlyPointer | null | undefined,   props :TProps | undefined}> */
  @js.native
  trait MatchContainerProps[TProps, TFallback] extends StObject {
    
    val fallback: js.UndefOr[TFallback | Null] = js.native
    
    val loader: js.Function1[/* module */ js.Any, ComponentType[TProps]] = js.native
    
    val `match`: js.UndefOr[MatchPointer | TypenameOnlyPointer | Null] = js.native
    
    val props: js.UndefOr[TProps] = js.native
  }
  object MatchContainerProps {
    
    @scala.inline
    def apply[TProps, TFallback](loader: /* module */ js.Any => ComponentType[TProps]): MatchContainerProps[TProps, TFallback] = {
      val __obj = js.Dynamic.literal(loader = js.Any.fromFunction1(loader))
      __obj.asInstanceOf[MatchContainerProps[TProps, TFallback]]
    }
    
    @scala.inline
    implicit class MatchContainerPropsMutableBuilder[Self <: MatchContainerProps[_, _], TProps, TFallback] (val x: Self with (MatchContainerProps[TProps, TFallback])) extends AnyVal {
      
      @scala.inline
      def setFallback(value: TFallback): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackNull: Self = StObject.set(x, "fallback", null)
      
      @scala.inline
      def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      @scala.inline
      def setLoader(value: /* module */ js.Any => ComponentType[TProps]): Self = StObject.set(x, "loader", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMatch(value: MatchPointer | TypenameOnlyPointer): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchNull: Self = StObject.set(x, "match", null)
      
      @scala.inline
      def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      @scala.inline
      def setProps(value: TProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<{  __fragmentPropName :string | null | undefined,   __module_component :unknown | undefined,    $fragmentRefs :unknown}> */
  @js.native
  trait MatchPointer extends StObject {
    
    @JSName(" $fragmentRefs")
    val Space$fragmentRefs: js.Any = js.native
    
    val __fragmentPropName: js.UndefOr[String | Null] = js.native
    
    val __module_component: js.UndefOr[js.Any] = js.native
  }
  object MatchPointer {
    
    @scala.inline
    def apply(Space$fragmentRefs: js.Any): MatchPointer = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic(" $fragmentRefs")(Space$fragmentRefs.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatchPointer]
    }
    
    @scala.inline
    implicit class MatchPointerMutableBuilder[Self <: MatchPointer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSpace$fragmentRefs(value: js.Any): Self = StObject.set(x, " $fragmentRefs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set__fragmentPropName(value: String): Self = StObject.set(x, "__fragmentPropName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set__fragmentPropNameNull: Self = StObject.set(x, "__fragmentPropName", null)
      
      @scala.inline
      def set__fragmentPropNameUndefined: Self = StObject.set(x, "__fragmentPropName", js.undefined)
      
      @scala.inline
      def set__module_component(value: js.Any): Self = StObject.set(x, "__module_component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set__module_componentUndefined: Self = StObject.set(x, "__module_component", js.undefined)
    }
  }
  
  /**
    * Renders the results of a data-driven dependency fetched with the `@match`
    * directive. The `@match` directive can be used to specify a mapping of
    * result types to the containers used to render those types. The result
    * value is an opaque object that described which component was selected
    * and a reference to its data. Use <MatchContainer/> to render these
    * values.
    *
    * ## Example
    *
    * For example, consider a piece of media content that might be text or
    * an image, where for clients that don't support images the application
    * should fall back to rendering the image caption as text. @match can be
    * used to dynamically select whether to render a given media item as
    * an image or text (on the server) and then fetch the corresponding
    * React component and its data dependencies (information about the
    * image or about the text).
    *
    * ```
    * // Media.react.js
    *
    * // Define a React component that uses <MatchContainer /> to render the
    * // results of a @module selection
    * function Media(props) {
    *   const {media, ...restProps} = props;
    *
    *   const loader = moduleReference => {
    *      // given the data returned by your server for the @module directive,
    *      // return the React component (or throw a Suspense promise if
    *      // it is loading asynchronously).
    *      todo_returnModuleOrThrowPromise(moduleReference);
    *   };
    *   return <MatchContainer
    *     loader={loader}
    *     match={media.mediaAttachment}
    *     props={restProps}
    *   />;
    * }
    *
    * module.exports = createSuspenseFragmentContainer(
    *   Media,
    *   {
    *     media: graphql`
    *       fragment Media_media on Media {
    *         # ...
    *         mediaAttachment @match {
    *            ...ImageContainer_image @module(name: "ImageContainer.react")
    *            ...TextContainer_text @module(name: "TextContainer.react")
    *         }
    *       }
    *     `
    *   },
    * );
    * ```
    *
    * ## API
    *
    * MatchContainer accepts the following props:
    * - `match`: The results (an opaque object) of a `@match` field.
    * - `props`: Props that should be passed through to the dynamically
    *   selected component. Note that any of the components listed in
    *   `@module()` could be selected, so all components should accept
    *   the value passed here.
    * - `loader`: A function to load a module given a reference (whatever
    *   your server returns for the `js(moduleName: String)` field).
    *
    */
  /* Inlined std.Readonly<{  __typename :string}> */
  @js.native
  trait TypenameOnlyPointer extends StObject {
    
    val __typename: String = js.native
  }
  object TypenameOnlyPointer {
    
    @scala.inline
    def apply(__typename: String): TypenameOnlyPointer = {
      val __obj = js.Dynamic.literal(__typename = __typename.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypenameOnlyPointer]
    }
    
    @scala.inline
    implicit class TypenameOnlyPointerMutableBuilder[Self <: TypenameOnlyPointer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set__typename(value: String): Self = StObject.set(x, "__typename", value.asInstanceOf[js.Any])
    }
  }
}
