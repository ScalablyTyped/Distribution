package typings.raven.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptureOptions extends js.Object {
  var extra: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var fingerprint: js.UndefOr[js.Array[String]] = js.undefined
  var level: js.UndefOr[String] = js.undefined
  var req: js.UndefOr[IncomingMessage] = js.undefined
  var tags: js.UndefOr[StringDictionary[String]] = js.undefined
  var user: js.UndefOr[js.Any] = js.undefined
}

object CaptureOptions {
  @scala.inline
  def apply(
    extra: StringDictionary[js.Any] = null,
    fingerprint: js.Array[String] = null,
    level: String = null,
    req: IncomingMessage = null,
    tags: StringDictionary[String] = null,
    user: js.Any = null
  ): CaptureOptions = {
    val __obj = js.Dynamic.literal()
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (req != null) __obj.updateDynamic("req")(req.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureOptions]
  }
}

