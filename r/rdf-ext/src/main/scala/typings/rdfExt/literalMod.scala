package typings.rdfExt

import typings.rdfExt.anon.Datatype
import typings.rdfJs.mod.Literal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object literalMod {
  
  @js.native
  trait LiteralExt extends Literal {
    
    def toCanonical(): String = js.native
    
    def toJSON(): Datatype = js.native
  }
}
