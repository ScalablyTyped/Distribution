package typings.rdfjsScore

import typings.rdfjsScore.anon.Dataset
import typings.rdfjsScore.anon.Term
import typings.rdfjsScore.anon.TermCallback
import typings.rdfjsScore.mod.Score
import typings.rdfjsScore.mod.ScoreCb
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.datasetMod.DatasetCore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortObjectsMod {
  
  @JSImport("@rdfjs/score/sortObjects", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(arg: SortArgs[Term]): js.Array[Term] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(arg.asInstanceOf[js.Any]).asInstanceOf[js.Array[Term]]
  inline def default[T](arg: SortArgs[T] & TermCallback[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(arg.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  trait SortArgs[T] extends StObject {
    
    var dataset: DatasetCore[Quad, Quad]
    
    var objects: js.Array[T]
    
    def score(arg: Dataset): js.Array[Score]
    @JSName("score")
    var score_Original: ScoreCb
  }
  object SortArgs {
    
    inline def apply[T](
      dataset: DatasetCore[Quad, Quad],
      objects: js.Array[T],
      score: /* arg */ Dataset => js.Array[Score]
    ): SortArgs[T] = {
      val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any], score = js.Any.fromFunction1(score))
      __obj.asInstanceOf[SortArgs[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SortArgs[?], T] (val x: Self & SortArgs[T]) extends AnyVal {
      
      inline def setDataset(value: DatasetCore[Quad, Quad]): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
      
      inline def setObjects(value: js.Array[T]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
      
      inline def setObjectsVarargs(value: T*): Self = StObject.set(x, "objects", js.Array(value*))
      
      inline def setScore(value: /* arg */ Dataset => js.Array[Score]): Self = StObject.set(x, "score", js.Any.fromFunction1(value))
    }
  }
}
