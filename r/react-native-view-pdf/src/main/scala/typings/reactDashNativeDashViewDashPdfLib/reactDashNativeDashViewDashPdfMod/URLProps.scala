package typings
package reactDashNativeDashViewDashPdfLib.reactDashNativeDashViewDashPdfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URLProps extends js.Object {
  var body: js.UndefOr[java.lang.String] = js.undefined
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var method: js.UndefOr[reactDashNativeDashViewDashPdfLib.HTTPMethod] = js.undefined
}

object URLProps {
  @scala.inline
  def apply(
    body: java.lang.String = null,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    method: reactDashNativeDashViewDashPdfLib.HTTPMethod = null
  ): URLProps = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (method != null) __obj.updateDynamic("method")(method)
    __obj.asInstanceOf[URLProps]
  }
}

