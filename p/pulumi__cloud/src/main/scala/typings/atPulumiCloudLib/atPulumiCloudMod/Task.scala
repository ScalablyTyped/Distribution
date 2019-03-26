package typings
package atPulumiCloudLib.atPulumiCloudMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/cloud", "Task")
@js.native
class TaskCls protected ()
  extends atPulumiCloudLib.serviceMod.Task {
  /**
    * Construct a new Task, which is a Container that can be run many times as individual tasks.
    *
    * @param name The unique name of the task.
    * @param container The container specification.
    * @param opts A bag of options that controls how this resource behaves.
    */
  def this(name: java.lang.String, container: atPulumiCloudLib.serviceMod.Container) = this()
  def this(name: java.lang.String, container: atPulumiCloudLib.serviceMod.Container, opts: atPulumiPulumiLib.resourceMod.ResourceOptions) = this()
}

