package typings.reactLoadable

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.reactLoadable.anon.Default
import typings.reactLoadable.reactLoadableBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LoadableExport {
  
  @js.native
  trait CommonOptions extends StObject {
    
    /**
      * Defaults to 200, in milliseconds.
      *
      * Only show the loading component if the loader() has taken this long to succeed or error.
      */
    var delay: js.UndefOr[Double | `false` | Null] = js.native
    
    /**
      * React component displayed after delay until loader() succeeds. Also responsible for displaying errors.
      *
      * If you don't want to render anything you can pass a function that returns null
      * (this is considered a valid React component).
      */
    var loading: ComponentType[LoadingComponentProps] = js.native
    
    /**
      * Optional array of module paths that `Loadable.Capture`'s `report` function will be applied on during
      * server-side rendering. This helps the server know which modules were imported/used during SSR.
      * ```ts
      * Loadable({
      *   loader: () => import('./my-component'),
      *   modules: ['./my-component'],
      * });
      * ```
      */
    var modules: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Disabled by default.
      *
      * After the specified time in milliseconds passes, the component's `timedOut` prop will be set to true.
      */
    var timeout: js.UndefOr[Double | `false` | Null] = js.native
    
    /**
      * An optional function which returns an array of Webpack module ids which you can get
      * with require.resolveWeak. This is used by the client (inside `Loadable.preloadReady`) to
      * guarantee each webpack module is preloaded before the first client render.
      * ```ts
      * Loadable({
      *  loader: () => import('./Foo'),
      *  webpack: () => [require.resolveWeak('./Foo')],
      * });
      * ```
      */
    var webpack: js.UndefOr[js.Function0[js.Array[String | Double]]] = js.native
  }
  object CommonOptions {
    
    @scala.inline
    def apply(loading: ComponentType[LoadingComponentProps]): CommonOptions = {
      val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonOptions]
    }
    
    @scala.inline
    implicit class CommonOptionsMutableBuilder[Self <: CommonOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay(value: Double | `false`): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayNull: Self = StObject.set(x, "delay", null)
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setLoading(value: ComponentType[LoadingComponentProps]): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModules(value: js.Array[String]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      @scala.inline
      def setModulesVarargs(value: String*): Self = StObject.set(x, "modules", js.Array(value :_*))
      
      @scala.inline
      def setTimeout(value: Double | `false`): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutNull: Self = StObject.set(x, "timeout", null)
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setWebpack(value: () => js.Array[String | Double]): Self = StObject.set(x, "webpack", js.Any.fromFunction0(value))
      
      @scala.inline
      def setWebpackUndefined: Self = StObject.set(x, "webpack", js.undefined)
    }
  }
  
  @js.native
  trait Loadable extends StObject {
    
    def apply[Props, Exports /* <: js.Object */](options: Options[Props, Exports]): ComponentType[Props] with LoadableComponent = js.native
    
    var Capture: ComponentType[LoadableCaptureProps] = js.native
    
    def Map[Props, Exports /* <: StringDictionary[js.Any] */](options: OptionsWithMap[Props, Exports]): ComponentType[Props] with LoadableComponent = js.native
    
    /**
      * This will call all of the LoadableComponent.preload methods recursively until they are all
      * resolved. Allowing you to preload all of your dynamic modules in environments like the server.
      * ```ts
      * Loadable.preloadAll().then(() => {
      *   app.listen(3000, () => {
      *     console.log('Running on http://localhost:3000/');
      *   });
      * });
      * ```
      */
    def preloadAll(): js.Promise[Unit] = js.native
    
    /**
      * Check for modules that are already loaded in the browser and call the matching
      * `LoadableComponent.preload` methods.
      * ```ts
      * window.main = () => {
      *   Loadable.preloadReady().then(() => {
      *     ReactDOM.hydrate(
      *       <App/>,
      *       document.getElementById('app'),
      *     );
      *   });
      * };
      * ```
      */
    def preloadReady(): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait LoadableCaptureProps extends StObject {
    
    /**
      * Function called for every moduleName that is rendered via React Loadable.
      */
    def report(moduleName: String): Unit = js.native
  }
  object LoadableCaptureProps {
    
    @scala.inline
    def apply(report: String => Unit): LoadableCaptureProps = {
      val __obj = js.Dynamic.literal(report = js.Any.fromFunction1(report))
      __obj.asInstanceOf[LoadableCaptureProps]
    }
    
    @scala.inline
    implicit class LoadableCapturePropsMutableBuilder[Self <: LoadableCaptureProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReport(value: String => Unit): Self = StObject.set(x, "report", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait LoadableComponent extends StObject {
    
    /**
      * The generated component has a static method preload() for calling the loader function ahead of time.
      * This is useful for scenarios where you think the user might do something next and want to load the
      * next component eagerly.
      *
      * Note: preload() intentionally does not return a promise. You should not be depending on the timing of
      * preload(). It's meant as a performance optimization, not for creating UI logic.
      */
    def preload(): Unit = js.native
  }
  object LoadableComponent {
    
    @scala.inline
    def apply(preload: () => Unit): LoadableComponent = {
      val __obj = js.Dynamic.literal(preload = js.Any.fromFunction0(preload))
      __obj.asInstanceOf[LoadableComponent]
    }
    
    @scala.inline
    implicit class LoadableComponentMutableBuilder[Self <: LoadableComponent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPreload(value: () => Unit): Self = StObject.set(x, "preload", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait LoadingComponentProps extends StObject {
    
    var error: js.Any = js.native
    
    var isLoading: Boolean = js.native
    
    var pastDelay: Boolean = js.native
    
    def retry(): Unit = js.native
    
    var timedOut: Boolean = js.native
  }
  object LoadingComponentProps {
    
    @scala.inline
    def apply(error: js.Any, isLoading: Boolean, pastDelay: Boolean, retry: () => Unit, timedOut: Boolean): LoadingComponentProps = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any], pastDelay = pastDelay.asInstanceOf[js.Any], retry = js.Any.fromFunction0(retry), timedOut = timedOut.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadingComponentProps]
    }
    
    @scala.inline
    implicit class LoadingComponentPropsMutableBuilder[Self <: LoadingComponentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPastDelay(value: Boolean): Self = StObject.set(x, "pastDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetry(value: () => Unit): Self = StObject.set(x, "retry", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTimedOut(value: Boolean): Self = StObject.set(x, "timedOut", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactLoadable.LoadableExport.OptionsWithoutRender[Props]
    - typings.reactLoadable.LoadableExport.OptionsWithRender[Props, Exports]
  */
  trait Options[Props, Exports /* <: js.Object */] extends StObject
  object Options {
    
    @scala.inline
    def OptionsWithRender[Props, Exports /* <: js.Object */](
      loader: () => js.Promise[Exports],
      loading: ComponentType[LoadingComponentProps],
      render: (Exports, Props) => ReactNode
    ): typings.reactLoadable.LoadableExport.OptionsWithRender[Props, Exports] = {
      val __obj = js.Dynamic.literal(loader = js.Any.fromFunction0(loader), loading = loading.asInstanceOf[js.Any], render = js.Any.fromFunction2(render))
      __obj.asInstanceOf[typings.reactLoadable.LoadableExport.OptionsWithRender[Props, Exports]]
    }
    
    @scala.inline
    def OptionsWithoutRender[Props](
      loader: () => js.Promise[ComponentType[Props] | Default[Props]],
      loading: ComponentType[LoadingComponentProps]
    ): typings.reactLoadable.LoadableExport.OptionsWithoutRender[Props] = {
      val __obj = js.Dynamic.literal(loader = js.Any.fromFunction0(loader), loading = loading.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactLoadable.LoadableExport.OptionsWithoutRender[Props]]
    }
  }
  
  @js.native
  trait OptionsWithMap[Props, Exports /* <: StringDictionary[js.Any] */] extends CommonOptions {
    
    /**
      * An object containing functions which return promises, which resolve to an object to be passed to `render` on success.
      */
    var loader: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof Exports ]: (): std.Promise<Exports[P]>}
      */ typings.reactLoadable.reactLoadableStrings.OptionsWithMap with TopLevel[Exports] = js.native
    
    /**
      * If you want to customize what gets rendered from your loader you can also pass `render`.
      *
      * Note: If you want to load multiple resources at once, you can also use `Loadable.Map`.
      *
      * ```ts
      * Loadable({
      *     // ...
      *     render(loaded, props) {
      *         const Component = loaded.default;
      *         return <Component {...props} />
      *     }
      * });
      * ```
      */
    def render(loaded: Exports, props: Props): ReactNode = js.native
  }
  object OptionsWithMap {
    
    @scala.inline
    def apply[Props, Exports /* <: StringDictionary[js.Any] */](
      loader: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof Exports ]: (): std.Promise<Exports[P]>}
      */ typings.reactLoadable.reactLoadableStrings.OptionsWithMap with TopLevel[Exports],
      loading: ComponentType[LoadingComponentProps],
      render: (Exports, Props) => ReactNode
    ): OptionsWithMap[Props, Exports] = {
      val __obj = js.Dynamic.literal(loader = loader.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], render = js.Any.fromFunction2(render))
      __obj.asInstanceOf[OptionsWithMap[Props, Exports]]
    }
    
    @scala.inline
    implicit class OptionsWithMapMutableBuilder[Self <: OptionsWithMap[_, _], Props, Exports /* <: StringDictionary[js.Any] */] (val x: Self with (OptionsWithMap[Props, Exports])) extends AnyVal {
      
      @scala.inline
      def setLoader(
        value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ P in keyof Exports ]: (): std.Promise<Exports[P]>}
        */ typings.reactLoadable.reactLoadableStrings.OptionsWithMap with TopLevel[Exports]
      ): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRender(value: (Exports, Props) => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait OptionsWithRender[Props, Exports /* <: js.Object */]
    extends CommonOptions
       with Options[Props, Exports] {
    
    /**
      * Function returning a promise which returns an object to be passed to `render` on success.
      */
    def loader(): js.Promise[Exports] = js.native
    
    /**
      * If you want to customize what gets rendered from your loader you can also pass `render`.
      *
      * Note: If you want to load multiple resources at once, you can also use `Loadable.Map`.
      *
      * ```ts
      * Loadable({
      *     // ...
      *     render(loaded, props) {
      *         const Component = loaded.default;
      *         return <Component {...props} />
      *     }
      * });
      * ```
      */
    def render(loaded: Exports, props: Props): ReactNode = js.native
  }
  object OptionsWithRender {
    
    @scala.inline
    def apply[Props, Exports /* <: js.Object */](
      loader: () => js.Promise[Exports],
      loading: ComponentType[LoadingComponentProps],
      render: (Exports, Props) => ReactNode
    ): OptionsWithRender[Props, Exports] = {
      val __obj = js.Dynamic.literal(loader = js.Any.fromFunction0(loader), loading = loading.asInstanceOf[js.Any], render = js.Any.fromFunction2(render))
      __obj.asInstanceOf[OptionsWithRender[Props, Exports]]
    }
    
    @scala.inline
    implicit class OptionsWithRenderMutableBuilder[Self <: OptionsWithRender[_, _], Props, Exports /* <: js.Object */] (val x: Self with (OptionsWithRender[Props, Exports])) extends AnyVal {
      
      @scala.inline
      def setLoader(value: () => js.Promise[Exports]): Self = StObject.set(x, "loader", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRender(value: (Exports, Props) => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait OptionsWithoutRender[Props]
    extends CommonOptions
       with Options[Props, js.Any] {
    
    /**
      * Function returning a promise which returns a React component displayed on success.
      *
      * Resulting React component receives all the props passed to the generated component.
      */
    def loader(): js.Promise[ComponentType[Props] | Default[Props]] = js.native
  }
  object OptionsWithoutRender {
    
    @scala.inline
    def apply[Props](
      loader: () => js.Promise[ComponentType[Props] | Default[Props]],
      loading: ComponentType[LoadingComponentProps]
    ): OptionsWithoutRender[Props] = {
      val __obj = js.Dynamic.literal(loader = js.Any.fromFunction0(loader), loading = loading.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsWithoutRender[Props]]
    }
    
    @scala.inline
    implicit class OptionsWithoutRenderMutableBuilder[Self <: OptionsWithoutRender[_], Props] (val x: Self with OptionsWithoutRender[Props]) extends AnyVal {
      
      @scala.inline
      def setLoader(value: () => js.Promise[ComponentType[Props] | Default[Props]]): Self = StObject.set(x, "loader", js.Any.fromFunction0(value))
    }
  }
}
