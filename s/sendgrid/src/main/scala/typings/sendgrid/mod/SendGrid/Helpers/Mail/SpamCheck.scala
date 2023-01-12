package typings.sendgrid.mod.SendGrid.Helpers.Mail

import typings.sendgrid.anon.Posttourl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpamCheck extends StObject {
  
  def getEnable(): Boolean
  
  def getPosttoUrl(): String
  
  def getThreshold(): Double
  
  def setEnable(enabled: Boolean): Unit
  
  def setPosttoUrl(post_to_url: String): Unit
  
  def setThreshold(threshold: Double): Unit
  
  def toJSON(): Posttourl
}
object SpamCheck {
  
  inline def apply(
    getEnable: () => Boolean,
    getPosttoUrl: () => String,
    getThreshold: () => Double,
    setEnable: Boolean => Unit,
    setPosttoUrl: String => Unit,
    setThreshold: Double => Unit,
    toJSON: () => Posttourl
  ): SpamCheck = {
    val __obj = js.Dynamic.literal(getEnable = js.Any.fromFunction0(getEnable), getPosttoUrl = js.Any.fromFunction0(getPosttoUrl), getThreshold = js.Any.fromFunction0(getThreshold), setEnable = js.Any.fromFunction1(setEnable), setPosttoUrl = js.Any.fromFunction1(setPosttoUrl), setThreshold = js.Any.fromFunction1(setThreshold), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[SpamCheck]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpamCheck] (val x: Self) extends AnyVal {
    
    inline def setGetEnable(value: () => Boolean): Self = StObject.set(x, "getEnable", js.Any.fromFunction0(value))
    
    inline def setGetPosttoUrl(value: () => String): Self = StObject.set(x, "getPosttoUrl", js.Any.fromFunction0(value))
    
    inline def setGetThreshold(value: () => Double): Self = StObject.set(x, "getThreshold", js.Any.fromFunction0(value))
    
    inline def setSetEnable(value: Boolean => Unit): Self = StObject.set(x, "setEnable", js.Any.fromFunction1(value))
    
    inline def setSetPosttoUrl(value: String => Unit): Self = StObject.set(x, "setPosttoUrl", js.Any.fromFunction1(value))
    
    inline def setSetThreshold(value: Double => Unit): Self = StObject.set(x, "setThreshold", js.Any.fromFunction1(value))
    
    inline def setToJSON(value: () => Posttourl): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
