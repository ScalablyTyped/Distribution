package typings.ssh2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubsystemInfo extends StObject {
  
  /** The name of the subsystem. */
  var name: String = js.native
}
object SubsystemInfo {
  
  @scala.inline
  def apply(name: String): SubsystemInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubsystemInfo]
  }
  
  @scala.inline
  implicit class SubsystemInfoMutableBuilder[Self <: SubsystemInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
