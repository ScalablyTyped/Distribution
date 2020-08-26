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
    * Key-value map of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object KeyPairArgs {
  @scala.inline
  def apply(publicKey: Input[String]): KeyPairArgs = {
    val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyPairArgs]
  }
  @scala.inline
  implicit class KeyPairArgsOps[Self <: KeyPairArgs] (val x: Self) extends AnyVal {
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
    def setPublicKey(value: Input[String]): Self = this.set("publicKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyName(value: Input[String]): Self = this.set("keyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyName: Self = this.set("keyName", js.undefined)
    @scala.inline
    def setKeyNamePrefix(value: Input[String]): Self = this.set("keyNamePrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyNamePrefix: Self = this.set("keyNamePrefix", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

