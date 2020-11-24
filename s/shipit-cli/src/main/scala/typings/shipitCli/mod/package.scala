package typings.shipitCli

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type EmptyCallback = js.Function0[scala.Unit]
  
  type LocalOrRemoteCommand = js.Function3[
    /* command */ java.lang.String, 
    /* options */ js.UndefOr[typings.node.childProcessMod.ExecOptions], 
    /* callback */ js.UndefOr[
      js.Function3[
        /* error */ typings.std.Error, 
        /* stdout */ java.lang.String, 
        /* stderr */ java.lang.String, 
        scala.Unit
      ]
    ], 
    js.Thenable[typings.shipitCli.mod.ShipitLocal]
  ]
  
  type TaskExecution = js.Function3[
    /* name */ java.lang.String, 
    /* depsOrFn */ js.Array[java.lang.String] | typings.shipitCli.mod.EmptyCallback, 
    /* fn */ js.Function0[scala.Unit], 
    js.Any
  ]
  
  type Tasks_ = org.scalablytyped.runtime.StringDictionary[typings.shipitCli.mod.Task_]
}
