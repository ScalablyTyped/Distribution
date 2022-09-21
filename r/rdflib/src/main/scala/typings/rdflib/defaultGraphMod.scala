package typings.rdflib

import typings.rdflib.factoryTypesMod._Comparable
import typings.rdflib.factoryTypesMod._TFIDFactoryTypes
import typings.rdflib.rdflibStrings._empty
import typings.rdflib.tfTypesMod.QuadGraph
import typings.rdflib.tfTypesMod.QuadObject
import typings.rdflib.typesMod.GraphType
import typings.rdflib.typesMod._FromValueReturns
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultGraphMod {
  
  @JSImport("rdflib/lib/default-graph", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rdflib/lib/default-graph", JSImport.Default)
  @js.native
  open class default ()
    extends DefaultGraph
       with GraphType
  
  inline def isDefaultGraph(`object`: Any): /* is rdflib.rdflib/lib/default-graph.DefaultGraph */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefaultGraph")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is rdflib.rdflib/lib/default-graph.DefaultGraph */ Boolean]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.rdflib.typesMod._ValueType because Already inherited
  - typings.rdflib.tfTypesMod.Term because var conflicts: termType, value. Inlined 
  - typings.rdflib.tfTypesMod.DefaultGraph because var conflicts: termType, value. Inlined  */ @js.native
  trait DefaultGraph
    extends typings.rdflib.nodeInternalMod.default
       with QuadGraph
       with QuadObject
       with _Comparable
       with _FromValueReturns[Any]
       with _TFIDFactoryTypes {
    
    @JSName("termType")
    var termType_DefaultGraph: typings.rdflib.rdflibStrings.DefaultGraph = js.native
    
    var uri: String = js.native
    
    @JSName("value")
    var value_DefaultGraph: _empty = js.native
  }
}
