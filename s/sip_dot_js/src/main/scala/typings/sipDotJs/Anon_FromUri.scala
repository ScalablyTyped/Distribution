package typings.sipDotJs

import typings.sipDotJs.libCoreMod.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FromUri extends js.Object {
  var fromUri: js.UndefOr[String | URI] = js.undefined
  var toDisplayName: js.UndefOr[String] = js.undefined
  var toUri: js.UndefOr[String | URI] = js.undefined
}

object Anon_FromUri {
  @scala.inline
  def apply(fromUri: String | URI = null, toDisplayName: String = null, toUri: String | URI = null): Anon_FromUri = {
    val __obj = js.Dynamic.literal()
    if (fromUri != null) __obj.updateDynamic("fromUri")(fromUri.asInstanceOf[js.Any])
    if (toDisplayName != null) __obj.updateDynamic("toDisplayName")(toDisplayName)
    if (toUri != null) __obj.updateDynamic("toUri")(toUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FromUri]
  }
}

