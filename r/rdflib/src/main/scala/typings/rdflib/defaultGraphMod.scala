package typings.rdflib

import typings.rdflib.factoryTypesMod._Comparable
import typings.rdflib.factoryTypesMod._TFIDFactoryTypes
import typings.rdflib.rdflibStrings._empty
import typings.rdflib.tfTypesMod.QuadGraph
import typings.rdflib.tfTypesMod.QuadObject
import typings.rdflib.typesMod.GraphType
import typings.rdflib.typesMod._FromValueReturns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib/lib/default-graph", JSImport.Namespace)
@js.native
object defaultGraphMod extends js.Object {
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.rdflib.typesMod._ValueType because Already inherited
  - typings.rdflib.tfTypesMod.Term because var conflicts: termType, value. Inlined 
  - typings.rdflib.tfTypesMod.DefaultGraph because var conflicts: termType, value. Inlined  */ @js.native
  trait DefaultGraph
    extends typings.rdflib.nodeInternalMod.default
       with QuadGraph
       with QuadObject
       with _Comparable
       with _FromValueReturns[js.Any]
       with _TFIDFactoryTypes {
    @JSName("termType")
    var termType_DefaultGraph: typings.rdflib.rdflibStrings.DefaultGraph = js.native
    var uri: String = js.native
    @JSName("value")
    var value_DefaultGraph: _empty = js.native
  }
  
  @js.native
  class default ()
    extends DefaultGraph
       with GraphType
  
  def isDefaultGraph(`object`: js.Any): /* is rdflib.rdflib/lib/default-graph.DefaultGraph */ Boolean = js.native
}

