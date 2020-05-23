package typings.rmcSteps

import typings.rmcSteps.anon.Current
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-steps/lib", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Step ()
    extends typings.rmcSteps.stepMod.Step
  
  @js.native
  class default ()
    extends typings.rmcSteps.stepsMod.default
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: Current = js.native
  }
  
}

