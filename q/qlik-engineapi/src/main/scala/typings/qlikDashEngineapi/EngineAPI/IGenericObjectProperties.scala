package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericObjectProperties width extend GenericProperties
  */
trait IGenericObjectProperties extends IGenericProperties {
  var qExtendsId: js.UndefOr[String] = js.undefined
}

object IGenericObjectProperties {
  @scala.inline
  def apply(qInfo: INxInfo, qExtendsId: String = null): IGenericObjectProperties = {
    val __obj = js.Dynamic.literal(qInfo = qInfo.asInstanceOf[js.Any])
    if (qExtendsId != null) __obj.updateDynamic("qExtendsId")(qExtendsId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericObjectProperties]
  }
}

