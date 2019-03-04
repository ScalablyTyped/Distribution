package typings
package sipDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ToDisplayName extends js.Object {
  var toDisplayName: java.lang.String
  var toUri: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ToDisplayName {
  @scala.inline
  def apply(toDisplayName: java.lang.String, toUri: java.lang.String = null): Anon_ToDisplayName = {
    val __obj = js.Dynamic.literal(toDisplayName = toDisplayName)
    if (toUri != null) __obj.updateDynamic("toUri")(toUri)
    __obj.asInstanceOf[Anon_ToDisplayName]
  }
}

