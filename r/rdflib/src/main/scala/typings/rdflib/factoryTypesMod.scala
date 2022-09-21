package typings.rdflib

import typings.rdflib.literalMod.default
import typings.rdflib.tfTypesMod.NamedNode
import typings.rdflib.tfTypesMod.Quad
import typings.rdflib.tfTypesMod.QuadGraph
import typings.rdflib.tfTypesMod.QuadObject
import typings.rdflib.tfTypesMod.QuadPredicate
import typings.rdflib.tfTypesMod.QuadSubject
import typings.rdflib.tfTypesMod.RdfJsDataFactory
import typings.rdflib.tfTypesMod.Term
import typings.rdflib.typesMod.GraphType
import typings.rdflib.typesMod.ObjectType
import typings.rdflib.typesMod.PredicateType
import typings.rdflib.typesMod.SubjectType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoryTypesMod {
  
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
    /* "COLLECTIONS" */ val collections: typings.rdflib.factoryTypesMod.Feature.collections & String = js.native
    
    /** Whether the factory supports termType:DefaultGraph terms */
    @js.native
    sealed trait defaultGraphType
      extends StObject
         with Feature
    /* "DEFAULT_GRAPH_TYPE" */ val defaultGraphType: typings.rdflib.factoryTypesMod.Feature.defaultGraphType & String = js.native
    
    /** Whether the factory supports equals on produced instances */
    @js.native
    sealed trait equalsMethod
      extends StObject
         with Feature
    /* "EQUALS_METHOD" */ val equalsMethod: typings.rdflib.factoryTypesMod.Feature.equalsMethod & String = js.native
    
    /** Whether the factory can create a unique idempotent identifier for the given term. */
    @js.native
    sealed trait id
      extends StObject
         with Feature
    /* "ID" */ val id: typings.rdflib.factoryTypesMod.Feature.id & String = js.native
    
    /**
      * Whether the factory will return the same instance for subsequent calls.
      * This implies `===`, which means methods like `indexOf` can be used.
      */
    @js.native
    sealed trait identity
      extends StObject
         with Feature
    /* "IDENTITY" */ val identity: typings.rdflib.factoryTypesMod.Feature.identity & String = js.native
    
    /** Whether the factory supports mapping ids back to instances (should adhere to the identity setting) */
    @js.native
    sealed trait reversibleId
      extends StObject
         with Feature
    /* "REVERSIBLE_ID" */ val reversibleId: typings.rdflib.factoryTypesMod.Feature.reversibleId & String = js.native
    
    /** Whether the factory supports termType:Variable terms */
    @js.native
    sealed trait variableType
      extends StObject
         with Feature
    /* "VARIABLE_TYPE" */ val variableType: typings.rdflib.factoryTypesMod.Feature.variableType & String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rdflib.tfTypesMod.Term
    - typings.rdflib.tfTypesMod.NamedNode
    - typings.rdflib.tfTypesMod.BlankNode
    - typings.rdflib.tfTypesMod.Literal
    - typings.rdflib.tfTypesMod.Quad[
  typings.rdflib.tfTypesMod.QuadSubject, 
  typings.rdflib.tfTypesMod.QuadPredicate, 
  typings.rdflib.tfTypesMod.QuadObject, 
  typings.rdflib.tfTypesMod.QuadGraph]
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
    
    def quadToNQ(term: typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]): String = js.native
    def quadToNQ(term: Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph]): String = js.native
    
    def termToNQ(term: Term): String = js.native
    
    def toNQ(term: FactoryTypes): String = js.native
    def toNQ(term: Term): String = js.native
    
    @JSName("variable")
    def variable_MDataFactory(value: String): typings.rdflib.variableMod.default = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rdflib.namedNodeMod.default
    - typings.rdflib.blankNodeMod.default
    - typings.rdflib.literalMod.default
    - typings.rdflib.variableMod.default
    - typings.rdflib.statementMod.default[
  typings.rdflib.typesMod.SubjectType, 
  typings.rdflib.typesMod.PredicateType, 
  typings.rdflib.typesMod.ObjectType, 
  typings.rdflib.typesMod.GraphType]
  */
  type DefaultFactoryTypes = _DefaultFactoryTypes | (typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType])
  
  type Indexable = Double | String
  
  type Namespace = js.Function1[/* term */ String, NamedNode]
  
  type SupportTable = Record[Feature, Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.rdflib.tfTypesMod.NamedNode
    - typings.rdflib.tfTypesMod.BlankNode
    - typings.rdflib.tfTypesMod.Literal
    - typings.rdflib.tfTypesMod.Quad[
  typings.rdflib.tfTypesMod.QuadSubject, 
  typings.rdflib.tfTypesMod.QuadPredicate, 
  typings.rdflib.tfTypesMod.QuadObject, 
  typings.rdflib.tfTypesMod.QuadGraph]
    - typings.rdflib.tfTypesMod.Variable
    - typings.rdflib.tfTypesMod.Term
  */
  type TFIDFactoryTypes = _TFIDFactoryTypes | (Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph])
  
  trait _Comparable extends StObject
  object _Comparable {
    
    inline def BlankNode(equals_ : Term => Boolean, value: String): typings.rdflib.tfTypesMod.BlankNode = {
      val __obj = js.Dynamic.literal(termType = "BlankNode", value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[typings.rdflib.tfTypesMod.BlankNode]
    }
    
    inline def Literal(datatype: NamedNode, equals_ : Term => Boolean, language: String, value: String): typings.rdflib.tfTypesMod.Literal = {
      val __obj = js.Dynamic.literal(datatype = datatype.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], termType = "Literal", value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[typings.rdflib.tfTypesMod.Literal]
    }
    
    inline def NamedNode(equals_ : Term => Boolean, value: String): typings.rdflib.tfTypesMod.NamedNode = {
      val __obj = js.Dynamic.literal(termType = "NamedNode", value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[typings.rdflib.tfTypesMod.NamedNode]
    }
    
    inline def Term(equals_ : typings.rdflib.tfTypesMod.Term => Boolean, termType: String, value: String): typings.rdflib.tfTypesMod.Term = {
      val __obj = js.Dynamic.literal(termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[typings.rdflib.tfTypesMod.Term]
    }
  }
  
  trait _DefaultFactoryTypes extends StObject
  
  trait _TFIDFactoryTypes extends StObject
  object _TFIDFactoryTypes {
    
    inline def BlankNode(equals_ : Term => Boolean, value: String): typings.rdflib.tfTypesMod.BlankNode = {
      val __obj = js.Dynamic.literal(termType = "BlankNode", value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[typings.rdflib.tfTypesMod.BlankNode]
    }
    
    inline def Literal(datatype: NamedNode, equals_ : Term => Boolean, language: String, value: String): typings.rdflib.tfTypesMod.Literal = {
      val __obj = js.Dynamic.literal(datatype = datatype.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], termType = "Literal", value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[typings.rdflib.tfTypesMod.Literal]
    }
    
    inline def NamedNode(equals_ : Term => Boolean, value: String): typings.rdflib.tfTypesMod.NamedNode = {
      val __obj = js.Dynamic.literal(termType = "NamedNode", value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[typings.rdflib.tfTypesMod.NamedNode]
    }
    
    inline def Term(equals_ : typings.rdflib.tfTypesMod.Term => Boolean, termType: String, value: String): typings.rdflib.tfTypesMod.Term = {
      val __obj = js.Dynamic.literal(termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[typings.rdflib.tfTypesMod.Term]
    }
    
    inline def Variable(equals_ : Term => Boolean, value: String): typings.rdflib.tfTypesMod.Variable = {
      val __obj = js.Dynamic.literal(termType = "Variable", value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[typings.rdflib.tfTypesMod.Variable]
    }
  }
}
