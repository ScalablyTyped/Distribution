package typings.qlikEngineapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QBookmarkId extends StObject {
  
  var qBookmarkId: js.UndefOr[String] = js.undefined
  
  var qExpires: js.UndefOr[Double] = js.undefined
}
object QBookmarkId {
  
  inline def apply(): QBookmarkId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QBookmarkId]
  }
  
  extension [Self <: QBookmarkId](x: Self) {
    
    inline def setQBookmarkId(value: String): Self = StObject.set(x, "qBookmarkId", value.asInstanceOf[js.Any])
    
    inline def setQBookmarkIdUndefined: Self = StObject.set(x, "qBookmarkId", js.undefined)
    
    inline def setQExpires(value: Double): Self = StObject.set(x, "qExpires", value.asInstanceOf[js.Any])
    
    inline def setQExpiresUndefined: Self = StObject.set(x, "qExpires", js.undefined)
  }
}
