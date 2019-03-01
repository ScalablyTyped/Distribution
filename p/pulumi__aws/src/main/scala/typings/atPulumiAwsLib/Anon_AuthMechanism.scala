package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthMechanism extends js.Object {
  var authMechanism: js.UndefOr[java.lang.String] = js.undefined
  var authSource: js.UndefOr[java.lang.String] = js.undefined
  var authType: js.UndefOr[java.lang.String] = js.undefined
  var docsToInvestigate: js.UndefOr[java.lang.String] = js.undefined
  var extractDocId: js.UndefOr[java.lang.String] = js.undefined
  var nestingLevel: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AuthMechanism {
  @scala.inline
  def apply(
    authMechanism: java.lang.String = null,
    authSource: java.lang.String = null,
    authType: java.lang.String = null,
    docsToInvestigate: java.lang.String = null,
    extractDocId: java.lang.String = null,
    nestingLevel: java.lang.String = null
  ): Anon_AuthMechanism = {
    val __obj = js.Dynamic.literal()
    if (authMechanism != null) __obj.updateDynamic("authMechanism")(authMechanism)
    if (authSource != null) __obj.updateDynamic("authSource")(authSource)
    if (authType != null) __obj.updateDynamic("authType")(authType)
    if (docsToInvestigate != null) __obj.updateDynamic("docsToInvestigate")(docsToInvestigate)
    if (extractDocId != null) __obj.updateDynamic("extractDocId")(extractDocId)
    if (nestingLevel != null) __obj.updateDynamic("nestingLevel")(nestingLevel)
    __obj.asInstanceOf[Anon_AuthMechanism]
  }
}

