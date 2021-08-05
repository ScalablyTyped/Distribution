package typings.reactNavigationCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AB[A, B, C] extends StObject {
  
  var a: A
  
  var b: B
  
  var c: C
}
object AB {
  
  inline def apply[A, B, C](a: A, b: B, c: C): AB[A, B, C] = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any])
    __obj.asInstanceOf[AB[A, B, C]]
  }
  
  extension [Self <: AB[?, ?, ?], A, B, C](x: Self & (AB[A, B, C])) {
    
    inline def setA(value: A): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setB(value: B): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setC(value: C): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
  }
}
