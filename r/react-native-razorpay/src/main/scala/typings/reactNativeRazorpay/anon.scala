package typings.reactNativeRazorpay

import typings.reactNativeRazorpay.reactNativeRazorpayStrings.ben
import typings.reactNativeRazorpay.reactNativeRazorpayStrings.card
import typings.reactNativeRazorpay.reactNativeRazorpayStrings.emi
import typings.reactNativeRazorpay.reactNativeRazorpayStrings.en
import typings.reactNativeRazorpay.reactNativeRazorpayStrings.guj
import typings.reactNativeRazorpay.reactNativeRazorpayStrings.hi
import typings.reactNativeRazorpay.reactNativeRazorpayStrings.mar
import typings.reactNativeRazorpay.reactNativeRazorpayStrings.netbanking
import typings.reactNativeRazorpay.reactNativeRazorpayStrings.tam
import typings.reactNativeRazorpay.reactNativeRazorpayStrings.tel
import typings.reactNativeRazorpay.reactNativeRazorpayStrings.upi
import typings.reactNativeRazorpay.reactNativeRazorpayStrings.wallet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Animation extends StObject {
    
    var animation: js.UndefOr[Boolean] = js.undefined
    
    var backdropclose: js.UndefOr[Boolean] = js.undefined
    
    var confirm_close: js.UndefOr[Boolean] = js.undefined
    
    var escape: js.UndefOr[Boolean] = js.undefined
    
    var handleback: js.UndefOr[Boolean] = js.undefined
    
    var ondismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object Animation {
    
    inline def apply(): Animation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Animation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Animation] (val x: Self) extends AnyVal {
      
      inline def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setBackdropclose(value: Boolean): Self = StObject.set(x, "backdropclose", value.asInstanceOf[js.Any])
      
      inline def setBackdropcloseUndefined: Self = StObject.set(x, "backdropclose", js.undefined)
      
      inline def setConfirm_close(value: Boolean): Self = StObject.set(x, "confirm_close", value.asInstanceOf[js.Any])
      
      inline def setConfirm_closeUndefined: Self = StObject.set(x, "confirm_close", js.undefined)
      
      inline def setEscape(value: Boolean): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      inline def setHandleback(value: Boolean): Self = StObject.set(x, "handleback", value.asInstanceOf[js.Any])
      
      inline def setHandlebackUndefined: Self = StObject.set(x, "handleback", js.undefined)
      
      inline def setOndismiss(value: () => Unit): Self = StObject.set(x, "ondismiss", js.Any.fromFunction0(value))
      
      inline def setOndismissUndefined: Self = StObject.set(x, "ondismiss", js.undefined)
    }
  }
  
  trait Backdropcolor extends StObject {
    
    var backdrop_color: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var hide_topbar: js.UndefOr[Boolean] = js.undefined
  }
  object Backdropcolor {
    
    inline def apply(): Backdropcolor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Backdropcolor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Backdropcolor] (val x: Self) extends AnyVal {
      
      inline def setBackdrop_color(value: String): Self = StObject.set(x, "backdrop_color", value.asInstanceOf[js.Any])
      
      inline def setBackdrop_colorUndefined: Self = StObject.set(x, "backdrop_color", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setHide_topbar(value: Boolean): Self = StObject.set(x, "hide_topbar", value.asInstanceOf[js.Any])
      
      inline def setHide_topbarUndefined: Self = StObject.set(x, "hide_topbar", js.undefined)
    }
  }
  
  trait Contact extends StObject {
    
    var contact: js.UndefOr[String] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    var method: js.UndefOr[card | netbanking | wallet | emi | upi] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
  }
  object Contact {
    
    inline def apply(): Contact = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Contact]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Contact] (val x: Self) extends AnyVal {
      
      inline def setContact(value: String): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
      
      inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setMethod(value: card | netbanking | wallet | emi | upi): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait ContactEmail extends StObject {
    
    var contact: js.UndefOr[Boolean] = js.undefined
    
    var email: js.UndefOr[Boolean] = js.undefined
  }
  object ContactEmail {
    
    inline def apply(): ContactEmail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContactEmail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContactEmail] (val x: Self) extends AnyVal {
      
      inline def setContact(value: Boolean): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
      
      inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
      
      inline def setEmail(value: Boolean): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    }
  }
  
  trait Display extends StObject {
    
    var display: Language
  }
  object Display {
    
    inline def apply(display: Language): Display = {
      val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any])
      __obj.asInstanceOf[Display]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Display] (val x: Self) extends AnyVal {
      
      inline def setDisplay(value: Language): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    }
  }
  
  trait Email extends StObject {
    
    var contact: js.UndefOr[Boolean] = js.undefined
    
    var email: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[Boolean] = js.undefined
  }
  object Email {
    
    inline def apply(): Email = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Email]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Email] (val x: Self) extends AnyVal {
      
      inline def setContact(value: Boolean): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
      
      inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
      
      inline def setEmail(value: Boolean): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setName(value: Boolean): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait Enabled extends StObject {
    
    var enabled: Boolean
    
    var max_count: Double
  }
  object Enabled {
    
    inline def apply(enabled: Boolean, max_count: Double): Enabled = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], max_count = max_count.asInstanceOf[js.Any])
      __obj.asInstanceOf[Enabled]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Enabled] (val x: Self) extends AnyVal {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setMax_count(value: Double): Self = StObject.set(x, "max_count", value.asInstanceOf[js.Any])
    }
  }
  
  trait Language extends StObject {
    
    var language: en | ben | hi | mar | guj | tam | tel
  }
  object Language {
    
    inline def apply(language: en | ben | hi | mar | guj | tam | tel): Language = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
      __obj.asInstanceOf[Language]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Language] (val x: Self) extends AnyVal {
      
      inline def setLanguage(value: en | ben | hi | mar | guj | tam | tel): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    }
  }
  
  trait Orderid extends StObject {
    
    var order_id: String
    
    var payment_id: js.UndefOr[String] = js.undefined
  }
  object Orderid {
    
    inline def apply(order_id: String): Orderid = {
      val __obj = js.Dynamic.literal(order_id = order_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Orderid]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Orderid] (val x: Self) extends AnyVal {
      
      inline def setOrder_id(value: String): Self = StObject.set(x, "order_id", value.asInstanceOf[js.Any])
      
      inline def setPayment_id(value: String): Self = StObject.set(x, "payment_id", value.asInstanceOf[js.Any])
      
      inline def setPayment_idUndefined: Self = StObject.set(x, "payment_id", js.undefined)
    }
  }
}
