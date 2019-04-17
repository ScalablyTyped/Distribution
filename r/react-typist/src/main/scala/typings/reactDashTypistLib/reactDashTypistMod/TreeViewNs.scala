package typings
package reactDashTypistLib.reactDashTypistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-typist", "TreeView")
@js.native
object TreeViewNs extends js.Object {
  trait BackSpaceProps extends js.Object {
    var count: js.UndefOr[scala.Double] = js.undefined
    var delay: js.UndefOr[scala.Double] = js.undefined
  }
  
  @js.native
  class Backspace ()
    extends reactLib.reactMod.Component[BackSpaceProps, js.Object, js.Any]
  
  trait CurrentTextProps extends js.Object {
    var charIdx: scala.Double
    var character: java.lang.String
    var line: java.lang.String
    var lineIdx: scala.Double
    def defDelayGenerator(mn: scala.Double, st: scala.Double): js.Function1[/* params */ js.Any, scala.Double]
  }
  
  trait CursorProps extends js.Object {
    var blink: js.UndefOr[scala.Boolean] = js.undefined
    var element: js.UndefOr[java.lang.String] = js.undefined
    var hideWhenDone: js.UndefOr[scala.Boolean] = js.undefined
    var hideWhenDoneDelay: js.UndefOr[scala.Double] = js.undefined
    var show: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  @js.native
  class Delay ()
    extends reactLib.reactMod.Component[DelayProps, js.Object, js.Any]
  
  trait DelayProps extends js.Object {
    var ms: scala.Double
  }
  
}

