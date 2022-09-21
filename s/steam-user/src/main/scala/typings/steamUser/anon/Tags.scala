package typings.steamUser.anon

import typings.steamUser.mod.StoreTagNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tags extends StObject {
  
  var tags: StoreTagNames
}
object Tags {
  
  inline def apply(tags: StoreTagNames): Tags = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tags]
  }
  
  extension [Self <: Tags](x: Self) {
    
    inline def setTags(value: StoreTagNames): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
  }
}
