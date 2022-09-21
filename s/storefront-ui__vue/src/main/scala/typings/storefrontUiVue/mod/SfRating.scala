package typings.storefrontUiVue.mod

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SfRating extends Shortcut {
  
  @JSImport("@storefront-ui/vue", "SfRating")
  @js.native
  val ^ : Constructor = js.native
  
  trait Computed extends StObject {
    
    var finalMax: Double
    
    var finalScore: Double
  }
  object Computed {
    
    inline def apply(finalMax: Double, finalScore: Double): Computed = {
      val __obj = js.Dynamic.literal(finalMax = finalMax.asInstanceOf[js.Any], finalScore = finalScore.asInstanceOf[js.Any])
      __obj.asInstanceOf[Computed]
    }
    
    extension [Self <: Computed](x: Self) {
      
      inline def setFinalMax(value: Double): Self = StObject.set(x, "finalMax", value.asInstanceOf[js.Any])
      
      inline def setFinalScore(value: Double): Self = StObject.set(x, "finalScore", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor * / any */ trait Constructor extends StObject {
    
    var computed: Computed
    
    var props: Props
  }
  object Constructor {
    
    inline def apply(computed: Computed, props: Props): Constructor = {
      val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[Constructor]
    }
    
    extension [Self <: Constructor](x: Self) {
      
      inline def setComputed(value: Computed): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait Props extends StObject {
    
    var max: Double
    
    var score: Double
  }
  object Props {
    
    inline def apply(max: Double, score: Double): Props = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `SfRating.foo` */
  override def _to: Constructor = ^
}
