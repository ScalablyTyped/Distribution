package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Sysctl defines a kernel parameter to be set
  */
@js.native
trait Sysctl extends StObject {
  
  /**
    * Name of a property to set
    */
  var name: String = js.native
  
  /**
    * Value of a property to set
    */
  var value: String = js.native
}
object Sysctl {
  
  @scala.inline
  def apply(name: String, value: String): Sysctl = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sysctl]
  }
  
  @scala.inline
  implicit class SysctlMutableBuilder[Self <: Sysctl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
