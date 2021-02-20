package typings.reactMedia

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.Partial
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-media", JSImport.Default)
  @js.native
  def default(props: SingleQueryProps): ReactElement = js.native
  @JSImport("react-media", JSImport.Default)
  @js.native
  def default[Q](props: MultiQueryProps[Q]): ReactElement = js.native
  
  @js.native
  trait BaseProps extends StObject {
    
    var render: js.UndefOr[js.Function0[ReactNode]] = js.native
    
    var targetWindow: js.UndefOr[Window] = js.native
  }
  object BaseProps {
    
    @scala.inline
    def apply(): BaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseProps]
    }
    
    @scala.inline
    implicit class BasePropsMutableBuilder[Self <: BaseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRender(value: () => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setTargetWindow(value: Window): Self = StObject.set(x, "targetWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetWindowUndefined: Self = StObject.set(x, "targetWindow", js.undefined)
    }
  }
  
  /**
    * The type of the `queries` prop
    */
  type MediaQueries = StringDictionary[MediaQueryValue]
  
  type MediaQueryObject = StringDictionary[Boolean | Double | String]
  
  /**
    * All allowed forms of media query inputs
    */
  type MediaQueryValue = String | MediaQueryObject | js.Array[MediaQueryObject]
  
  /* Inlined react-media.react-media.BaseProps & {  queries :Queries,   defaultMatches :std.Partial<react-media.react-media.QueryResults<Queries>> | undefined,   children :(matches : react-media.react-media.QueryResults<Queries>): react.react.ReactNode | react.react.ReactNode | undefined,   onChange :(matches : react-media.react-media.QueryResults<Queries>): void | undefined} */
  @js.native
  trait MultiQueryProps[Queries] extends StObject {
    
    var children: js.UndefOr[(js.Function1[/* matches */ QueryResults[Queries], ReactNode]) | ReactNode] = js.native
    
    var defaultMatches: js.UndefOr[Partial[QueryResults[Queries]]] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* matches */ QueryResults[Queries], Unit]] = js.native
    
    var queries: Queries = js.native
    
    var render: js.UndefOr[js.Function0[ReactNode]] = js.native
    
    var targetWindow: js.UndefOr[Window] = js.native
  }
  object MultiQueryProps {
    
    @scala.inline
    def apply[Queries](queries: Queries): MultiQueryProps[Queries] = {
      val __obj = js.Dynamic.literal(queries = queries.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiQueryProps[Queries]]
    }
    
    @scala.inline
    implicit class MultiQueryPropsMutableBuilder[Self <: MultiQueryProps[_], Queries] (val x: Self with MultiQueryProps[Queries]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: (js.Function1[/* matches */ QueryResults[Queries], ReactNode]) | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction1(value: /* matches */ QueryResults[Queries] => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDefaultMatches(value: Partial[QueryResults[Queries]]): Self = StObject.set(x, "defaultMatches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultMatchesUndefined: Self = StObject.set(x, "defaultMatches", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* matches */ QueryResults[Queries] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setQueries(value: Queries): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRender(value: () => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setTargetWindow(value: Window): Self = StObject.set(x, "targetWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetWindowUndefined: Self = StObject.set(x, "targetWindow", js.undefined)
    }
  }
  
  /**
    * The type of returned `matches` in case the `queries` prop is provided. The keys on `matches`
    * are inferred from the shape of `queries`.
    *
    * @example
    *
    * <Media queries={{ small: '...', medium: '...' }}>{
    *   // matches: { small: boolean, medium: boolean }
    *   matches => {}
    * }</Media>
    */
  type QueryResults[Queries] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof Queries ]: boolean}
    */ typings.reactMedia.reactMediaStrings.QueryResults with TopLevel[js.Any]
  
  /* Inlined react-media.react-media.BaseProps & {  query :react-media.react-media.MediaQueryValue,   defaultMatches :boolean | undefined,   children :(matches : boolean): react.react.ReactNode | react.react.ReactNode | undefined,   onChange :(matches : boolean): void | undefined} */
  @js.native
  trait SingleQueryProps extends StObject {
    
    var children: js.UndefOr[(js.Function1[/* matches */ Boolean, ReactNode]) | ReactNode] = js.native
    
    var defaultMatches: js.UndefOr[Boolean] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* matches */ Boolean, Unit]] = js.native
    
    var query: MediaQueryValue = js.native
    
    var render: js.UndefOr[js.Function0[ReactNode]] = js.native
    
    var targetWindow: js.UndefOr[Window] = js.native
  }
  object SingleQueryProps {
    
    @scala.inline
    def apply(query: MediaQueryValue): SingleQueryProps = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[SingleQueryProps]
    }
    
    @scala.inline
    implicit class SingleQueryPropsMutableBuilder[Self <: SingleQueryProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: (js.Function1[/* matches */ Boolean, ReactNode]) | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction1(value: /* matches */ Boolean => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDefaultMatches(value: Boolean): Self = StObject.set(x, "defaultMatches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultMatchesUndefined: Self = StObject.set(x, "defaultMatches", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* matches */ Boolean => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setQuery(value: MediaQueryValue): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryVarargs(value: MediaQueryObject*): Self = StObject.set(x, "query", js.Array(value :_*))
      
      @scala.inline
      def setRender(value: () => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setTargetWindow(value: Window): Self = StObject.set(x, "targetWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetWindowUndefined: Self = StObject.set(x, "targetWindow", js.undefined)
    }
  }
}
