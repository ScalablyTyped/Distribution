package typings.reactMathquill

import typings.edtrIoMathquill.mod.Config
import typings.edtrIoMathquill.mod.MQ
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-mathquill", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-mathquill", JSImport.Default)
  @js.native
  class default ()
    extends Component[Props, js.Object, js.Any]
  
  inline def addStyles(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addStyles")().asInstanceOf[Unit]
  
  type MathQuill = Component[Props, js.Object, js.Any]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof react.react.ComponentProps<'span'>, 'onChange'> ]: react.react.ComponentProps<'span'>[P]} */ trait Props extends StObject {
    
    var config: js.UndefOr[Config] = js.undefined
    
    var latex: js.UndefOr[String] = js.undefined
    
    var mathquillDidMount: js.UndefOr[js.Function1[/* mathField */ MQ, Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* mathField */ MQ, Unit]] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setConfig(value: Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setLatex(value: String): Self = StObject.set(x, "latex", value.asInstanceOf[js.Any])
      
      inline def setLatexUndefined: Self = StObject.set(x, "latex", js.undefined)
      
      inline def setMathquillDidMount(value: /* mathField */ MQ => Unit): Self = StObject.set(x, "mathquillDidMount", js.Any.fromFunction1(value))
      
      inline def setMathquillDidMountUndefined: Self = StObject.set(x, "mathquillDidMount", js.undefined)
      
      inline def setOnChange(value: /* mathField */ MQ => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    }
  }
}
