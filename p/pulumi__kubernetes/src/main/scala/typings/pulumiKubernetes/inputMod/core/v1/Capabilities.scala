package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
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
  var add: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * Removed capabilities
    */
  var drop: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}
object Capabilities {
  
  @scala.inline
  def apply(): Capabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Capabilities]
  }
  
  @scala.inline
  implicit class CapabilitiesMutableBuilder[Self <: Capabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    @scala.inline
    def setAddVarargs(value: Input[String]*): Self = StObject.set(x, "add", js.Array(value :_*))
    
    @scala.inline
    def setDrop(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
    
    @scala.inline
    def setDropVarargs(value: Input[String]*): Self = StObject.set(x, "drop", js.Array(value :_*))
  }
}
