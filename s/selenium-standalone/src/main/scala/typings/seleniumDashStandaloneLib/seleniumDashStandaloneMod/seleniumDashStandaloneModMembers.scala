package typings
package seleniumDashStandaloneLib.seleniumDashStandaloneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-standalone", JSImport.Namespace)
@js.native
object seleniumDashStandaloneModMembers extends js.Object {
  def install(cb: js.Function2[/* error */ js.UndefOr[nodeLib.Error], /* fsPaths */ FsPaths, scala.Unit]): scala.Unit = js.native
  def install(
    optsCb: js.Function2[/* error */ js.UndefOr[nodeLib.Error], /* fsPaths */ FsPaths, scala.Unit],
    cb: js.Function2[/* error */ js.UndefOr[nodeLib.Error], /* fsPaths */ FsPaths, scala.Unit]
  ): scala.Unit = js.native
  def install(optsCb: InstallOpts): scala.Unit = js.native
  def install(
    opts: InstallOpts,
    cb: js.Function2[/* error */ js.UndefOr[nodeLib.Error], /* fsPaths */ FsPaths, scala.Unit]
  ): scala.Unit = js.native
  def start(
    cb: js.Function2[
      nodeLib.Error | scala.Null, 
      /* selenium */ nodeLib.childUnderscoreProcessMod.ChildProcess, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def start(
    optsCb: js.Function2[
      /* error */ nodeLib.Error | scala.Null, 
      /* selenium */ nodeLib.childUnderscoreProcessMod.ChildProcess, 
      scala.Unit
    ],
    cb: js.Function2[
      /* error */ nodeLib.Error | scala.Null, 
      /* selenium */ nodeLib.childUnderscoreProcessMod.ChildProcess, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def start(optsCb: StartOpts): scala.Unit = js.native
  def start(
    opts: StartOpts,
    cb: js.Function2[
      nodeLib.Error | scala.Null, 
      /* selenium */ nodeLib.childUnderscoreProcessMod.ChildProcess, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

