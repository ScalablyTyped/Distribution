package typings.saucelabs.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cta
  extends /* key */ StringDictionary[js.Any] {
  
  var cta: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var message: js.UndefOr[String] = js.native
}
object Cta {
  
  @scala.inline
  def apply(): Cta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cta]
  }
  
  @scala.inline
  implicit class CtaMutableBuilder[Self <: Cta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCta(value: String): Self = StObject.set(x, "cta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtaUndefined: Self = StObject.set(x, "cta", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
