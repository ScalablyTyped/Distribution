package typings.rdfjsToNtriples

import typings.rdfJs.mod.Quad
import typings.rdfJs.mod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@rdfjs/to-ntriples", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @JSName("quadToNTriples")
  var quadToNTriples_Original: js.Function1[/* quad */ Quad, String] = js.native
  @JSName("termToNTriples")
  var termToNTriples_Original: FnTerm = js.native
  def quadToNTriples(quad: Quad): String = js.native
  def termToNTriples(term: js.Any): js.UndefOr[scala.Nothing] = js.native
  def termToNTriples(term: Term): String = js.native
}

