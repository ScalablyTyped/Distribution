package typings.snyk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Authorization extends StObject {
  
  var authorization: String
  
  var `x-is-ci`: Boolean
}
object Authorization {
  
  inline def apply(authorization: String, `x-is-ci`: Boolean): Authorization = {
    val __obj = js.Dynamic.literal(authorization = authorization.asInstanceOf[js.Any])
    __obj.updateDynamic("x-is-ci")(`x-is-ci`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authorization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Authorization] (val x: Self) extends AnyVal {
    
    inline def setAuthorization(value: String): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    inline def `setX-is-ci`(value: Boolean): Self = StObject.set(x, "x-is-ci", value.asInstanceOf[js.Any])
  }
}
