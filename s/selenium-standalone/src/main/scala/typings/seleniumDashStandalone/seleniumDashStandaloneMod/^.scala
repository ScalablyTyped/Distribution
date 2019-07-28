package typings.seleniumDashStandalone.seleniumDashStandaloneMod

import typings.node.childUnderscoreProcessMod.ChildProcess
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-standalone", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def install(cb: js.Function2[js.UndefOr[Error], /* fsPaths */ FsPaths, Unit]): Unit = js.native
  def install(
    optsCb: js.Function2[/* error */ js.UndefOr[Error], /* fsPaths */ FsPaths, Unit],
    cb: js.Function2[/* error */ js.UndefOr[Error], /* fsPaths */ FsPaths, Unit]
  ): Unit = js.native
  def install(optsCb: InstallOpts): Unit = js.native
  def install(opts: InstallOpts, cb: js.Function2[js.UndefOr[Error], /* fsPaths */ FsPaths, Unit]): Unit = js.native
  def start(cb: js.Function2[Error | Null, /* selenium */ ChildProcess, Unit]): Unit = js.native
  def start(
    optsCb: js.Function2[/* error */ Error | Null, /* selenium */ ChildProcess, Unit],
    cb: js.Function2[/* error */ Error | Null, /* selenium */ ChildProcess, Unit]
  ): Unit = js.native
  def start(optsCb: StartOpts): Unit = js.native
  def start(opts: StartOpts, cb: js.Function2[Error | Null, /* selenium */ ChildProcess, Unit]): Unit = js.native
}

