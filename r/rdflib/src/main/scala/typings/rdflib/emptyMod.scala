package typings.rdflib

import typings.rdflib.factoryTypesMod._Comparable
import typings.rdflib.factoryTypesMod._TFIDFactoryTypes
import typings.rdflib.tfTypesMod.QuadObject
import typings.rdflib.typesMod._FromValueReturns
import typings.rdflib.typesMod._ObjectType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emptyMod {
  
  @JSImport("rdflib/lib/empty", JSImport.Default)
  @js.native
  open class default ()
    extends Empty
       with _ObjectType
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.rdflib.typesMod._ValueType because Already inherited
  - typings.rdflib.tfTypesMod.Term because var conflicts: termType, value. Inlined  */ @js.native
  trait Empty
    extends typings.rdflib.nodeInternalMod.default
       with QuadObject
       with _Comparable
       with _FromValueReturns[Any]
       with _TFIDFactoryTypes {
    
    @JSName("termType")
    var termType_Empty: typings.rdflib.rdflibStrings.Empty = js.native
  }
}
