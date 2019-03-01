package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericObjectProperties width extend GenericProperties
  */
trait IGenericObjectProperties extends IGenericProperties {
  var qExtendsId: js.UndefOr[java.lang.String] = js.undefined
}

object IGenericObjectProperties {
  @scala.inline
  def apply(qInfo: INxInfo, qExtendsId: java.lang.String = null): IGenericObjectProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qInfo")(qInfo)
    if (qExtendsId != null) __obj.updateDynamic("qExtendsId")(qExtendsId)
    __obj.asInstanceOf[IGenericObjectProperties]
  }
}

