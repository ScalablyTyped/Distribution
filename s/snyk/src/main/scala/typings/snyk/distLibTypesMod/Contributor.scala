package typings.snyk.distLibTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contributor extends StObject {
  
  var email: String
  
  var lastCommitDate: String
}
object Contributor {
  
  inline def apply(email: String, lastCommitDate: String): Contributor = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], lastCommitDate = lastCommitDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contributor]
  }
  
  extension [Self <: Contributor](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setLastCommitDate(value: String): Self = StObject.set(x, "lastCommitDate", value.asInstanceOf[js.Any])
  }
}
