package typings.reactJsonPretty

import org.scalablytyped.runtime.StringDictionary
import typings.propTypes.mod.Requireable
import typings.react.mod.Component
import typings.react.mod.HTMLAttributes
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-json-pretty", JSImport.Namespace)
  @js.native
  open class ^ () extends JSONPretty
  
  /* static member */
  object defaultProps {
    
    @JSImport("react-json-pretty", "defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-json-pretty", "defaultProps.data")
    @js.native
    def data: String = js.native
    inline def data_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("data")(x.asInstanceOf[js.Any])
    
    @JSImport("react-json-pretty", "defaultProps.json")
    @js.native
    def json: String = js.native
    inline def json_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("json")(x.asInstanceOf[js.Any])
    
    @JSImport("react-json-pretty", "defaultProps.silent")
    @js.native
    def silent: Boolean = js.native
    inline def silent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("silent")(x.asInstanceOf[js.Any])
    
    @JSImport("react-json-pretty", "defaultProps.space")
    @js.native
    def space: Double = js.native
    inline def space_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("space")(x.asInstanceOf[js.Any])
    
    @JSImport("react-json-pretty", "defaultProps.themeClassName")
    @js.native
    def themeClassName: String = js.native
    inline def themeClassName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("themeClassName")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  object propTypes {
    
    @JSImport("react-json-pretty", "propTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-json-pretty", "propTypes.data")
    @js.native
    def data: Requireable[Any] = js.native
    inline def data_=(x: Requireable[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("data")(x.asInstanceOf[js.Any])
    
    @JSImport("react-json-pretty", "propTypes.json")
    @js.native
    def json: Requireable[Any] = js.native
    inline def json_=(x: Requireable[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("json")(x.asInstanceOf[js.Any])
    
    @JSImport("react-json-pretty", "propTypes.onJSONPrettyError")
    @js.native
    def onJSONPrettyError: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    inline def onJSONPrettyError_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onJSONPrettyError")(x.asInstanceOf[js.Any])
    
    @JSImport("react-json-pretty", "propTypes.replacer")
    @js.native
    def replacer: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    inline def replacer_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("replacer")(x.asInstanceOf[js.Any])
    
    @JSImport("react-json-pretty", "propTypes.silent")
    @js.native
    def silent: Requireable[Boolean] = js.native
    inline def silent_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("silent")(x.asInstanceOf[js.Any])
    
    @JSImport("react-json-pretty", "propTypes.space")
    @js.native
    def space: Requireable[String | Double] = js.native
    inline def space_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("space")(x.asInstanceOf[js.Any])
    
    @JSImport("react-json-pretty", "propTypes.theme")
    @js.native
    def theme: Requireable[js.Object] = js.native
    
    @JSImport("react-json-pretty", "propTypes.themeClassName")
    @js.native
    def themeClassName: Requireable[String] = js.native
    inline def themeClassName_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("themeClassName")(x.asInstanceOf[js.Any])
    
    inline def theme_=(x: Requireable[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("theme")(x.asInstanceOf[js.Any])
  }
  
  trait IProps
    extends StObject
       with HTMLAttributes[HTMLElement] {
    
    var booleanStyle: js.UndefOr[String] = js.undefined
    
    var data: js.UndefOr[Any] = js.undefined
    
    var errorStyle: js.UndefOr[String] = js.undefined
    
    var json: js.UndefOr[Any] = js.undefined
    
    var keyStyle: js.UndefOr[String] = js.undefined
    
    var mainStyle: js.UndefOr[String] = js.undefined
    
    var onJSONPrettyError: js.UndefOr[js.Function1[/* e */ js.Error, Unit]] = js.undefined
    
    var replacer: js.UndefOr[js.Function2[/* key */ String, /* value */ Any, Any | Null]] = js.undefined
    
    var silent: js.UndefOr[Boolean] = js.undefined
    
    var space: js.UndefOr[Double | String] = js.undefined
    
    var stringStyle: js.UndefOr[String] = js.undefined
    
    var theme: js.UndefOr[ITheme] = js.undefined
    
    var themeClassName: js.UndefOr[String] = js.undefined
    
    var valueStyle: js.UndefOr[String] = js.undefined
  }
  object IProps {
    
    inline def apply(): IProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IProps]
    }
    
    extension [Self <: IProps](x: Self) {
      
      inline def setBooleanStyle(value: String): Self = StObject.set(x, "booleanStyle", value.asInstanceOf[js.Any])
      
      inline def setBooleanStyleUndefined: Self = StObject.set(x, "booleanStyle", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setErrorStyle(value: String): Self = StObject.set(x, "errorStyle", value.asInstanceOf[js.Any])
      
      inline def setErrorStyleUndefined: Self = StObject.set(x, "errorStyle", js.undefined)
      
      inline def setJson(value: Any): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setKeyStyle(value: String): Self = StObject.set(x, "keyStyle", value.asInstanceOf[js.Any])
      
      inline def setKeyStyleUndefined: Self = StObject.set(x, "keyStyle", js.undefined)
      
      inline def setMainStyle(value: String): Self = StObject.set(x, "mainStyle", value.asInstanceOf[js.Any])
      
      inline def setMainStyleUndefined: Self = StObject.set(x, "mainStyle", js.undefined)
      
      inline def setOnJSONPrettyError(value: /* e */ js.Error => Unit): Self = StObject.set(x, "onJSONPrettyError", js.Any.fromFunction1(value))
      
      inline def setOnJSONPrettyErrorUndefined: Self = StObject.set(x, "onJSONPrettyError", js.undefined)
      
      inline def setReplacer(value: (/* key */ String, /* value */ Any) => Any | Null): Self = StObject.set(x, "replacer", js.Any.fromFunction2(value))
      
      inline def setReplacerUndefined: Self = StObject.set(x, "replacer", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      inline def setSpace(value: Double | String): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
      
      inline def setStringStyle(value: String): Self = StObject.set(x, "stringStyle", value.asInstanceOf[js.Any])
      
      inline def setStringStyleUndefined: Self = StObject.set(x, "stringStyle", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeClassName(value: String): Self = StObject.set(x, "themeClassName", value.asInstanceOf[js.Any])
      
      inline def setThemeClassNameUndefined: Self = StObject.set(x, "themeClassName", js.undefined)
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setValueStyle(value: String): Self = StObject.set(x, "valueStyle", value.asInstanceOf[js.Any])
      
      inline def setValueStyleUndefined: Self = StObject.set(x, "valueStyle", js.undefined)
    }
  }
  
  type ITheme = StringDictionary[String]
  
  @js.native
  trait JSONPretty
    extends Component[IProps, js.Object, Any] {
    
    /* private */ var _pretty: Any = js.native
    
    /* private */ var _replace: Any = js.native
  }
}
