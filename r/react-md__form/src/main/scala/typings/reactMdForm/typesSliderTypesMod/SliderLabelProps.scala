package typings.reactMdForm.typesSliderTypesMod

import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.reactMdUtils.typesTypesMod.PropsWithRef
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderLabelProps extends StObject {
  
  /**
    * An optional label to display with the slider. This should normally be a
    * short (1-4 word) description for this slider.
    */
  var label: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * Optional props to pass to the component wrapping the `label` content.
    */
  var labelProps: js.UndefOr[PropsWithRef[HTMLAttributes[HTMLSpanElement], HTMLSpanElement]] = js.undefined
}
object SliderLabelProps {
  
  inline def apply(): SliderLabelProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderLabelProps]
  }
  
  extension [Self <: SliderLabelProps](x: Self) {
    
    inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelProps(value: PropsWithRef[HTMLAttributes[HTMLSpanElement], HTMLSpanElement]): Self = StObject.set(x, "labelProps", value.asInstanceOf[js.Any])
    
    inline def setLabelPropsUndefined: Self = StObject.set(x, "labelProps", js.undefined)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
