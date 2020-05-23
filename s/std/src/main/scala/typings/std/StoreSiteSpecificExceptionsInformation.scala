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
    detailURI: js.UndefOr[Null | java.lang.String] = js.undefined,
    domain: js.UndefOr[Null | java.lang.String] = js.undefined,
    explanationString: js.UndefOr[Null | java.lang.String] = js.undefined,
    siteName: js.UndefOr[Null | java.lang.String] = js.undefined
  ): StoreSiteSpecificExceptionsInformation = {
    val __obj = js.Dynamic.literal()
    if (arrayOfDomainStrings != null) __obj.updateDynamic("arrayOfDomainStrings")(arrayOfDomainStrings.asInstanceOf[js.Any])
    if (!js.isUndefined(detailURI)) __obj.updateDynamic("detailURI")(detailURI.asInstanceOf[js.Any])
    if (!js.isUndefined(domain)) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (!js.isUndefined(explanationString)) __obj.updateDynamic("explanationString")(explanationString.asInstanceOf[js.Any])
    if (!js.isUndefined(siteName)) __obj.updateDynamic("siteName")(siteName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreSiteSpecificExceptionsInformation]
  }
}

