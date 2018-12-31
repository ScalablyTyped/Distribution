package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPropertyString extends CustomPropertyCommon {
  var defaultValue: js.UndefOr[java.lang.String] = js.undefined
  var expression: js.UndefOr[
    qlikLib.qlikLibStrings.always | qlikLib.qlikLibStrings.optional | qlikLib.qlikLibStrings.Empty
  ] = js.undefined
  var maxLength: js.UndefOr[scala.Double] = js.undefined
  @JSName("type")
  var type_CustomPropertyString: qlikLib.qlikLibStrings.string
}

