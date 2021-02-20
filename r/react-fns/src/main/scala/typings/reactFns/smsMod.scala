package typings.reactFns

import typings.react.mod.HTMLAttributes
import typings.react.mod.SFC
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object smsMod {
  
  @JSImport("react-fns/dist/Sms", "Sms")
  @js.native
  val Sms: SFC[SmsProps] = js.native
  
  @js.native
  trait SmsProps extends HTMLAttributes[HTMLAnchorElement] {
    
    var body: js.UndefOr[String] = js.native
    
    var phone: String = js.native
  }
  object SmsProps {
    
    @scala.inline
    def apply(phone: String): SmsProps = {
      val __obj = js.Dynamic.literal(phone = phone.asInstanceOf[js.Any])
      __obj.asInstanceOf[SmsProps]
    }
    
    @scala.inline
    implicit class SmsPropsMutableBuilder[Self <: SmsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    }
  }
}
