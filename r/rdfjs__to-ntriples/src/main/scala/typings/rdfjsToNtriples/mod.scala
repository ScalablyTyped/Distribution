package typings.rdfjsToNtriples

import typings.rdfJs.mod.Quad
import typings.rdfJs.mod.Term
import typings.rdfjsToNtriples.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rdfjs/to-ntriples", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@rdfjs/to-ntriples", "quadToNTriples")
  @js.native
  def quadToNTriples: js.Function1[/* quad */ Quad, String] = js.native
  @scala.inline
  def quadToNTriples(quad: Quad): String = ^.asInstanceOf[js.Dynamic].applyDynamic("quadToNTriples")(quad.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def quadToNTriples_=(x: js.Function1[/* quad */ Quad, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("quadToNTriples")(x.asInstanceOf[js.Any])
  
  @JSImport("@rdfjs/to-ntriples", "termToNTriples")
  @js.native
  def termToNTriples: FnCall = js.native
  @scala.inline
  def termToNTriples(term: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("termToNTriples")(term.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def termToNTriples(term: Term): String = ^.asInstanceOf[js.Dynamic].applyDynamic("termToNTriples")(term.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def termToNTriples_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("termToNTriples")(x.asInstanceOf[js.Any])
}
