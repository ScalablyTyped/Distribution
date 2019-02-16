package typings
package shipitDashCliLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object shipitDashCliMod {
  type EmptyCallback = js.Function0[scala.Unit]
  type LocalOrRemoteCommand = js.Function3[
    /* command */ java.lang.String, 
    /* options */ js.UndefOr[nodeLib.childUnderscoreProcessMod.ExecOptions], 
    /* callback */ js.UndefOr[
      js.Function3[
        /* error */ nodeLib.Error, 
        /* stdout */ java.lang.String, 
        /* stderr */ java.lang.String, 
        scala.Unit
      ]
    ], 
    js.Thenable[ShipitLocal]
  ]
  type TaskExecution = js.Function3[
    /* name */ java.lang.String, 
    /* depsOrFn */ js.Array[java.lang.String] | EmptyCallback, 
    /* fn */ js.Function0[scala.Unit], 
    js.Any
  ]
}
