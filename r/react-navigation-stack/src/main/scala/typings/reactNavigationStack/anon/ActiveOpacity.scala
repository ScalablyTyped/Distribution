package typings.reactNavigationStack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveOpacity extends StObject {
  
  var activeOpacity: Double = js.native
}
object ActiveOpacity {
  
  @scala.inline
  def apply(activeOpacity: Double): ActiveOpacity = {
    val __obj = js.Dynamic.literal(activeOpacity = activeOpacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveOpacity]
  }
  
  @scala.inline
  implicit class ActiveOpacityMutableBuilder[Self <: ActiveOpacity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
  }
}
