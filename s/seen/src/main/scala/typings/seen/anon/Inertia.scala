package typings.seen.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Inertia extends StObject {
  
  var inertia: Boolean = js.native
}
object Inertia {
  
  @scala.inline
  def apply(inertia: Boolean): Inertia = {
    val __obj = js.Dynamic.literal(inertia = inertia.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inertia]
  }
  
  @scala.inline
  implicit class InertiaMutableBuilder[Self <: Inertia] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInertia(value: Boolean): Self = StObject.set(x, "inertia", value.asInstanceOf[js.Any])
  }
}
