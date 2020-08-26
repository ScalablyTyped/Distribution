package typings.reactMdStates.statesConfigMod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/states/types/StatesConfig", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * The `StatesConfig` component is a top-level context provider for the states
    * context configuration. It'll keep track of:
    *
    * - the current interaction mode of your user
    * - configuration for ripple effects
    * - disabling or enabling the ripple effects
    * - disabling or enabling the fix for color pollution
    */
  def apply(hasRippleTimeoutRippleClassNamesDisableRippleDisableProgrammaticRippleChildren: StatesConfigProps): ReactElement = js.native
  @js.native
  object propTypes extends js.Object {
    var children: js.Any = js.native
    var disableProgrammaticRipple: js.Any = js.native
    var disableRipple: js.Any = js.native
    var rippleClassNames: js.Any = js.native
    var rippleTimeout: js.Any = js.native
  }
  
}

