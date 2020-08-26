package typings.senchaTouch.Ext.slider

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISlider extends IContainer {
  /** [Config Option] (Boolean) */
  var allowThumbsOverlapping: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean/Object) */
  var animation: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var animationDuration: js.UndefOr[Boolean] = js.native
  /** [Method] Sets the increment configuration
    * @param increment Number
    * @returns Number
    */
  var applyIncrement: js.UndefOr[js.Function1[/* increment */ js.UndefOr[Double], Double]] = js.native
  /** [Method] Returns the value of allowThumbsOverlapping
    * @returns Boolean
    */
  var getAllowThumbsOverlapping: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of animation
    * @returns Boolean/Object
    */
  var getAnimation: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of increment
    * @returns Number
    */
  var getIncrement: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of maxValue
    * @returns Number
    */
  var getMaxValue: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of minValue
    * @returns Number
    */
  var getMinValue: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of readOnly
    * @returns Boolean
    */
  var getReadOnly: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the Thumb instance bound to this Slider
    * @param index Number The index of Thumb to return.
    * @returns Ext.slider.Thumb The thumb instance
    */
  var getThumb: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], IThumb]] = js.native
  /** [Method] Returns the value of thumbConfig
    * @returns Object
    */
  var getThumbConfig: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the Thumb instances bound to this Slider
    * @returns Ext.slider.Thumb[] The thumb instances
    */
  var getThumbs: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of value
    * @returns Number/Number[]
    */
  var getValue: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Convenience method
    * @returns Object
    */
  var getValues: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (Number) */
  var increment: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var maxValue: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var minValue: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var readOnly: js.UndefOr[Boolean] = js.native
  /** [Method] Sets the value of allowThumbsOverlapping
    * @param allowThumbsOverlapping Boolean The new value.
    */
  var setAllowThumbsOverlapping: js.UndefOr[js.Function1[/* allowThumbsOverlapping */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of animation
    * @param animation Boolean/Object The new value.
    */
  var setAnimation: js.UndefOr[js.Function1[/* animation */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of increment
    * @param increment Number The new value.
    */
  var setIncrement: js.UndefOr[js.Function1[/* increment */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of maxValue
    * @param maxValue Number The new value.
    */
  var setMaxValue: js.UndefOr[js.Function1[/* maxValue */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of minValue
    * @param minValue Number The new value.
    */
  var setMinValue: js.UndefOr[js.Function1[/* minValue */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of readOnly
    * @param readOnly Boolean The new value.
    */
  var setReadOnly: js.UndefOr[js.Function1[/* readOnly */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of thumbConfig
    * @param thumbConfig Object The new value.
    */
  var setThumbConfig: js.UndefOr[js.Function1[/* thumbConfig */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of value
    * @param value Number/Number[] The new value.
    */
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Convenience method
    * @param value Object
    */
  var setValues: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Object) */
  var thumbConfig: js.UndefOr[js.Any] = js.native
  /** [Method] Updates the sliders thumbs with their new value s
    * @param newValue Object
    * @param oldValue Object
    */
  var updateValue: js.UndefOr[
    js.Function2[/* newValue */ js.UndefOr[js.Any], /* oldValue */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Config Option] (Number/Number[]) */
  var value: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number/Number[]) */
  var values: js.UndefOr[js.Any] = js.native
}

object ISlider {
  @scala.inline
  def apply(): ISlider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISlider]
  }
  @scala.inline
  implicit class ISliderOps[Self <: ISlider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowThumbsOverlapping(value: Boolean): Self = this.set("allowThumbsOverlapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowThumbsOverlapping: Self = this.set("allowThumbsOverlapping", js.undefined)
    @scala.inline
    def setAnimation(value: js.Any): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setAnimationDuration(value: Boolean): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    @scala.inline
    def setApplyIncrement(value: /* increment */ js.UndefOr[Double] => Double): Self = this.set("applyIncrement", js.Any.fromFunction1(value))
    @scala.inline
    def deleteApplyIncrement: Self = this.set("applyIncrement", js.undefined)
    @scala.inline
    def setGetAllowThumbsOverlapping(value: () => Boolean): Self = this.set("getAllowThumbsOverlapping", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetAllowThumbsOverlapping: Self = this.set("getAllowThumbsOverlapping", js.undefined)
    @scala.inline
    def setGetAnimation(value: () => _): Self = this.set("getAnimation", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetAnimation: Self = this.set("getAnimation", js.undefined)
    @scala.inline
    def setGetIncrement(value: () => Double): Self = this.set("getIncrement", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetIncrement: Self = this.set("getIncrement", js.undefined)
    @scala.inline
    def setGetMaxValue(value: () => Double): Self = this.set("getMaxValue", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMaxValue: Self = this.set("getMaxValue", js.undefined)
    @scala.inline
    def setGetMinValue(value: () => Double): Self = this.set("getMinValue", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMinValue: Self = this.set("getMinValue", js.undefined)
    @scala.inline
    def setGetReadOnly(value: () => Boolean): Self = this.set("getReadOnly", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetReadOnly: Self = this.set("getReadOnly", js.undefined)
    @scala.inline
    def setGetThumb(value: /* index */ js.UndefOr[Double] => IThumb): Self = this.set("getThumb", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetThumb: Self = this.set("getThumb", js.undefined)
    @scala.inline
    def setGetThumbConfig(value: () => _): Self = this.set("getThumbConfig", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetThumbConfig: Self = this.set("getThumbConfig", js.undefined)
    @scala.inline
    def setGetThumbs(value: () => Array): Self = this.set("getThumbs", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetThumbs: Self = this.set("getThumbs", js.undefined)
    @scala.inline
    def setGetValue(value: () => _): Self = this.set("getValue", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetValue: Self = this.set("getValue", js.undefined)
    @scala.inline
    def setGetValues(value: () => _): Self = this.set("getValues", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetValues: Self = this.set("getValues", js.undefined)
    @scala.inline
    def setIncrement(value: Double): Self = this.set("increment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncrement: Self = this.set("increment", js.undefined)
    @scala.inline
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    @scala.inline
    def setMinValue(value: Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setSetAllowThumbsOverlapping(value: /* allowThumbsOverlapping */ js.UndefOr[Boolean] => Unit): Self = this.set("setAllowThumbsOverlapping", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetAllowThumbsOverlapping: Self = this.set("setAllowThumbsOverlapping", js.undefined)
    @scala.inline
    def setSetAnimation(value: /* animation */ js.UndefOr[js.Any] => Unit): Self = this.set("setAnimation", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetAnimation: Self = this.set("setAnimation", js.undefined)
    @scala.inline
    def setSetIncrement(value: /* increment */ js.UndefOr[Double] => Unit): Self = this.set("setIncrement", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetIncrement: Self = this.set("setIncrement", js.undefined)
    @scala.inline
    def setSetMaxValue(value: /* maxValue */ js.UndefOr[Double] => Unit): Self = this.set("setMaxValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMaxValue: Self = this.set("setMaxValue", js.undefined)
    @scala.inline
    def setSetMinValue(value: /* minValue */ js.UndefOr[Double] => Unit): Self = this.set("setMinValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMinValue: Self = this.set("setMinValue", js.undefined)
    @scala.inline
    def setSetReadOnly(value: /* readOnly */ js.UndefOr[Boolean] => Unit): Self = this.set("setReadOnly", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetReadOnly: Self = this.set("setReadOnly", js.undefined)
    @scala.inline
    def setSetThumbConfig(value: /* thumbConfig */ js.UndefOr[js.Any] => Unit): Self = this.set("setThumbConfig", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetThumbConfig: Self = this.set("setThumbConfig", js.undefined)
    @scala.inline
    def setSetValue(value: /* value */ js.UndefOr[js.Any] => Unit): Self = this.set("setValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetValue: Self = this.set("setValue", js.undefined)
    @scala.inline
    def setSetValues(value: /* value */ js.UndefOr[js.Any] => Unit): Self = this.set("setValues", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetValues: Self = this.set("setValues", js.undefined)
    @scala.inline
    def setThumbConfig(value: js.Any): Self = this.set("thumbConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbConfig: Self = this.set("thumbConfig", js.undefined)
    @scala.inline
    def setUpdateValue(value: (/* newValue */ js.UndefOr[js.Any], /* oldValue */ js.UndefOr[js.Any]) => Unit): Self = this.set("updateValue", js.Any.fromFunction2(value))
    @scala.inline
    def deleteUpdateValue: Self = this.set("updateValue", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValues(value: js.Any): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

