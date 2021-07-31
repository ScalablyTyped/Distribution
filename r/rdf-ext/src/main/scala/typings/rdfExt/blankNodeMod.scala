package typings.rdfExt

import typings.rdfExt.anon.TermType
import typings.rdfJs.mod.BlankNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blankNodeMod {
  
  @js.native
  trait BlankNodeExt
    extends StObject
       with BlankNode {
    
    def toCanonical(): String = js.native
    
    def toJSON(): TermType = js.native
  }
}
