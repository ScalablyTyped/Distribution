package typings.relayDashCompiler.libCoreGraphQLIRMod

import typings.relayDashCompiler.libCoreGraphQLIRVisitorMod.VisitNode
import typings.typescript.typescriptMod.TypeReferenceNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connection extends VisitNode {
  var conditional: Boolean
  var key: String
  var value: TypeReferenceNode
}

object Connection {
  @scala.inline
  def apply(conditional: Boolean, key: String, value: TypeReferenceNode): Connection = {
    val __obj = js.Dynamic.literal(conditional = conditional.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Connection]
  }
}

