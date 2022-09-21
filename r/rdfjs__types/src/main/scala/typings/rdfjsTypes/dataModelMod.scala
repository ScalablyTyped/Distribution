package typings.rdfjsTypes

import typings.rdfjsTypes.rdfjsTypesStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataModelMod {
  
  @js.native
  trait BaseQuad
    extends StObject
       with _Term {
    
    /**
      * @param other The term to compare with.
      * @return True if and only if the argument is a) of the same type b) has all components equal.
      */
    def equals(): Boolean = js.native
    def equals(other: Term): Boolean = js.native
    
    /**
      * The named graph.
      * @see Quad_Graph
      */
    var graph: Term = js.native
    
    /**
      * The object.
      * @see Quad_Object
      */
    var `object`: Term = js.native
    
    /**
      * The predicate.
      * @see Quad_Predicate
      */
    var predicate: Term = js.native
    
    /**
      * The subject.
      * @see Quad_Subject
      */
    var subject: Term = js.native
    
    /**
      * Contains the constant "Quad".
      */
    var termType: typings.rdfjsTypes.rdfjsTypesStrings.Quad = js.native
    
    /**
      * Contains an empty string as constant value.
      */
    var value: _empty = js.native
  }
  
  @js.native
  trait BlankNode
    extends StObject
       with _QuadGraph
       with _QuadObject
       with _QuadSubject
       with _Term {
    
    /**
      * @param other The term to compare with.
      * @return True if and only if other has termType "BlankNode" and the same `value`.
      */
    def equals(): Boolean = js.native
    def equals(other: Term): Boolean = js.native
    
    /**
      * Contains the constant "BlankNode".
      */
    var termType: typings.rdfjsTypes.rdfjsTypesStrings.BlankNode = js.native
    
    /**
      * Blank node name as a string, without any serialization specific prefixes,
      * e.g. when parsing,
      * if the data was sourced from Turtle, remove _:,
      * if it was sourced from RDF/XML, do not change the blank node name (example: blank3).
      */
    var value: String = js.native
  }
  
  @js.native
  trait DataFactory[OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */] extends StObject {
    
    /**
      * @param value The optional blank node identifier.
      * @return A new instance of BlankNode.
      *                         If the `value` parameter is undefined a new identifier
      *                         for the blank node is generated for each call.
      * @see BlankNode
      */
    def blankNode(): BlankNode = js.native
    def blankNode(value: String): BlankNode = js.native
    
    /**
      * @return An instance of DefaultGraph.
      */
    def defaultGraph(): DefaultGraph = js.native
    
    /**
      * @param                 value              The literal value.
      * @param languageOrDatatype The optional language or datatype.
      *                                                    If `languageOrDatatype` is a NamedNode,
      *                                                    then it is used for the value of `NamedNode.datatype`.
      *                                                    Otherwise `languageOrDatatype` is used for the value
      *                                                    of `NamedNode.language`.
      * @return A new instance of Literal.
      * @see Literal
      */
    def literal(value: String): Literal = js.native
    def literal(value: String, languageOrDatatype: String): Literal = js.native
    def literal(value: String, languageOrDatatype: NamedNode[String]): Literal = js.native
    
    /**
      * @param value The IRI for the named node.
      * @return A new instance of NamedNode.
      * @see NamedNode
      */
    def namedNode[Iri /* <: String */](value: Iri): NamedNode[Iri] = js.native
    
    /**
      * @param subject   The quad subject term.
      * @param predicate The quad predicate term.
      * @param object    The quad object term.
      * @param graph     The quad graph term.
      * @return A new instance of Quad.
      * @see Quad
      */
    def quad(
      subject: /* import warning: importer.ImportType#apply Failed type conversion: InQuad['subject'] */ js.Any,
      predicate: /* import warning: importer.ImportType#apply Failed type conversion: InQuad['predicate'] */ js.Any,
      `object`: /* import warning: importer.ImportType#apply Failed type conversion: InQuad['object'] */ js.Any
    ): OutQuad = js.native
    def quad(
      subject: /* import warning: importer.ImportType#apply Failed type conversion: InQuad['subject'] */ js.Any,
      predicate: /* import warning: importer.ImportType#apply Failed type conversion: InQuad['predicate'] */ js.Any,
      `object`: /* import warning: importer.ImportType#apply Failed type conversion: InQuad['object'] */ js.Any,
      graph: /* import warning: importer.ImportType#apply Failed type conversion: InQuad['graph'] */ js.Any
    ): OutQuad = js.native
    
    /**
      * This method is optional.
      * @param value The variable name
      * @return A new instance of Variable.
      * @see Variable
      */
    var variable: js.UndefOr[js.Function1[/* value */ String, Variable]] = js.native
  }
  
  @js.native
  trait DefaultGraph
    extends StObject
       with _QuadGraph
       with _Term {
    
    /**
      * @param other The term to compare with.
      * @return True if and only if other has termType "DefaultGraph".
      */
    def equals(): Boolean = js.native
    def equals(other: Term): Boolean = js.native
    
    /**
      * Contains the constant "DefaultGraph".
      */
    var termType: typings.rdfjsTypes.rdfjsTypesStrings.DefaultGraph = js.native
    
    /**
      * Contains an empty string as constant value.
      */
    var value: _empty = js.native
  }
  
  @js.native
  trait Literal
    extends StObject
       with _QuadObject
       with _Term {
    
    /**
      * A NamedNode whose IRI represents the datatype of the literal.
      */
    var datatype: NamedNode[String] = js.native
    
    /**
      * @param other The term to compare with.
      * @return True if and only if other has termType "Literal"
      *                   and the same `value`, `language`, and `datatype`.
      */
    def equals(): Boolean = js.native
    def equals(other: Term): Boolean = js.native
    
    /**
      * the language as lowercase BCP47 string (examples: en, en-gb)
      * or an empty string if the literal has no language.
      * @link http://tools.ietf.org/html/bcp47
      */
    var language: String = js.native
    
    /**
      * Contains the constant "Literal".
      */
    var termType: typings.rdfjsTypes.rdfjsTypesStrings.Literal = js.native
    
    /**
      * The text value, unescaped, without language or type (example: Brad Pitt).
      */
    var value: String = js.native
  }
  
  @js.native
  trait NamedNode[Iri /* <: String */] extends StObject {
    
    /**
      * @param other The term to compare with.
      * @return True if and only if other has termType "NamedNode" and the same `value`.
      */
    def equals(): Boolean = js.native
    def equals(other: Term): Boolean = js.native
    
    /**
      * Contains the constant "NamedNode".
      */
    var termType: typings.rdfjsTypes.rdfjsTypesStrings.NamedNode = js.native
    
    /**
      * The IRI of the named node (example: `http://example.org/resource`)
      */
    var value: Iri = js.native
  }
  
  @js.native
  trait Quad
    extends StObject
       with BaseQuad
       with _QuadObject
       with _QuadSubject {
    
    /**
      * The named graph.
      * @see Quad_Graph
      */
    @JSName("graph")
    var graph_Quad: QuadGraph = js.native
    
    /**
      * The object.
      * @see Quad_Object
      */
    @JSName("object")
    var object_Quad: QuadObject = js.native
    
    /**
      * The predicate.
      * @see Quad_Predicate
      */
    @JSName("predicate")
    var predicate_Quad: QuadPredicate = js.native
    
    /**
      * The subject.
      * @see Quad_Subject
      */
    @JSName("subject")
    var subject_Quad: QuadSubject = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rdfjsTypes.dataModelMod.DefaultGraph
    - typings.rdfjsTypes.dataModelMod.NamedNode[java.lang.String]
    - typings.rdfjsTypes.dataModelMod.BlankNode
    - typings.rdfjsTypes.dataModelMod.Variable
  */
  type QuadGraph = _QuadGraph | NamedNode[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.rdfjsTypes.dataModelMod.NamedNode[java.lang.String]
    - typings.rdfjsTypes.dataModelMod.Literal
    - typings.rdfjsTypes.dataModelMod.BlankNode
    - typings.rdfjsTypes.dataModelMod.Quad
    - typings.rdfjsTypes.dataModelMod.Variable
  */
  type QuadObject = _QuadObject | NamedNode[String]
  
  type QuadPredicate = NamedNode[String] | Variable
  
  /* Rewritten from type alias, can be one of: 
    - typings.rdfjsTypes.dataModelMod.NamedNode[java.lang.String]
    - typings.rdfjsTypes.dataModelMod.BlankNode
    - typings.rdfjsTypes.dataModelMod.Quad
    - typings.rdfjsTypes.dataModelMod.Variable
  */
  type QuadSubject = _QuadSubject | NamedNode[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.rdfjsTypes.dataModelMod.NamedNode[java.lang.String]
    - typings.rdfjsTypes.dataModelMod.BlankNode
    - typings.rdfjsTypes.dataModelMod.Literal
    - typings.rdfjsTypes.dataModelMod.Variable
    - typings.rdfjsTypes.dataModelMod.DefaultGraph
    - typings.rdfjsTypes.dataModelMod.BaseQuad
  */
  type Term = _Term | NamedNode[String]
  
  @js.native
  trait Variable
    extends StObject
       with _QuadGraph
       with _QuadObject
       with _QuadSubject
       with _Term {
    
    /**
      * @param other The term to compare with.
      * @return True if and only if other has termType "Variable" and the same `value`.
      */
    def equals(): Boolean = js.native
    def equals(other: Term): Boolean = js.native
    
    /**
      * Contains the constant "Variable".
      */
    var termType: typings.rdfjsTypes.rdfjsTypesStrings.Variable = js.native
    
    /**
      * The name of the variable *without* leading ? (example: a).
      */
    var value: String = js.native
  }
  
  trait _QuadGraph extends StObject
  
  trait _QuadObject extends StObject
  
  trait _QuadSubject extends StObject
  
  trait _Term extends StObject
}
