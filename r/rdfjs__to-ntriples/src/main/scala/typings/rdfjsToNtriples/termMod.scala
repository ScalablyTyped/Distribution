package typings.rdfjsToNtriples

import typings.rdfJs.mod.Term
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object termMod {
  
  @scala.inline
  def apply(term: js.Any): Unit = ^.asInstanceOf[js.Dynamic].apply(term.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def apply(term: Term): String = ^.asInstanceOf[js.Dynamic].apply(term.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@rdfjs/to-ntriples/lib/term", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
