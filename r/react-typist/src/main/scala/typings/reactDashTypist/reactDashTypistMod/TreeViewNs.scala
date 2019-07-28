package typings.reactDashTypist.reactDashTypistMod

import typings.react.reactMod.Component
import typings.reactDashTypist.reactDashTypistMod.TreeViewNs.BackSpaceProps
import typings.reactDashTypist.reactDashTypistMod.TreeViewNs.DelayProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-typist", "TreeView")
@js.native
object TreeViewNs extends js.Object {
  trait BackSpaceProps extends js.Object {
    var count: js.UndefOr[Double] = js.undefined
    var delay: js.UndefOr[Double] = js.undefined
  }
  
  @js.native
  class Backspace ()
    extends Component[BackSpaceProps, js.Object, js.Any]
  
  trait CurrentTextProps extends js.Object {
    var charIdx: Double
    var character: String
    var line: String
    var lineIdx: Double
    def defDelayGenerator(mn: Double, st: Double): js.Function1[/* params */ js.Any, Double]
  }
  
  trait CursorProps extends js.Object {
    var blink: js.UndefOr[Boolean] = js.undefined
    var element: js.UndefOr[String] = js.undefined
    var hideWhenDone: js.UndefOr[Boolean] = js.undefined
    var hideWhenDoneDelay: js.UndefOr[Double] = js.undefined
    var show: js.UndefOr[Boolean] = js.undefined
  }
  
  @js.native
  class Delay ()
    extends Component[DelayProps, js.Object, js.Any]
  
  trait DelayProps extends js.Object {
    var ms: Double
  }
  
}

