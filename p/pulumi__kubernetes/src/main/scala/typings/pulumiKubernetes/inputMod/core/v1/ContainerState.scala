package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ContainerState holds a possible state of container. Only one of its members may be specified. If none of them is specified, the default one is ContainerStateWaiting.
  */
@js.native
trait ContainerState extends js.Object {
  
  /**
    * Details about a running container
    */
  var running: js.UndefOr[Input[ContainerStateRunning]] = js.native
  
  /**
    * Details about a terminated container
    */
  var terminated: js.UndefOr[Input[ContainerStateTerminated]] = js.native
  
  /**
    * Details about a waiting container
    */
  var waiting: js.UndefOr[Input[ContainerStateWaiting]] = js.native
}
object ContainerState {
  
  @scala.inline
  def apply(): ContainerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerState]
  }
  
  @scala.inline
  implicit class ContainerStateOps[Self <: ContainerState] (val x: Self) extends AnyVal {
    
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
    def setRunning(value: Input[ContainerStateRunning]): Self = this.set("running", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunning: Self = this.set("running", js.undefined)
    
    @scala.inline
    def setTerminated(value: Input[ContainerStateTerminated]): Self = this.set("terminated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerminated: Self = this.set("terminated", js.undefined)
    
    @scala.inline
    def setWaiting(value: Input[ContainerStateWaiting]): Self = this.set("waiting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaiting: Self = this.set("waiting", js.undefined)
  }
}
