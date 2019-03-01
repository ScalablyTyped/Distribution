package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericListProperties...
  */
trait IGenericListProperties extends IGenericProperties {
  var qListObjectDef: IListObjectDef
}

object IGenericListProperties {
  @scala.inline
  def apply(qInfo: INxInfo, qListObjectDef: IListObjectDef): IGenericListProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qInfo")(qInfo)
    __obj.updateDynamic("qListObjectDef")(qListObjectDef)
    __obj.asInstanceOf[IGenericListProperties]
  }
}

