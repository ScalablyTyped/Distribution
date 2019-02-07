package typings
package rcDashSliderLib.rcDashSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeProps extends CommonApiProps {
  /**
    * allowCross could be set as true to allow those handles to cross.
    *  @default true
    */
  var allowCross: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Determine how many ranges to render, and multiple handles will be rendered (number + 1).
    *  @default 1
    */
  var count: js.UndefOr[scala.Double] = js.undefined
  /**
    * Set initial positions of handles.
    *  @default [0,0]
    */
  var defaultValue: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * onAfterChange will be triggered when ontouchend or onmouseup is triggered.
    * For prop (count = -1) type returned is [number, undefined]. Bug raised in rc-slider https://github.com/react-component/slider/issues/457
    */
  var onAfterChange: js.UndefOr[js.Function1[/* value */ js.Array[scala.Double], scala.Unit]] = js.undefined
  /**
    * onBeforeChange will be triggered when ontouchstart or onmousedown is triggered.
    * For prop (count = -1) type returned is [number, undefined]. Bug raised in rc-slider https://github.com/react-component/slider/issues/457
    */
  var onBeforeChange: js.UndefOr[js.Function1[/* value */ js.Array[scala.Double], scala.Unit]] = js.undefined
  /**
    * onChange will be triggered while the value of Slider changing.
    * For prop (count = -1) type returned is [number, undefined]. Bug raised in rc-slider https://github.com/react-component/slider/issues/457
    */
  var onChange: js.UndefOr[js.Function1[/* value */ js.Array[scala.Double], scala.Unit]] = js.undefined
  /**
    * pushable could be set as true to allow pushing of surrounding handles when moving an handle. When set to a number, the number will be the minimum ensured distance between handles.
    *  @default true
    */
  var pushable: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  /**
    * Set the tabIndex of each handle.
    * @default [0,0]
    */
  var tabIndex: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * Set current positions of handles.
    */
  var value: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

