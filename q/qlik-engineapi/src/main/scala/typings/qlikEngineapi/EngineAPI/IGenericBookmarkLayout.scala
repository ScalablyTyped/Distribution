package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericBookmarkLayout with extend GenericBaseLayout
  */
trait IGenericBookmarkLayout
  extends StObject
     with IGenericBaseLayout {
  
  var qBookmark: INxBookmark
  
  @JSName("qMeta")
  var qMeta_IGenericBookmarkLayout: INxMetaTitleDescription
}
object IGenericBookmarkLayout {
  
  inline def apply(qBookmark: INxBookmark, qInfo: INxInfo, qMeta: INxMetaTitleDescription): IGenericBookmarkLayout = {
    val __obj = js.Dynamic.literal(qBookmark = qBookmark.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericBookmarkLayout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IGenericBookmarkLayout] (val x: Self) extends AnyVal {
    
    inline def setQBookmark(value: INxBookmark): Self = StObject.set(x, "qBookmark", value.asInstanceOf[js.Any])
    
    inline def setQMeta(value: INxMetaTitleDescription): Self = StObject.set(x, "qMeta", value.asInstanceOf[js.Any])
  }
}
