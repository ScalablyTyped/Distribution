package typings.rdfExt

import typings.rdfExt.anon.Value
import typings.rdfJs.mod.DefaultGraph
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultGraphMod {
  
  @js.native
  trait DefaultGraphExt
    extends StObject
       with DefaultGraph {
    
    def toCanonical(): String = js.native
    
    def toJSON(): Value = js.native
  }
}
