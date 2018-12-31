package typings
package prettierLib.prettierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SupportOption extends js.Object {
  var array: js.UndefOr[scala.Boolean] = js.undefined
  var choices: js.UndefOr[SupportOptionChoice] = js.undefined
  var default: SupportOptionValue
  var deprecated: js.UndefOr[java.lang.String] = js.undefined
  var description: java.lang.String
  var oppositeDescription: js.UndefOr[java.lang.String] = js.undefined
  var range: js.UndefOr[SupportOptionRange] = js.undefined
  var redirect: js.UndefOr[SupportOptionRedirect] = js.undefined
  var since: js.UndefOr[java.lang.String] = js.undefined
  var `type`: prettierLib.prettierLibStrings.int | prettierLib.prettierLibStrings.boolean | prettierLib.prettierLibStrings.choice | prettierLib.prettierLibStrings.path
}

