package typings.reactBase16Styling

import org.scalablytyped.runtime.StringDictionary
import typings.base16.mod.Base16Theme
import typings.csstype.mod.Properties
import typings.reactBase16Styling.anon.PartialStyling
import typings.reactBase16Styling.reactBase16StylingBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesTypesMod {
  
  trait Styling extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[Properties[String | Double, String]] = js.undefined
  }
  object Styling {
    
    inline def apply(): Styling = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Styling]
    }
    
    extension [Self <: Styling](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setStyle(value: Properties[String | Double, String]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait StylingConfig
    extends StObject
       with /* name */ StringDictionary[StylingValue | String | Base16Theme] {
    
    var extend: js.UndefOr[String | Base16Theme | StylingValue] = js.undefined
  }
  object StylingConfig {
    
    inline def apply(): StylingConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StylingConfig]
    }
    
    extension [Self <: StylingConfig](x: Self) {
      
      inline def setExtend(value: String | Base16Theme | StylingValue): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
      
      inline def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    }
  }
  
  @js.native
  trait StylingFunction extends StObject {
    
    def apply(keys: String, rest: Any*): Styling = js.native
    def apply(keys: js.Array[js.UndefOr[String | `false`]], rest: Any*): Styling = js.native
    def apply(keys: Unit, rest: Any*): Styling = js.native
    def apply(keys: `false`, rest: Any*): Styling = js.native
  }
  
  type StylingValue = String | (Properties[String | Double, String]) | StylingValueFunction
  
  @js.native
  trait StylingValueFunction extends StObject {
    
    def apply(styling: Styling, rest: Any*): PartialStyling = js.native
  }
  
  type Theme = String | Base16Theme | StylingConfig
}
