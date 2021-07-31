package typings.seleniumWebdriver.anon

import typings.seleniumWebdriver.capabilitiesMod.Capabilities
import typings.seleniumWebdriver.mod.CreateSessionCapabilities
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Desired
  extends StObject
     with CreateSessionCapabilities {
  
  var desired: js.UndefOr[Capabilities] = js.undefined
  
  var required: js.UndefOr[Capabilities] = js.undefined
}
object Desired {
  
  @scala.inline
  def apply(): Desired = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Desired]
  }
  
  @scala.inline
  implicit class DesiredMutableBuilder[Self <: Desired] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDesired(value: Capabilities): Self = StObject.set(x, "desired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredUndefined: Self = StObject.set(x, "desired", js.undefined)
    
    @scala.inline
    def setRequired(value: Capabilities): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
  }
}
