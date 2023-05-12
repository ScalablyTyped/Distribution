package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A function that walks a node array using the given visitor, returning an array whose contents satisfy the test.
  *
  * - If the input node array is undefined, the output is undefined.
  * - If the visitor can return undefined, the node it visits in the array will be reused.
  * - If the output node array is not undefined, then its contents will satisfy the test.
  * - In order to obtain a return type that is more specific than `NodeArray<Node>`, a test
  *   function _must_ be provided, and that function must be a type predicate.
  *
  * For the canonical implementation of this type, @see {visitNodes}.
  */
@js.native
trait NodesVisitor extends StObject {
  
  def apply[TIn /* <: Node */, TInArray /* <: js.UndefOr[NodeArray[TIn]] */](nodes: TInArray, visitor: Visitor[TIn, js.UndefOr[Node]]): NodeArray[Node] | (TInArray & Unit) = js.native
  def apply[TIn /* <: Node */, TInArray /* <: js.UndefOr[NodeArray[TIn]] */](
    nodes: TInArray,
    visitor: Visitor[TIn, js.UndefOr[Node]],
    test: js.Function1[/* node */ Node, Boolean]
  ): NodeArray[Node] | (TInArray & Unit) = js.native
  def apply[TIn /* <: Node */, TInArray /* <: js.UndefOr[NodeArray[TIn]] */](
    nodes: TInArray,
    visitor: Visitor[TIn, js.UndefOr[Node]],
    test: js.Function1[/* node */ Node, Boolean],
    start: Double
  ): NodeArray[Node] | (TInArray & Unit) = js.native
  def apply[TIn /* <: Node */, TInArray /* <: js.UndefOr[NodeArray[TIn]] */](
    nodes: TInArray,
    visitor: Visitor[TIn, js.UndefOr[Node]],
    test: js.Function1[/* node */ Node, Boolean],
    start: Double,
    count: Double
  ): NodeArray[Node] | (TInArray & Unit) = js.native
  def apply[TIn /* <: Node */, TInArray /* <: js.UndefOr[NodeArray[TIn]] */](
    nodes: TInArray,
    visitor: Visitor[TIn, js.UndefOr[Node]],
    test: js.Function1[/* node */ Node, Boolean],
    start: Unit,
    count: Double
  ): NodeArray[Node] | (TInArray & Unit) = js.native
  def apply[TIn /* <: Node */, TInArray /* <: js.UndefOr[NodeArray[TIn]] */](nodes: TInArray, visitor: Visitor[TIn, js.UndefOr[Node]], test: Unit, start: Double): NodeArray[Node] | (TInArray & Unit) = js.native
  def apply[TIn /* <: Node */, TInArray /* <: js.UndefOr[NodeArray[TIn]] */](nodes: TInArray, visitor: Visitor[TIn, js.UndefOr[Node]], test: Unit, start: Double, count: Double): NodeArray[Node] | (TInArray & Unit) = js.native
  def apply[TIn /* <: Node */, TInArray /* <: js.UndefOr[NodeArray[TIn]] */](nodes: TInArray, visitor: Visitor[TIn, js.UndefOr[Node]], test: Unit, start: Unit, count: Double): NodeArray[Node] | (TInArray & Unit) = js.native
}
