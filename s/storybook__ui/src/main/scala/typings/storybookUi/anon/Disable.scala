package typings.storybookUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Disable extends StObject {
  
  var disable: Boolean = js.native
}
object Disable {
  
  @scala.inline
  def apply(disable: Boolean): Disable = {
    val __obj = js.Dynamic.literal(disable = disable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disable]
  }
  
  @scala.inline
  implicit class DisableMutableBuilder[Self <: Disable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
  }
}
