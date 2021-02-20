package typings.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateOpts extends StObject {
  
  /** Whether or not to force Ractive to consider a value to be changed. */
  var force: js.UndefOr[Boolean] = js.native
}
object UpdateOpts {
  
  @scala.inline
  def apply(): UpdateOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateOpts]
  }
  
  @scala.inline
  implicit class UpdateOptsMutableBuilder[Self <: UpdateOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
  }
}
