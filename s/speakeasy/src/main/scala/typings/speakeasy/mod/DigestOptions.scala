package typings.speakeasy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DigestOptions
  extends StObject
     with SharedOptions {
  
  var counter: Double
  
  /**
    * @deprecated use secret
    */
  var key: js.UndefOr[String] = js.undefined
  
  var secret: String
}
object DigestOptions {
  
  @scala.inline
  def apply(counter: Double, secret: String): DigestOptions = {
    val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[DigestOptions]
  }
  
  @scala.inline
  implicit class DigestOptionsMutableBuilder[Self <: DigestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCounter(value: Double): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
  }
}
