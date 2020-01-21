package typings.sparqlHttpClient

import typings.rdfJs.mod.Term
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBindings extends js.Object {
  var bindings: js.Array[Record[String, Term]]
}

object AnonBindings {
  @scala.inline
  def apply(bindings: js.Array[Record[String, Term]]): AnonBindings = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBindings]
  }
}

