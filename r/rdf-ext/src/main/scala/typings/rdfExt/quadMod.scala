package typings.rdfExt

import typings.rdfExt.anon.Graph
import typings.rdfExt.blankNodeMod.BlankNodeExt
import typings.rdfExt.defaultGraphMod.DefaultGraphExt
import typings.rdfExt.literalMod.LiteralExt
import typings.rdfExt.namedNodeMod.NamedNodeExt
import typings.rdfExt.rdfExtStrings._empty
import typings.rdfExt.variableMod.VariableExt
import typings.rdfJs.mod.Quad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rdf-ext/lib/Quad", JSImport.Namespace)
@js.native
object quadMod extends js.Object {
  
  @js.native
  trait QuadExt extends Quad {
    
    @JSName("graph")
    var graph_QuadExt: DefaultGraphExt | NamedNodeExt[String] | BlankNodeExt | VariableExt = js.native
    
    @JSName("object")
    var object_QuadExt: NamedNodeExt[String] | LiteralExt | BlankNodeExt | VariableExt = js.native
    
    @JSName("predicate")
    var predicate_QuadExt: NamedNodeExt[String] | VariableExt = js.native
    
    @JSName("subject")
    var subject_QuadExt: NamedNodeExt[String] | BlankNodeExt | VariableExt = js.native
    
    @JSName("termType")
    var termType_QuadExt: typings.rdfExt.rdfExtStrings.Quad = js.native
    
    def toCanonical(): String = js.native
    
    def toJSON(): Graph = js.native
    
    @JSName("value")
    var value_QuadExt: _empty = js.native
  }
}
