package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragPositions extends StObject {
  
  var client: ClientPositions
  
  var page: PagePositions
}
object DragPositions {
  
  inline def apply(client: ClientPositions, page: PagePositions): DragPositions = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragPositions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DragPositions] (val x: Self) extends AnyVal {
    
    inline def setClient(value: ClientPositions): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setPage(value: PagePositions): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
  }
}
