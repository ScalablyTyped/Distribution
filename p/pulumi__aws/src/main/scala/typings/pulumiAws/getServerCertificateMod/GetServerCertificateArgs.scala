package typings.pulumiAws.getServerCertificateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServerCertificateArgs extends js.Object {
  /**
    * sort results by expiration date. returns the certificate with expiration date in furthest in the future.
    */
  val latest: js.UndefOr[Boolean] = js.native
  /**
    * exact name of the cert to lookup
    */
  val name: js.UndefOr[String] = js.native
  /**
    * prefix of cert to filter by
    */
  val namePrefix: js.UndefOr[String] = js.native
  /**
    * prefix of path to filter by
    */
  val pathPrefix: js.UndefOr[String] = js.native
}

object GetServerCertificateArgs {
  @scala.inline
  def apply(): GetServerCertificateArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServerCertificateArgs]
  }
  @scala.inline
  implicit class GetServerCertificateArgsOps[Self <: GetServerCertificateArgs] (val x: Self) extends AnyVal {
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
    def setLatest(value: Boolean): Self = this.set("latest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatest: Self = this.set("latest", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
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

