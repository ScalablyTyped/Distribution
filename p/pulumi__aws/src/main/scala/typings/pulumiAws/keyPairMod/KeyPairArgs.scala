package typings.pulumiAws.keyPairMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyPairArgs extends js.Object {
  /**
    * The name for the key pair.
    */
  val keyName: js.UndefOr[Input[String]] = js.native
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `keyName`.
    */
  val keyNamePrefix: js.UndefOr[Input[String]] = js.native
  /**
    * The public key material.
    */
  val publicKey: Input[String] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object KeyPairArgs {
  @scala.inline
  def apply(
    publicKey: Input[String],
    keyName: Input[String] = null,
    keyNamePrefix: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): KeyPairArgs = {
    val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any])
    if (keyName != null) __obj.updateDynamic("keyName")(keyName.asInstanceOf[js.Any])
    if (keyNamePrefix != null) __obj.updateDynamic("keyNamePrefix")(keyNamePrefix.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyPairArgs]
  }
}

