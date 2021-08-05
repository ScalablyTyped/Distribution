package typings.rcUtil

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AfterClose extends StObject {
    
    var afterClose: js.Function
    
    var onClose: js.Function
    
    var visible: Boolean
  }
  object AfterClose {
    
    inline def apply(afterClose: js.Function, onClose: js.Function, visible: Boolean): AfterClose = {
      val __obj = js.Dynamic.literal(afterClose = afterClose.asInstanceOf[js.Any], onClose = onClose.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[AfterClose]
    }
    
    extension [Self <: AfterClose](x: Self) {
      
      inline def setAfterClose(value: js.Function): Self = StObject.set(x, "afterClose", value.asInstanceOf[js.Any])
      
      inline def setOnClose(value: js.Function): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  trait DefaultValue[T] extends StObject {
    
    var defaultValue: js.UndefOr[T | js.Function0[T]] = js.undefined
    
    var onChange: js.UndefOr[js.Function2[/* value */ T, /* prevValue */ T, Unit]] = js.undefined
    
    var postState: js.UndefOr[js.Function1[/* value */ T, T]] = js.undefined
    
    var value: js.UndefOr[T] = js.undefined
  }
  object DefaultValue {
    
    inline def apply[T](): DefaultValue[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultValue[T]]
    }
    
    extension [Self <: DefaultValue[?], T](x: Self & DefaultValue[T]) {
      
      inline def setDefaultValue(value: T | js.Function0[T]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueFunction0(value: () => T): Self = StObject.set(x, "defaultValue", js.Any.fromFunction0(value))
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setOnChange(value: (/* value */ T, /* prevValue */ T) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setPostState(value: /* value */ T => T): Self = StObject.set(x, "postState", js.Any.fromFunction1(value))
      
      inline def setPostStateUndefined: Self = StObject.set(x, "postState", js.undefined)
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait GetContainer extends StObject {
    
    def getContainer(): HTMLElement
    
    def getOpenCount(): Double
    
    var ref: js.UndefOr[js.Function1[/* c */ js.Any, Unit]] = js.undefined
    
    def switchScrollingEffect(): Unit
  }
  object GetContainer {
    
    inline def apply(getContainer: () => HTMLElement, getOpenCount: () => Double, switchScrollingEffect: () => Unit): GetContainer = {
      val __obj = js.Dynamic.literal(getContainer = js.Any.fromFunction0(getContainer), getOpenCount = js.Any.fromFunction0(getOpenCount), switchScrollingEffect = js.Any.fromFunction0(switchScrollingEffect))
      __obj.asInstanceOf[GetContainer]
    }
    
    extension [Self <: GetContainer](x: Self) {
      
      inline def setGetContainer(value: () => HTMLElement): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
      
      inline def setGetOpenCount(value: () => Double): Self = StObject.set(x, "getOpenCount", js.Any.fromFunction0(value))
      
      inline def setRef(value: /* c */ js.Any => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setSwitchScrollingEffect(value: () => Unit): Self = StObject.set(x, "switchScrollingEffect", js.Any.fromFunction0(value))
    }
  }
  
  trait MockRestore extends StObject {
    
    def mockRestore(): Unit
  }
  object MockRestore {
    
    inline def apply(mockRestore: () => Unit): MockRestore = {
      val __obj = js.Dynamic.literal(mockRestore = js.Any.fromFunction0(mockRestore))
      __obj.asInstanceOf[MockRestore]
    }
    
    extension [Self <: MockRestore](x: Self) {
      
      inline def setMockRestore(value: () => Unit): Self = StObject.set(x, "mockRestore", js.Any.fromFunction0(value))
    }
  }
  
  trait PrevProps extends StObject {
    
    var _self: js.Any
    
    var prevProps: js.Any
  }
  object PrevProps {
    
    inline def apply(_self: js.Any, prevProps: js.Any): PrevProps = {
      val __obj = js.Dynamic.literal(_self = _self.asInstanceOf[js.Any], prevProps = prevProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrevProps]
    }
    
    extension [Self <: PrevProps](x: Self) {
      
      inline def setPrevProps(value: js.Any): Self = StObject.set(x, "prevProps", value.asInstanceOf[js.Any])
      
      inline def set_self(value: js.Any): Self = StObject.set(x, "_self", value.asInstanceOf[js.Any])
    }
  }
  
  trait PrevPropsAny extends StObject {
    
    var prevProps: js.Any
  }
  object PrevPropsAny {
    
    inline def apply(prevProps: js.Any): PrevPropsAny = {
      val __obj = js.Dynamic.literal(prevProps = prevProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrevPropsAny]
    }
    
    extension [Self <: PrevPropsAny](x: Self) {
      
      inline def setPrevProps(value: js.Any): Self = StObject.set(x, "prevProps", value.asInstanceOf[js.Any])
    }
  }
}
