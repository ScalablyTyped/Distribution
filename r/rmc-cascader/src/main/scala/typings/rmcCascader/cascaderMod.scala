package typings.rmcCascader

import typings.react.mod.Component
import typings.rmcCascader.cascaderTypesMod.ICascaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-cascader/lib/Cascader", JSImport.Namespace)
@js.native
object cascaderMod extends js.Object {
  @js.native
  trait Cascader
    extends Component[ICascaderProps, js.Any, js.Any] {
    @JSName("state")
    var state_Cascader: AnonValue = js.native
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MCascader(nextProps: js.Any): Unit = js.native
    def getCols(): js.Any = js.native
    def getValue(d: js.Any, `val`: js.Any): js.Any = js.native
    def onValueChange(value: js.Any, index: js.Any): Unit = js.native
  }
  
  @js.native
  class default () extends Cascader
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: AnonCols = js.native
  }
  
}

