package typings.reactMdForm.typesSliderTypesMod

import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseSliderProps
  extends StObject
     with HTMLAttributes[HTMLDivElement]
     with SliderAddons
     with SliderLabelProps
     with SliderPresentation
     with SliderThumbPresentation {
  
  /**
    * An id for the slider and different parts which is required for a11y.
    */
  var baseId: String
}
object BaseSliderProps {
  
  inline def apply(baseId: String): BaseSliderProps = {
    val __obj = js.Dynamic.literal(baseId = baseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseSliderProps]
  }
  
  extension [Self <: BaseSliderProps](x: Self) {
    
    inline def setBaseId(value: String): Self = StObject.set(x, "baseId", value.asInstanceOf[js.Any])
  }
}
