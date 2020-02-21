package typings.rdfjsToNtriples

import typings.rdfJs.mod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnTerm extends js.Object {
  def apply(term: js.Any): js.UndefOr[scala.Nothing] = js.native
  def apply(term: Term): String = js.native
}

