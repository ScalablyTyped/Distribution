package typings.reactBase16Styling

import typings.csstype.mod.Properties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<react-base16-styling.react-base16-styling/lib/types/types.Styling> */
  trait PartialStyling extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[Properties[String | Double, String]] = js.undefined
  }
  object PartialStyling {
    
    inline def apply(): PartialStyling = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialStyling]
    }
    
    extension [Self <: PartialStyling](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setStyle(value: Properties[String | Double, String]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
