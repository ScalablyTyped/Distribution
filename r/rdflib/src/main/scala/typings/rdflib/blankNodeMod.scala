package typings.rdflib

import typings.rdflib.factoryTypesMod._Comparable
import typings.rdflib.factoryTypesMod._DefaultFactoryTypes
import typings.rdflib.factoryTypesMod._TFIDFactoryTypes
import typings.rdflib.rdflibStrings._Colon
import typings.rdflib.tfTypesMod.QuadGraph
import typings.rdflib.tfTypesMod.QuadObject
import typings.rdflib.tfTypesMod.QuadSubject
import typings.rdflib.typesMod.SubjectType
import typings.rdflib.typesMod._FromValueReturns
import typings.rdflib.typesMod._ObjectType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blankNodeMod {
  
  @JSImport("rdflib/lib/blank-node", JSImport.Default)
  @js.native
  /**
    * Initializes this node
    * @param [id] The identifier for the blank node
    */
  open class default ()
    extends BlankNode
       with SubjectType
       with _DefaultFactoryTypes
       with _ObjectType {
    def this(id: String) = this()
    def this(id: Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("rdflib/lib/blank-node", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rdflib/lib/blank-node", "default.NTAnonymousNodePrefix")
    @js.native
    def NTAnonymousNodePrefix: _Colon = js.native
    inline def NTAnonymousNodePrefix_=(x: _Colon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NTAnonymousNodePrefix")(x.asInstanceOf[js.Any])
    
    @JSImport("rdflib/lib/blank-node", "default.getId")
    @js.native
    def getId: Any = js.native
    inline def getId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getId")(x.asInstanceOf[js.Any])
    
    /**
      * The next unique identifier for blank nodes
      */
    @JSImport("rdflib/lib/blank-node", "default.nextId")
    @js.native
    def nextId: Double = js.native
    inline def nextId_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nextId")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.rdflib.typesMod._ValueType because Already inherited
  - typings.rdflib.tfTypesMod.Term because var conflicts: termType, value. Inlined 
  - typings.rdflib.tfTypesMod.BlankNode because var conflicts: termType, value. Inlined  */ @js.native
  trait BlankNode
    extends typings.rdflib.nodeInternalMod.default
       with QuadGraph
       with QuadObject
       with QuadSubject
       with _Comparable
       with _TFIDFactoryTypes
       with _FromValueReturns[Any] {
    
    def compareTerm(other: BlankNode): Double = js.native
    
    /**
      * Gets a copy of this blank node in the specified formula
      * @param formula The formula
      */
    def copy(formula: typings.rdflib.storeMod.default): BlankNode = js.native
    
    /**
      * The identifier for the blank node
      */
    def id: String = js.native
    def id_=(value: String): Unit = js.native
    
    /** Whether this is a blank node */
    var isBlank: Double = js.native
    
    /**
      * This type of node is a variable.
      *
      * Note that the existence of this property already indicates that it is a variable.
      */
    var isVar: Double = js.native
    
    @JSName("termType")
    var termType_BlankNode: typings.rdflib.rdflibStrings.BlankNode = js.native
  }
}
