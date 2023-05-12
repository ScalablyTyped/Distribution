package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArticleAuthor extends StObject {
  
  var bio: js.UndefOr[String] = js.undefined
  
  var email: String
  
  var firstName: String
  
  var lastName: String
  
  var name: String
}
object ArticleAuthor {
  
  inline def apply(email: String, firstName: String, lastName: String, name: String): ArticleAuthor = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], firstName = firstName.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArticleAuthor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArticleAuthor] (val x: Self) extends AnyVal {
    
    inline def setBio(value: String): Self = StObject.set(x, "bio", value.asInstanceOf[js.Any])
    
    inline def setBioUndefined: Self = StObject.set(x, "bio", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    inline def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
