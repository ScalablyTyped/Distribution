package typings.sdpTransform.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mids extends StObject {
  
  var mids: String
  
  var `type`: String
}
object Mids {
  
  @scala.inline
  def apply(mids: String, `type`: String): Mids = {
    val __obj = js.Dynamic.literal(mids = mids.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mids]
  }
  
  @scala.inline
  implicit class MidsMutableBuilder[Self <: Mids] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMids(value: String): Self = StObject.set(x, "mids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
