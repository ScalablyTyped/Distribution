package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Adds and removes POSIX capabilities from running containers.
  */
trait Capabilities extends StObject {
  
  /**
    * Added capabilities
    */
  var add: js.Array[String]
  
  /**
    * Removed capabilities
    */
  var drop: js.Array[String]
}
object Capabilities {
  
  @scala.inline
  def apply(add: js.Array[String], drop: js.Array[String]): Capabilities = {
    val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any])
    __obj.asInstanceOf[Capabilities]
  }
  
  @scala.inline
  implicit class CapabilitiesMutableBuilder[Self <: Capabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: js.Array[String]): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddVarargs(value: String*): Self = StObject.set(x, "add", js.Array(value :_*))
    
    @scala.inline
    def setDrop(value: js.Array[String]): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropVarargs(value: String*): Self = StObject.set(x, "drop", js.Array(value :_*))
  }
}
