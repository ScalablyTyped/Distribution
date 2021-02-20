package typings.reactNavigationCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AB[A, B, C] extends StObject {
  
  var a: A = js.native
  
  var b: B = js.native
  
  var c: C = js.native
}
object AB {
  
  @scala.inline
  def apply[A, B, C](a: A, b: B, c: C): AB[A, B, C] = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any])
    __obj.asInstanceOf[AB[A, B, C]]
  }
  
  @scala.inline
  implicit class ABMutableBuilder[Self <: AB[_, _, _], A, B, C] (val x: Self with (AB[A, B, C])) extends AnyVal {
    
    @scala.inline
    def setA(value: A): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setB(value: B): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setC(value: C): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
  }
}
