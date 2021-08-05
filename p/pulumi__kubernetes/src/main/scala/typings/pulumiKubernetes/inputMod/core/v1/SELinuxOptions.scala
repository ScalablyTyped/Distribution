package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SELinuxOptions are the labels to be applied to the container
  */
trait SELinuxOptions extends StObject {
  
  /**
    * Level is SELinux level label that applies to the container.
    */
  var level: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Role is a SELinux role label that applies to the container.
    */
  var role: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Type is a SELinux type label that applies to the container.
    */
  var `type`: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * User is a SELinux user label that applies to the container.
    */
  var user: js.UndefOr[Input[String]] = js.undefined
}
object SELinuxOptions {
  
  inline def apply(): SELinuxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SELinuxOptions]
  }
  
  extension [Self <: SELinuxOptions](x: Self) {
    
    inline def setLevel(value: Input[String]): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setRole(value: Input[String]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUser(value: Input[String]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
