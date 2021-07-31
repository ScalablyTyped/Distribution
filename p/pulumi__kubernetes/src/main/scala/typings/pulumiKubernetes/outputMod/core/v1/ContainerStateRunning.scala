package typings.pulumiKubernetes.outputMod.core.v1

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
  var startedAt: String
}
object ContainerStateRunning {
  
  @scala.inline
  def apply(startedAt: String): ContainerStateRunning = {
    val __obj = js.Dynamic.literal(startedAt = startedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerStateRunning]
  }
  
  @scala.inline
  implicit class ContainerStateRunningMutableBuilder[Self <: ContainerStateRunning] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStartedAt(value: String): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
  }
}
