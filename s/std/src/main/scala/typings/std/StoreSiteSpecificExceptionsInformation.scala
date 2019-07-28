package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreSiteSpecificExceptionsInformation extends StoreExceptionsInformation {
  var arrayOfDomainStrings: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object StoreSiteSpecificExceptionsInformation {
  @scala.inline
  def apply(
    arrayOfDomainStrings: js.Array[java.lang.String] = null,
    detailURI: java.lang.String = null,
    domain: java.lang.String = null,
    explanationString: java.lang.String = null,
    siteName: java.lang.String = null
  ): StoreSiteSpecificExceptionsInformation = {
    val __obj = js.Dynamic.literal()
    if (arrayOfDomainStrings != null) __obj.updateDynamic("arrayOfDomainStrings")(arrayOfDomainStrings)
    if (detailURI != null) __obj.updateDynamic("detailURI")(detailURI)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (explanationString != null) __obj.updateDynamic("explanationString")(explanationString)
    if (siteName != null) __obj.updateDynamic("siteName")(siteName)
    __obj.asInstanceOf[StoreSiteSpecificExceptionsInformation]
  }
}

