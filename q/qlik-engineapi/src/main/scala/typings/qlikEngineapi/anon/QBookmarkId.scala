package typings.qlikEngineapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QBookmarkId extends StObject {
  
  var qBookmarkId: js.UndefOr[String] = js.native
  
  var qExpires: js.UndefOr[Double] = js.native
}
object QBookmarkId {
  
  @scala.inline
  def apply(): QBookmarkId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QBookmarkId]
  }
  
  @scala.inline
  implicit class QBookmarkIdMutableBuilder[Self <: QBookmarkId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQBookmarkId(value: String): Self = StObject.set(x, "qBookmarkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQBookmarkIdUndefined: Self = StObject.set(x, "qBookmarkId", js.undefined)
    
    @scala.inline
    def setQExpires(value: Double): Self = StObject.set(x, "qExpires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQExpiresUndefined: Self = StObject.set(x, "qExpires", js.undefined)
  }
}
