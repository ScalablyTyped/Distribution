package typings.reactDashTypist.reactDashTypistMod

import typings.react.reactMod.Component
import typings.reactDashTypist.reactDashTypistMod.Typist.BackSpaceProps
import typings.reactDashTypist.reactDashTypistMod.Typist.DelayProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-typist", JSImport.Default)
@js.native
class default ()
  extends Component[TypistProps, js.Object, js.Any]

@JSImport("react-typist", JSImport.Default)
@js.native
object default extends js.Object {
  @js.native
  class Backspace ()
    extends Component[BackSpaceProps, js.Object, js.Any]
  
  @js.native
  class Delay ()
    extends Component[DelayProps, js.Object, js.Any]
  
}

