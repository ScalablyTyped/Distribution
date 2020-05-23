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
  var frameworkVersion: String
  var functions: js.UndefOr[Functions] = js.undefined
  var layers: js.UndefOr[Layers] = js.undefined
  var provider: Provider
  var resources: js.UndefOr[Resources] = js.undefined
  var service: Service
}

object Serverless {
  @scala.inline
  def apply(
    frameworkVersion: String,
    provider: Provider,
    service: Service,
    _package: Package = null,
    functions: Functions = null,
    layers: Layers = null,
    resources: Resources = null
  ): Serverless = {
    val __obj = js.Dynamic.literal(frameworkVersion = frameworkVersion.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    if (_package != null) __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    if (functions != null) __obj.updateDynamic("functions")(functions.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[Serverless]
  }
}

