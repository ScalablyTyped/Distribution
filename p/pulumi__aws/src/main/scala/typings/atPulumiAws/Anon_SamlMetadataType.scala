package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SamlMetadataType extends js.Object {
  var samlMetadata: Input[String]
  var `type`: Input[String]
}

object Anon_SamlMetadataType {
  @scala.inline
  def apply(samlMetadata: Input[String], `type`: Input[String]): Anon_SamlMetadataType = {
    val __obj = js.Dynamic.literal(samlMetadata = samlMetadata.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_SamlMetadataType]
  }
}

