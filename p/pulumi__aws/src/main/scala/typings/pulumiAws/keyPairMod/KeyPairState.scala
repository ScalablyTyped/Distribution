package typings.pulumiAws.keyPairMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyPairState extends js.Object {
  /**
    * The key pair ARN.
    */
  val arn: js.UndefOr[Input[String]] = js.native
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
    * Key-value map of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object KeyPairState {
  @scala.inline
  def apply(): KeyPairState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyPairState]
  }
  @scala.inline
  implicit class KeyPairStateOps[Self <: KeyPairState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setFingerprint(value: Input[String]): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFingerprint: Self = this.set("fingerprint", js.undefined)
    @scala.inline
    def setKeyName(value: Input[String]): Self = this.set("keyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyName: Self = this.set("keyName", js.undefined)
    @scala.inline
    def setKeyNamePrefix(value: Input[String]): Self = this.set("keyNamePrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyNamePrefix: Self = this.set("keyNamePrefix", js.undefined)
    @scala.inline
    def setKeyPairId(value: Input[String]): Self = this.set("keyPairId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyPairId: Self = this.set("keyPairId", js.undefined)
    @scala.inline
    def setPublicKey(value: Input[String]): Self = this.set("publicKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicKey: Self = this.set("publicKey", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

