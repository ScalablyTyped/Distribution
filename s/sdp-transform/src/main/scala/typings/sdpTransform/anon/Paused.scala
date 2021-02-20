package typings.sdpTransform.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Paused extends StObject {
  
  var paused: Boolean = js.native
  
  var scid: Double | String = js.native
}
object Paused {
  
  @scala.inline
  def apply(paused: Boolean, scid: Double | String): Paused = {
    val __obj = js.Dynamic.literal(paused = paused.asInstanceOf[js.Any], scid = scid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Paused]
  }
  
  @scala.inline
  implicit class PausedMutableBuilder[Self <: Paused] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScid(value: Double | String): Self = StObject.set(x, "scid", value.asInstanceOf[js.Any])
  }
}
