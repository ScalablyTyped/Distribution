package typings.reactTypingAnimation.mod

import typings.react.mod.Component
import typings.reactTypingAnimation.mod.Typing.BackspaceProperties
import typings.reactTypingAnimation.mod.Typing.DelayProperties
import typings.reactTypingAnimation.mod.Typing.ResetProperties
import typings.reactTypingAnimation.mod.Typing.SpeedProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-typing-animation", JSImport.Default)
@js.native
class default ()
  extends Component[TypingProps, js.Object, js.Any]

@JSImport("react-typing-animation", JSImport.Default)
@js.native
object default extends js.Object {
  @js.native
  class Backspace ()
    extends Component[BackspaceProperties, js.Object, js.Any]
  
  @js.native
  class Delay ()
    extends Component[DelayProperties, js.Object, js.Any]
  
  @js.native
  class Reset ()
    extends Component[ResetProperties, js.Object, js.Any]
  
  @js.native
  class Speed ()
    extends Component[SpeedProperties, js.Object, js.Any]
  
}

