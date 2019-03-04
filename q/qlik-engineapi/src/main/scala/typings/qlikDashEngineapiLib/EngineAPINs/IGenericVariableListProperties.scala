package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericVariableListProperties width extend GenericProperties
  */
trait IGenericVariableListProperties extends IGenericProperties {
  var qVariableListDef: IVariableListDef
}

object IGenericVariableListProperties {
  @scala.inline
  def apply(qInfo: INxInfo, qVariableListDef: IVariableListDef): IGenericVariableListProperties = {
    val __obj = js.Dynamic.literal(qInfo = qInfo, qVariableListDef = qVariableListDef)
  
    __obj.asInstanceOf[IGenericVariableListProperties]
  }
}

