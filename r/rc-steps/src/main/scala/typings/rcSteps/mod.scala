package typings.rcSteps

import typings.rcSteps.libStepMod.StepProps
import typings.rcSteps.libStepsMod.StepsProps
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-steps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    inline def apply(props: StepsProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("rc-steps", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof imported_Step.default` */
    inline def Step(props: StepProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Step")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  }
  
  inline def Step(props: StepProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Step")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
}
