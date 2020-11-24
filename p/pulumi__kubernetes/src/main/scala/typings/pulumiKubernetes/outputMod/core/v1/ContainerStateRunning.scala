package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ContainerStateRunning is a running state of a container.
  */
@js.native
trait ContainerStateRunning extends js.Object {
  
  /**
    * Time at which the container was last (re-)started
    */
  var startedAt: String = js.native
}
object ContainerStateRunning {
  
  @scala.inline
  def apply(startedAt: String): ContainerStateRunning = {
    val __obj = js.Dynamic.literal(startedAt = startedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerStateRunning]
  }
  
  @scala.inline
  implicit class ContainerStateRunningOps[Self <: ContainerStateRunning] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStartedAt(value: String): Self = this.set("startedAt", value.asInstanceOf[js.Any])
  }
}
