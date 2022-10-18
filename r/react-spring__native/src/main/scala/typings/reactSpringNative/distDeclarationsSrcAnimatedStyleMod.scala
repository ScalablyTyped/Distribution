package typings.reactSpringNative

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcAnimatedStyleMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimatedObject * / any */ @JSImport("@react-spring/native/dist/declarations/src/AnimatedStyle", "AnimatedStyle")
  @js.native
  open class AnimatedStyle protected () extends StObject {
    def this(style: Style) = this()
    
    def setValue(style: Style): Unit = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped object */ trait Style extends StObject {
    
    var transform: js.UndefOr[Any] = js.undefined
  }
  object Style {
    
    inline def apply(): Style = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Style]
    }
    
    extension [Self <: Style](x: Self) {
      
      inline def setTransform(value: Any): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
}
