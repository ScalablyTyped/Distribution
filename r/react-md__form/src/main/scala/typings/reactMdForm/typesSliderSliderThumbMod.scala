package typings.reactMdForm

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.reactMdForm.typesSliderTypesMod.SliderThumbOptions
import typings.reactMdForm.typesSliderTypesMod.ThumbIndex
import typings.reactMdUtils.typesTypesMod.LabelRequiredForA11y
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSliderSliderThumbMod {
  
  @JSImport("@react-md/form/types/slider/SliderThumb", "SliderThumb")
  @js.native
  val SliderThumb: ForwardRefExoticComponent[SliderThumbProps & RefAttributes[HTMLSpanElement]] = js.native
  
  trait BaseThumbProps
    extends StObject
       with HTMLAttributes[HTMLSpanElement]
       with SliderThumbOptions {
    
    /**
      * Boolean if the thumb is currently in an active state which will add a
      * "bubble" around the thumb.
      */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the thumb should animate between positions when the `value`
      * changes. This should normally be set to `false` while dragging the thumb
      * since it'll make it look like the thumb is lagging behind the mouse cursor
      * or user's finger.
      */
    var animate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The prefix to use for the id of the thumb. When the `id` prop is omitted,
      * the `id` for this component will be created by `${baseId}-thumb-${index + 1}`.
      *
      * Either the `id` or `baseId` props are required for a11y.
      */
    var baseId: js.UndefOr[String] = js.undefined
    
    /**
      * The index of the thumb which is used for some additional styling
      * behavior.
      */
    var index: ThumbIndex
    
    /**
      * An optional name to apply to the hidden input field representing the value
      * of the slider.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * The current value for the slider.
      */
    var value: Double
  }
  object BaseThumbProps {
    
    inline def apply(index: ThumbIndex, value: Double): BaseThumbProps = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseThumbProps]
    }
    
    extension [Self <: BaseThumbProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setBaseId(value: String): Self = StObject.set(x, "baseId", value.asInstanceOf[js.Any])
      
      inline def setBaseIdUndefined: Self = StObject.set(x, "baseId", js.undefined)
      
      inline def setIndex(value: ThumbIndex): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type SliderThumbProps = LabelRequiredForA11y[BaseThumbProps]
}
