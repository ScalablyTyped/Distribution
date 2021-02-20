package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericBookmarkLayout with extend GenericBaseLayout
  */
@js.native
trait IGenericBookmarkLayout extends IGenericBaseLayout {
  
  var qBookmark: INxBookmark = js.native
  
  @JSName("qMeta")
  var qMeta_IGenericBookmarkLayout: INxMetaTitleDescription = js.native
}
object IGenericBookmarkLayout {
  
  @scala.inline
  def apply(qBookmark: INxBookmark, qInfo: INxInfo, qMeta: INxMetaTitleDescription): IGenericBookmarkLayout = {
    val __obj = js.Dynamic.literal(qBookmark = qBookmark.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericBookmarkLayout]
  }
  
  @scala.inline
  implicit class IGenericBookmarkLayoutMutableBuilder[Self <: IGenericBookmarkLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQBookmark(value: INxBookmark): Self = StObject.set(x, "qBookmark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMeta(value: INxMetaTitleDescription): Self = StObject.set(x, "qMeta", value.asInstanceOf[js.Any])
  }
}
