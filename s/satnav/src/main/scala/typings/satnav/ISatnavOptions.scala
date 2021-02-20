package typings.satnav

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISatnavOptions extends StObject {
  
  var force: js.UndefOr[Boolean] = js.native
  
  var html5: js.UndefOr[Boolean] = js.native
  
  var matchAll: js.UndefOr[Boolean] = js.native
  
  var poll: js.UndefOr[Double] = js.native
}
object ISatnavOptions {
  
  @scala.inline
  def apply(): ISatnavOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISatnavOptions]
  }
  
  @scala.inline
  implicit class ISatnavOptionsMutableBuilder[Self <: ISatnavOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    @scala.inline
    def setHtml5(value: Boolean): Self = StObject.set(x, "html5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml5Undefined: Self = StObject.set(x, "html5", js.undefined)
    
    @scala.inline
    def setMatchAll(value: Boolean): Self = StObject.set(x, "matchAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchAllUndefined: Self = StObject.set(x, "matchAll", js.undefined)
    
    @scala.inline
    def setPoll(value: Double): Self = StObject.set(x, "poll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPollUndefined: Self = StObject.set(x, "poll", js.undefined)
  }
}
