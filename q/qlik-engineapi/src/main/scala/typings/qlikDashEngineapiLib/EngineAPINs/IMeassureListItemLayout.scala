package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericDimensionsListProperties width extend GenericBaseLayout
  */
trait IMeassureListItemLayout extends IGenericBaseLayout {
  var qData: scala.Null
  @JSName("qMeta")
  var qMeta_IMeassureListItemLayout: INxMetaTitleDescriptionTag
}

object IMeassureListItemLayout {
  @scala.inline
  def apply(qData: scala.Null, qInfo: INxInfo, qMeta: INxMetaTitleDescriptionTag): IMeassureListItemLayout = {
    val __obj = js.Dynamic.literal(qData = qData, qInfo = qInfo, qMeta = qMeta)
  
    __obj.asInstanceOf[IMeassureListItemLayout]
  }
}

