package typings.reactMailchimpSubscribe

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactMailchimpSubscribe.reactMailchimpSubscribeStrings.error
import typings.reactMailchimpSubscribe.reactMailchimpSubscribeStrings.sending
import typings.reactMailchimpSubscribe.reactMailchimpSubscribeStrings.success
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-mailchimp-subscribe", JSImport.Default)
  @js.native
  class default[FormFields] ()
    extends Component[Props[FormFields], js.Object, js.Any]
  
  trait ClassicFormFields
    extends StObject
       with NameFormFields {
    
    var `BIRTHDAY[day]`: Double
    
    var `BIRTHDAY[month]`: Double
  }
  object ClassicFormFields {
    
    inline def apply(`BIRTHDAY[day]`: Double, `BIRTHDAY[month]`: Double, EMAIL: String, FNAME: String, LNAME: String): ClassicFormFields = {
      val __obj = js.Dynamic.literal(EMAIL = EMAIL.asInstanceOf[js.Any], FNAME = FNAME.asInstanceOf[js.Any], LNAME = LNAME.asInstanceOf[js.Any])
      __obj.updateDynamic("BIRTHDAY[day]")(`BIRTHDAY[day]`.asInstanceOf[js.Any])
      __obj.updateDynamic("BIRTHDAY[month]")(`BIRTHDAY[month]`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClassicFormFields]
    }
    
    extension [Self <: ClassicFormFields](x: Self) {
      
      inline def `setBIRTHDAY[day]`(value: Double): Self = StObject.set(x, "BIRTHDAY[day]", value.asInstanceOf[js.Any])
      
      inline def `setBIRTHDAY[month]`(value: Double): Self = StObject.set(x, "BIRTHDAY[month]", value.asInstanceOf[js.Any])
    }
  }
  
  type DefaultFormFields = EmailFormFields
  
  trait EmailFormFields extends StObject {
    
    var EMAIL: String
  }
  object EmailFormFields {
    
    inline def apply(EMAIL: String): EmailFormFields = {
      val __obj = js.Dynamic.literal(EMAIL = EMAIL.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmailFormFields]
    }
    
    extension [Self <: EmailFormFields](x: Self) {
      
      inline def setEMAIL(value: String): Self = StObject.set(x, "EMAIL", value.asInstanceOf[js.Any])
    }
  }
  
  trait ErrorResponseArgs
    extends StObject
       with ResponseArgs {
    
    var message: String | Error
    
    var status: error
  }
  object ErrorResponseArgs {
    
    inline def apply(message: String | Error): ErrorResponseArgs = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = "error")
      __obj.asInstanceOf[ErrorResponseArgs]
    }
    
    extension [Self <: ErrorResponseArgs](x: Self) {
      
      inline def setMessage(value: String | Error): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: error): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  type FormHooks[FormFields] = SubscribeArg[FormFields] & (ErrorResponseArgs | SuccessResponseArgs | PendingArgs)
  
  type MailchimpSubscribe[FormFields] = Component[Props[FormFields], js.Object, js.Any]
  
  trait NameFormFields
    extends StObject
       with EmailFormFields {
    
    var FNAME: String
    
    var LNAME: String
  }
  object NameFormFields {
    
    inline def apply(EMAIL: String, FNAME: String, LNAME: String): NameFormFields = {
      val __obj = js.Dynamic.literal(EMAIL = EMAIL.asInstanceOf[js.Any], FNAME = FNAME.asInstanceOf[js.Any], LNAME = LNAME.asInstanceOf[js.Any])
      __obj.asInstanceOf[NameFormFields]
    }
    
    extension [Self <: NameFormFields](x: Self) {
      
      inline def setFNAME(value: String): Self = StObject.set(x, "FNAME", value.asInstanceOf[js.Any])
      
      inline def setLNAME(value: String): Self = StObject.set(x, "LNAME", value.asInstanceOf[js.Any])
    }
  }
  
  trait PendingArgs extends StObject {
    
    var message: Null
    
    var status: sending | Null
  }
  object PendingArgs {
    
    inline def apply(message: Null): PendingArgs = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = null)
      __obj.asInstanceOf[PendingArgs]
    }
    
    extension [Self <: PendingArgs](x: Self) {
      
      inline def setMessage(value: Null): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: sending): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusNull: Self = StObject.set(x, "status", null)
    }
  }
  
  trait Props[FormFields] extends StObject {
    
    var render: js.UndefOr[js.Function1[/* hooks */ FormHooks[FormFields], ReactNode]] = js.undefined
    
    var url: String
  }
  object Props {
    
    inline def apply[FormFields](url: String): Props[FormFields] = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props[FormFields]]
    }
    
    extension [Self <: Props[?], FormFields](x: Self & Props[FormFields]) {
      
      inline def setRender(value: /* hooks */ FormHooks[FormFields] => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMailchimpSubscribe.mod.ErrorResponseArgs
    - typings.reactMailchimpSubscribe.mod.SuccessResponseArgs
  */
  trait ResponseArgs extends StObject
  object ResponseArgs {
    
    inline def ErrorResponseArgs(message: String | Error): typings.reactMailchimpSubscribe.mod.ErrorResponseArgs = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = "error")
      __obj.asInstanceOf[typings.reactMailchimpSubscribe.mod.ErrorResponseArgs]
    }
    
    inline def SuccessResponseArgs(message: String): typings.reactMailchimpSubscribe.mod.SuccessResponseArgs = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = "success")
      __obj.asInstanceOf[typings.reactMailchimpSubscribe.mod.SuccessResponseArgs]
    }
  }
  
  trait SubscribeArg[FormFields] extends StObject {
    
    def subscribe(data: FormFields): Unit
  }
  object SubscribeArg {
    
    inline def apply[FormFields](subscribe: FormFields => Unit): SubscribeArg[FormFields] = {
      val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
      __obj.asInstanceOf[SubscribeArg[FormFields]]
    }
    
    extension [Self <: SubscribeArg[?], FormFields](x: Self & SubscribeArg[FormFields]) {
      
      inline def setSubscribe(value: FormFields => Unit): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    }
  }
  
  trait SuccessResponseArgs
    extends StObject
       with ResponseArgs {
    
    var message: String
    
    var status: success
  }
  object SuccessResponseArgs {
    
    inline def apply(message: String): SuccessResponseArgs = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = "success")
      __obj.asInstanceOf[SuccessResponseArgs]
    }
    
    extension [Self <: SuccessResponseArgs](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: success): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
