package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
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
  var startedAt: js.UndefOr[Input[String]] = js.native
}
object ContainerStateRunning {
  
  @scala.inline
  def apply(): ContainerStateRunning = {
    val __obj = js.Dynamic.literal()
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
    def setStartedAt(value: Input[String]): Self = this.set("startedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartedAt: Self = this.set("startedAt", js.undefined)
  }
}
