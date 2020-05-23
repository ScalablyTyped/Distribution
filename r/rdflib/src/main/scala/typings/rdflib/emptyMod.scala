package typings.rdflib

import typings.rdflib.factoryTypesMod._Comparable
import typings.rdflib.factoryTypesMod._TFIDFactoryTypes
import typings.rdflib.tfTypesMod.QuadObject
import typings.rdflib.typesMod._FromValueReturns
import typings.rdflib.typesMod._ObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib/lib/empty", JSImport.Namespace)
@js.native
object emptyMod extends js.Object {
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.rdflib.typesMod._ValueType because Already inherited
  - typings.rdflib.tfTypesMod.Term because var conflicts: termType, value. Inlined  */ @js.native
  trait Empty
    extends typings.rdflib.nodeInternalMod.default
       with QuadObject
       with _Comparable
       with _FromValueReturns[js.Any]
       with _TFIDFactoryTypes {
    @JSName("termType")
    var termType_Empty: typings.rdflib.rdflibStrings.Empty = js.native
  }
  
  @js.native
  class default ()
    extends Empty
       with _ObjectType
  
}

