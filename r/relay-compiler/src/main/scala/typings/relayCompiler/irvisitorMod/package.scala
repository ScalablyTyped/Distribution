package typings.relayCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object irvisitorMod {
  type NodeVisitor = typings.relayCompiler.irvisitorMod.EnterLeave[typings.relayCompiler.anon.Argument] | typings.relayCompiler.anon.ClientExtension
  type NodeVisitorObject[T /* <: typings.relayCompiler.irvisitorMod.VisitNode */] = typings.relayCompiler.irvisitorMod.EnterLeave[typings.relayCompiler.irvisitorMod.VisitFn[T]] | typings.relayCompiler.irvisitorMod.VisitFn[T]
  type VisitFn[T /* <: typings.relayCompiler.irvisitorMod.VisitNode */] = js.Function5[
    /* node */ T, 
    /* key */ js.UndefOr[js.Any], 
    /* parent */ js.UndefOr[
      scala.Null | typings.relayCompiler.irvisitorMod.VisitNode | js.Array[typings.relayCompiler.irvisitorMod.VisitNode]
    ], 
    /* path */ js.UndefOr[js.Array[js.Any]], 
    /* ancestors */ js.UndefOr[
      js.Array[
        typings.relayCompiler.irvisitorMod.VisitNode | js.Array[typings.relayCompiler.irvisitorMod.VisitNode]
      ]
    ], 
    // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any
  ]
}
