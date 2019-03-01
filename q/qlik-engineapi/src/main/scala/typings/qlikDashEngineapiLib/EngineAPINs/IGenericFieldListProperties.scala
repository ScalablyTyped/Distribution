package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericFieldListProperties width extend GenericProperties
  */
trait IGenericFieldListProperties extends IGenericProperties {
  /**
    * FieldListDef...
    */
  var qFieldListDef: IFieldListDef
}

object IGenericFieldListProperties {
  @scala.inline
  def apply(qFieldListDef: IFieldListDef, qInfo: INxInfo): IGenericFieldListProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qFieldListDef")(qFieldListDef)
    __obj.updateDynamic("qInfo")(qInfo)
    __obj.asInstanceOf[IGenericFieldListProperties]
  }
}

