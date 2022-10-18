package typings.reactFns

import typings.react.mod.HTMLAttributes
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSmsMod {
  
  @JSImport("react-fns/dist/Sms", "Sms")
  @js.native
  val Sms: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<SmsProps> */ Any = js.native
  
  trait SmsProps
    extends StObject
       with HTMLAttributes[HTMLAnchorElement] {
    
    var body: js.UndefOr[String] = js.undefined
    
    var phone: String
  }
  object SmsProps {
    
    inline def apply(phone: String): SmsProps = {
      val __obj = js.Dynamic.literal(phone = phone.asInstanceOf[js.Any])
      __obj.asInstanceOf[SmsProps]
    }
    
    extension [Self <: SmsProps](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    }
  }
}
