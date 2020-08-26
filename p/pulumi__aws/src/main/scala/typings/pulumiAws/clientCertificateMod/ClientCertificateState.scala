package typings.pulumiAws.clientCertificateMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientCertificateState extends js.Object {
  /**
    * Amazon Resource Name (ARN)
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The date when the client certificate was created.
    */
  val createdDate: js.UndefOr[Input[String]] = js.native
  /**
    * The description of the client certificate.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The date when the client certificate will expire.
    */
  val expirationDate: js.UndefOr[Input[String]] = js.native
  /**
    * The PEM-encoded public key of the client certificate.
    */
  val pemEncodedCertificate: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value map of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object ClientCertificateState {
  @scala.inline
  def apply(): ClientCertificateState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientCertificateState]
  }
  @scala.inline
  implicit class ClientCertificateStateOps[Self <: ClientCertificateState] (val x: Self) extends AnyVal {
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
    def setCreatedDate(value: Input[String]): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedDate: Self = this.set("createdDate", js.undefined)
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setExpirationDate(value: Input[String]): Self = this.set("expirationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationDate: Self = this.set("expirationDate", js.undefined)
    @scala.inline
    def setPemEncodedCertificate(value: Input[String]): Self = this.set("pemEncodedCertificate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePemEncodedCertificate: Self = this.set("pemEncodedCertificate", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

