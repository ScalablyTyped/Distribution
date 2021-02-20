package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ContainerStateRunning is a running state of a container.
  */
@js.native
trait ContainerStateRunning extends StObject {
  
  /**
    * Time at which the container was last (re-)started
    */
  var startedAt: js.UndefOr[Input[String]] = js.native
}
object ContainerStateRunning {
  
  @scala.inline
  def apply(): ContainerStateRunning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerStateRunning]
  }
  
  @scala.inline
  implicit class ContainerStateRunningMutableBuilder[Self <: ContainerStateRunning] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStartedAt(value: Input[String]): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedAtUndefined: Self = StObject.set(x, "startedAt", js.undefined)
  }
}
