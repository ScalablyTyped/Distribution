package typings.sparkpost.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Showrecipients extends StObject {
  
  var show_recipients: js.UndefOr[Boolean] = js.undefined
}
object Showrecipients {
  
  @scala.inline
  def apply(): Showrecipients = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Showrecipients]
  }
  
  @scala.inline
  implicit class ShowrecipientsMutableBuilder[Self <: Showrecipients] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShow_recipients(value: Boolean): Self = StObject.set(x, "show_recipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow_recipientsUndefined: Self = StObject.set(x, "show_recipients", js.undefined)
  }
}
