package typings.seleniumStandalone.mod

import typings.node.childProcessMod.ChildProcess
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("selenium-standalone", "start")
@js.native
object start extends js.Object {
  
  def apply(cb: js.Function2[Error | Null, /* selenium */ ChildProcess, Unit]): Unit = js.native
  def apply(
    optsCb: js.Function2[/* error */ Error | Null, /* selenium */ ChildProcess, Unit],
    cb: js.Function2[/* error */ Error | Null, /* selenium */ ChildProcess, Unit]
  ): Unit = js.native
  def apply(optsCb: StartOpts): Unit = js.native
  def apply(opts: StartOpts, cb: js.Function2[Error | Null, /* selenium */ ChildProcess, Unit]): Unit = js.native
}
