package typings.stremioAddonSdk.anon

import typings.stremioAddonSdk.mod.ContentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extra extends StObject {
  
  var extra: VideoHash
  
  var id: String
  
  var `type`: ContentType
}
object Extra {
  
  inline def apply(extra: VideoHash, id: String, `type`: ContentType): Extra = {
    val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extra]
  }
  
  extension [Self <: Extra](x: Self) {
    
    inline def setExtra(value: VideoHash): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: ContentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
