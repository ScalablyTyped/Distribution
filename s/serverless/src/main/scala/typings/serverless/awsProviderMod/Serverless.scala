package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  Types based on https://github.com/serverless/serverless/blob/master/docs/providers/aws/guide/serverless.yml.md
  */
trait Serverless extends js.Object {
  @JSName("package")
  var _package: js.UndefOr[Package] = js.undefined
  var app: js.UndefOr[String] = js.undefined
  var custom: js.UndefOr[Custom] = js.undefined
  var frameworkVersion: String
  var functions: js.UndefOr[Functions] = js.undefined
  var layers: js.UndefOr[Layers] = js.undefined
  @JSName("org")
  var org_ : js.UndefOr[String] = js.undefined
  var plugins: js.UndefOr[js.Array[String]] = js.undefined
  var provider: Provider
  var resources: js.UndefOr[Resources] = js.undefined
  var service: Service | String
  var tenant: js.UndefOr[String] = js.undefined
}

object Serverless {
  @scala.inline
  def apply(
    frameworkVersion: String,
    provider: Provider,
    service: Service | String,
    _package: Package = null,
    app: String = null,
    custom: Custom = null,
    functions: Functions = null,
    layers: Layers = null,
    org_ : String = null,
    plugins: js.Array[String] = null,
    resources: Resources = null,
    tenant: String = null
  ): Serverless = {
    val __obj = js.Dynamic.literal(frameworkVersion = frameworkVersion.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    if (_package != null) __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    if (app != null) __obj.updateDynamic("app")(app.asInstanceOf[js.Any])
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (functions != null) __obj.updateDynamic("functions")(functions.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (org_ != null) __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (tenant != null) __obj.updateDynamic("tenant")(tenant.asInstanceOf[js.Any])
    __obj.asInstanceOf[Serverless]
  }
}

