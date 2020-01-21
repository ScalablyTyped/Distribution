package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ContainerState holds a possible state of container. Only one of its members may be specified.
  * If none of them is specified, the default one is ContainerStateWaiting.
  */
trait ContainerState extends js.Object {
  /**
    * Details about a running container
    */
  val running: ContainerStateRunning
  /**
    * Details about a terminated container
    */
  val terminated: ContainerStateTerminated
  /**
    * Details about a waiting container
    */
  val waiting: ContainerStateWaiting
}

object ContainerState {
  @scala.inline
  def apply(
    running: ContainerStateRunning,
    terminated: ContainerStateTerminated,
    waiting: ContainerStateWaiting
  ): ContainerState = {
    val __obj = js.Dynamic.literal(running = running.asInstanceOf[js.Any], terminated = terminated.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ContainerState]
  }
}

