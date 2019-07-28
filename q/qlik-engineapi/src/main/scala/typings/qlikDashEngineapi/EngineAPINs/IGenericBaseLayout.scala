package typings.qlikDashEngineapi.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericBaseLayout...
  */
trait IGenericBaseLayout extends js.Object {
  var qInfo: INxInfo
  var qMeta: INxMeta
}

object IGenericBaseLayout {
  @scala.inline
  def apply(qInfo: INxInfo, qMeta: INxMeta): IGenericBaseLayout = {
    val __obj = js.Dynamic.literal(qInfo = qInfo, qMeta = qMeta)
  
    __obj.asInstanceOf[IGenericBaseLayout]
  }
}

