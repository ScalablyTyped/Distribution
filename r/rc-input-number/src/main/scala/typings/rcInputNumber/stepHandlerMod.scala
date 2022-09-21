package typings.rcInputNumber

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepHandlerMod {
  
  @JSImport("rc-input-number/es/StepHandler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasPrefixClsUpNodeDownNodeUpDisabledDownDisabledOnStep: StepHandlerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasPrefixClsUpNodeDownNodeUpDisabledDownDisabledOnStep.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait StepHandlerProps extends StObject {
    
    var downDisabled: js.UndefOr[Boolean] = js.undefined
    
    var downNode: js.UndefOr[ReactNode] = js.undefined
    
    def onStep(up: Boolean): Unit
    
    var prefixCls: String
    
    var upDisabled: js.UndefOr[Boolean] = js.undefined
    
    var upNode: js.UndefOr[ReactNode] = js.undefined
  }
  object StepHandlerProps {
    
    inline def apply(onStep: Boolean => Unit, prefixCls: String): StepHandlerProps = {
      val __obj = js.Dynamic.literal(onStep = js.Any.fromFunction1(onStep), prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepHandlerProps]
    }
    
    extension [Self <: StepHandlerProps](x: Self) {
      
      inline def setDownDisabled(value: Boolean): Self = StObject.set(x, "downDisabled", value.asInstanceOf[js.Any])
      
      inline def setDownDisabledUndefined: Self = StObject.set(x, "downDisabled", js.undefined)
      
      inline def setDownNode(value: ReactNode): Self = StObject.set(x, "downNode", value.asInstanceOf[js.Any])
      
      inline def setDownNodeUndefined: Self = StObject.set(x, "downNode", js.undefined)
      
      inline def setOnStep(value: Boolean => Unit): Self = StObject.set(x, "onStep", js.Any.fromFunction1(value))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setUpDisabled(value: Boolean): Self = StObject.set(x, "upDisabled", value.asInstanceOf[js.Any])
      
      inline def setUpDisabledUndefined: Self = StObject.set(x, "upDisabled", js.undefined)
      
      inline def setUpNode(value: ReactNode): Self = StObject.set(x, "upNode", value.asInstanceOf[js.Any])
      
      inline def setUpNodeUndefined: Self = StObject.set(x, "upNode", js.undefined)
    }
  }
}
