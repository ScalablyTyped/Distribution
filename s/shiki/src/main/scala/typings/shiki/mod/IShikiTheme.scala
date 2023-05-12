package typings.shiki.mod

import typings.shiki.shikiStrings.css
import typings.shiki.shikiStrings.dark
import typings.shiki.shikiStrings.light
import typings.std.Record
import typings.vscodeTextmate.releaseThemeMod.IRawTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IShikiTheme
  extends StObject
     with IRawTheme {
  
  /**
    * @description text default background color
    */
  var bg: String
  
  /**
    *
    * @description color map of the theme file
    */
  var colors: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * @description text default foreground color
    */
  var fg: String
  
  /**
    * @description relative path of included theme
    */
  var include: js.UndefOr[String] = js.undefined
  
  /**
    * @description theme name
    */
  @JSName("name")
  var name_IShikiTheme: String
  
  /**
    * @description tokenColors of the theme file
    */
  @JSName("settings")
  var settings_IShikiTheme: js.Array[Any]
  
  /**
    * @description light/dark theme
    */
  var `type`: light | dark | css
}
object IShikiTheme {
  
  inline def apply(bg: String, fg: String, name: String, settings: js.Array[Any], `type`: light | dark | css): IShikiTheme = {
    val __obj = js.Dynamic.literal(bg = bg.asInstanceOf[js.Any], fg = fg.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShikiTheme]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IShikiTheme] (val x: Self) extends AnyVal {
    
    inline def setBg(value: String): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
    
    inline def setColors(value: Record[String, String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setFg(value: String): Self = StObject.set(x, "fg", value.asInstanceOf[js.Any])
    
    inline def setInclude(value: String): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: js.Array[Any]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsVarargs(value: Any*): Self = StObject.set(x, "settings", js.Array(value*))
    
    inline def setType(value: light | dark | css): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
