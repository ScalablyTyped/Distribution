package typings.rdflib

import typings.rdflib.factoryTypesMod._Comparable
import typings.rdflib.factoryTypesMod._TFIDFactoryTypes
import typings.rdflib.tfTypesMod.QuadObject
import typings.rdflib.typesMod.FromValueReturns
import typings.rdflib.typesMod.ValueType
import typings.rdflib.typesMod._FromValueReturns
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collectionMod {
  
  @JSImport("rdflib/lib/collection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.rdflib.typesMod._FromValueReturns because Already inherited */ @JSImport("rdflib/lib/collection", JSImport.Default)
  @js.native
  open class default[T /* <: typings.rdflib.nodeInternalMod.default */] () extends Collection[T] {
    def this(initial: js.Array[ValueType]) = this()
  }
  /* static members */
  object default {
    
    @JSImport("rdflib/lib/collection", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rdflib/lib/collection", "default.termType")
    @js.native
    def termType: typings.rdflib.rdflibStrings.Collection = js.native
    inline def termType_=(x: typings.rdflib.rdflibStrings.Collection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("termType")(x.asInstanceOf[js.Any])
    
    inline def toNT(collection: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toNT")(collection.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  inline def fromValue[T /* <: FromValueReturns[C] */, C /* <: typings.rdflib.nodeInternalMod.default */](value: ValueType): T = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.rdflib.typesMod._ValueType because Already inherited
  - typings.rdflib.tfTypesMod.Term because var conflicts: termType, value. Inlined  */ @js.native
  trait Collection[T /* <: typings.rdflib.nodeInternalMod.default */]
    extends typings.rdflib.nodeInternalMod.default
       with QuadObject
       with _Comparable
       with _FromValueReturns[Any]
       with _TFIDFactoryTypes {
    
    /**
      * Appends an element to this collection
      * @param element - The new element
      */
    def append(element: T): Double = js.native
    
    /**
      * Closes this collection
      */
    def close(): Boolean = js.native
    
    var closed: Boolean = js.native
    
    def compareTerm(other: typings.rdflib.blankNodeMod.default): Double = js.native
    
    /**
      * The nodes in this collection
      */
    var elements: js.Array[T] = js.native
    
    def id: String = js.native
    def id_=(value: String): Unit = js.native
    
    var isVar: Double = js.native
    
    /**
      * Removes the first element from the collection (and return it)
      */
    def shift(): js.UndefOr[T] = js.native
    
    @JSName("termType")
    var termType_Collection: typings.rdflib.rdflibStrings.Collection = js.native
    
    /**
      * Prepends the specified element to the collection's front
      * @param element - The element to prepend
      */
    def unshift(element: T): Double = js.native
  }
}
