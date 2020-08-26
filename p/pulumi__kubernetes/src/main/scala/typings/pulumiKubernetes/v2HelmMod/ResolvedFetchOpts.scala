package typings.pulumiKubernetes.v2HelmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolvedFetchOpts extends js.Object {
  var caFile: js.UndefOr[String] = js.native
  var certFile: js.UndefOr[String] = js.native
  var destination: js.UndefOr[String] = js.native
  var devel: js.UndefOr[Boolean] = js.native
  var home: js.UndefOr[String] = js.native
  var keyFile: js.UndefOr[String] = js.native
  var keyring: js.UndefOr[String] = js.native
  var password: js.UndefOr[String] = js.native
  var prov: js.UndefOr[Boolean] = js.native
  var repo: js.UndefOr[String] = js.native
  var untar: js.UndefOr[Boolean] = js.native
  var untardir: js.UndefOr[String] = js.native
  var username: js.UndefOr[String] = js.native
  var verify: js.UndefOr[Boolean] = js.native
  var version: js.UndefOr[String] = js.native
}

object ResolvedFetchOpts {
  @scala.inline
  def apply(): ResolvedFetchOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolvedFetchOpts]
  }
  @scala.inline
  implicit class ResolvedFetchOptsOps[Self <: ResolvedFetchOpts] (val x: Self) extends AnyVal {
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
    def setCaFile(value: String): Self = this.set("caFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaFile: Self = this.set("caFile", js.undefined)
    @scala.inline
    def setCertFile(value: String): Self = this.set("certFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertFile: Self = this.set("certFile", js.undefined)
    @scala.inline
    def setDestination(value: String): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    @scala.inline
    def setDevel(value: Boolean): Self = this.set("devel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevel: Self = this.set("devel", js.undefined)
    @scala.inline
    def setHome(value: String): Self = this.set("home", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHome: Self = this.set("home", js.undefined)
    @scala.inline
    def setKeyFile(value: String): Self = this.set("keyFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyFile: Self = this.set("keyFile", js.undefined)
    @scala.inline
    def setKeyring(value: String): Self = this.set("keyring", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyring: Self = this.set("keyring", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setProv(value: Boolean): Self = this.set("prov", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProv: Self = this.set("prov", js.undefined)
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepo: Self = this.set("repo", js.undefined)
    @scala.inline
    def setUntar(value: Boolean): Self = this.set("untar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUntar: Self = this.set("untar", js.undefined)
    @scala.inline
    def setUntardir(value: String): Self = this.set("untardir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUntardir: Self = this.set("untardir", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
    @scala.inline
    def setVerify(value: Boolean): Self = this.set("verify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerify: Self = this.set("verify", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

