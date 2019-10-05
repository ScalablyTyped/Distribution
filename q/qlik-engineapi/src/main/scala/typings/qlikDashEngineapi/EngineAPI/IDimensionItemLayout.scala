package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DimensionItemLayout...
  */
trait IDimensionItemLayout extends js.Object {
  var qData: Null
  var qInfo: INxInfo
  var qMeta: INxMetaTitleDescriptionTag
}

object IDimensionItemLayout {
  @scala.inline
  def apply(qData: Null, qInfo: INxInfo, qMeta: INxMetaTitleDescriptionTag): IDimensionItemLayout = {
    val __obj = js.Dynamic.literal(qData = qData, qInfo = qInfo, qMeta = qMeta)
  
    __obj.asInstanceOf[IDimensionItemLayout]
  }
}

