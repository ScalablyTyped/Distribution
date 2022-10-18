package typings.reactNativeSafeAreaContext

import org.scalablytyped.runtime.Shortcut
import typings.reactNativeSafeAreaContext.anon.InitialWindowMetrics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSpecsNativeSafeAreaContextMod extends Shortcut {
  
  @JSImport("react-native-safe-area-context/lib/typescript/specs/NativeSafeAreaContext", JSImport.Default)
  @js.native
  val default: Any = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TurboModule * / any */ trait Spec extends StObject {
    
    def getConstants(): InitialWindowMetrics
  }
  object Spec {
    
    inline def apply(getConstants: () => InitialWindowMetrics): Spec = {
      val __obj = js.Dynamic.literal(getConstants = js.Any.fromFunction0(getConstants))
      __obj.asInstanceOf[Spec]
    }
    
    extension [Self <: Spec](x: Self) {
      
      inline def setGetConstants(value: () => InitialWindowMetrics): Self = StObject.set(x, "getConstants", js.Any.fromFunction0(value))
    }
  }
  
  type _To = Any
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptSpecsNativeSafeAreaContextMod.foo` */
  override def _to: Any = default
}
