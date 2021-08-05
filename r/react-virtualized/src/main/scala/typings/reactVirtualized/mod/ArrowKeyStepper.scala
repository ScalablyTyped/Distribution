package typings.reactVirtualized.mod

import typings.reactVirtualized.anon.Disabled
import typings.reactVirtualized.esArrowKeyStepperMod.ArrowKeyStepperProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-virtualized", "ArrowKeyStepper")
@js.native
class ArrowKeyStepper protected ()
  extends typings.reactVirtualized.esArrowKeyStepperMod.ArrowKeyStepper {
  def this(props: ArrowKeyStepperProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: ArrowKeyStepperProps, context: js.Any) = this()
}
/* static members */
object ArrowKeyStepper {
  
  @JSImport("react-virtualized", "ArrowKeyStepper")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-virtualized", "ArrowKeyStepper.defaultProps")
  @js.native
  def defaultProps: Disabled = js.native
  inline def defaultProps_=(x: Disabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
