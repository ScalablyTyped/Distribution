package typings.rdfjsScore

import typings.rdfjsScore.countMod.CountCriteria
import typings.rdfjsScore.existsMod.ExistsCriteria
import typings.rdfjsScore.mod.Pointers
import typings.rdfjsScore.mod.Score
import typings.rdfjsScore.mod.ScoreCb
import typings.rdfjsScore.mod.ScoreFn
import typings.rdfjsScore.pageRankMod.PageRank
import typings.rdfjsScore.scaleMod.ScaleCriteria
import typings.rdfjsScore.sortObjectsMod.SortArgs
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.dataModelMod.QuadGraph
import typings.rdfjsTypes.datasetMod.DatasetCore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dataset extends StObject {
    
    var dataset: DatasetCore[Quad, Quad]
    
    var graph: QuadGraph
    
    var terms: js.UndefOr[js.Array[typings.rdfjsTypes.dataModelMod.Term]] = js.undefined
  }
  object Dataset {
    
    inline def apply(dataset: DatasetCore[Quad, Quad], graph: QuadGraph): Dataset = {
      val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any], graph = graph.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dataset]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dataset] (val x: Self) extends AnyVal {
      
      inline def setDataset(value: DatasetCore[Quad, Quad]): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
      
      inline def setGraph(value: QuadGraph): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
      
      inline def setTerms(value: js.Array[typings.rdfjsTypes.dataModelMod.Term]): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
      
      inline def setTermsUndefined: Self = StObject.set(x, "terms", js.undefined)
      
      inline def setTermsVarargs(value: typings.rdfjsTypes.dataModelMod.Term*): Self = StObject.set(x, "terms", js.Array(value*))
    }
  }
  
  /* Inlined @rdfjs/score.@rdfjs/score.ScoreFn<[std.Array<@rdfjs/score.@rdfjs/score.ScoreCb>]> & {  prioritized :@rdfjs/score.@rdfjs/score.ScoreFn<[std.Array<@rdfjs/score.@rdfjs/score.ScoreCb>]>} */
  @js.native
  trait ScoreFnArrayScoreCbpriori extends StObject {
    
    def apply(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: js.Array[js.Array[ScoreCb]]
    ): js.Function1[/* ptrs */ Pointers, js.Array[Score]] = js.native
    
    def prioritized(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: js.Array[js.Array[ScoreCb]]
    ): js.Function1[/* ptrs */ Pointers, js.Array[Score]] = js.native
    @JSName("prioritized")
    var prioritized_Original: ScoreFn[js.Array[js.Array[ScoreCb]]] = js.native
  }
  
  trait Term extends StObject {
    
    var term: typings.rdfjsTypes.dataModelMod.Term
  }
  object Term {
    
    inline def apply(term: typings.rdfjsTypes.dataModelMod.Term): Term = {
      val __obj = js.Dynamic.literal(term = term.asInstanceOf[js.Any])
      __obj.asInstanceOf[Term]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Term] (val x: Self) extends AnyVal {
      
      inline def setTerm(value: typings.rdfjsTypes.dataModelMod.Term): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    }
  }
  
  trait TermCallback[T] extends StObject {
    
    def termCallback(obj: T): typings.rdfjsTypes.dataModelMod.Term
  }
  object TermCallback {
    
    inline def apply[T](termCallback: T => typings.rdfjsTypes.dataModelMod.Term): TermCallback[T] = {
      val __obj = js.Dynamic.literal(termCallback = js.Any.fromFunction1(termCallback))
      __obj.asInstanceOf[TermCallback[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TermCallback[?], T] (val x: Self & TermCallback[T]) extends AnyVal {
      
      inline def setTermCallback(value: T => typings.rdfjsTypes.dataModelMod.Term): Self = StObject.set(x, "termCallback", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Typeofscore extends StObject {
    
    def combine(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: js.Array[js.Array[ScoreCb]]
    ): js.Function1[/* ptrs */ Pointers, js.Array[Score]] = js.native
    @JSName("combine")
    val combine_Original: ScoreFnArrayScoreCbpriori = js.native
    
    def concat(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: js.Array[js.Array[ScoreCb]]
    ): js.Function1[/* ptrs */ Pointers, js.Array[Score]] = js.native
    
    def count(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: js.Array[Any | CountCriteria]
    ): js.Function1[/* ptrs */ Pointers, js.Array[Score]] = js.native
    
    def distinct(score: js.Array[Score]): js.Array[Score] = js.native
    
    def exists(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: js.Array[ExistsCriteria]
    ): js.Function1[/* ptrs */ Pointers, js.Array[Score]] = js.native
    
    def fallback(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: js.Array[js.Array[ScoreCb]]
    ): js.Function1[/* ptrs */ Pointers, js.Array[Score]] = js.native
    
    def fixed(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: js.Array[typings.rdfjsTypes.dataModelMod.Term]
    ): js.Function1[/* ptrs */ Pointers, js.Array[Score]] = js.native
    
    def language(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: js.Array[js.Array[String]]
    ): js.Function1[/* ptrs */ Pointers, js.Array[Score]] = js.native
    
    def pageRank(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: js.Array[Any | PageRank]
    ): js.Function1[/* ptrs */ Pointers, js.Array[Score]] = js.native
    
    def pathDepth(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: js.Array[Any]
    ): js.Function1[/* ptrs */ Pointers, js.Array[Score]] = js.native
    
    def prioritized(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: js.Array[js.Array[ScoreCb]]
    ): js.Function1[/* ptrs */ Pointers, js.Array[Score]] = js.native
    
    def product(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: js.Array[js.Array[ScoreCb]]
    ): js.Function1[/* ptrs */ Pointers, js.Array[Score]] = js.native
    
    def scale(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: js.Array[ScaleCriteria]
    ): js.Function1[/* ptrs */ Pointers, js.Array[Score]] = js.native
    
    def sort(scores: js.Array[Score]): js.Array[Score] = js.native
    
    def sortObjects(arg: SortArgs[Term]): js.Array[Term] = js.native
    def sortObjects[T](arg: SortArgs[T] & TermCallback[T]): js.Array[T] = js.native
    
    def sum(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: js.Array[js.Array[ScoreCb]]
    ): js.Function1[/* ptrs */ Pointers, js.Array[Score]] = js.native
    
    def `type`(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: js.Array[typings.rdfjsTypes.dataModelMod.Term]
    ): js.Function1[/* ptrs */ Pointers, js.Array[Score]] = js.native
  }
}
