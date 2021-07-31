package typings.reactBase16Styling

import org.scalablytyped.runtime.StringDictionary
import typings.base16.mod.Base16Theme
import typings.csstype.mod.Properties
import typings.reactBase16Styling.anon.PartialStyling
import typings.reactBase16Styling.reactBase16StylingBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait Styling extends StObject {
    
    var className: String
    
    var style: Properties[String | Double]
  }
  object Styling {
    
    @scala.inline
    def apply(className: String, style: Properties[String | Double]): Styling = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[Styling]
    }
    
    @scala.inline
    implicit class StylingMutableBuilder[Self <: Styling] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: Properties[String | Double]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  trait StylingConfig
    extends StObject
       with /* name */ StringDictionary[StylingValue | String | Base16Theme] {
    
    var extend: js.UndefOr[String | Base16Theme | StylingValue] = js.undefined
  }
  object StylingConfig {
    
    @scala.inline
    def apply(): StylingConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StylingConfig]
    }
    
    @scala.inline
    implicit class StylingConfigMutableBuilder[Self <: StylingConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtend(value: String | Base16Theme | StylingValue): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    }
  }
  
  @js.native
  trait StylingFunction extends StObject {
    
    def apply(keys: String, rest: js.Any*): Styling = js.native
    def apply(keys: js.Array[js.UndefOr[String | `false`]], rest: js.Any*): Styling = js.native
    def apply(keys: Unit, rest: js.Any*): Styling = js.native
    def apply(keys: `false`, rest: js.Any*): Styling = js.native
  }
  
  type StylingValue = String | (Properties[String | Double]) | StylingValueFunction
  
  @js.native
  trait StylingValueFunction extends StObject {
    
    def apply(styling: Styling, rest: js.Any*): PartialStyling = js.native
  }
  
  type Theme = String | Base16Theme | StylingConfig
}
