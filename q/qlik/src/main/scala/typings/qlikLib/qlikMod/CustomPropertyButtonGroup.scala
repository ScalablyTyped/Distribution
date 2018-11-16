package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CustomPropertyButtonGroup extends CustomPropertyCommon {
  var component: qlikLib.qlikLibStrings.buttongroup
  var defaultValue: js.UndefOr[java.lang.String] = js.undefined
  var options: js.UndefOr[js.Array[ButtonGroupOption] | js.Function0[js.Array[ButtonGroupOption]]] = js.undefined
  @JSName("type")
  var type_CustomPropertyButtonGroup: qlikLib.qlikLibStrings.string
}

