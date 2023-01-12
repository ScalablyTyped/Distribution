package typings.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slider {
  
  trait ISlider
    extends StObject
       with IContainer {
    
    /** [Config Option] (Boolean) */
    var allowThumbsOverlapping: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Boolean/Object) */
    var animation: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (Boolean) */
    var animationDuration: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Sets the increment configuration
      * @param increment Number
      * @returns Number
      */
    var applyIncrement: js.UndefOr[js.Function1[/* increment */ js.UndefOr[Double], Double]] = js.undefined
    
    /** [Method] Returns the value of allowThumbsOverlapping
      * @returns Boolean
      */
    var getAllowThumbsOverlapping: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns the value of animation
      * @returns Boolean/Object
      */
    var getAnimation: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of increment
      * @returns Number
      */
    var getIncrement: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the value of maxValue
      * @returns Number
      */
    var getMaxValue: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the value of minValue
      * @returns Number
      */
    var getMinValue: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the value of readOnly
      * @returns Boolean
      */
    var getReadOnly: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns the Thumb instance bound to this Slider
      * @param index Number The index of Thumb to return.
      * @returns Ext.slider.Thumb The thumb instance
      */
    var getThumb: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], IThumb]] = js.undefined
    
    /** [Method] Returns the value of thumbConfig
      * @returns Object
      */
    var getThumbConfig: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the Thumb instances bound to this Slider
      * @returns Ext.slider.Thumb[] The thumb instances
      */
    var getThumbs: js.UndefOr[js.Function0[Array]] = js.undefined
    
    /** [Method] Returns the value of value
      * @returns Number/Number[]
      */
    var getValue: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Convenience method
      * @returns Object
      */
    var getValues: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Config Option] (Number) */
    var increment: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var maxValue: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var minValue: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Boolean) */
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Sets the value of allowThumbsOverlapping
      * @param allowThumbsOverlapping Boolean The new value.
      */
    var setAllowThumbsOverlapping: js.UndefOr[js.Function1[/* allowThumbsOverlapping */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of animation
      * @param animation Boolean/Object The new value.
      */
    var setAnimation: js.UndefOr[js.Function1[/* animation */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of increment
      * @param increment Number The new value.
      */
    var setIncrement: js.UndefOr[js.Function1[/* increment */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of maxValue
      * @param maxValue Number The new value.
      */
    var setMaxValue: js.UndefOr[js.Function1[/* maxValue */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of minValue
      * @param minValue Number The new value.
      */
    var setMinValue: js.UndefOr[js.Function1[/* minValue */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of readOnly
      * @param readOnly Boolean The new value.
      */
    var setReadOnly: js.UndefOr[js.Function1[/* readOnly */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of thumbConfig
      * @param thumbConfig Object The new value.
      */
    var setThumbConfig: js.UndefOr[js.Function1[/* thumbConfig */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of value
      * @param value Number/Number[] The new value.
      */
    var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Convenience method
      * @param value Object
      */
    var setValues: js.UndefOr[js.Function1[/* value */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Config Option] (Object) */
    var thumbConfig: js.UndefOr[Any] = js.undefined
    
    /** [Method] Updates the sliders thumbs with their new value s
      * @param newValue Object
      * @param oldValue Object
      */
    var updateValue: js.UndefOr[
        js.Function2[/* newValue */ js.UndefOr[Any], /* oldValue */ js.UndefOr[Any], Unit]
      ] = js.undefined
    
    /** [Config Option] (Number/Number[]) */
    var value: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (Number/Number[]) */
    var values: js.UndefOr[Any] = js.undefined
  }
  object ISlider {
    
    inline def apply(): ISlider = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISlider]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISlider] (val x: Self) extends AnyVal {
      
      inline def setAllowThumbsOverlapping(value: Boolean): Self = StObject.set(x, "allowThumbsOverlapping", value.asInstanceOf[js.Any])
      
      inline def setAllowThumbsOverlappingUndefined: Self = StObject.set(x, "allowThumbsOverlapping", js.undefined)
      
      inline def setAnimation(value: Any): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationDuration(value: Boolean): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setApplyIncrement(value: /* increment */ js.UndefOr[Double] => Double): Self = StObject.set(x, "applyIncrement", js.Any.fromFunction1(value))
      
      inline def setApplyIncrementUndefined: Self = StObject.set(x, "applyIncrement", js.undefined)
      
      inline def setGetAllowThumbsOverlapping(value: () => Boolean): Self = StObject.set(x, "getAllowThumbsOverlapping", js.Any.fromFunction0(value))
      
      inline def setGetAllowThumbsOverlappingUndefined: Self = StObject.set(x, "getAllowThumbsOverlapping", js.undefined)
      
      inline def setGetAnimation(value: () => Any): Self = StObject.set(x, "getAnimation", js.Any.fromFunction0(value))
      
      inline def setGetAnimationUndefined: Self = StObject.set(x, "getAnimation", js.undefined)
      
      inline def setGetIncrement(value: () => Double): Self = StObject.set(x, "getIncrement", js.Any.fromFunction0(value))
      
      inline def setGetIncrementUndefined: Self = StObject.set(x, "getIncrement", js.undefined)
      
      inline def setGetMaxValue(value: () => Double): Self = StObject.set(x, "getMaxValue", js.Any.fromFunction0(value))
      
      inline def setGetMaxValueUndefined: Self = StObject.set(x, "getMaxValue", js.undefined)
      
      inline def setGetMinValue(value: () => Double): Self = StObject.set(x, "getMinValue", js.Any.fromFunction0(value))
      
      inline def setGetMinValueUndefined: Self = StObject.set(x, "getMinValue", js.undefined)
      
      inline def setGetReadOnly(value: () => Boolean): Self = StObject.set(x, "getReadOnly", js.Any.fromFunction0(value))
      
      inline def setGetReadOnlyUndefined: Self = StObject.set(x, "getReadOnly", js.undefined)
      
      inline def setGetThumb(value: /* index */ js.UndefOr[Double] => IThumb): Self = StObject.set(x, "getThumb", js.Any.fromFunction1(value))
      
      inline def setGetThumbConfig(value: () => Any): Self = StObject.set(x, "getThumbConfig", js.Any.fromFunction0(value))
      
      inline def setGetThumbConfigUndefined: Self = StObject.set(x, "getThumbConfig", js.undefined)
      
      inline def setGetThumbUndefined: Self = StObject.set(x, "getThumb", js.undefined)
      
      inline def setGetThumbs(value: () => Array): Self = StObject.set(x, "getThumbs", js.Any.fromFunction0(value))
      
      inline def setGetThumbsUndefined: Self = StObject.set(x, "getThumbs", js.undefined)
      
      inline def setGetValue(value: () => Any): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      inline def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
      
      inline def setGetValues(value: () => Any): Self = StObject.set(x, "getValues", js.Any.fromFunction0(value))
      
      inline def setGetValuesUndefined: Self = StObject.set(x, "getValues", js.undefined)
      
      inline def setIncrement(value: Double): Self = StObject.set(x, "increment", value.asInstanceOf[js.Any])
      
      inline def setIncrementUndefined: Self = StObject.set(x, "increment", js.undefined)
      
      inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
      
      inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
      
      inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setSetAllowThumbsOverlapping(value: /* allowThumbsOverlapping */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAllowThumbsOverlapping", js.Any.fromFunction1(value))
      
      inline def setSetAllowThumbsOverlappingUndefined: Self = StObject.set(x, "setAllowThumbsOverlapping", js.undefined)
      
      inline def setSetAnimation(value: /* animation */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setAnimation", js.Any.fromFunction1(value))
      
      inline def setSetAnimationUndefined: Self = StObject.set(x, "setAnimation", js.undefined)
      
      inline def setSetIncrement(value: /* increment */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setIncrement", js.Any.fromFunction1(value))
      
      inline def setSetIncrementUndefined: Self = StObject.set(x, "setIncrement", js.undefined)
      
      inline def setSetMaxValue(value: /* maxValue */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMaxValue", js.Any.fromFunction1(value))
      
      inline def setSetMaxValueUndefined: Self = StObject.set(x, "setMaxValue", js.undefined)
      
      inline def setSetMinValue(value: /* minValue */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMinValue", js.Any.fromFunction1(value))
      
      inline def setSetMinValueUndefined: Self = StObject.set(x, "setMinValue", js.undefined)
      
      inline def setSetReadOnly(value: /* readOnly */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setReadOnly", js.Any.fromFunction1(value))
      
      inline def setSetReadOnlyUndefined: Self = StObject.set(x, "setReadOnly", js.undefined)
      
      inline def setSetThumbConfig(value: /* thumbConfig */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setThumbConfig", js.Any.fromFunction1(value))
      
      inline def setSetThumbConfigUndefined: Self = StObject.set(x, "setThumbConfig", js.undefined)
      
      inline def setSetValue(value: /* value */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
      
      inline def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
      
      inline def setSetValues(value: /* value */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setValues", js.Any.fromFunction1(value))
      
      inline def setSetValuesUndefined: Self = StObject.set(x, "setValues", js.undefined)
      
      inline def setThumbConfig(value: Any): Self = StObject.set(x, "thumbConfig", value.asInstanceOf[js.Any])
      
      inline def setThumbConfigUndefined: Self = StObject.set(x, "thumbConfig", js.undefined)
      
      inline def setUpdateValue(value: (/* newValue */ js.UndefOr[Any], /* oldValue */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "updateValue", js.Any.fromFunction2(value))
      
      inline def setUpdateValueUndefined: Self = StObject.set(x, "updateValue", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
  
  trait IThumb
    extends StObject
       with IComponent {
    
    /** [Config Option] (Object) */
    var draggable: js.UndefOr[Any] = js.undefined
    
    /** [Method] Returns the value of draggable
      * @returns Object
      */
    var getDraggable: js.UndefOr[js.Function0[Any]] = js.undefined
  }
  object IThumb {
    
    inline def apply(): IThumb = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IThumb]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IThumb] (val x: Self) extends AnyVal {
      
      inline def setDraggable(value: Any): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setGetDraggable(value: () => Any): Self = StObject.set(x, "getDraggable", js.Any.fromFunction0(value))
      
      inline def setGetDraggableUndefined: Self = StObject.set(x, "getDraggable", js.undefined)
    }
  }
  
  trait IToggle
    extends StObject
       with ISlider {
    
    /** [Method] Sets the increment configuration
      * @returns Number
      */
    @JSName("applyIncrement")
    var applyIncrement_IToggle: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the value of maxValueCls
      * @returns String
      */
    var getMaxValueCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Method] Returns the value of minValueCls
      * @returns String
      */
    var getMinValueCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Config Option] (String) */
    var maxValueCls: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (String) */
    var minValueCls: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Sets the value of maxValueCls
      * @param maxValueCls String The new value.
      */
    var setMaxValueCls: js.UndefOr[js.Function1[/* maxValueCls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Sets the value of minValueCls
      * @param minValueCls String The new value.
      */
    var setMinValueCls: js.UndefOr[js.Function1[/* minValueCls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Sets the value of value
      * @param newValue Object
      * @param oldValue Object
      */
    @JSName("setValue")
    var setValue_IToggle: js.UndefOr[
        js.Function2[/* newValue */ js.UndefOr[Any], /* oldValue */ js.UndefOr[Any], Unit]
      ] = js.undefined
  }
  object IToggle {
    
    inline def apply(): IToggle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IToggle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IToggle] (val x: Self) extends AnyVal {
      
      inline def setApplyIncrement(value: () => Double): Self = StObject.set(x, "applyIncrement", js.Any.fromFunction0(value))
      
      inline def setApplyIncrementUndefined: Self = StObject.set(x, "applyIncrement", js.undefined)
      
      inline def setGetMaxValueCls(value: () => java.lang.String): Self = StObject.set(x, "getMaxValueCls", js.Any.fromFunction0(value))
      
      inline def setGetMaxValueClsUndefined: Self = StObject.set(x, "getMaxValueCls", js.undefined)
      
      inline def setGetMinValueCls(value: () => java.lang.String): Self = StObject.set(x, "getMinValueCls", js.Any.fromFunction0(value))
      
      inline def setGetMinValueClsUndefined: Self = StObject.set(x, "getMinValueCls", js.undefined)
      
      inline def setMaxValueCls(value: java.lang.String): Self = StObject.set(x, "maxValueCls", value.asInstanceOf[js.Any])
      
      inline def setMaxValueClsUndefined: Self = StObject.set(x, "maxValueCls", js.undefined)
      
      inline def setMinValueCls(value: java.lang.String): Self = StObject.set(x, "minValueCls", value.asInstanceOf[js.Any])
      
      inline def setMinValueClsUndefined: Self = StObject.set(x, "minValueCls", js.undefined)
      
      inline def setSetMaxValueCls(value: /* maxValueCls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setMaxValueCls", js.Any.fromFunction1(value))
      
      inline def setSetMaxValueClsUndefined: Self = StObject.set(x, "setMaxValueCls", js.undefined)
      
      inline def setSetMinValueCls(value: /* minValueCls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setMinValueCls", js.Any.fromFunction1(value))
      
      inline def setSetMinValueClsUndefined: Self = StObject.set(x, "setMinValueCls", js.undefined)
      
      inline def setSetValue(value: (/* newValue */ js.UndefOr[Any], /* oldValue */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction2(value))
      
      inline def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
    }
  }
}
