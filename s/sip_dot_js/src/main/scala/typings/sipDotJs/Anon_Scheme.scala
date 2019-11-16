package typings.sipDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Scheme extends js.Object {
  var scheme: js.UndefOr[String] = js.undefined
  var sipUri: js.UndefOr[String] = js.undefined
}

object Anon_Scheme {
  @scala.inline
  def apply(scheme: String = null, sipUri: String = null): Anon_Scheme = {
    val __obj = js.Dynamic.literal()
    if (scheme != null) __obj.updateDynamic("scheme")(scheme)
    if (sipUri != null) __obj.updateDynamic("sipUri")(sipUri)
    __obj.asInstanceOf[Anon_Scheme]
  }
}

