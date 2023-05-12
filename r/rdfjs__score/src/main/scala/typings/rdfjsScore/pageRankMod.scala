package typings.rdfjsScore

import org.scalablytyped.runtime.Shortcut
import typings.rdfjsScore.mod.ScoreFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pageRankMod extends Shortcut {
  
  @JSImport("@rdfjs/score/pageRank", JSImport.Default)
  @js.native
  val default: ScoreFn[js.Array[Any | PageRank]] = js.native
  
  trait PageRank extends StObject {
    
    var alpha: js.UndefOr[Double] = js.undefined
    
    var epsilon: js.UndefOr[Double] = js.undefined
  }
  object PageRank {
    
    inline def apply(): PageRank = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageRank]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PageRank] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setEpsilon(value: Double): Self = StObject.set(x, "epsilon", value.asInstanceOf[js.Any])
      
      inline def setEpsilonUndefined: Self = StObject.set(x, "epsilon", js.undefined)
    }
  }
  
  type _To = ScoreFn[js.Array[Any | PageRank]]
  
  /* This means you don't have to write `default`, but can instead just say `pageRankMod.foo` */
  override def _to: ScoreFn[js.Array[Any | PageRank]] = default
}
