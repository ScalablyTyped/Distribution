package typings
package sipDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FromDisplayName extends js.Object {
  var fromDisplayName: js.UndefOr[java.lang.String] = js.undefined
  var fromTag: js.UndefOr[java.lang.String] = js.undefined
  var fromUri: js.UndefOr[java.lang.String | sipDotJsLib.libCoreMod.URI] = js.undefined
  var toDisplayName: js.UndefOr[java.lang.String] = js.undefined
  var toUri: js.UndefOr[java.lang.String | sipDotJsLib.libCoreMod.URI] = js.undefined
}

object Anon_FromDisplayName {
  @scala.inline
  def apply(
    fromDisplayName: java.lang.String = null,
    fromTag: java.lang.String = null,
    fromUri: java.lang.String | sipDotJsLib.libCoreMod.URI = null,
    toDisplayName: java.lang.String = null,
    toUri: java.lang.String | sipDotJsLib.libCoreMod.URI = null
  ): Anon_FromDisplayName = {
    val __obj = js.Dynamic.literal()
    if (fromDisplayName != null) __obj.updateDynamic("fromDisplayName")(fromDisplayName)
    if (fromTag != null) __obj.updateDynamic("fromTag")(fromTag)
    if (fromUri != null) __obj.updateDynamic("fromUri")(fromUri.asInstanceOf[js.Any])
    if (toDisplayName != null) __obj.updateDynamic("toDisplayName")(toDisplayName)
    if (toUri != null) __obj.updateDynamic("toUri")(toUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FromDisplayName]
  }
}

