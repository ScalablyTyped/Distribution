package typings.qlikDashEngineapi.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericBookmarkLayout with extend GenericBaseLayout
  */
trait IGenericBookmarkLayout extends IGenericBaseLayout {
  var qBookmark: INxBookmark
  @JSName("qMeta")
  var qMeta_IGenericBookmarkLayout: INxMetaTitleDescription
}

object IGenericBookmarkLayout {
  @scala.inline
  def apply(qBookmark: INxBookmark, qInfo: INxInfo, qMeta: INxMetaTitleDescription): IGenericBookmarkLayout = {
    val __obj = js.Dynamic.literal(qBookmark = qBookmark, qInfo = qInfo, qMeta = qMeta)
  
    __obj.asInstanceOf[IGenericBookmarkLayout]
  }
}

