package typings.atPulumiAws.ec2KeyPairMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyPairArgs extends js.Object {
  /**
    * The name for the key pair.
    */
  val keyName: js.UndefOr[Input[String]] = js.undefined
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `keyName`.
    */
  val keyNamePrefix: js.UndefOr[Input[String]] = js.undefined
  /**
    * The public key material.
    */
  val publicKey: Input[String]
}

object KeyPairArgs {
  @scala.inline
  def apply(publicKey: Input[String], keyName: Input[String] = null, keyNamePrefix: Input[String] = null): KeyPairArgs = {
    val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any])
    if (keyName != null) __obj.updateDynamic("keyName")(keyName.asInstanceOf[js.Any])
    if (keyNamePrefix != null) __obj.updateDynamic("keyNamePrefix")(keyNamePrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyPairArgs]
  }
}

