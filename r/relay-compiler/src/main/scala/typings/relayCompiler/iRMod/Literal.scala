package typings.relayCompiler.iRMod

import typings.relayCompiler.irvisitorMod.VisitNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Literal
  extends ArgumentValue
     with IR
     with VisitNode {
  var kind: typings.relayCompiler.relayCompilerStrings.Literal
  var loc: Location
  var value: js.Any
}

object Literal {
  @scala.inline
  def apply(kind: typings.relayCompiler.relayCompilerStrings.Literal, loc: Location, value: js.Any): Literal = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
}

