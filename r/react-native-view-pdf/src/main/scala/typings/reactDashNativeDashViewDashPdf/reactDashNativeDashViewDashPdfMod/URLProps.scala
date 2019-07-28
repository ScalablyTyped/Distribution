package typings.reactDashNativeDashViewDashPdf.reactDashNativeDashViewDashPdfMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URLProps extends js.Object {
  var body: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var method: js.UndefOr[HTTPMethod] = js.undefined
}

object URLProps {
  @scala.inline
  def apply(body: String = null, headers: StringDictionary[String] = null, method: HTTPMethod = null): URLProps = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (method != null) __obj.updateDynamic("method")(method)
    __obj.asInstanceOf[URLProps]
  }
}

