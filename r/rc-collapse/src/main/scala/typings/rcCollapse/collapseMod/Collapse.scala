package typings.rcCollapse.collapseMod

import typings.rcCollapse.interfaceMod.CollapseProps
import typings.react.mod.Component
import typings.react.mod.Key
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Collapse
  extends Component[CollapseProps, CollapseState, js.Any] {
  
  def getItems(): js.Array[ReactElement] = js.native
  
  def getNewChild(child: ReactElement, index: Double): ReactElement = js.native
  
  def onClickItem(key: Key): Unit = js.native
  
  def setActiveKey(activeKey: js.Array[Key]): Unit = js.native
  
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MCollapse(nextProps: CollapseProps, nextState: CollapseState): Boolean = js.native
}
