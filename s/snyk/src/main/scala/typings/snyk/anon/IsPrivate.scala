package typings.snyk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsPrivate extends StObject {
  
  var isPrivate: Boolean
}
object IsPrivate {
  
  inline def apply(isPrivate: Boolean): IsPrivate = {
    val __obj = js.Dynamic.literal(isPrivate = isPrivate.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsPrivate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsPrivate] (val x: Self) extends AnyVal {
    
    inline def setIsPrivate(value: Boolean): Self = StObject.set(x, "isPrivate", value.asInstanceOf[js.Any])
  }
}
