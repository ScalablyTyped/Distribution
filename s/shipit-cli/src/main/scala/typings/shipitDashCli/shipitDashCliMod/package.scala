package typings.shipitDashCli

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object shipitDashCliMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.node.childUnderscoreProcessMod.ExecOptions
  import typings.std.Error

  type EmptyCallback = js.Function0[Unit]
  type LocalOrRemoteCommand = js.Function3[
    /* command */ String, 
    /* options */ js.UndefOr[ExecOptions], 
    /* callback */ js.UndefOr[js.Function3[/* error */ Error, /* stdout */ String, /* stderr */ String, Unit]], 
    js.Thenable[ShipitLocal]
  ]
  type TaskExecution = js.Function3[
    /* name */ String, 
    /* depsOrFn */ js.Array[String] | EmptyCallback, 
    /* fn */ js.Function0[Unit], 
    js.Any
  ]
  type Tasks = StringDictionary[Task]
}
