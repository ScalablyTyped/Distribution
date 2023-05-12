package typings.rcMotion

import typings.rcMotion.anon.MotionContextPropschildre
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esContextMod {
  
  @JSImport("rc-motion/es/context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: MotionContextPropschildre): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("rc-motion/es/context", "Context")
  @js.native
  val Context: typings.react.mod.Context[MotionContextProps] = js.native
  
  trait MotionContextProps extends StObject {
    
    var motion: js.UndefOr[Boolean] = js.undefined
  }
  object MotionContextProps {
    
    inline def apply(): MotionContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MotionContextProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MotionContextProps] (val x: Self) extends AnyVal {
      
      inline def setMotion(value: Boolean): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
      
      inline def setMotionUndefined: Self = StObject.set(x, "motion", js.undefined)
    }
  }
}
