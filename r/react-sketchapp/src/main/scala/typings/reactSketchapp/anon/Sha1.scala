package typings.reactSketchapp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sha1 extends StObject {
  
  var data: String
  
  var sha1: String
}
object Sha1 {
  
  inline def apply(data: String, sha1: String): Sha1 = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], sha1 = sha1.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sha1]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Sha1] (val x: Self) extends AnyVal {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setSha1(value: String): Self = StObject.set(x, "sha1", value.asInstanceOf[js.Any])
  }
}
