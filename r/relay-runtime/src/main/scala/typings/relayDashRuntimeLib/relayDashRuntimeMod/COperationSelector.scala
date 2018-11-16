package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait COperationSelector[TNode, TOperation] extends js.Object {
  var fragment: CSelector[TNode]
  var node: TOperation
  var root: CSelector[TNode]
  var variables: Variables
}

