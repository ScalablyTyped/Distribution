package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  Types based on https://github.com/serverless/serverless/blob/master/docs/providers/aws/guide/serverless.yml.md
  */
@js.native
trait Serverless extends js.Object {
  @JSName("package")
  var _package: js.UndefOr[Package] = js.native
  var app: js.UndefOr[String] = js.native
  var custom: js.UndefOr[Custom] = js.native
  var frameworkVersion: String = js.native
  var functions: js.UndefOr[Functions] = js.native
  var layers: js.UndefOr[Layers] = js.native
  @JSName("org")
  var org_ : js.UndefOr[String] = js.native
  var plugins: js.UndefOr[js.Array[String]] = js.native
  var provider: Provider = js.native
  var resources: js.UndefOr[Resources] = js.native
  var service: Service | String = js.native
  var tenant: js.UndefOr[String] = js.native
}

object Serverless {
  @scala.inline
  def apply(frameworkVersion: String, provider: Provider, service: Service | String): Serverless = {
    val __obj = js.Dynamic.literal(frameworkVersion = frameworkVersion.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[Serverless]
  }
  @scala.inline
  implicit class ServerlessOps[Self <: Serverless] (val x: Self) extends AnyVal {
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
    def setFrameworkVersion(value: String): Self = this.set("frameworkVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvider(value: Provider): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def setService(value: Service | String): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def set_package(value: Package): Self = this.set("package", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_package: Self = this.set("package", js.undefined)
    @scala.inline
    def setApp(value: String): Self = this.set("app", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApp: Self = this.set("app", js.undefined)
    @scala.inline
    def setCustom(value: Custom): Self = this.set("custom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    @scala.inline
    def setFunctions(value: Functions): Self = this.set("functions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctions: Self = this.set("functions", js.undefined)
    @scala.inline
    def setLayers(value: Layers): Self = this.set("layers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
    @scala.inline
    def setOrg_(value: String): Self = this.set("org", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrg_ : Self = this.set("org", js.undefined)
    @scala.inline
    def setPluginsVarargs(value: String*): Self = this.set("plugins", js.Array(value :_*))
    @scala.inline
    def setPlugins(value: js.Array[String]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    @scala.inline
    def setResources(value: Resources): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    @scala.inline
    def setTenant(value: String): Self = this.set("tenant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTenant: Self = this.set("tenant", js.undefined)
  }
  
}

