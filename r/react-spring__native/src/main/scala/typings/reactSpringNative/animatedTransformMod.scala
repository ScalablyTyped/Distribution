package typings.reactSpringNative

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animatedTransformMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimatedObject * / any */ @JSImport("@react-spring/native/dist/declarations/src/AnimatedTransform", "AnimatedTransform")
  @js.native
  open class AnimatedTransform protected () extends StObject {
    def this(source: Source) = this()
    
    /* protected */ def _makePayload(source: Source): js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimatedValue<any> */ Any
      ] = js.native
    
    def getValue(): js.Array[Any] = js.native
    
    def setValue(source: Source): Unit = js.native
    
    /* protected */ var source: Source = js.native
  }
  
  type Source = js.Array[Transform]
  
  type Transform = StringDictionary[
    String | Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated */ Any)
  ]
}
