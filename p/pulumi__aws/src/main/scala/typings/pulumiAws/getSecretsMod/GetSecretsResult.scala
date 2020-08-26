package typings.pulumiAws.getSecretsMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.kms.GetSecretsSecret
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSecretsResult extends js.Object {
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * Map containing each `secret` `name` as the key with its decrypted plaintext value
    */
  val plaintext: StringDictionary[String] = js.native
  val secrets: js.Array[GetSecretsSecret] = js.native
}

object GetSecretsResult {
  @scala.inline
  def apply(id: String, plaintext: StringDictionary[String], secrets: js.Array[GetSecretsSecret]): GetSecretsResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], plaintext = plaintext.asInstanceOf[js.Any], secrets = secrets.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSecretsResult]
  }
  @scala.inline
  implicit class GetSecretsResultOps[Self <: GetSecretsResult] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlaintext(value: StringDictionary[String]): Self = this.set("plaintext", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecretsVarargs(value: GetSecretsSecret*): Self = this.set("secrets", js.Array(value :_*))
    @scala.inline
    def setSecrets(value: js.Array[GetSecretsSecret]): Self = this.set("secrets", value.asInstanceOf[js.Any])
  }
  
}

