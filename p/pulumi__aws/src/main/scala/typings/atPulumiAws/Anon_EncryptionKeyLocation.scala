package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncryptionKeyLocation extends js.Object {
  var encryptionKey: js.UndefOr[Input[Anon_IdTypeInput]] = js.undefined
  var location: Input[String]
  var `type`: Input[String]
}

object Anon_EncryptionKeyLocation {
  @scala.inline
  def apply(location: Input[String], `type`: Input[String], encryptionKey: Input[Anon_IdTypeInput] = null): Anon_EncryptionKeyLocation = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (encryptionKey != null) __obj.updateDynamic("encryptionKey")(encryptionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EncryptionKeyLocation]
  }
}

