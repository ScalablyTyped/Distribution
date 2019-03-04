package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SamlMetadata extends js.Object {
  var samlMetadata: java.lang.String
  var `type`: java.lang.String
}

object Anon_SamlMetadata {
  @scala.inline
  def apply(samlMetadata: java.lang.String, `type`: java.lang.String): Anon_SamlMetadata = {
    val __obj = js.Dynamic.literal(samlMetadata = samlMetadata)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_SamlMetadata]
  }
}

