package typings.pulumiAws.outputMod.dms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointMongodbSettings extends js.Object {
  var authMechanism: js.UndefOr[String] = js.native
  var authSource: js.UndefOr[String] = js.native
  var authType: js.UndefOr[String] = js.native
  var docsToInvestigate: js.UndefOr[String] = js.native
  var extractDocId: js.UndefOr[String] = js.native
  var nestingLevel: js.UndefOr[String] = js.native
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
    if (authMechanism != null) __obj.updateDynamic("authMechanism")(authMechanism.asInstanceOf[js.Any])
    if (authSource != null) __obj.updateDynamic("authSource")(authSource.asInstanceOf[js.Any])
    if (authType != null) __obj.updateDynamic("authType")(authType.asInstanceOf[js.Any])
    if (docsToInvestigate != null) __obj.updateDynamic("docsToInvestigate")(docsToInvestigate.asInstanceOf[js.Any])
    if (extractDocId != null) __obj.updateDynamic("extractDocId")(extractDocId.asInstanceOf[js.Any])
    if (nestingLevel != null) __obj.updateDynamic("nestingLevel")(nestingLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointMongodbSettings]
  }
}

