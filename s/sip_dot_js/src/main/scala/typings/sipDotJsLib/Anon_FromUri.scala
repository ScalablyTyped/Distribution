package typings
package sipDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FromUri extends js.Object {
  var fromUri: js.UndefOr[java.lang.String | sipDotJsLib.libCoreMod.URI] = js.undefined
  var toDisplayName: js.UndefOr[java.lang.String] = js.undefined
  var toUri: js.UndefOr[java.lang.String | sipDotJsLib.libCoreMod.URI] = js.undefined
}

object Anon_FromUri {
  @scala.inline
  def apply(
    fromUri: java.lang.String | sipDotJsLib.libCoreMod.URI = null,
    toDisplayName: java.lang.String = null,
    toUri: java.lang.String | sipDotJsLib.libCoreMod.URI = null
  ): Anon_FromUri = {
    val __obj = js.Dynamic.literal()
    if (fromUri != null) __obj.updateDynamic("fromUri")(fromUri.asInstanceOf[js.Any])
    if (toDisplayName != null) __obj.updateDynamic("toDisplayName")(toDisplayName)
    if (toUri != null) __obj.updateDynamic("toUri")(toUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FromUri]
  }
}

