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

