package typings.rdfExt

import typings.rdfExt.libPropTypeMod.PropType
import typings.rdfExt.libQuadMod.QuadExt
import typings.rdfExt.rdfExtStrings.`object`
import typings.rdfExt.rdfExtStrings.graph
import typings.rdfExt.rdfExtStrings.language
import typings.rdfExt.rdfExtStrings.predicate
import typings.rdfExt.rdfExtStrings.subject
import typings.rdfExt.rdfExtStrings.termType
import typings.rdfExt.rdfExtStrings.toJSON
import typings.rdfExt.rdfExtStrings.value
import typings.rdfjsTypes.dataModelMod.BlankNode
import typings.rdfjsTypes.dataModelMod.DefaultGraph
import typings.rdfjsTypes.dataModelMod.Literal
import typings.rdfjsTypes.dataModelMod.NamedNode
import typings.rdfjsTypes.dataModelMod.Variable
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Datatype extends StObject {
    
    var datatype: TermTypeValue
    
    var language: PropType[Literal, typings.rdfExt.rdfExtStrings.language]
    
    var termType: PropType[Literal, typings.rdfExt.rdfExtStrings.termType]
    
    var value: PropType[Literal, typings.rdfExt.rdfExtStrings.value]
  }
  object Datatype {
    
    inline def apply(
      datatype: TermTypeValue,
      language: PropType[Literal, language],
      termType: PropType[Literal, termType],
      value: PropType[Literal, value]
    ): Datatype = {
      val __obj = js.Dynamic.literal(datatype = datatype.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Datatype]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Datatype] (val x: Self) extends AnyVal {
      
      inline def setDatatype(value: TermTypeValue): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      inline def setLanguage(value: PropType[Literal, language]): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setTermType(value: PropType[Literal, termType]): Self = StObject.set(x, "termType", value.asInstanceOf[js.Any])
      
      inline def setValue(value: PropType[Literal, value]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Graph extends StObject {
    
    var graph: ReturnType[PropType[PropType[QuadExt, typings.rdfExt.rdfExtStrings.graph], toJSON]]
    
    var `object`: ReturnType[PropType[PropType[QuadExt, typings.rdfExt.rdfExtStrings.`object`], toJSON]]
    
    var predicate: ReturnType[PropType[PropType[QuadExt, typings.rdfExt.rdfExtStrings.predicate], toJSON]]
    
    var subject: ReturnType[PropType[PropType[QuadExt, typings.rdfExt.rdfExtStrings.subject], toJSON]]
  }
  object Graph {
    
    inline def apply(
      graph: ReturnType[PropType[PropType[QuadExt, graph], toJSON]],
      `object`: ReturnType[PropType[PropType[QuadExt, `object`], toJSON]],
      predicate: ReturnType[PropType[PropType[QuadExt, predicate], toJSON]],
      subject: ReturnType[PropType[PropType[QuadExt, subject], toJSON]]
    ): Graph = {
      val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], predicate = predicate.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Graph]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Graph] (val x: Self) extends AnyVal {
      
      inline def setGraph(value: ReturnType[PropType[PropType[QuadExt, graph], toJSON]]): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
      
      inline def setObject(value: ReturnType[PropType[PropType[QuadExt, `object`], toJSON]]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setPredicate(value: ReturnType[PropType[PropType[QuadExt, predicate], toJSON]]): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
      
      inline def setSubject(value: ReturnType[PropType[PropType[QuadExt, subject], toJSON]]): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    }
  }
  
  trait TermType extends StObject {
    
    var termType: PropType[BlankNode, typings.rdfExt.rdfExtStrings.termType]
    
    var value: PropType[BlankNode, typings.rdfExt.rdfExtStrings.value]
  }
  object TermType {
    
    inline def apply(termType: PropType[BlankNode, termType], value: PropType[BlankNode, value]): TermType = {
      val __obj = js.Dynamic.literal(termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TermType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TermType] (val x: Self) extends AnyVal {
      
      inline def setTermType(value: PropType[BlankNode, termType]): Self = StObject.set(x, "termType", value.asInstanceOf[js.Any])
      
      inline def setValue(value: PropType[BlankNode, value]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait TermTypePropType extends StObject {
    
    var termType: PropType[Variable, typings.rdfExt.rdfExtStrings.termType]
    
    var value: PropType[Variable, typings.rdfExt.rdfExtStrings.value]
  }
  object TermTypePropType {
    
    inline def apply(termType: PropType[Variable, termType], value: PropType[Variable, value]): TermTypePropType = {
      val __obj = js.Dynamic.literal(termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TermTypePropType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TermTypePropType] (val x: Self) extends AnyVal {
      
      inline def setTermType(value: PropType[Variable, termType]): Self = StObject.set(x, "termType", value.asInstanceOf[js.Any])
      
      inline def setValue(value: PropType[Variable, value]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait TermTypeValue extends StObject {
    
    var termType: PropType[NamedNode[String], typings.rdfExt.rdfExtStrings.termType]
    
    var value: PropType[NamedNode[String], typings.rdfExt.rdfExtStrings.value]
  }
  object TermTypeValue {
    
    inline def apply(termType: PropType[NamedNode[String], termType], value: PropType[NamedNode[String], value]): TermTypeValue = {
      val __obj = js.Dynamic.literal(termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TermTypeValue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TermTypeValue] (val x: Self) extends AnyVal {
      
      inline def setTermType(value: PropType[NamedNode[String], termType]): Self = StObject.set(x, "termType", value.asInstanceOf[js.Any])
      
      inline def setValue(value: PropType[NamedNode[String], value]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value extends StObject {
    
    var termType: PropType[DefaultGraph, typings.rdfExt.rdfExtStrings.termType]
    
    var value: PropType[DefaultGraph, typings.rdfExt.rdfExtStrings.value]
  }
  object Value {
    
    inline def apply(termType: PropType[DefaultGraph, termType], value: PropType[DefaultGraph, value]): Value = {
      val __obj = js.Dynamic.literal(termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      inline def setTermType(value: PropType[DefaultGraph, termType]): Self = StObject.set(x, "termType", value.asInstanceOf[js.Any])
      
      inline def setValue(value: PropType[DefaultGraph, value]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
