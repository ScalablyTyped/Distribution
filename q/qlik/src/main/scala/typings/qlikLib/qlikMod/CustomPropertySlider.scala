package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPropertySlider extends CustomPropertyCommon {
  var component: qlikLib.qlikLibStrings.slider
  var defaultValue: js.UndefOr[scala.Double] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var step: js.UndefOr[scala.Double] = js.undefined
  @JSName("type")
  var type_CustomPropertySlider: qlikLib.qlikLibStrings.number
}

