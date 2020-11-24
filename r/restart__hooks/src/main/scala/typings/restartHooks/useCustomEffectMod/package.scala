package typings.restartHooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object useCustomEffectMod {
  
  type EffectHook = js.Function2[
    /* effect */ typings.react.mod.EffectCallback, 
    /* deps */ js.UndefOr[typings.react.mod.DependencyList], 
    scala.Unit
  ]
  
  type IsEqual[TDeps /* <: typings.react.mod.DependencyList */] = js.Function2[/* nextDeps */ TDeps, /* prevDeps */ TDeps, scala.Boolean]
}
