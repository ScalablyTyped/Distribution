package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreExceptionsInformation extends ExceptionInformation {
  var detailURI: js.UndefOr[java.lang.String | Null] = js.undefined
  var explanationString: js.UndefOr[java.lang.String | Null] = js.undefined
  var siteName: js.UndefOr[java.lang.String | Null] = js.undefined
}

object StoreExceptionsInformation {
  @scala.inline
  def apply(
    detailURI: java.lang.String = null,
    domain: java.lang.String = null,
    explanationString: java.lang.String = null,
    siteName: java.lang.String = null
  ): StoreExceptionsInformation = {
    val __obj = js.Dynamic.literal()
    if (detailURI != null) __obj.updateDynamic("detailURI")(detailURI)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (explanationString != null) __obj.updateDynamic("explanationString")(explanationString)
    if (siteName != null) __obj.updateDynamic("siteName")(siteName)
    __obj.asInstanceOf[StoreExceptionsInformation]
  }
}

