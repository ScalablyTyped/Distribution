package typings
package ravenLib.ravenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptureOptions extends js.Object {
  var extra: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var fingerprint: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var level: js.UndefOr[java.lang.String] = js.undefined
  var req: js.UndefOr[nodeLib.httpMod.IncomingMessage] = js.undefined
  var tags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var user: js.UndefOr[js.Any] = js.undefined
}

object CaptureOptions {
  @scala.inline
  def apply(
    extra: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    fingerprint: js.Array[java.lang.String] = null,
    level: java.lang.String = null,
    req: nodeLib.httpMod.IncomingMessage = null,
    tags: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
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

