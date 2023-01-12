package typings.senchaTouch.Ext.util

import typings.senchaTouch.Ext.IEvented
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object translatable {
  
  trait IAbstract
    extends StObject
       with IEvented {
    
    /** [Method] Returns the value of easing
      * @returns Object
      */
    var getEasing: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of easingX
      * @returns Object
      */
    var getEasingX: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of easingY
      * @returns Object
      */
    var getEasingY: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of useWrapper
      * @returns Object
      */
    var getUseWrapper: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Sets the value of easing
      * @param easing Object The new value.
      */
    var setEasing: js.UndefOr[js.Function1[/* easing */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of easingX
      * @param easingX Object The new value.
      */
    var setEasingX: js.UndefOr[js.Function1[/* easingX */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of easingY
      * @param easingY Object The new value.
      */
    var setEasingY: js.UndefOr[js.Function1[/* easingY */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of useWrapper
      * @param useWrapper Object The new value.
      */
    var setUseWrapper: js.UndefOr[js.Function1[/* useWrapper */ js.UndefOr[Any], Unit]] = js.undefined
  }
  object IAbstract {
    
    inline def apply(): IAbstract = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAbstract]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IAbstract] (val x: Self) extends AnyVal {
      
      inline def setGetEasing(value: () => Any): Self = StObject.set(x, "getEasing", js.Any.fromFunction0(value))
      
      inline def setGetEasingUndefined: Self = StObject.set(x, "getEasing", js.undefined)
      
      inline def setGetEasingX(value: () => Any): Self = StObject.set(x, "getEasingX", js.Any.fromFunction0(value))
      
      inline def setGetEasingXUndefined: Self = StObject.set(x, "getEasingX", js.undefined)
      
      inline def setGetEasingY(value: () => Any): Self = StObject.set(x, "getEasingY", js.Any.fromFunction0(value))
      
      inline def setGetEasingYUndefined: Self = StObject.set(x, "getEasingY", js.undefined)
      
      inline def setGetUseWrapper(value: () => Any): Self = StObject.set(x, "getUseWrapper", js.Any.fromFunction0(value))
      
      inline def setGetUseWrapperUndefined: Self = StObject.set(x, "getUseWrapper", js.undefined)
      
      inline def setSetEasing(value: /* easing */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setEasing", js.Any.fromFunction1(value))
      
      inline def setSetEasingUndefined: Self = StObject.set(x, "setEasing", js.undefined)
      
      inline def setSetEasingX(value: /* easingX */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setEasingX", js.Any.fromFunction1(value))
      
      inline def setSetEasingXUndefined: Self = StObject.set(x, "setEasingX", js.undefined)
      
      inline def setSetEasingY(value: /* easingY */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setEasingY", js.Any.fromFunction1(value))
      
      inline def setSetEasingYUndefined: Self = StObject.set(x, "setEasingY", js.undefined)
      
      inline def setSetUseWrapper(value: /* useWrapper */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setUseWrapper", js.Any.fromFunction1(value))
      
      inline def setSetUseWrapperUndefined: Self = StObject.set(x, "setUseWrapper", js.undefined)
    }
  }
  
  trait ICssPosition
    extends StObject
       with IDom
  object ICssPosition {
    
    inline def apply(): ICssPosition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICssPosition]
    }
  }
  
  trait ICssTransform
    extends StObject
       with IDom
  object ICssTransform {
    
    inline def apply(): ICssTransform = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICssTransform]
    }
  }
  
  trait IDom
    extends StObject
       with IAbstract {
    
    /** [Method] Returns the value of element
      * @returns Object
      */
    var getElement: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Sets the value of element
      * @param element Object The new value.
      */
    var setElement: js.UndefOr[js.Function1[/* element */ js.UndefOr[Any], Unit]] = js.undefined
  }
  object IDom {
    
    inline def apply(): IDom = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDom]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDom] (val x: Self) extends AnyVal {
      
      inline def setGetElement(value: () => Any): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
      
      inline def setGetElementUndefined: Self = StObject.set(x, "getElement", js.undefined)
      
      inline def setSetElement(value: /* element */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setElement", js.Any.fromFunction1(value))
      
      inline def setSetElementUndefined: Self = StObject.set(x, "setElement", js.undefined)
    }
  }
  
  trait IScrollPosition
    extends StObject
       with IDom {
    
    /** [Method] Returns the value of useWrapper
      * @returns Boolean
      */
    @JSName("getUseWrapper")
    var getUseWrapper_IScrollPosition: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Sets the value of useWrapper
      * @param useWrapper Boolean The new value.
      */
    @JSName("setUseWrapper")
    var setUseWrapper_IScrollPosition: js.UndefOr[js.Function1[/* useWrapper */ js.UndefOr[Boolean], Unit]] = js.undefined
  }
  object IScrollPosition {
    
    inline def apply(): IScrollPosition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IScrollPosition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IScrollPosition] (val x: Self) extends AnyVal {
      
      inline def setGetUseWrapper(value: () => Boolean): Self = StObject.set(x, "getUseWrapper", js.Any.fromFunction0(value))
      
      inline def setGetUseWrapperUndefined: Self = StObject.set(x, "getUseWrapper", js.undefined)
      
      inline def setSetUseWrapper(value: /* useWrapper */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setUseWrapper", js.Any.fromFunction1(value))
      
      inline def setSetUseWrapperUndefined: Self = StObject.set(x, "setUseWrapper", js.undefined)
    }
  }
}
