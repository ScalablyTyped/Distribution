package typings.reactFns

import typings.react.mod.HTMLAttributes
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mailtoMod {
  
  @JSImport("react-fns/dist/Mailto", "Mailto")
  @js.native
  val Mailto: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<MailtoProps> */ Any = js.native
  
  trait MailtoProps
    extends StObject
       with HTMLAttributes[HTMLAnchorElement] {
    
    var bcc: js.UndefOr[js.Array[String]] = js.undefined
    
    var body: js.UndefOr[String] = js.undefined
    
    var cc: js.UndefOr[js.Array[String]] = js.undefined
    
    var email: String
    
    var subject: js.UndefOr[String] = js.undefined
  }
  object MailtoProps {
    
    inline def apply(email: String): MailtoProps = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
      __obj.asInstanceOf[MailtoProps]
    }
    
    extension [Self <: MailtoProps](x: Self) {
      
      inline def setBcc(value: js.Array[String]): Self = StObject.set(x, "bcc", value.asInstanceOf[js.Any])
      
      inline def setBccUndefined: Self = StObject.set(x, "bcc", js.undefined)
      
      inline def setBccVarargs(value: String*): Self = StObject.set(x, "bcc", js.Array(value*))
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCc(value: js.Array[String]): Self = StObject.set(x, "cc", value.asInstanceOf[js.Any])
      
      inline def setCcUndefined: Self = StObject.set(x, "cc", js.undefined)
      
      inline def setCcVarargs(value: String*): Self = StObject.set(x, "cc", js.Array(value*))
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    }
  }
}
