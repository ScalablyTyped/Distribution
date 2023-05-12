package typings.rdfjsScore

import org.scalablytyped.runtime.Shortcut
import typings.rdfjsScore.anon.Dataset
import typings.rdfjsScore.mod.Score
import typings.rdfjsScore.mod.ScoreCb
import typings.rdfjsScore.mod.ScoreFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scaleMod extends Shortcut {
  
  @JSImport("@rdfjs/score/scale", JSImport.Default)
  @js.native
  val default: ScoreFn[js.Array[ScaleCriteria]] = js.native
  
  trait ScaleCriteria extends StObject {
    
    var factor: Double
    
    def score(arg: Dataset): js.Array[Score]
    @JSName("score")
    var score_Original: ScoreCb
  }
  object ScaleCriteria {
    
    inline def apply(factor: Double, score: /* arg */ Dataset => js.Array[Score]): ScaleCriteria = {
      val __obj = js.Dynamic.literal(factor = factor.asInstanceOf[js.Any], score = js.Any.fromFunction1(score))
      __obj.asInstanceOf[ScaleCriteria]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScaleCriteria] (val x: Self) extends AnyVal {
      
      inline def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
      
      inline def setScore(value: /* arg */ Dataset => js.Array[Score]): Self = StObject.set(x, "score", js.Any.fromFunction1(value))
    }
  }
  
  type _To = ScoreFn[js.Array[ScaleCriteria]]
  
  /* This means you don't have to write `default`, but can instead just say `scaleMod.foo` */
  override def _to: ScoreFn[js.Array[ScaleCriteria]] = default
}
