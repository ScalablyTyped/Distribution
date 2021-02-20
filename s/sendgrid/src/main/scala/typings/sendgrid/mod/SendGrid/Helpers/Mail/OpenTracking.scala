package typings.sendgrid.mod.SendGrid.Helpers.Mail

import typings.sendgrid.anon.Substitutiontag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenTracking extends StObject {
  
  def getEnable(): Boolean = js.native
  
  def getSubscriptionTag(): String = js.native
  
  def setEnable(enabled: Boolean): Unit = js.native
  
  def setSubscriptionTag(subscriptionTag: String): Unit = js.native
  
  def toJSON(): Substitutiontag = js.native
}
object OpenTracking {
  
  @scala.inline
  def apply(
    getEnable: () => Boolean,
    getSubscriptionTag: () => String,
    setEnable: Boolean => Unit,
    setSubscriptionTag: String => Unit,
    toJSON: () => Substitutiontag
  ): OpenTracking = {
    val __obj = js.Dynamic.literal(getEnable = js.Any.fromFunction0(getEnable), getSubscriptionTag = js.Any.fromFunction0(getSubscriptionTag), setEnable = js.Any.fromFunction1(setEnable), setSubscriptionTag = js.Any.fromFunction1(setSubscriptionTag), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[OpenTracking]
  }
  
  @scala.inline
  implicit class OpenTrackingMutableBuilder[Self <: OpenTracking] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetEnable(value: () => Boolean): Self = StObject.set(x, "getEnable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSubscriptionTag(value: () => String): Self = StObject.set(x, "getSubscriptionTag", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetEnable(value: Boolean => Unit): Self = StObject.set(x, "setEnable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSubscriptionTag(value: String => Unit): Self = StObject.set(x, "setSubscriptionTag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToJSON(value: () => Substitutiontag): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
