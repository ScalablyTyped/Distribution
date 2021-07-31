package typings.pulumiCloud.serviceMod

import typings.pulumiCloud.serviceMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Task extends StObject {
  
  /**
    * Run the task, passing in additional task run options.
    */
  def run(): js.Promise[Unit] = js.native
  def run(options: TaskRunOptions): js.Promise[Unit] = js.native
}
object Task {
  
  @scala.inline
  def apply: TaskConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("Task").asInstanceOf[TaskConstructor]
}
