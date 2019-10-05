package typings.atPulumiAws.typesOutputMod.dms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointMongodbSettings extends js.Object {
  var authMechanism: js.UndefOr[String] = js.undefined
  var authSource: js.UndefOr[String] = js.undefined
  var authType: js.UndefOr[String] = js.undefined
  var docsToInvestigate: js.UndefOr[String] = js.undefined
  var extractDocId: js.UndefOr[String] = js.undefined
  var nestingLevel: js.UndefOr[String] = js.undefined
}

object EndpointMongodbSettings {
  @scala.inline
  def apply(
    authMechanism: String = null,
    authSource: String = null,
    authType: String = null,
    docsToInvestigate: String = null,
    extractDocId: String = null,
    nestingLevel: String = null
  ): EndpointMongodbSettings = {
    val __obj = js.Dynamic.literal()
    if (authMechanism != null) __obj.updateDynamic("authMechanism")(authMechanism)
    if (authSource != null) __obj.updateDynamic("authSource")(authSource)
    if (authType != null) __obj.updateDynamic("authType")(authType)
    if (docsToInvestigate != null) __obj.updateDynamic("docsToInvestigate")(docsToInvestigate)
    if (extractDocId != null) __obj.updateDynamic("extractDocId")(extractDocId)
    if (nestingLevel != null) __obj.updateDynamic("nestingLevel")(nestingLevel)
    __obj.asInstanceOf[EndpointMongodbSettings]
  }
}

