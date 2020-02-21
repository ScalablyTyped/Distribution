package typings.pulumiAws.keyPairMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyPairState extends js.Object {
  /**
    * The MD5 public key fingerprint as specified in section 4 of RFC 4716.
    */
  val fingerprint: js.UndefOr[Input[String]] = js.native
  /**
    * The name for the key pair.
    */
  val keyName: js.UndefOr[Input[String]] = js.native
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `keyName`.
    */
  val keyNamePrefix: js.UndefOr[Input[String]] = js.native
  /**
    * The key pair ID.
    */
  val keyPairId: js.UndefOr[Input[String]] = js.native
  /**
    * The public key material.
    */
  val publicKey: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object KeyPairState {
  @scala.inline
  def apply(
    fingerprint: Input[String] = null,
    keyName: Input[String] = null,
    keyNamePrefix: Input[String] = null,
    keyPairId: Input[String] = null,
    publicKey: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): KeyPairState = {
    val __obj = js.Dynamic.literal()
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (keyName != null) __obj.updateDynamic("keyName")(keyName.asInstanceOf[js.Any])
    if (keyNamePrefix != null) __obj.updateDynamic("keyNamePrefix")(keyNamePrefix.asInstanceOf[js.Any])
    if (keyPairId != null) __obj.updateDynamic("keyPairId")(keyPairId.asInstanceOf[js.Any])
    if (publicKey != null) __obj.updateDynamic("publicKey")(publicKey.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyPairState]
  }
}

