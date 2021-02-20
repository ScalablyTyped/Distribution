package typings.reactFns

import typings.react.mod.HTMLAttributes
import typings.react.mod.SFC
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mailtoMod {
  
  @JSImport("react-fns/dist/Mailto", "Mailto")
  @js.native
  val Mailto: SFC[MailtoProps] = js.native
  
  @js.native
  trait MailtoProps extends HTMLAttributes[HTMLAnchorElement] {
    
    var bcc: js.UndefOr[js.Array[String]] = js.native
    
    var body: js.UndefOr[String] = js.native
    
    var cc: js.UndefOr[js.Array[String]] = js.native
    
    var email: String = js.native
    
    var subject: js.UndefOr[String] = js.native
  }
  object MailtoProps {
    
    @scala.inline
    def apply(email: String): MailtoProps = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
      __obj.asInstanceOf[MailtoProps]
    }
    
    @scala.inline
    implicit class MailtoPropsMutableBuilder[Self <: MailtoProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBcc(value: js.Array[String]): Self = StObject.set(x, "bcc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBccUndefined: Self = StObject.set(x, "bcc", js.undefined)
      
      @scala.inline
      def setBccVarargs(value: String*): Self = StObject.set(x, "bcc", js.Array(value :_*))
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setCc(value: js.Array[String]): Self = StObject.set(x, "cc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCcUndefined: Self = StObject.set(x, "cc", js.undefined)
      
      @scala.inline
      def setCcVarargs(value: String*): Self = StObject.set(x, "cc", js.Array(value :_*))
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    }
  }
}
