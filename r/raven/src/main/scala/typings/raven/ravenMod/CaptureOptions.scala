package typings.raven.ravenMod

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
    if (extra != null) __obj.updateDynamic("extra")(extra)
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint)
    if (level != null) __obj.updateDynamic("level")(level)
    if (req != null) __obj.updateDynamic("req")(req)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[CaptureOptions]
  }
}

