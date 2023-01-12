package typings.steamUser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deleted extends StObject {
  
  var deleted: Boolean
  
  var ordinal: Double
  
  var server_timestamp: js.Date
}
object Deleted {
  
  inline def apply(deleted: Boolean, ordinal: Double, server_timestamp: js.Date): Deleted = {
    val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any], ordinal = ordinal.asInstanceOf[js.Any], server_timestamp = server_timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deleted]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Deleted] (val x: Self) extends AnyVal {
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setOrdinal(value: Double): Self = StObject.set(x, "ordinal", value.asInstanceOf[js.Any])
    
    inline def setServer_timestamp(value: js.Date): Self = StObject.set(x, "server_timestamp", value.asInstanceOf[js.Any])
  }
}
