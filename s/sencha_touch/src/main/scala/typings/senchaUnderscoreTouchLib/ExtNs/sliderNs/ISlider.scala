package typings
package senchaUnderscoreTouchLib.ExtNs.sliderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISlider
  extends senchaUnderscoreTouchLib.ExtNs.IContainer {
  /** [Config Option] (Boolean) */
  var allowThumbsOverlapping: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean/Object) */
  var animation: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var animationDuration: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Sets the increment configuration
  		* @param increment Number
  		* @returns Number
  		*/
  var applyIncrement: js.UndefOr[js.Function1[/* increment */ js.UndefOr[scala.Double], scala.Double]] = js.undefined
  /** [Method] Returns the value of allowThumbsOverlapping
  		* @returns Boolean
  		*/
  var getAllowThumbsOverlapping: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of animation
  		* @returns Boolean/Object
  		*/
  var getAnimation: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of increment
  		* @returns Number
  		*/
  var getIncrement: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of maxValue
  		* @returns Number
  		*/
  var getMaxValue: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of minValue
  		* @returns Number
  		*/
  var getMinValue: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of readOnly
  		* @returns Boolean
  		*/
  var getReadOnly: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the Thumb instance bound to this Slider
  		* @param index Number The index of Thumb to return.
  		* @returns Ext.slider.Thumb The thumb instance
  		*/
  var getThumb: js.UndefOr[js.Function1[/* index */ js.UndefOr[scala.Double], IThumb]] = js.undefined
  /** [Method] Returns the value of thumbConfig
  		* @returns Object
  		*/
  var getThumbConfig: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the Thumb instances bound to this Slider
  		* @returns Ext.slider.Thumb[] The thumb instances
  		*/
  var getThumbs: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the value of value
  		* @returns Number/Number[]
  		*/
  var getValue: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Convenience method
  		* @returns Object
  		*/
  var getValues: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Number) */
  var increment: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var maxValue: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var minValue: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean) */
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Sets the value of allowThumbsOverlapping
  		* @param allowThumbsOverlapping Boolean The new value.
  		*/
  var setAllowThumbsOverlapping: js.UndefOr[js.Function1[/* allowThumbsOverlapping */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of animation
  		* @param animation Boolean/Object The new value.
  		*/
  var setAnimation: js.UndefOr[js.Function1[/* animation */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of increment
  		* @param increment Number The new value.
  		*/
  var setIncrement: js.UndefOr[js.Function1[/* increment */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of maxValue
  		* @param maxValue Number The new value.
  		*/
  var setMaxValue: js.UndefOr[js.Function1[/* maxValue */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of minValue
  		* @param minValue Number The new value.
  		*/
  var setMinValue: js.UndefOr[js.Function1[/* minValue */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of readOnly
  		* @param readOnly Boolean The new value.
  		*/
  var setReadOnly: js.UndefOr[js.Function1[/* readOnly */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of thumbConfig
  		* @param thumbConfig Object The new value.
  		*/
  var setThumbConfig: js.UndefOr[js.Function1[/* thumbConfig */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of value
  		* @param value Number/Number[] The new value.
  		*/
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Convenience method
  		* @param value Object
  		*/
  var setValues: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Object) */
  var thumbConfig: js.UndefOr[js.Any] = js.undefined
  /** [Method] Updates the sliders thumbs with their new value s
  		* @param newValue Object
  		* @param oldValue Object
  		*/
  var updateValue: js.UndefOr[
    js.Function2[/* newValue */ js.UndefOr[js.Any], /* oldValue */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Config Option] (Number/Number[]) */
  var value: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number/Number[]) */
  var values: js.UndefOr[js.Any] = js.undefined
}

object ISlider {
  @scala.inline
  def apply(
    IContainer: senchaUnderscoreTouchLib.ExtNs.IContainer = null,
    allowThumbsOverlapping: js.UndefOr[scala.Boolean] = js.undefined,
    animation: js.Any = null,
    animationDuration: js.UndefOr[scala.Boolean] = js.undefined,
    applyIncrement: /* increment */ js.UndefOr[scala.Double] => scala.Double = null,
    baseCls: java.lang.String = null,
    getAllowThumbsOverlapping: () => scala.Boolean = null,
    getAnimation: () => _ = null,
    getBaseCls: () => java.lang.String = null,
    getIncrement: () => scala.Double = null,
    getMaxValue: () => scala.Double = null,
    getMinValue: () => scala.Double = null,
    getReadOnly: () => scala.Boolean = null,
    getThumb: /* index */ js.UndefOr[scala.Double] => IThumb = null,
    getThumbConfig: () => _ = null,
    getThumbs: () => senchaUnderscoreTouchLib.ExtNs.Array = null,
    getValue: () => _ = null,
    getValues: () => _ = null,
    increment: scala.Int | scala.Double = null,
    maxValue: scala.Int | scala.Double = null,
    minValue: scala.Int | scala.Double = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    setAllowThumbsOverlapping: /* allowThumbsOverlapping */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setAnimation: /* animation */ js.UndefOr[js.Any] => scala.Unit = null,
    setBaseCls: /* baseCls */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setIncrement: /* increment */ js.UndefOr[scala.Double] => scala.Unit = null,
    setMaxValue: /* maxValue */ js.UndefOr[scala.Double] => scala.Unit = null,
    setMinValue: /* minValue */ js.UndefOr[scala.Double] => scala.Unit = null,
    setReadOnly: /* readOnly */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setThumbConfig: /* thumbConfig */ js.UndefOr[js.Any] => scala.Unit = null,
    setValue: /* value */ js.UndefOr[js.Any] => scala.Unit = null,
    setValues: /* value */ js.UndefOr[js.Any] => scala.Unit = null,
    thumbConfig: js.Any = null,
    updateValue: (/* newValue */ js.UndefOr[js.Any], /* oldValue */ js.UndefOr[js.Any]) => scala.Unit = null,
    value: js.Any = null,
    values: js.Any = null
  ): ISlider = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IContainer)
    if (!js.isUndefined(allowThumbsOverlapping)) __obj.updateDynamic("allowThumbsOverlapping")(allowThumbsOverlapping)
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (!js.isUndefined(animationDuration)) __obj.updateDynamic("animationDuration")(animationDuration)
    if (applyIncrement != null) __obj.updateDynamic("applyIncrement")(js.Any.fromFunction1(applyIncrement))
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (getAllowThumbsOverlapping != null) __obj.updateDynamic("getAllowThumbsOverlapping")(js.Any.fromFunction0(getAllowThumbsOverlapping))
    if (getAnimation != null) __obj.updateDynamic("getAnimation")(js.Any.fromFunction0(getAnimation))
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(js.Any.fromFunction0(getBaseCls))
    if (getIncrement != null) __obj.updateDynamic("getIncrement")(js.Any.fromFunction0(getIncrement))
    if (getMaxValue != null) __obj.updateDynamic("getMaxValue")(js.Any.fromFunction0(getMaxValue))
    if (getMinValue != null) __obj.updateDynamic("getMinValue")(js.Any.fromFunction0(getMinValue))
    if (getReadOnly != null) __obj.updateDynamic("getReadOnly")(js.Any.fromFunction0(getReadOnly))
    if (getThumb != null) __obj.updateDynamic("getThumb")(js.Any.fromFunction1(getThumb))
    if (getThumbConfig != null) __obj.updateDynamic("getThumbConfig")(js.Any.fromFunction0(getThumbConfig))
    if (getThumbs != null) __obj.updateDynamic("getThumbs")(js.Any.fromFunction0(getThumbs))
    if (getValue != null) __obj.updateDynamic("getValue")(js.Any.fromFunction0(getValue))
    if (getValues != null) __obj.updateDynamic("getValues")(js.Any.fromFunction0(getValues))
    if (increment != null) __obj.updateDynamic("increment")(increment.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (setAllowThumbsOverlapping != null) __obj.updateDynamic("setAllowThumbsOverlapping")(js.Any.fromFunction1(setAllowThumbsOverlapping))
    if (setAnimation != null) __obj.updateDynamic("setAnimation")(js.Any.fromFunction1(setAnimation))
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(js.Any.fromFunction1(setBaseCls))
    if (setIncrement != null) __obj.updateDynamic("setIncrement")(js.Any.fromFunction1(setIncrement))
    if (setMaxValue != null) __obj.updateDynamic("setMaxValue")(js.Any.fromFunction1(setMaxValue))
    if (setMinValue != null) __obj.updateDynamic("setMinValue")(js.Any.fromFunction1(setMinValue))
    if (setReadOnly != null) __obj.updateDynamic("setReadOnly")(js.Any.fromFunction1(setReadOnly))
    if (setThumbConfig != null) __obj.updateDynamic("setThumbConfig")(js.Any.fromFunction1(setThumbConfig))
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction1(setValue))
    if (setValues != null) __obj.updateDynamic("setValues")(js.Any.fromFunction1(setValues))
    if (thumbConfig != null) __obj.updateDynamic("thumbConfig")(thumbConfig)
    if (updateValue != null) __obj.updateDynamic("updateValue")(js.Any.fromFunction2(updateValue))
    if (value != null) __obj.updateDynamic("value")(value)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[ISlider]
  }
}

