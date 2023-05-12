package typings.smallweiAvue.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizeSize extends StObject {
  
  var size: typings.smallweiAvue.Size
}
object SizeSize {
  
  inline def apply(size: typings.smallweiAvue.Size): SizeSize = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeSize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SizeSize] (val x: Self) extends AnyVal {
    
    inline def setSize(value: typings.smallweiAvue.Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
