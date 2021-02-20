package typings.reactBase16Styling

import org.scalablytyped.runtime.StringDictionary
import typings.base16.mod.Base16Theme
import typings.csstype.mod.Properties
import typings.reactBase16Styling.anon.PartialStyling
import typings.reactBase16Styling.reactBase16StylingBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait Styling extends StObject {
    
    var className: String = js.native
    
    var style: Properties[String | Double] = js.native
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
  
  @js.native
  trait StylingConfig extends /* name */ StringDictionary[StylingValue | String | Base16Theme] {
    
    var extend: js.UndefOr[String | Base16Theme | StylingValue] = js.native
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
      def setExtendFunction2(value: (/* styling */ Styling, /* repeated */ js.Any) => PartialStyling): Self = StObject.set(x, "extend", js.Any.fromFunction2(value))
      
      @scala.inline
      def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    }
  }
  
  type StylingFunction = js.Function2[
    /* keys */ js.UndefOr[String | `false` | (js.Array[js.UndefOr[String | `false`]])], 
    /* repeated */ js.Any, 
    Styling
  ]
  
  type StylingValue = String | (Properties[String | Double]) | StylingValueFunction
  
  type StylingValueFunction = js.Function2[/* styling */ Styling, /* repeated */ js.Any, PartialStyling]
  
  type Theme = String | Base16Theme | StylingConfig
}
