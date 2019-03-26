package typings
package atPulumiCloudLib.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Task extends js.Object {
  /**
    * Run the task, passing in additional task run options.
    */
  def run(): js.Promise[scala.Unit] = js.native
  def run(options: TaskRunOptions): js.Promise[scala.Unit] = js.native
}

@JSImport("@pulumi/cloud/service", "Task")
@js.native
class TaskCls protected () extends Task {
  /**
    * Construct a new Task, which is a Container that can be run many times as individual tasks.
    *
    * @param name The unique name of the task.
    * @param container The container specification.
    * @param opts A bag of options that controls how this resource behaves.
    */
  def this(name: java.lang.String, container: Container) = this()
  def this(name: java.lang.String, container: Container, opts: atPulumiPulumiLib.resourceMod.ResourceOptions) = this()
}

