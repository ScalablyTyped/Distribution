package typings.storybookComponents.anon

import typings.std.HTMLElement
import typings.storybookComponents.`distTs3Dot9Modules@popperjsCoreLibEnumsMod`.BasePlacement
import typings.storybookComponents.`distTs3Dot9Modules@popperjsCoreLibEnumsMod`.Variation
import typings.storybookComponents.`distTs3Dot9Modules@popperjsCoreLibModifiersComputeStylesMod`.RoundOffsets
import typings.storybookComponents.`distTs3Dot9Modules@popperjsCoreLibTypesMod`.Offsets
import typings.storybookComponents.`distTs3Dot9Modules@popperjsCoreLibTypesMod`.PositioningStrategy
import typings.storybookComponents.`distTs3Dot9Modules@popperjsCoreLibTypesMod`.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Adaptive extends StObject {
  
  var adaptive: Boolean
  
  var gpuAcceleration: Boolean
  
  var isFixed: Boolean
  
  var offsets: Partialxnumberynumbercent
  
  var placement: BasePlacement
  
  var popper: HTMLElement
  
  var popperRect: Rect
  
  var position: PositioningStrategy
  
  var roundOffsets: Boolean | RoundOffsets
  
  var variation: js.UndefOr[Variation | Null] = js.undefined
}
object Adaptive {
  
  inline def apply(
    adaptive: Boolean,
    gpuAcceleration: Boolean,
    isFixed: Boolean,
    offsets: Partialxnumberynumbercent,
    placement: BasePlacement,
    popper: HTMLElement,
    popperRect: Rect,
    position: PositioningStrategy,
    roundOffsets: Boolean | RoundOffsets
  ): Adaptive = {
    val __obj = js.Dynamic.literal(adaptive = adaptive.asInstanceOf[js.Any], gpuAcceleration = gpuAcceleration.asInstanceOf[js.Any], isFixed = isFixed.asInstanceOf[js.Any], offsets = offsets.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], popper = popper.asInstanceOf[js.Any], popperRect = popperRect.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], roundOffsets = roundOffsets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Adaptive]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Adaptive] (val x: Self) extends AnyVal {
    
    inline def setAdaptive(value: Boolean): Self = StObject.set(x, "adaptive", value.asInstanceOf[js.Any])
    
    inline def setGpuAcceleration(value: Boolean): Self = StObject.set(x, "gpuAcceleration", value.asInstanceOf[js.Any])
    
    inline def setIsFixed(value: Boolean): Self = StObject.set(x, "isFixed", value.asInstanceOf[js.Any])
    
    inline def setOffsets(value: Partialxnumberynumbercent): Self = StObject.set(x, "offsets", value.asInstanceOf[js.Any])
    
    inline def setPlacement(value: BasePlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPopper(value: HTMLElement): Self = StObject.set(x, "popper", value.asInstanceOf[js.Any])
    
    inline def setPopperRect(value: Rect): Self = StObject.set(x, "popperRect", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: PositioningStrategy): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setRoundOffsets(value: Boolean | RoundOffsets): Self = StObject.set(x, "roundOffsets", value.asInstanceOf[js.Any])
    
    inline def setRoundOffsetsFunction1(value: /* offsets */ Partialxnumberynumbercent => Offsets): Self = StObject.set(x, "roundOffsets", js.Any.fromFunction1(value))
    
    inline def setVariation(value: Variation): Self = StObject.set(x, "variation", value.asInstanceOf[js.Any])
    
    inline def setVariationNull: Self = StObject.set(x, "variation", null)
    
    inline def setVariationUndefined: Self = StObject.set(x, "variation", js.undefined)
  }
}
