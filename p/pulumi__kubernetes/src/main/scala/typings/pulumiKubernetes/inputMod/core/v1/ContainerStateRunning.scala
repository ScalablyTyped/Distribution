package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ContainerStateRunning is a running state of a container.
  */
trait ContainerStateRunning extends StObject {
  
  /**
    * Time at which the container was last (re-)started
    */
  var startedAt: js.UndefOr[Input[String]] = js.undefined
}
object ContainerStateRunning {
  
  inline def apply(): ContainerStateRunning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerStateRunning]
  }
  
  extension [Self <: ContainerStateRunning](x: Self) {
    
    inline def setStartedAt(value: Input[String]): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
    
    inline def setStartedAtUndefined: Self = StObject.set(x, "startedAt", js.undefined)
  }
}
