package typings.rcSegmented

import typings.rcSegmented.mod.SegmentedValue
import typings.rcSegmented.rcSegmentedStrings.ltr
import typings.rcSegmented.rcSegmentedStrings.rtl
import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esMotionThumbMod {
  
  @JSImport("rc-segmented/es/MotionThumb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: MotionThumbInterface): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  trait MotionThumbInterface extends StObject {
    
    var containerRef: RefObject[HTMLDivElement]
    
    var direction: js.UndefOr[ltr | rtl] = js.undefined
    
    def getValueIndex(value: SegmentedValue): Double
    
    var motionName: String
    
    var onMotionEnd: VoidFunction
    
    var onMotionStart: VoidFunction
    
    var prefixCls: String
    
    var value: SegmentedValue
  }
  object MotionThumbInterface {
    
    inline def apply(
      containerRef: RefObject[HTMLDivElement],
      getValueIndex: SegmentedValue => Double,
      motionName: String,
      onMotionEnd: () => Unit,
      onMotionStart: () => Unit,
      prefixCls: String,
      value: SegmentedValue
    ): MotionThumbInterface = {
      val __obj = js.Dynamic.literal(containerRef = containerRef.asInstanceOf[js.Any], getValueIndex = js.Any.fromFunction1(getValueIndex), motionName = motionName.asInstanceOf[js.Any], onMotionEnd = js.Any.fromFunction0(onMotionEnd), onMotionStart = js.Any.fromFunction0(onMotionStart), prefixCls = prefixCls.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[MotionThumbInterface]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MotionThumbInterface] (val x: Self) extends AnyVal {
      
      inline def setContainerRef(value: RefObject[HTMLDivElement]): Self = StObject.set(x, "containerRef", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setGetValueIndex(value: SegmentedValue => Double): Self = StObject.set(x, "getValueIndex", js.Any.fromFunction1(value))
      
      inline def setMotionName(value: String): Self = StObject.set(x, "motionName", value.asInstanceOf[js.Any])
      
      inline def setOnMotionEnd(value: () => Unit): Self = StObject.set(x, "onMotionEnd", js.Any.fromFunction0(value))
      
      inline def setOnMotionStart(value: () => Unit): Self = StObject.set(x, "onMotionStart", js.Any.fromFunction0(value))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setValue(value: SegmentedValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
