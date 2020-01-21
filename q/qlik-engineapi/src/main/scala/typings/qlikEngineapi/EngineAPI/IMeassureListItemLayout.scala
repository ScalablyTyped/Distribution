package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericDimensionsListProperties width extend GenericBaseLayout
  */
trait IMeassureListItemLayout extends IGenericBaseLayout {
  var qData: Null
  @JSName("qMeta")
  var qMeta_IMeassureListItemLayout: INxMetaTitleDescriptionTag
}

object IMeassureListItemLayout {
  @scala.inline
  def apply(qData: Null, qInfo: INxInfo, qMeta: INxMetaTitleDescriptionTag): IMeassureListItemLayout = {
    val __obj = js.Dynamic.literal(qData = qData.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IMeassureListItemLayout]
  }
}

