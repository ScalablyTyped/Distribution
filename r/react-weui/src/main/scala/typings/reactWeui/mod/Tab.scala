package typings.reactWeui.mod

import typings.reactWeui.anon.DefaultIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-weui", "Tab")
@js.native
class Tab protected () extends js.Object {
  def this(args: js.Any*) = this()
  def handleHeaderClick(idx: js.Any): Unit = js.native
  def parseChild(children: js.Any): js.Any = js.native
  def render(): js.Any = js.native
  def renderBar(`type`: js.Any, children: js.Any, cls: js.Any): js.Any = js.native
}

/* static members */
@JSImport("react-weui", "Tab")
@js.native
object Tab extends js.Object {
  var defaultProps: DefaultIndex = js.native
  @js.native
  object propTypes extends js.Object {
    @js.native
    object defaultIndex extends js.Object {
      def apply(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
      def isRequired(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
    }
    
    @js.native
    object onChange extends js.Object {
      def apply(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
      def isRequired(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
    }
    
    @js.native
    object `type` extends js.Object {
      def apply(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
      def isRequired(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
    }
    
  }
  
}

