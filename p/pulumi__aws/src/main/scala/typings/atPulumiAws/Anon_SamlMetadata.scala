package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SamlMetadata extends js.Object {
  var samlMetadata: String
  var `type`: String
}

object Anon_SamlMetadata {
  @scala.inline
  def apply(samlMetadata: String, `type`: String): Anon_SamlMetadata = {
    val __obj = js.Dynamic.literal(samlMetadata = samlMetadata)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_SamlMetadata]
  }
}

