package typings.rdfExt

import typings.rdfExt.anon.Graph
import typings.rdfExt.libBlankNodeMod.BlankNodeExt
import typings.rdfExt.libDefaultGraphMod.DefaultGraphExt
import typings.rdfExt.libLiteralMod.LiteralExt
import typings.rdfExt.libNamedNodeMod.NamedNodeExt
import typings.rdfExt.libVariableMod.VariableExt
import typings.rdfExt.rdfExtStrings._empty
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.dataModelMod.QuadGraph
import typings.rdfjsTypes.dataModelMod.QuadObject
import typings.rdfjsTypes.dataModelMod.QuadPredicate
import typings.rdfjsTypes.dataModelMod.QuadSubject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libQuadMod {
  
  @JSImport("rdf-ext/lib/Quad", JSImport.Default)
  @js.native
  open class default protected () extends QuadExt {
    def this(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject) = this()
    def this(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject, graph: QuadGraph) = this()
  }
  
  @JSImport("rdf-ext/lib/Quad", "QuadExt")
  @js.native
  open class QuadExt protected ()
    extends StObject
       with Quad {
    def this(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject) = this()
    def this(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject, graph: QuadGraph) = this()
    
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
