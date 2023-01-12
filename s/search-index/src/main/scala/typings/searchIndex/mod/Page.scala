package typings.searchIndex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Page extends StObject {
  
  var NUMBER: Double
  
  var SIZE: Double
}
object Page {
  
  inline def apply(NUMBER: Double, SIZE: Double): Page = {
    val __obj = js.Dynamic.literal(NUMBER = NUMBER.asInstanceOf[js.Any], SIZE = SIZE.asInstanceOf[js.Any])
    __obj.asInstanceOf[Page]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Page] (val x: Self) extends AnyVal {
    
    inline def setNUMBER(value: Double): Self = StObject.set(x, "NUMBER", value.asInstanceOf[js.Any])
    
    inline def setSIZE(value: Double): Self = StObject.set(x, "SIZE", value.asInstanceOf[js.Any])
  }
}
