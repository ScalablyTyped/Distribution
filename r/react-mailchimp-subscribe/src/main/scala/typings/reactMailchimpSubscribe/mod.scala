package typings.reactMailchimpSubscribe

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactMailchimpSubscribe.reactMailchimpSubscribeStrings.error
import typings.reactMailchimpSubscribe.reactMailchimpSubscribeStrings.sending
import typings.reactMailchimpSubscribe.reactMailchimpSubscribeStrings.success
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-mailchimp-subscribe", JSImport.Default)
  @js.native
  class default[FormFields] ()
    extends Component[Props[FormFields], js.Object, js.Any]
  
  @js.native
  trait ClassicFormFields extends NameFormFields {
    
    var `BIRTHDAY[day]`: Double = js.native
    
    var `BIRTHDAY[month]`: Double = js.native
  }
  object ClassicFormFields {
    
    @scala.inline
    def apply(`BIRTHDAY[day]`: Double, `BIRTHDAY[month]`: Double, EMAIL: String, FNAME: String, LNAME: String): ClassicFormFields = {
      val __obj = js.Dynamic.literal(EMAIL = EMAIL.asInstanceOf[js.Any], FNAME = FNAME.asInstanceOf[js.Any], LNAME = LNAME.asInstanceOf[js.Any])
      __obj.updateDynamic("BIRTHDAY[day]")(`BIRTHDAY[day]`.asInstanceOf[js.Any])
      __obj.updateDynamic("BIRTHDAY[month]")(`BIRTHDAY[month]`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClassicFormFields]
    }
    
    @scala.inline
    implicit class ClassicFormFieldsMutableBuilder[Self <: ClassicFormFields] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setBIRTHDAY[day]`(value: Double): Self = StObject.set(x, "BIRTHDAY[day]", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBIRTHDAY[month]`(value: Double): Self = StObject.set(x, "BIRTHDAY[month]", value.asInstanceOf[js.Any])
    }
  }
  
  type DefaultFormFields = EmailFormFields
  
  @js.native
  trait EmailFormFields extends StObject {
    
    var EMAIL: String = js.native
  }
  object EmailFormFields {
    
    @scala.inline
    def apply(EMAIL: String): EmailFormFields = {
      val __obj = js.Dynamic.literal(EMAIL = EMAIL.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmailFormFields]
    }
    
    @scala.inline
    implicit class EmailFormFieldsMutableBuilder[Self <: EmailFormFields] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEMAIL(value: String): Self = StObject.set(x, "EMAIL", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ErrorResponseArgs extends ResponseArgs {
    
    var message: String | Error = js.native
    
    var status: error = js.native
  }
  object ErrorResponseArgs {
    
    @scala.inline
    def apply(message: String | Error, status: error): ErrorResponseArgs = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorResponseArgs]
    }
    
    @scala.inline
    implicit class ErrorResponseArgsMutableBuilder[Self <: ErrorResponseArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String | Error): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: error): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  type FormHooks[FormFields] = SubscribeArg[FormFields] with (ErrorResponseArgs | SuccessResponseArgs | PendingArgs)
  
  type MailchimpSubscribe[FormFields] = Component[Props[FormFields], js.Object, js.Any]
  
  @js.native
  trait NameFormFields extends EmailFormFields {
    
    var FNAME: String = js.native
    
    var LNAME: String = js.native
  }
  object NameFormFields {
    
    @scala.inline
    def apply(EMAIL: String, FNAME: String, LNAME: String): NameFormFields = {
      val __obj = js.Dynamic.literal(EMAIL = EMAIL.asInstanceOf[js.Any], FNAME = FNAME.asInstanceOf[js.Any], LNAME = LNAME.asInstanceOf[js.Any])
      __obj.asInstanceOf[NameFormFields]
    }
    
    @scala.inline
    implicit class NameFormFieldsMutableBuilder[Self <: NameFormFields] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFNAME(value: String): Self = StObject.set(x, "FNAME", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLNAME(value: String): Self = StObject.set(x, "LNAME", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PendingArgs extends StObject {
    
    var message: Null = js.native
    
    var status: sending | Null = js.native
  }
  object PendingArgs {
    
    @scala.inline
    def apply(message: Null): PendingArgs = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[PendingArgs]
    }
    
    @scala.inline
    implicit class PendingArgsMutableBuilder[Self <: PendingArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: Null): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: sending): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusNull: Self = StObject.set(x, "status", null)
    }
  }
  
  @js.native
  trait Props[FormFields] extends StObject {
    
    var render: js.UndefOr[js.Function1[/* hooks */ FormHooks[FormFields], ReactNode]] = js.native
    
    var url: String = js.native
  }
  object Props {
    
    @scala.inline
    def apply[FormFields](url: String): Props[FormFields] = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props[FormFields]]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props[_], FormFields] (val x: Self with Props[FormFields]) extends AnyVal {
      
      @scala.inline
      def setRender(value: /* hooks */ FormHooks[FormFields] => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMailchimpSubscribe.mod.ErrorResponseArgs
    - typings.reactMailchimpSubscribe.mod.SuccessResponseArgs
  */
  trait ResponseArgs extends StObject
  object ResponseArgs {
    
    @scala.inline
    def ErrorResponseArgs(message: String | Error, status: error): typings.reactMailchimpSubscribe.mod.ErrorResponseArgs = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactMailchimpSubscribe.mod.ErrorResponseArgs]
    }
    
    @scala.inline
    def SuccessResponseArgs(message: String, status: success): typings.reactMailchimpSubscribe.mod.SuccessResponseArgs = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactMailchimpSubscribe.mod.SuccessResponseArgs]
    }
  }
  
  @js.native
  trait SubscribeArg[FormFields] extends StObject {
    
    def subscribe(data: FormFields): Unit = js.native
  }
  object SubscribeArg {
    
    @scala.inline
    def apply[FormFields](subscribe: FormFields => Unit): SubscribeArg[FormFields] = {
      val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
      __obj.asInstanceOf[SubscribeArg[FormFields]]
    }
    
    @scala.inline
    implicit class SubscribeArgMutableBuilder[Self <: SubscribeArg[_], FormFields] (val x: Self with SubscribeArg[FormFields]) extends AnyVal {
      
      @scala.inline
      def setSubscribe(value: FormFields => Unit): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait SuccessResponseArgs extends ResponseArgs {
    
    var message: String = js.native
    
    var status: success = js.native
  }
  object SuccessResponseArgs {
    
    @scala.inline
    def apply(message: String, status: success): SuccessResponseArgs = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuccessResponseArgs]
    }
    
    @scala.inline
    implicit class SuccessResponseArgsMutableBuilder[Self <: SuccessResponseArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: success): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
