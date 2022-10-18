package typings.rdfExt

import typings.rdfExt.anon.Graph
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
  
  // tslint:disable-next-line:no-unnecessary-class
  @JSImport("rdf-ext/lib/Quad", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with QuadExt {
    def this(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject) = this()
    def this(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject, graph: QuadGraph) = this()
  }
  
  // tslint:disable-next-line:no-unnecessary-class
  @js.native
  trait QuadExt
    extends StObject
       with Quad {
    
    @JSName("graph")
    var graph_QuadExt: typings.rdfExt.libDefaultGraphMod.^ | typings.rdfExt.libNamedNodeMod.^[String] | typings.rdfExt.libBlankNodeMod.^ | typings.rdfExt.libVariableMod.^ = js.native
    
    @JSName("object")
    var object_QuadExt: typings.rdfExt.libNamedNodeMod.^[String] | typings.rdfExt.libLiteralMod.^ | typings.rdfExt.libBlankNodeMod.^ | typings.rdfExt.libVariableMod.^ = js.native
    
    @JSName("predicate")
    var predicate_QuadExt: typings.rdfExt.libNamedNodeMod.^[String] | typings.rdfExt.libVariableMod.^ = js.native
    
    @JSName("subject")
    var subject_QuadExt: typings.rdfExt.libNamedNodeMod.^[String] | typings.rdfExt.libBlankNodeMod.^ | typings.rdfExt.libVariableMod.^ = js.native
    
    @JSName("termType")
    var termType_QuadExt: typings.rdfExt.rdfExtStrings.Quad = js.native
    
    def toCanonical(): String = js.native
    
    def toJSON(): Graph = js.native
    
    @JSName("value")
    var value_QuadExt: _empty = js.native
  }
}
