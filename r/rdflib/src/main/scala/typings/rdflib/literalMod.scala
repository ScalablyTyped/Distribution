package typings.rdflib

import typings.rdflib.factoryTypesMod._Comparable
import typings.rdflib.factoryTypesMod._DefaultFactoryTypes
import typings.rdflib.factoryTypesMod._TFIDFactoryTypes
import typings.rdflib.tfTypesMod.NamedNode
import typings.rdflib.tfTypesMod.QuadObject
import typings.rdflib.typesMod.FromValueReturns
import typings.rdflib.typesMod.ValueType
import typings.rdflib.typesMod._FromValueReturns
import typings.rdflib.typesMod._ObjectType
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib/lib/literal", JSImport.Namespace)
@js.native
object literalMod extends js.Object {
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.rdflib.typesMod._ValueType because Already inherited
  - typings.rdflib.tfTypesMod.Term because var conflicts: termType, value. Inlined 
  - typings.rdflib.tfTypesMod.Literal because var conflicts: termType, value. Inlined language, datatype */ @js.native
  trait Literal
    extends typings.rdflib.nodeInternalMod.default
       with QuadObject
       with _Comparable
       with _TFIDFactoryTypes
       with _FromValueReturns[js.Any] {
    /**
      * The literal's datatype as a named node
      */
    var datatype: NamedNode | typings.rdflib.namedNodeMod.default = js.native
    var isVar: Double = js.native
    /**
      * The language for the literal
      */
    var language: String = js.native
    @JSName("termType")
    var termType_Literal: typings.rdflib.rdflibStrings.Literal = js.native
    /**
      * Gets a copy of this literal
      */
    def copy(): Literal = js.native
    /**
      * The language for the literal
      * @deprecated use {language} instead
      */
    def lang: String = js.native
    def lang_=(language: String): Unit = js.native
  }
  
  @js.native
  class default protected ()
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
    def this(value: String, language: js.UndefOr[scala.Nothing], datatype: js.Any) = this()
    def this(value: String, language: String, datatype: js.Any) = this()
    def this(value: String, language: Null, datatype: js.Any) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    /**
      * Builds a literal node from a boolean value
      * @param value - The value
      */
    def fromBoolean(value: Boolean): Literal = js.native
    /**
      * Builds a literal node from a date value
      * @param value The value
      */
    def fromDate(value: Date): Literal = js.native
    /**
      * Builds a literal node from a number value
      * @param value - The value
      */
    def fromNumber(value: Double): Literal = js.native
    /**
      * Builds a literal node from an input value
      * @param value - The input value
      */
    def fromValue[T /* <: FromValueReturns[_] */](value: ValueType): T = js.native
    /** Serializes a literal to an N-Triples string */
    def toNT(literal: Literal): String = js.native
  }
  
}

