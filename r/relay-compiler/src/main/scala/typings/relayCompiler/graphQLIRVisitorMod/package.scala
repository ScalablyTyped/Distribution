package typings.relayCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object graphQLIRVisitorMod {
  type NodeVisitor = typings.relayCompiler.graphQLIRVisitorMod.EnterLeave[typings.relayCompiler.AnonArgument] | typings.relayCompiler.AnonArgumentClientExtension
  type NodeVisitorObject[T /* <: typings.relayCompiler.graphQLIRVisitorMod.VisitNode */] = typings.relayCompiler.graphQLIRVisitorMod.EnterLeave[typings.relayCompiler.graphQLIRVisitorMod.VisitFn[T]] | typings.relayCompiler.graphQLIRVisitorMod.VisitFn[T]
  type VisitFn[T /* <: typings.relayCompiler.graphQLIRVisitorMod.VisitNode */] = js.Function5[
    /* node */ T, 
    /* key */ js.UndefOr[js.Any], 
    /* parent */ js.UndefOr[
      scala.Null | typings.relayCompiler.graphQLIRVisitorMod.VisitNode | js.Array[typings.relayCompiler.graphQLIRVisitorMod.VisitNode]
    ], 
    /* path */ js.UndefOr[js.Array[js.Any]], 
    /* ancestors */ js.UndefOr[
      js.Array[
        typings.relayCompiler.graphQLIRVisitorMod.VisitNode | js.Array[typings.relayCompiler.graphQLIRVisitorMod.VisitNode]
      ]
    ], 
    // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any
  ]
}
