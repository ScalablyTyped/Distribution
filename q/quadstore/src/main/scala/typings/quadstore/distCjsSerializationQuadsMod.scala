package typings.quadstore

import typings.quadstore.distCjsTypesMod.Prefixes
import typings.quadstore.distCjsTypesMod.SerializedTerm
import typings.quadstore.distCjsTypesMod.TermName
import typings.rdfjsTypes.dataModelMod.DataFactory
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.dataModelMod.Term
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsSerializationQuadsMod {
  
  @JSImport("quadstore/dist/cjs/serialization/quads", "quadReader")
  @js.native
  val quadReader: QuadReader_ = js.native
  
  @JSImport("quadstore/dist/cjs/serialization/quads", "twoStepsQuadWriter")
  @js.native
  val twoStepsQuadWriter: TwoStepsQuadWriter_ = js.native
  
  /* Inlined {  keyOffset :number,   lengthsOffset :number, read (key : string, keyOffset : number, termNames : std.Array<quadstore.quadstore/dist/cjs/types.TermName>, factory : rdf-js.rdf-js.DataFactory<@rdfjs/types.@rdfjs/types/data-model.Quad, @rdfjs/types.@rdfjs/types/data-model.Quad>, prefixes : quadstore.quadstore/dist/cjs/types.Prefixes): quadstore.quadstore/dist/cjs/types.Quad} & std.Record<quadstore.quadstore/dist/cjs/types.TermName, rdf-js.rdf-js.Term | null> */
  trait QuadReader_ extends StObject {
    
    var graph: Term | Null
    
    var keyOffset: Double
    
    var lengthsOffset: Double
    
    var `object`: Term | Null
    
    var predicate: Term | Null
    
    def read(
      key: String,
      keyOffset: Double,
      termNames: js.Array[TermName],
      factory: DataFactory[Quad, Quad],
      prefixes: Prefixes
    ): Quad
    
    var subject: Term | Null
  }
  object QuadReader_ {
    
    inline def apply(
      keyOffset: Double,
      lengthsOffset: Double,
      read: (String, Double, js.Array[TermName], DataFactory[Quad, Quad], Prefixes) => Quad
    ): QuadReader_ = {
      val __obj = js.Dynamic.literal(keyOffset = keyOffset.asInstanceOf[js.Any], lengthsOffset = lengthsOffset.asInstanceOf[js.Any], read = js.Any.fromFunction5(read), graph = null, predicate = null, subject = null)
      __obj.updateDynamic("object")(null)
      __obj.asInstanceOf[QuadReader_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QuadReader_] (val x: Self) extends AnyVal {
      
      inline def setGraph(value: Term): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
      
      inline def setGraphNull: Self = StObject.set(x, "graph", null)
      
      inline def setKeyOffset(value: Double): Self = StObject.set(x, "keyOffset", value.asInstanceOf[js.Any])
      
      inline def setLengthsOffset(value: Double): Self = StObject.set(x, "lengthsOffset", value.asInstanceOf[js.Any])
      
      inline def setObject(value: Term): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectNull: Self = StObject.set(x, "object", null)
      
      inline def setPredicate(value: Term): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
      
      inline def setPredicateNull: Self = StObject.set(x, "predicate", null)
      
      inline def setRead(value: (String, Double, js.Array[TermName], DataFactory[Quad, Quad], Prefixes) => Quad): Self = StObject.set(x, "read", js.Any.fromFunction5(value))
      
      inline def setSubject(value: Term): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectNull: Self = StObject.set(x, "subject", null)
    }
  }
  
  /* Inlined std.Record<quadstore.quadstore/dist/cjs/types.TermName, quadstore.quadstore/dist/cjs/types.SerializedTerm> & {ingest (quad : quadstore.quadstore/dist/cjs/types.Quad, prefixes : quadstore.quadstore/dist/cjs/types.Prefixes): quadstore.quadstore/dist/cjs/serialization/quads.TwoStepsQuadWriter, write (prefix : string, termNames : std.Array<quadstore.quadstore/dist/cjs/types.TermName>): string} */
  trait TwoStepsQuadWriter_ extends StObject {
    
    var graph: SerializedTerm
    
    def ingest(quad: Quad, prefixes: Prefixes): TwoStepsQuadWriter_
    
    var `object`: SerializedTerm
    
    var predicate: SerializedTerm
    
    var subject: SerializedTerm
    
    def write(prefix: String, termNames: js.Array[TermName]): String
  }
  object TwoStepsQuadWriter_ {
    
    inline def apply(
      graph: SerializedTerm,
      ingest: (Quad, Prefixes) => TwoStepsQuadWriter_,
      `object`: SerializedTerm,
      predicate: SerializedTerm,
      subject: SerializedTerm,
      write: (String, js.Array[TermName]) => String
    ): TwoStepsQuadWriter_ = {
      val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], ingest = js.Any.fromFunction2(ingest), predicate = predicate.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], write = js.Any.fromFunction2(write))
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TwoStepsQuadWriter_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TwoStepsQuadWriter_] (val x: Self) extends AnyVal {
      
      inline def setGraph(value: SerializedTerm): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
      
      inline def setIngest(value: (Quad, Prefixes) => TwoStepsQuadWriter_): Self = StObject.set(x, "ingest", js.Any.fromFunction2(value))
      
      inline def setObject(value: SerializedTerm): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setPredicate(value: SerializedTerm): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
      
      inline def setSubject(value: SerializedTerm): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setWrite(value: (String, js.Array[TermName]) => String): Self = StObject.set(x, "write", js.Any.fromFunction2(value))
    }
  }
}
