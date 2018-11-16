package typings
package shipitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object shipitMod {
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
    stdLib.PromiseLike[ShipitLocal]
  ]
  type TaskExecution = js.Function3[
    /* name */ java.lang.String, 
    /* depsOrFn */ js.Array[java.lang.String] | EmptyCallback, 
    /* fn */ js.Function0[scala.Unit], 
    js.Any
  ]
}
