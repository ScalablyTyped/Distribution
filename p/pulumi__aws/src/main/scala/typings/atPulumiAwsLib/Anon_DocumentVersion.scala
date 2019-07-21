package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DocumentVersion extends js.Object {
  var documentVersion: js.UndefOr[java.lang.String] = js.undefined
  var parameters: js.UndefOr[js.Array[Anon_NameValues]] = js.undefined
}

object Anon_DocumentVersion {
  @scala.inline
  def apply(documentVersion: java.lang.String = null, parameters: js.Array[Anon_NameValues] = null): Anon_DocumentVersion = {
    val __obj = js.Dynamic.literal()
    if (documentVersion != null) __obj.updateDynamic("documentVersion")(documentVersion)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    __obj.asInstanceOf[Anon_DocumentVersion]
  }
}

