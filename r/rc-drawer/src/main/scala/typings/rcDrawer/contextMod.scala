package typings.rcDrawer

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Context
import typings.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod extends Shortcut {
  
  @JSImport("rc-drawer/es/context", JSImport.Default)
  @js.native
  val default: Context[DrawerContextProps] = js.native
  
  trait DrawerContextProps extends StObject {
    
    var pull: VoidFunction
    
    var push: VoidFunction
    
    var pushDistance: js.UndefOr[Double | String] = js.undefined
  }
  object DrawerContextProps {
    
    inline def apply(pull: () => Unit, push: () => Unit): DrawerContextProps = {
      val __obj = js.Dynamic.literal(pull = js.Any.fromFunction0(pull), push = js.Any.fromFunction0(push))
      __obj.asInstanceOf[DrawerContextProps]
    }
    
    extension [Self <: DrawerContextProps](x: Self) {
      
      inline def setPull(value: () => Unit): Self = StObject.set(x, "pull", js.Any.fromFunction0(value))
      
      inline def setPush(value: () => Unit): Self = StObject.set(x, "push", js.Any.fromFunction0(value))
      
      inline def setPushDistance(value: Double | String): Self = StObject.set(x, "pushDistance", value.asInstanceOf[js.Any])
      
      inline def setPushDistanceUndefined: Self = StObject.set(x, "pushDistance", js.undefined)
    }
  }
  
  type _To = Context[DrawerContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `contextMod.foo` */
  override def _to: Context[DrawerContextProps] = default
}
