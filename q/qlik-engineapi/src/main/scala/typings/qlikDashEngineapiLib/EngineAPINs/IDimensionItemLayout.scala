package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DimensionItemLayout...
  */
trait IDimensionItemLayout extends js.Object {
  var qData: scala.Null
  var qInfo: INxInfo
  var qMeta: INxMetaTitleDescriptionTag
}

object IDimensionItemLayout {
  @scala.inline
  def apply(qData: scala.Null, qInfo: INxInfo, qMeta: INxMetaTitleDescriptionTag): IDimensionItemLayout = {
    val __obj = js.Dynamic.literal(qData = qData, qInfo = qInfo, qMeta = qMeta)
  
    __obj.asInstanceOf[IDimensionItemLayout]
  }
}

