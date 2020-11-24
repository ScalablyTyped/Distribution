package typings.pulumiKubernetes.v2HelmMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchOpts extends js.Object {
  
  /** Verify certificates of HTTPS-enabled servers using this CA bundle. */
  var caFile: js.UndefOr[Input[String]] = js.native
  
  /** Identify HTTPS client using this SSL certificate file. */
  var certFile: js.UndefOr[Input[String]] = js.native
  
  /**
    * Location to write the chart. If this and tardir are specified, tardir is appended to this
    * (default ".").
    */
  var destination: js.UndefOr[Input[String]] = js.native
  
  /**
    * Use development versions, too. Equivalent to version '>0.0.0-0'. If --version is set, this is
    * ignored.
    */
  var devel: js.UndefOr[Input[Boolean]] = js.native
  
  /** Location of your Helm config. Overrides $HELM_HOME (default "/Users/alex/.helm"). */
  var home: js.UndefOr[Input[String]] = js.native
  
  /** Identify HTTPS client using this SSL key file. */
  var keyFile: js.UndefOr[Input[String]] = js.native
  
  /** Keyring containing public keys (default "/Users/alex/.gnupg/pubring.gpg"). */
  var keyring: js.UndefOr[Input[String]] = js.native
  
  /** Chart repository password. */
  var password: js.UndefOr[Input[String]] = js.native
  
  /** Fetch the provenance file, but don't perform verification. */
  var prov: js.UndefOr[Input[Boolean]] = js.native
  
  /** Chart repository url where to locate the requested chart. */
  var repo: js.UndefOr[Input[String]] = js.native
  
  /** If set to false, will leave the chart as a tarball after downloading. */
  var untar: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * If untar is specified, this flag specifies the name of the directory into which the chart is
    * expanded (default ".").
    */
  var untardir: js.UndefOr[Input[String]] = js.native
  
  /** Chart repository username. */
  var username: js.UndefOr[Input[String]] = js.native
  
  /** Verify the package against its signature. */
  var verify: js.UndefOr[Input[Boolean]] = js.native
  
  /** Specific version of a chart. Without this, the latest version is fetched. */
  var version: js.UndefOr[Input[String]] = js.native
}
object FetchOpts {
  
  @scala.inline
  def apply(): FetchOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchOpts]
  }
  
  @scala.inline
  implicit class FetchOptsOps[Self <: FetchOpts] (val x: Self) extends AnyVal {
    
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
    def setCaFile(value: Input[String]): Self = this.set("caFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaFile: Self = this.set("caFile", js.undefined)
    
    @scala.inline
    def setCertFile(value: Input[String]): Self = this.set("certFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertFile: Self = this.set("certFile", js.undefined)
    
    @scala.inline
    def setDestination(value: Input[String]): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    
    @scala.inline
    def setDevel(value: Input[Boolean]): Self = this.set("devel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevel: Self = this.set("devel", js.undefined)
    
    @scala.inline
    def setHome(value: Input[String]): Self = this.set("home", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHome: Self = this.set("home", js.undefined)
    
    @scala.inline
    def setKeyFile(value: Input[String]): Self = this.set("keyFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyFile: Self = this.set("keyFile", js.undefined)
    
    @scala.inline
    def setKeyring(value: Input[String]): Self = this.set("keyring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyring: Self = this.set("keyring", js.undefined)
    
    @scala.inline
    def setPassword(value: Input[String]): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setProv(value: Input[Boolean]): Self = this.set("prov", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProv: Self = this.set("prov", js.undefined)
    
    @scala.inline
    def setRepo(value: Input[String]): Self = this.set("repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepo: Self = this.set("repo", js.undefined)
    
    @scala.inline
    def setUntar(value: Input[Boolean]): Self = this.set("untar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUntar: Self = this.set("untar", js.undefined)
    
    @scala.inline
    def setUntardir(value: Input[String]): Self = this.set("untardir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUntardir: Self = this.set("untardir", js.undefined)
    
    @scala.inline
    def setUsername(value: Input[String]): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
    
    @scala.inline
    def setVerify(value: Input[Boolean]): Self = this.set("verify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerify: Self = this.set("verify", js.undefined)
    
    @scala.inline
    def setVersion(value: Input[String]): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
