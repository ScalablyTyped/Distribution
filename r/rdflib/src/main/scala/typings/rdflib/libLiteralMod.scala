package typings.rdflib

import typings.rdflib.libFactoriesFactoryTypesMod._Comparable
import typings.rdflib.libFactoriesFactoryTypesMod._DefaultFactoryTypes
import typings.rdflib.libFactoriesFactoryTypesMod._TFIDFactoryTypes
import typings.rdflib.libTfTypesMod.NamedNode
import typings.rdflib.libTfTypesMod.QuadObject
import typings.rdflib.libTypesMod.FromValueReturns
import typings.rdflib.libTypesMod.ValueType
import typings.rdflib.libTypesMod._FromValueReturns
import typings.rdflib.libTypesMod._ObjectType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLiteralMod {
  
  @JSImport("rdflib/lib/literal", JSImport.Default)
  @js.native
  open class default protected ()
    extends Literal
       with _DefaultFactoryTypes
       with _ObjectType {
    /**
      * Initializes a literal
      * @param value - The literal's lexical value
      * @param language - The language for the literal. Defaults to ''.
      * @param datatype - The literal's datatype as a named node. Defaults to xsd:string.
      */
    def this(value: String) = this()
    def this(value: String, language: String) = this()
    def this(value: String, language: String, datatype: Any) = this()
    def this(value: String, language: Null, datatype: Any) = this()
    def this(value: String, language: Unit, datatype: Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("rdflib/lib/literal", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Builds a literal node from a boolean value
      * @param value - The value
      */
    inline def fromBoolean(value: Boolean): Literal = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBoolean")(value.asInstanceOf[js.Any]).asInstanceOf[Literal]
    
    /**
      * Builds a literal node from a date value
      * @param value The value
      */
    inline def fromDate(value: js.Date): Literal = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(value.asInstanceOf[js.Any]).asInstanceOf[Literal]
    
    /**
      * Builds a literal node from a number value
      * @param value - The value
      */
    inline def fromNumber(value: Double): Literal = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Literal]
    
    /**
      * Builds a literal node from an input value
      * @param value - The input value
      */
    inline def fromValue[T /* <: FromValueReturns[Any] */](value: ValueType): T = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(value.asInstanceOf[js.Any]).asInstanceOf[T]
    
    /** Serializes a literal to an N-Triples string */
    inline def toNT(literal: Literal): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toNT")(literal.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.rdflib.libTypesMod._ValueType because Already inherited
  - typings.rdflib.libTfTypesMod.Term because var conflicts: termType, value. Inlined 
  - typings.rdflib.libTfTypesMod.Literal because var conflicts: termType, value. Inlined language, datatype */ @js.native
  trait Literal
    extends typings.rdflib.libNodeInternalMod.default
       with QuadObject
       with _Comparable
       with _TFIDFactoryTypes
       with _FromValueReturns[Any] {
    
    /**
      * Gets a copy of this literal
      */
    def copy(): Literal = js.native
    
    /**
      * The literal's datatype as a named node
      */
    var datatype: NamedNode | typings.rdflib.libNamedNodeMod.default = js.native
    
    var isVar: Double = js.native
    
    /**
      * The language for the literal
      * @deprecated use {language} instead
      */
    def lang: String = js.native
    def lang_=(language: String): Unit = js.native
    
    /**
      * The language for the literal
      */
    var language: String = js.native
    
    @JSName("termType")
    var termType_Literal: typings.rdflib.rdflibStrings.Literal = js.native
  }
}
