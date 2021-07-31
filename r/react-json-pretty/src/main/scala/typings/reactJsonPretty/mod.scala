package typings.reactJsonPretty

import org.scalablytyped.runtime.StringDictionary
import typings.propTypes.mod.Requireable
import typings.react.mod.Component
import typings.react.mod.HTMLAttributes
import typings.std.Error
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-json-pretty", JSImport.Namespace)
  @js.native
  class ^ () extends JSONPretty
  
  /* static member */
  object defaultProps {
    
    @JSImport("react-json-pretty", "defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-json-pretty", "defaultProps.data")
    @js.native
    def data: String = js.native
    @scala.inline
    def data_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("data")(x.asInstanceOf[js.Any])
    
    @JSImport("react-json-pretty", "defaultProps.json")
    @js.native
    def json: String = js.native
    @scala.inline
    def json_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("json")(x.asInstanceOf[js.Any])
    
    @JSImport("react-json-pretty", "defaultProps.silent")
    @js.native
    def silent: Boolean = js.native
    @scala.inline
    def silent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("silent")(x.asInstanceOf[js.Any])
    
    @JSImport("react-json-pretty", "defaultProps.space")
    @js.native
    def space: Double = js.native
    @scala.inline
    def space_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("space")(x.asInstanceOf[js.Any])
    
    @JSImport("react-json-pretty", "defaultProps.themeClassName")
    @js.native
    def themeClassName: String = js.native
    @scala.inline
    def themeClassName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("themeClassName")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  object propTypes {
    
    @JSImport("react-json-pretty", "propTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-json-pretty", "propTypes.data")
    @js.native
    def data: Requireable[js.Any] = js.native
    @scala.inline
    def data_=(x: Requireable[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("data")(x.asInstanceOf[js.Any])
    
    @JSImport("react-json-pretty", "propTypes.json")
    @js.native
    def json: Requireable[js.Any] = js.native
    @scala.inline
    def json_=(x: Requireable[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("json")(x.asInstanceOf[js.Any])
    
    @JSImport("react-json-pretty", "propTypes.onJSONPrettyError")
    @js.native
    def onJSONPrettyError: Requireable[js.Function1[/* repeated */ js.Any, js.Any]] = js.native
    @scala.inline
    def onJSONPrettyError_=(x: Requireable[js.Function1[/* repeated */ js.Any, js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onJSONPrettyError")(x.asInstanceOf[js.Any])
    
    @JSImport("react-json-pretty", "propTypes.replacer")
    @js.native
    def replacer: Requireable[js.Function1[/* repeated */ js.Any, js.Any]] = js.native
    @scala.inline
    def replacer_=(x: Requireable[js.Function1[/* repeated */ js.Any, js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("replacer")(x.asInstanceOf[js.Any])
    
    @JSImport("react-json-pretty", "propTypes.silent")
    @js.native
    def silent: Requireable[Boolean] = js.native
    @scala.inline
    def silent_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("silent")(x.asInstanceOf[js.Any])
    
    @JSImport("react-json-pretty", "propTypes.space")
    @js.native
    def space: Requireable[String | Double] = js.native
    @scala.inline
    def space_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("space")(x.asInstanceOf[js.Any])
    
    @JSImport("react-json-pretty", "propTypes.theme")
    @js.native
    def theme: Requireable[js.Object] = js.native
    
    @JSImport("react-json-pretty", "propTypes.themeClassName")
    @js.native
    def themeClassName: Requireable[String] = js.native
    @scala.inline
    def themeClassName_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("themeClassName")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def theme_=(x: Requireable[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("theme")(x.asInstanceOf[js.Any])
  }
  
  trait IProps
    extends StObject
       with HTMLAttributes[HTMLElement] {
    
    var booleanStyle: js.UndefOr[String] = js.undefined
    
    var data: js.UndefOr[js.Any] = js.undefined
    
    var errorStyle: js.UndefOr[String] = js.undefined
    
    var json: js.UndefOr[js.Any] = js.undefined
    
    var keyStyle: js.UndefOr[String] = js.undefined
    
    var mainStyle: js.UndefOr[String] = js.undefined
    
    var onJSONPrettyError: js.UndefOr[js.Function1[/* e */ Error, Unit]] = js.undefined
    
    var replacer: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, js.Any | Null]] = js.undefined
    
    var silent: js.UndefOr[Boolean] = js.undefined
    
    var space: js.UndefOr[Double | String] = js.undefined
    
    var stringStyle: js.UndefOr[String] = js.undefined
    
    var theme: js.UndefOr[ITheme] = js.undefined
    
    var themeClassName: js.UndefOr[String] = js.undefined
    
    var valueStyle: js.UndefOr[String] = js.undefined
  }
  object IProps {
    
    @scala.inline
    def apply(): IProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IProps]
    }
    
    @scala.inline
    implicit class IPropsMutableBuilder[Self <: IProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBooleanStyle(value: String): Self = StObject.set(x, "booleanStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBooleanStyleUndefined: Self = StObject.set(x, "booleanStyle", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setErrorStyle(value: String): Self = StObject.set(x, "errorStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorStyleUndefined: Self = StObject.set(x, "errorStyle", js.undefined)
      
      @scala.inline
      def setJson(value: js.Any): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      @scala.inline
      def setKeyStyle(value: String): Self = StObject.set(x, "keyStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyStyleUndefined: Self = StObject.set(x, "keyStyle", js.undefined)
      
      @scala.inline
      def setMainStyle(value: String): Self = StObject.set(x, "mainStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainStyleUndefined: Self = StObject.set(x, "mainStyle", js.undefined)
      
      @scala.inline
      def setOnJSONPrettyError(value: /* e */ Error => Unit): Self = StObject.set(x, "onJSONPrettyError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnJSONPrettyErrorUndefined: Self = StObject.set(x, "onJSONPrettyError", js.undefined)
      
      @scala.inline
      def setReplacer(value: (/* key */ String, /* value */ js.Any) => js.Any | Null): Self = StObject.set(x, "replacer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReplacerUndefined: Self = StObject.set(x, "replacer", js.undefined)
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      @scala.inline
      def setSpace(value: Double | String): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
      
      @scala.inline
      def setStringStyle(value: String): Self = StObject.set(x, "stringStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringStyleUndefined: Self = StObject.set(x, "stringStyle", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeClassName(value: String): Self = StObject.set(x, "themeClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeClassNameUndefined: Self = StObject.set(x, "themeClassName", js.undefined)
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setValueStyle(value: String): Self = StObject.set(x, "valueStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueStyleUndefined: Self = StObject.set(x, "valueStyle", js.undefined)
    }
  }
  
  type ITheme = StringDictionary[String]
  
  @js.native
  trait JSONPretty
    extends Component[IProps, js.Object, js.Any] {
    
    var _pretty: js.Any = js.native
    
    var _replace: js.Any = js.native
  }
}
