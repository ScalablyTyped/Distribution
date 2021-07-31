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
    
    @scala.inline
    def apply(afterClose: js.Function, onClose: js.Function, visible: Boolean): AfterClose = {
      val __obj = js.Dynamic.literal(afterClose = afterClose.asInstanceOf[js.Any], onClose = onClose.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[AfterClose]
    }
    
    @scala.inline
    implicit class AfterCloseMutableBuilder[Self <: AfterClose] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterClose(value: js.Function): Self = StObject.set(x, "afterClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClose(value: js.Function): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  trait DefaultValue[T] extends StObject {
    
    var defaultValue: js.UndefOr[T | js.Function0[T]] = js.undefined
    
    var onChange: js.UndefOr[js.Function2[/* value */ T, /* prevValue */ T, Unit]] = js.undefined
    
    var postState: js.UndefOr[js.Function1[/* value */ T, T]] = js.undefined
    
    var value: js.UndefOr[T] = js.undefined
  }
  object DefaultValue {
    
    @scala.inline
    def apply[T](): DefaultValue[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultValue[T]]
    }
    
    @scala.inline
    implicit class DefaultValueMutableBuilder[Self <: DefaultValue[?], T] (val x: Self & DefaultValue[T]) extends AnyVal {
      
      @scala.inline
      def setDefaultValue(value: T | js.Function0[T]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueFunction0(value: () => T): Self = StObject.set(x, "defaultValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* value */ T, /* prevValue */ T) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setPostState(value: /* value */ T => T): Self = StObject.set(x, "postState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPostStateUndefined: Self = StObject.set(x, "postState", js.undefined)
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait GetContainer extends StObject {
    
    def getContainer(): HTMLElement
    
    def getOpenCount(): Double
    
    var ref: js.UndefOr[js.Function1[/* c */ js.Any, Unit]] = js.undefined
    
    def switchScrollingEffect(): Unit
  }
  object GetContainer {
    
    @scala.inline
    def apply(getContainer: () => HTMLElement, getOpenCount: () => Double, switchScrollingEffect: () => Unit): GetContainer = {
      val __obj = js.Dynamic.literal(getContainer = js.Any.fromFunction0(getContainer), getOpenCount = js.Any.fromFunction0(getOpenCount), switchScrollingEffect = js.Any.fromFunction0(switchScrollingEffect))
      __obj.asInstanceOf[GetContainer]
    }
    
    @scala.inline
    implicit class GetContainerMutableBuilder[Self <: GetContainer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetContainer(value: () => HTMLElement): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetOpenCount(value: () => Double): Self = StObject.set(x, "getOpenCount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRef(value: /* c */ js.Any => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      @scala.inline
      def setSwitchScrollingEffect(value: () => Unit): Self = StObject.set(x, "switchScrollingEffect", js.Any.fromFunction0(value))
    }
  }
  
  trait MockRestore extends StObject {
    
    def mockRestore(): Unit
  }
  object MockRestore {
    
    @scala.inline
    def apply(mockRestore: () => Unit): MockRestore = {
      val __obj = js.Dynamic.literal(mockRestore = js.Any.fromFunction0(mockRestore))
      __obj.asInstanceOf[MockRestore]
    }
    
    @scala.inline
    implicit class MockRestoreMutableBuilder[Self <: MockRestore] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMockRestore(value: () => Unit): Self = StObject.set(x, "mockRestore", js.Any.fromFunction0(value))
    }
  }
  
  trait PrevProps extends StObject {
    
    var _self: js.Any
    
    var prevProps: js.Any
  }
  object PrevProps {
    
    @scala.inline
    def apply(_self: js.Any, prevProps: js.Any): PrevProps = {
      val __obj = js.Dynamic.literal(_self = _self.asInstanceOf[js.Any], prevProps = prevProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrevProps]
    }
    
    @scala.inline
    implicit class PrevPropsMutableBuilder[Self <: PrevProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrevProps(value: js.Any): Self = StObject.set(x, "prevProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_self(value: js.Any): Self = StObject.set(x, "_self", value.asInstanceOf[js.Any])
    }
  }
  
  trait PrevPropsAny extends StObject {
    
    var prevProps: js.Any
  }
  object PrevPropsAny {
    
    @scala.inline
    def apply(prevProps: js.Any): PrevPropsAny = {
      val __obj = js.Dynamic.literal(prevProps = prevProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrevPropsAny]
    }
    
    @scala.inline
    implicit class PrevPropsAnyMutableBuilder[Self <: PrevPropsAny] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrevProps(value: js.Any): Self = StObject.set(x, "prevProps", value.asInstanceOf[js.Any])
    }
  }
}
