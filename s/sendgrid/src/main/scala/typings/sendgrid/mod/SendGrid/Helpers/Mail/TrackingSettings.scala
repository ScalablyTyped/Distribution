package typings.sendgrid.mod.SendGrid.Helpers.Mail

import typings.sendgrid.anon.Clicktracking
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackingSettings extends StObject {
  
  def getClickTracking(): ClickTracking
  
  def getGanalytics(): Ganalytics
  
  def getOpenTracking(): OpenTracking
  
  def getSubscriptionTracking(): SubscriptionTracking
  
  def setClickTracking(value: ClickTracking): Unit
  
  def setGanalytics(value: Ganalytics): Unit
  
  def setOpenTracking(value: OpenTracking): Unit
  
  def setSubscriptionTracking(value: SubscriptionTracking): Unit
  
  def toJSON(): Clicktracking
}
object TrackingSettings {
  
  @scala.inline
  def apply(
    getClickTracking: () => ClickTracking,
    getGanalytics: () => Ganalytics,
    getOpenTracking: () => OpenTracking,
    getSubscriptionTracking: () => SubscriptionTracking,
    setClickTracking: ClickTracking => Unit,
    setGanalytics: Ganalytics => Unit,
    setOpenTracking: OpenTracking => Unit,
    setSubscriptionTracking: SubscriptionTracking => Unit,
    toJSON: () => Clicktracking
  ): TrackingSettings = {
    val __obj = js.Dynamic.literal(getClickTracking = js.Any.fromFunction0(getClickTracking), getGanalytics = js.Any.fromFunction0(getGanalytics), getOpenTracking = js.Any.fromFunction0(getOpenTracking), getSubscriptionTracking = js.Any.fromFunction0(getSubscriptionTracking), setClickTracking = js.Any.fromFunction1(setClickTracking), setGanalytics = js.Any.fromFunction1(setGanalytics), setOpenTracking = js.Any.fromFunction1(setOpenTracking), setSubscriptionTracking = js.Any.fromFunction1(setSubscriptionTracking), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[TrackingSettings]
  }
  
  @scala.inline
  implicit class TrackingSettingsMutableBuilder[Self <: TrackingSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetClickTracking(value: () => ClickTracking): Self = StObject.set(x, "getClickTracking", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGanalytics(value: () => Ganalytics): Self = StObject.set(x, "getGanalytics", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOpenTracking(value: () => OpenTracking): Self = StObject.set(x, "getOpenTracking", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSubscriptionTracking(value: () => SubscriptionTracking): Self = StObject.set(x, "getSubscriptionTracking", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetClickTracking(value: ClickTracking => Unit): Self = StObject.set(x, "setClickTracking", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetGanalytics(value: Ganalytics => Unit): Self = StObject.set(x, "setGanalytics", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOpenTracking(value: OpenTracking => Unit): Self = StObject.set(x, "setOpenTracking", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSubscriptionTracking(value: SubscriptionTracking => Unit): Self = StObject.set(x, "setSubscriptionTracking", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToJSON(value: () => Clicktracking): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
