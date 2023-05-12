package typings.rdfjsScore

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typings.rdfjsScore.anon.Typeofscore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoryMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@rdfjs/score/Factory", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ScoreFactory {
    
    /* CompleteClass */
    var score: Typeofscore = js.native
  }
  @JSImport("@rdfjs/score/Factory", JSImport.Default)
  @js.native
  val default: FactoryCtor = js.native
  
  @js.native
  trait FactoryCtor
    extends StObject
       with Instantiable0[ScoreFactory]
  
  trait ScoreFactory extends StObject {
    
    var score: Typeofscore
  }
  object ScoreFactory {
    
    inline def apply(score: Typeofscore): ScoreFactory = {
      val __obj = js.Dynamic.literal(score = score.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScoreFactory]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScoreFactory] (val x: Self) extends AnyVal {
      
      inline def setScore(value: Typeofscore): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FactoryCtor
  
  /* This means you don't have to write `default`, but can instead just say `factoryMod.foo` */
  override def _to: FactoryCtor = default
}
