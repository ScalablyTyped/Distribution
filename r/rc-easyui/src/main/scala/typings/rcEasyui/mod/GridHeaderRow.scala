package typings.rcEasyui.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-easyui", "GridHeaderRow")
@js.native
class GridHeaderRow protected ()
  extends Component[js.Any, js.Object, js.Any] {
  def this(e: js.Any) = this()
  @JSName("componentDidMount")
  def componentDidMount_MGridHeaderRow(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MGridHeaderRow(): Unit = js.native
  def onColumnAdd(e: js.Any): Unit = js.native
  def onColumnRemove(e: js.Any): Unit = js.native
}

@JSImport("rc-easyui", "GridHeaderRow")
@js.native
object GridHeaderRow extends js.Object {
  @js.native
  object contextTypes extends js.Object {
    @js.native
    object locale extends js.Object {
      // Circular reference from rc_easyui.GridHeaderRow.contextTypes.locale
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object t extends js.Object {
      // Circular reference from rc_easyui.GridHeaderRow.contextTypes.t
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
  }
  
  @js.native
  object propTypes extends js.Object {
    @js.native
    object className extends js.Object {
      // Circular reference from rc_easyui.GridHeaderRow.propTypes.className
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object style extends js.Object {
      // Circular reference from rc_easyui.GridHeaderRow.propTypes.style
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
  }
  
}

