package typings.rdflib

import typings.rdflib.libFactoriesFactoryTypesMod._Comparable
import typings.rdflib.libFactoriesFactoryTypesMod._DefaultFactoryTypes
import typings.rdflib.libFactoriesFactoryTypesMod._TFIDFactoryTypes
import typings.rdflib.libTfTypesMod.QuadGraph
import typings.rdflib.libTfTypesMod.QuadObject
import typings.rdflib.libTfTypesMod.QuadPredicate
import typings.rdflib.libTfTypesMod.QuadSubject
import typings.rdflib.libTypesMod.GraphType
import typings.rdflib.libTypesMod.PredicateType
import typings.rdflib.libTypesMod.SubjectType
import typings.rdflib.libTypesMod._FromValueReturns
import typings.rdflib.libTypesMod._ObjectType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVariableMod {
  
  @JSImport("rdflib/lib/variable", JSImport.Default)
  @js.native
  /**
    * Initializes this variable
    * @param name The variable's name
    */
  open class default ()
    extends Variable
       with GraphType
       with PredicateType
       with SubjectType
       with _DefaultFactoryTypes
       with _ObjectType {
    def this(name: String) = this()
  }
  /* static members */
  object default {
    
    @JSImport("rdflib/lib/variable", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def toString(variable: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(variable.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.rdflib.libTypesMod._ValueType because Already inherited
  - typings.rdflib.libTfTypesMod.Term because var conflicts: termType, value. Inlined 
  - typings.rdflib.libTfTypesMod.Variable because var conflicts: termType, value. Inlined  */ @js.native
  trait Variable
    extends typings.rdflib.libNodeInternalMod.default
       with QuadGraph
       with QuadObject
       with QuadPredicate
       with QuadSubject
       with _TFIDFactoryTypes
       with _Comparable
       with _FromValueReturns[Any] {
    
    /** The base string for a variable's name */
    var base: String = js.native
    
    var isVar: Double = js.native
    
    def substitute(bindings: Any): Any = js.native
    
    @JSName("termType")
    var termType_Variable: typings.rdflib.rdflibStrings.Variable = js.native
    
    /** The unique identifier of this variable */
    var uri: String = js.native
  }
}
