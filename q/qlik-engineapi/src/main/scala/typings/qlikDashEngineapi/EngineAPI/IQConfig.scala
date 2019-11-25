package typings.qlikDashEngineapi.EngineAPI

import typings.qlikDashEngineapi.Anon_QIsDesktop
import typings.qlikDashEngineapi.Anon_QNameQUrl
import typings.qlikDashEngineapi.Anon_QPathSeparator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQConfig extends js.Object {
  var qFeatures: Anon_QIsDesktop
  var qServices: js.Array[Anon_QNameQUrl]
  var qSystemProperties: Anon_QPathSeparator
}

object IQConfig {
  @scala.inline
  def apply(
    qFeatures: Anon_QIsDesktop,
    qServices: js.Array[Anon_QNameQUrl],
    qSystemProperties: Anon_QPathSeparator
  ): IQConfig = {
    val __obj = js.Dynamic.literal(qFeatures = qFeatures.asInstanceOf[js.Any], qServices = qServices.asInstanceOf[js.Any], qSystemProperties = qSystemProperties.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IQConfig]
  }
}

