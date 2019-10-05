package typings.atPulumiCloud.serviceMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Task extends js.Object {
  /**
    * Run the task, passing in additional task run options.
    */
  def run(): js.Promise[Unit] = js.native
  def run(options: TaskRunOptions): js.Promise[Unit] = js.native
}

@JSImport("@pulumi/cloud/service", "Task")
@js.native
object Task extends TopLevel[TaskConstructor]

