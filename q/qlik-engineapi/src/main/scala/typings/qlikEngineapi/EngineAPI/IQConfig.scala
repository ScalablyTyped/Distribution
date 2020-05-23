package typings.qlikEngineapi.EngineAPI

import typings.qlikEngineapi.anon.QIsDesktop
import typings.qlikEngineapi.anon.QPathSeparator
import typings.qlikEngineapi.anon.QUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQConfig extends js.Object {
  var qFeatures: QIsDesktop
  var qServices: js.Array[QUrl]
  var qSystemProperties: QPathSeparator
}

object IQConfig {
  @scala.inline
  def apply(qFeatures: QIsDesktop, qServices: js.Array[QUrl], qSystemProperties: QPathSeparator): IQConfig = {
    val __obj = js.Dynamic.literal(qFeatures = qFeatures.asInstanceOf[js.Any], qServices = qServices.asInstanceOf[js.Any], qSystemProperties = qSystemProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQConfig]
  }
}

