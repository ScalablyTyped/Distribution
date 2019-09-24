package typings.relayDashCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libCoreGraphQLIRVisitorMod {
  import typings.relayDashCompiler.Anon_Argument
  import typings.relayDashCompiler.Anon_ArgumentClientExtension

  type NodeVisitor = EnterLeave[Anon_Argument] | Anon_ArgumentClientExtension
  type NodeVisitorObject[T /* <: VisitNode */] = EnterLeave[VisitFn[T]] | VisitFn[T]
  type VisitFn[T /* <: VisitNode */] = js.Function5[
    /* node */ T, 
    /* key */ js.UndefOr[js.Any], 
    /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], 
    /* path */ js.UndefOr[js.Array[js.Any]], 
    /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]], 
    // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any
  ]
}
