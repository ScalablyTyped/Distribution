package typings.rdfjsToNtriples

import typings.rdfJs.mod.Quad
import typings.rdfJs.mod.Term
import typings.rdfjsToNtriples.anon.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@rdfjs/to-ntriples", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def quadToNTriples(quad: Quad): String = js.native
  @JSName("quadToNTriples")
  var quadToNTriples_Original: js.Function1[/* quad */ Quad, String] = js.native
  
  def termToNTriples(term: js.Any): js.UndefOr[scala.Nothing] = js.native
  def termToNTriples(term: Term): String = js.native
  @JSName("termToNTriples")
  var termToNTriples_Original: FnCall = js.native
}
