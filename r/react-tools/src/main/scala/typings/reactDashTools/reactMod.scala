package typings.reactDashTools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("React", JSImport.Namespace)
@js.native
object reactMod extends js.Object {
  @js.native
  class Component () extends js.Object {
    def this(props: js.Any) = this()
    def this(props: js.Any, context: js.Any) = this()
    var context: js.Any = js.native
    var props: js.Any = js.native
    var state: js.Any = js.native
    def forceUpdate(): Unit = js.native
    def forceUpdate(callback: js.Any): Unit = js.native
    def setState(partial: js.Any): Unit = js.native
    def setState(partial: js.Any, callback: js.Any): Unit = js.native
  }
  
  var PropTypes: js.Any = js.native
  def createElement(tag: js.Any): js.Any = js.native
  def createElement(tag: js.Any, props: js.Any, children: js.Any*): js.Any = js.native
  def findDOMNode(instance: js.Any): js.Any = js.native
  def render(element: js.Any, container: js.Any): js.Any = js.native
  def unmountComponentAtNode(container: js.Any): Unit = js.native
  /* static members */
  @js.native
  object Component extends js.Object {
    var name: String = js.native
  }
  
}

