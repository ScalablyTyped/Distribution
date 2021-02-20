package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SELinuxOptions are the labels to be applied to the container
  */
@js.native
trait SELinuxOptions extends StObject {
  
  /**
    * Level is SELinux level label that applies to the container.
    */
  var level: String = js.native
  
  /**
    * Role is a SELinux role label that applies to the container.
    */
  var role: String = js.native
  
  /**
    * Type is a SELinux type label that applies to the container.
    */
  var `type`: String = js.native
  
  /**
    * User is a SELinux user label that applies to the container.
    */
  var user: String = js.native
}
object SELinuxOptions {
  
  @scala.inline
  def apply(level: String, role: String, `type`: String, user: String): SELinuxOptions = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SELinuxOptions]
  }
  
  @scala.inline
  implicit class SELinuxOptionsMutableBuilder[Self <: SELinuxOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
