package typings.rdflib

import typings.rdflib.libFactoriesFactoryTypesMod._Comparable
import typings.rdflib.libFactoriesFactoryTypesMod._TFIDFactoryTypes
import typings.rdflib.libTfTypesMod.QuadObject
import typings.rdflib.libTypesMod._FromValueReturns
import typings.rdflib.libTypesMod._ObjectType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEmptyMod {
  
  @JSImport("rdflib/lib/empty", JSImport.Default)
  @js.native
  open class default ()
    extends Empty
       with _ObjectType
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.rdflib.libTypesMod._ValueType because Already inherited
  - typings.rdflib.libTfTypesMod.Term because var conflicts: termType, value. Inlined  */ @js.native
  trait Empty
    extends typings.rdflib.libNodeInternalMod.default
       with QuadObject
       with _Comparable
       with _FromValueReturns[Any]
       with _TFIDFactoryTypes {
    
    @JSName("termType")
    var termType_Empty: typings.rdflib.rdflibStrings.Empty = js.native
  }
}
