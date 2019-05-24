package typings
package sipDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallId extends js.Object {
  var callId: js.UndefOr[java.lang.String] = js.undefined
  var cseq: js.UndefOr[scala.Double] = js.undefined
  var fromDisplayName: js.UndefOr[java.lang.String] = js.undefined
  var fromTag: js.UndefOr[java.lang.String] = js.undefined
  var fromUri: js.UndefOr[sipDotJsLib.libURIMod.URI] = js.undefined
  var routeSet: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var toTag: js.UndefOr[java.lang.String] = js.undefined
  var toUri: js.UndefOr[sipDotJsLib.libURIMod.URI] = js.undefined
}

object Anon_CallId {
  @scala.inline
  def apply(
    callId: java.lang.String = null,
    cseq: scala.Int | scala.Double = null,
    fromDisplayName: java.lang.String = null,
    fromTag: java.lang.String = null,
    fromUri: sipDotJsLib.libURIMod.URI = null,
    routeSet: js.Array[java.lang.String] = null,
    toTag: java.lang.String = null,
    toUri: sipDotJsLib.libURIMod.URI = null
  ): Anon_CallId = {
    val __obj = js.Dynamic.literal()
    if (callId != null) __obj.updateDynamic("callId")(callId)
    if (cseq != null) __obj.updateDynamic("cseq")(cseq.asInstanceOf[js.Any])
    if (fromDisplayName != null) __obj.updateDynamic("fromDisplayName")(fromDisplayName)
    if (fromTag != null) __obj.updateDynamic("fromTag")(fromTag)
    if (fromUri != null) __obj.updateDynamic("fromUri")(fromUri)
    if (routeSet != null) __obj.updateDynamic("routeSet")(routeSet)
    if (toTag != null) __obj.updateDynamic("toTag")(toTag)
    if (toUri != null) __obj.updateDynamic("toUri")(toUri)
    __obj.asInstanceOf[Anon_CallId]
  }
}

