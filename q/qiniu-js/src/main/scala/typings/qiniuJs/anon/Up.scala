package typings.qiniuJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Up extends StObject {
  
  var up: Acc
}
object Up {
  
  inline def apply(up: Acc): Up = {
    val __obj = js.Dynamic.literal(up = up.asInstanceOf[js.Any])
    __obj.asInstanceOf[Up]
  }
  
  extension [Self <: Up](x: Self) {
    
    inline def setUp(value: Acc): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
  }
}
