package typings
package rcDashSliderLib.rcDashSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonApiProps extends js.Object {
  /**
    * The style used for the active dots.
    */
  var activeDotStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /**
    * Additional CSS class for the root DOM node
    *  @default ''
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If true, handles can't be moved.
    *  @default false
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The style used for the dots.
    */
  var dotStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /**
    * When the step value is greater than 1, you can set the dots to true if you want to render the slider with dots.
    *  @default false
    */
  var dots: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A handle generator which could be used to customized handle.
    */
  var handle: js.UndefOr[js.Function1[/* props */ js.Any, reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  /**
    * The style used for handle. (both for slider(Object) and range(Array of Object), the array will be used for mutli handle follow element order)
    */
  var handleStyle: js.UndefOr[
    js.Array[reactLib.reactMod.ReactNs.CSSProperties] | reactLib.reactMod.ReactNs.CSSProperties
  ] = js.undefined
  /**
    * If the value is true, it means a continuous value interval, otherwise, it is a independent value.
    *  @default true
    */
  var included: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Marks on the slider. The key determines the position, and the value determines what will show.
    * If you want to set the style of a specific mark point, the value should be an object which contains style and label properties.
    *  @default '{}' | {number: { style, label }}
    */
  var marks: js.UndefOr[Marks] = js.undefined
  /**
    * The maximum value of the slider
    *  @default 100
    */
  var max: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minimum value of the slider
    *  @default 0
    */
  var min: js.UndefOr[scala.Double] = js.undefined
  /**
    * The style used for the track base color.
    */
  var railStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /**
    * Value to be added or subtracted on each step the slider makes. Must be greater than zero, and max - min should be evenly divisible by the step value.
    *  @default 1
    */
  var step: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * The style used for the background and container. (both for slider(Object) and range(Array of Object), the array will be used for mutli handle follow element order)
    */
  var style: js.UndefOr[
    js.Array[reactLib.reactMod.ReactNs.CSSProperties] | reactLib.reactMod.ReactNs.CSSProperties
  ] = js.undefined
  /**
    * @deprecated in version ^6.0.0. Use rc-tooltip
    * Tooltip formatter
    */
  var tipFormatter: js.UndefOr[(js.Function1[/* value */ js.Any, js.UndefOr[_]]) | scala.Null] = js.undefined
  /**
    * @deprecated in version ^6.0.0. Use rc-tooltip
    * Tooltip transition class name
    */
  var tipTransitionName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The style used for track. (both for slider(Object) and range(Array of Object), the array will be used for mutli track follow element order)
    */
  var trackStyle: js.UndefOr[
    js.Array[reactLib.reactMod.ReactNs.CSSProperties] | reactLib.reactMod.ReactNs.CSSProperties
  ] = js.undefined
  /**
    * If vertical is true, the slider will be vertical.
    * @default false
    */
  var vertical: js.UndefOr[scala.Boolean] = js.undefined
}

