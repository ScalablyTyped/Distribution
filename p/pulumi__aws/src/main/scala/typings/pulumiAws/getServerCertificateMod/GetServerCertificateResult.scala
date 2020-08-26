package typings.pulumiAws.getServerCertificateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServerCertificateResult extends js.Object {
  val arn: String = js.native
  val certificateBody: String = js.native
  val certificateChain: String = js.native
  val expirationDate: String = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val latest: js.UndefOr[Boolean] = js.native
  val name: String = js.native
  val namePrefix: js.UndefOr[String] = js.native
  val path: String = js.native
  val pathPrefix: js.UndefOr[String] = js.native
  val uploadDate: String = js.native
}

object GetServerCertificateResult {
  @scala.inline
  def apply(
    arn: String,
    certificateBody: String,
    certificateChain: String,
    expirationDate: String,
    id: String,
    name: String,
    path: String,
    uploadDate: String
  ): GetServerCertificateResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], certificateBody = certificateBody.asInstanceOf[js.Any], certificateChain = certificateChain.asInstanceOf[js.Any], expirationDate = expirationDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], uploadDate = uploadDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServerCertificateResult]
  }
  @scala.inline
  implicit class GetServerCertificateResultOps[Self <: GetServerCertificateResult] (val x: Self) extends AnyVal {
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setCertificateBody(value: String): Self = this.set("certificateBody", value.asInstanceOf[js.Any])
    @scala.inline
    def setCertificateChain(value: String): Self = this.set("certificateChain", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpirationDate(value: String): Self = this.set("expirationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setUploadDate(value: String): Self = this.set("uploadDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setLatest(value: Boolean): Self = this.set("latest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatest: Self = this.set("latest", js.undefined)
    @scala.inline
    def setNamePrefix(value: String): Self = this.set("namePrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamePrefix: Self = this.set("namePrefix", js.undefined)
    @scala.inline
    def setPathPrefix(value: String): Self = this.set("pathPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathPrefix: Self = this.set("pathPrefix", js.undefined)
  }
  
}

