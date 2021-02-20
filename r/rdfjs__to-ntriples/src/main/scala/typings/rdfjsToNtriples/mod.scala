package typings.rdfjsToNtriples

import typings.rdfJs.mod.Quad
import typings.rdfJs.mod.Term
import typings.rdfjsToNtriples.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rdfjs/to-ntriples", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@rdfjs/to-ntriples", "quadToNTriples")
  @js.native
  def quadToNTriples: js.Function1[/* quad */ Quad, String] = js.native
  @JSImport("@rdfjs/to-ntriples", "quadToNTriples")
  @js.native
  def quadToNTriples(quad: Quad): String = js.native
  @scala.inline
  def quadToNTriples_=(x: js.Function1[/* quad */ Quad, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("quadToNTriples")(x.asInstanceOf[js.Any])
  
  @JSImport("@rdfjs/to-ntriples", "termToNTriples")
  @js.native
  def termToNTriples: FnCall = js.native
  @JSImport("@rdfjs/to-ntriples", "termToNTriples")
  @js.native
  def termToNTriples(term: js.Any): js.UndefOr[scala.Nothing] = js.native
  @JSImport("@rdfjs/to-ntriples", "termToNTriples")
  @js.native
  def termToNTriples(term: Term): String = js.native
  @scala.inline
  def termToNTriples_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("termToNTriples")(x.asInstanceOf[js.Any])
}
