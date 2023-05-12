package typings.rdfjsScore

import typings.rdfjsScore.anon.Dataset
import typings.rdfjsScore.anon.TermCallback
import typings.rdfjsScore.countMod.CountCriteria
import typings.rdfjsScore.existsMod.ExistsCriteria
import typings.rdfjsScore.pageRankMod.PageRank
import typings.rdfjsScore.scaleMod.ScaleCriteria
import typings.rdfjsScore.sortObjectsMod.SortArgs
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.dataModelMod.QuadGraph
import typings.rdfjsTypes.dataModelMod.Term
import typings.rdfjsTypes.datasetMod.DatasetCore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rdfjs/score", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined @rdfjs/score.@rdfjs/score.ScoreFn<[std.Array<@rdfjs/score.@rdfjs/score.ScoreCb>]> & {  prioritized :@rdfjs/score.@rdfjs/score.ScoreFn<[std.Array<@rdfjs/score.@rdfjs/score.ScoreCb>]>} */
  object combine {
    
    inline def apply(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: js.Array[js.Array[ScoreCb]]
    ): js.Function1[/* ptrs */ Pointers, js.Array[Score]] = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ptrs */ Pointers, js.Array[Score]]]
    
    @JSImport("@rdfjs/score", "combine")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@rdfjs/score", "combine.prioritized")
    @js.native
    def prioritized: ScoreFn[js.Array[js.Array[ScoreCb]]] = js.native
    inline def prioritized(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: js.Array[js.Array[ScoreCb]]
    ): js.Function1[/* ptrs */ Pointers, js.Array[Score]] = ^.asInstanceOf[js.Dynamic].applyDynamic("prioritized")(args.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ptrs */ Pointers, js.Array[Score]]]
    inline def prioritized_=(x: ScoreFn[js.Array[js.Array[ScoreCb]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prioritized")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@rdfjs/score", "concat")
  @js.native
  val concat: ScoreFn[js.Array[js.Array[ScoreCb]]] = js.native
  
  @JSImport("@rdfjs/score", "count")
  @js.native
  val count: ScoreFn[js.Array[Any | CountCriteria]] = js.native
  
  inline def distinct(score: js.Array[Score]): js.Array[Score] = ^.asInstanceOf[js.Dynamic].applyDynamic("distinct")(score.asInstanceOf[js.Any]).asInstanceOf[js.Array[Score]]
  
  @JSImport("@rdfjs/score", "exists")
  @js.native
  val exists: ScoreFn[js.Array[ExistsCriteria]] = js.native
  
  @JSImport("@rdfjs/score", "fallback")
  @js.native
  val fallback: ScoreFn[js.Array[js.Array[ScoreCb]]] = js.native
  
  @JSImport("@rdfjs/score", "fixed")
  @js.native
  val fixed: ScoreFn[js.Array[Term]] = js.native
  
  @JSImport("@rdfjs/score", "language")
  @js.native
  val language: ScoreFn[js.Array[js.Array[String]]] = js.native
  
  @JSImport("@rdfjs/score", "pageRank")
  @js.native
  val pageRank: ScoreFn[js.Array[Any | PageRank]] = js.native
  
  @JSImport("@rdfjs/score", "pathDepth")
  @js.native
  val pathDepth: ScoreFn[js.Array[Any]] = js.native
  
  @JSImport("@rdfjs/score", "prioritized")
  @js.native
  val prioritized: ScoreFn[js.Array[js.Array[ScoreCb]]] = js.native
  
  @JSImport("@rdfjs/score", "product")
  @js.native
  val product: ScoreFn[js.Array[js.Array[ScoreCb]]] = js.native
  
  @JSImport("@rdfjs/score", "scale")
  @js.native
  val scale: ScoreFn[js.Array[ScaleCriteria]] = js.native
  
  inline def sort(scores: js.Array[Score]): js.Array[Score] = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(scores.asInstanceOf[js.Any]).asInstanceOf[js.Array[Score]]
  
  inline def sortObjects(arg: SortArgs[typings.rdfjsScore.anon.Term]): js.Array[typings.rdfjsScore.anon.Term] = ^.asInstanceOf[js.Dynamic].applyDynamic("sortObjects")(arg.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.rdfjsScore.anon.Term]]
  inline def sortObjects[T](arg: SortArgs[T] & TermCallback[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("sortObjects")(arg.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  @JSImport("@rdfjs/score", "sum")
  @js.native
  val sum: ScoreFn[js.Array[js.Array[ScoreCb]]] = js.native
  
  @JSImport("@rdfjs/score", "type")
  @js.native
  val `type`: ScoreFn[js.Array[Term]] = js.native
  
  trait Pointers extends StObject {
    
    var dataset: DatasetCore[Quad, Quad]
    
    var graph: js.UndefOr[QuadGraph] = js.undefined
    
    var terms: js.UndefOr[js.Array[Term]] = js.undefined
  }
  object Pointers {
    
    inline def apply(dataset: DatasetCore[Quad, Quad]): Pointers = {
      val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pointers]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Pointers] (val x: Self) extends AnyVal {
      
      inline def setDataset(value: DatasetCore[Quad, Quad]): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
      
      inline def setGraph(value: QuadGraph): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
      
      inline def setGraphUndefined: Self = StObject.set(x, "graph", js.undefined)
      
      inline def setTerms(value: js.Array[Term]): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
      
      inline def setTermsUndefined: Self = StObject.set(x, "terms", js.undefined)
      
      inline def setTermsVarargs(value: Term*): Self = StObject.set(x, "terms", js.Array(value*))
    }
  }
  
  trait Score
    extends StObject
       with Pointers {
    
    var score: Double
  }
  object Score {
    
    inline def apply(dataset: DatasetCore[Quad, Quad], score: Double): Score = {
      val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
      __obj.asInstanceOf[Score]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Score] (val x: Self) extends AnyVal {
      
      inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    }
  }
  
  type ScoreCb = js.Function1[/* arg */ Dataset, js.Array[Score]]
  
  type ScoreFn[T /* <: js.Array[Any] */] = js.Function1[/* args */ T, js.Function1[/* ptrs */ Pointers, js.Array[Score]]]
}
