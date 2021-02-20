package typings.storybookUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PassArgsFirst extends StObject {
  
  var passArgsFirst: Boolean = js.native
}
object PassArgsFirst {
  
  @scala.inline
  def apply(passArgsFirst: Boolean): PassArgsFirst = {
    val __obj = js.Dynamic.literal(passArgsFirst = passArgsFirst.asInstanceOf[js.Any])
    __obj.asInstanceOf[PassArgsFirst]
  }
  
  @scala.inline
  implicit class PassArgsFirstMutableBuilder[Self <: PassArgsFirst] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPassArgsFirst(value: Boolean): Self = StObject.set(x, "passArgsFirst", value.asInstanceOf[js.Any])
  }
}
