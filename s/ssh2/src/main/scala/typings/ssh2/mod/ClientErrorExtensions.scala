package typings.ssh2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientErrorExtensions extends StObject {
  
  /** Additional detail for 'client-ssh' messages. */
  var description: js.UndefOr[String] = js.native
  
  /** Indicates 'client-socket' for socket-level errors and 'client-ssh' for SSH disconnection messages. */
  var level: js.UndefOr[String] = js.native
}
object ClientErrorExtensions {
  
  @scala.inline
  def apply(): ClientErrorExtensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientErrorExtensions]
  }
  
  @scala.inline
  implicit class ClientErrorExtensionsMutableBuilder[Self <: ClientErrorExtensions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
  }
}
