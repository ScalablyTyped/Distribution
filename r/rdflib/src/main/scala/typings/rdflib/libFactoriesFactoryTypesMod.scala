package typings.rdflib

import typings.rdflib.libLiteralMod.default
import typings.rdflib.libTfTypesMod.NamedNode
import typings.rdflib.libTfTypesMod.Quad
import typings.rdflib.libTfTypesMod.QuadGraph
import typings.rdflib.libTfTypesMod.QuadObject
import typings.rdflib.libTfTypesMod.QuadPredicate
import typings.rdflib.libTfTypesMod.QuadSubject
import typings.rdflib.libTfTypesMod.RdfJsDataFactory
import typings.rdflib.libTfTypesMod.Term
import typings.rdflib.libTypesMod.GraphType
import typings.rdflib.libTypesMod.ObjectType
import typings.rdflib.libTypesMod.PredicateType
import typings.rdflib.libTypesMod.SubjectType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFactoriesFactoryTypesMod {
  
  @js.native
  sealed trait Feature extends StObject
  @JSImport("rdflib/lib/factories/factory-types", "Feature")
  @js.native
  object Feature extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Feature & String] = js.native
    
    /** Whether the factory supports termType:Collection terms */
    @js.native
    sealed trait collections
      extends StObject
         with Feature
    /* "COLLECTIONS" */ val collections: typings.rdflib.libFactoriesFactoryTypesMod.Feature.collections & String = js.native
    
    /** Whether the factory supports termType:DefaultGraph terms */
    @js.native
    sealed trait defaultGraphType
      extends StObject
         with Feature
    /* "DEFAULT_GRAPH_TYPE" */ val defaultGraphType: typings.rdflib.libFactoriesFactoryTypesMod.Feature.defaultGraphType & String = js.native
    
    /** Whether the factory supports equals on produced instances */
    @js.native
    sealed trait equalsMethod
      extends StObject
         with Feature
    /* "EQUALS_METHOD" */ val equalsMethod: typings.rdflib.libFactoriesFactoryTypesMod.Feature.equalsMethod & String = js.native
    
    /** Whether the factory can create a unique idempotent identifier for the given term. */
    @js.native
    sealed trait id
      extends StObject
         with Feature
    /* "ID" */ val id: typings.rdflib.libFactoriesFactoryTypesMod.Feature.id & String = js.native
    
    /**
      * Whether the factory will return the same instance for subsequent calls.
      * This implies `===`, which means methods like `indexOf` can be used.
      */
    @js.native
    sealed trait identity
      extends StObject
         with Feature
    /* "IDENTITY" */ val identity: typings.rdflib.libFactoriesFactoryTypesMod.Feature.identity & String = js.native
    
    /** Whether the factory supports mapping ids back to instances (should adhere to the identity setting) */
    @js.native
    sealed trait reversibleId
      extends StObject
         with Feature
    /* "REVERSIBLE_ID" */ val reversibleId: typings.rdflib.libFactoriesFactoryTypesMod.Feature.reversibleId & String = js.native
    
    /** Whether the factory supports termType:Variable terms */
    @js.native
    sealed trait variableType
      extends StObject
         with Feature
    /* "VARIABLE_TYPE" */ val variableType: typings.rdflib.libFactoriesFactoryTypesMod.Feature.variableType & String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rdflib.libTfTypesMod.Term
    - typings.rdflib.libTfTypesMod.NamedNode
    - typings.rdflib.libTfTypesMod.BlankNode
    - typings.rdflib.libTfTypesMod.Literal
    - typings.rdflib.libTfTypesMod.Quad[
  typings.rdflib.libTfTypesMod.QuadSubject, 
  typings.rdflib.libTfTypesMod.QuadPredicate, 
  typings.rdflib.libTfTypesMod.QuadObject, 
  typings.rdflib.libTfTypesMod.QuadGraph]
    - scala.Unit
    - scala.Null
  */
  type Comparable = js.UndefOr[_Comparable | (Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph]) | Null]
  
  @js.native
  trait DataFactory[FactoryTypes, IndexType]
    extends StObject
       with RdfJsDataFactory {
    
    /**
      * BlankNode index
      * @private
      */
    var bnIndex: js.UndefOr[Double] = js.native
    
    def equals(a: Comparable, b: Comparable): Boolean = js.native
    
    def id(obj: FactoryTypes): IndexType = js.native
    /**
      * Generates a unique session-idempotent identifier for the given object.
      *
      * @example NQ serialization (reversible from value)
      * @example MD5 hash of termType + value (irreversible from value, map needed)
      *
      * @return {Indexable} A unique value which must also be a valid JS object key type.
      */
    def id(obj: Term): IndexType = js.native
    
    def isQuad(obj: Any): /* is rdflib.rdflib/lib/statement.default<rdflib.rdflib/lib/types.SubjectType, rdflib.rdflib/lib/types.PredicateType, rdflib.rdflib/lib/types.ObjectType, rdflib.rdflib/lib/types.GraphType> */ Boolean = js.native
    
    def literal(value: String): default = js.native
    
    def quadToNQ(term: typings.rdflib.libStatementMod.default[SubjectType, PredicateType, ObjectType, GraphType]): String = js.native
    def quadToNQ(term: Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph]): String = js.native
    
    def termToNQ(term: Term): String = js.native
    
    def toNQ(term: FactoryTypes): String = js.native
    def toNQ(term: Term): String = js.native
    
    @JSName("variable")
    def variable_MDataFactory(value: String): typings.rdflib.libVariableMod.default = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rdflib.libNamedNodeMod.default
    - typings.rdflib.libBlankNodeMod.default
    - typings.rdflib.libLiteralMod.default
    - typings.rdflib.libVariableMod.default
    - typings.rdflib.libStatementMod.default[
  typings.rdflib.libTypesMod.SubjectType, 
  typings.rdflib.libTypesMod.PredicateType, 
  typings.rdflib.libTypesMod.ObjectType, 
  typings.rdflib.libTypesMod.GraphType]
  */
  type DefaultFactoryTypes = _DefaultFactoryTypes | (typings.rdflib.libStatementMod.default[SubjectType, PredicateType, ObjectType, GraphType])
  
  type Indexable = Double | String
  
  type Namespace = js.Function1[/* term */ String, NamedNode]
  
  type SupportTable = Record[Feature, Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.rdflib.libTfTypesMod.NamedNode
    - typings.rdflib.libTfTypesMod.BlankNode
    - typings.rdflib.libTfTypesMod.Literal
    - typings.rdflib.libTfTypesMod.Quad[
  typings.rdflib.libTfTypesMod.QuadSubject, 
  typings.rdflib.libTfTypesMod.QuadPredicate, 
  typings.rdflib.libTfTypesMod.QuadObject, 
  typings.rdflib.libTfTypesMod.QuadGraph]
    - typings.rdflib.libTfTypesMod.Variable
    - typings.rdflib.libTfTypesMod.Term
  */
  type TFIDFactoryTypes = _TFIDFactoryTypes | (Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph])
  
  trait _Comparable extends StObject
  object _Comparable {
    
    inline def BlankNode(equals_ : Term => Boolean, value: String): typings.rdflib.libTfTypesMod.BlankNode = {
      val __obj = js.Dynamic.literal(termType = "BlankNode", value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[typings.rdflib.libTfTypesMod.BlankNode]
    }
    
    inline def Literal(datatype: NamedNode, equals_ : Term => Boolean, language: String, value: String): typings.rdflib.libTfTypesMod.Literal = {
      val __obj = js.Dynamic.literal(datatype = datatype.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], termType = "Literal", value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[typings.rdflib.libTfTypesMod.Literal]
    }
    
    inline def NamedNode(equals_ : Term => Boolean, value: String): typings.rdflib.libTfTypesMod.NamedNode = {
      val __obj = js.Dynamic.literal(termType = "NamedNode", value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[typings.rdflib.libTfTypesMod.NamedNode]
    }
    
    inline def Term(equals_ : typings.rdflib.libTfTypesMod.Term => Boolean, termType: String, value: String): typings.rdflib.libTfTypesMod.Term = {
      val __obj = js.Dynamic.literal(termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[typings.rdflib.libTfTypesMod.Term]
    }
  }
  
  trait _DefaultFactoryTypes extends StObject
  
  trait _TFIDFactoryTypes extends StObject
  object _TFIDFactoryTypes {
    
    inline def BlankNode(equals_ : Term => Boolean, value: String): typings.rdflib.libTfTypesMod.BlankNode = {
      val __obj = js.Dynamic.literal(termType = "BlankNode", value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[typings.rdflib.libTfTypesMod.BlankNode]
    }
    
    inline def Literal(datatype: NamedNode, equals_ : Term => Boolean, language: String, value: String): typings.rdflib.libTfTypesMod.Literal = {
      val __obj = js.Dynamic.literal(datatype = datatype.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], termType = "Literal", value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[typings.rdflib.libTfTypesMod.Literal]
    }
    
    inline def NamedNode(equals_ : Term => Boolean, value: String): typings.rdflib.libTfTypesMod.NamedNode = {
      val __obj = js.Dynamic.literal(termType = "NamedNode", value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[typings.rdflib.libTfTypesMod.NamedNode]
    }
    
    inline def Term(equals_ : typings.rdflib.libTfTypesMod.Term => Boolean, termType: String, value: String): typings.rdflib.libTfTypesMod.Term = {
      val __obj = js.Dynamic.literal(termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[typings.rdflib.libTfTypesMod.Term]
    }
    
    inline def Variable(equals_ : Term => Boolean, value: String): typings.rdflib.libTfTypesMod.Variable = {
      val __obj = js.Dynamic.literal(termType = "Variable", value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[typings.rdflib.libTfTypesMod.Variable]
    }
  }
}
