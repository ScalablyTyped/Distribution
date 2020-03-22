package typings.rcTreeSelect

import typings.rcTreeSelect.interfaceMod.DataNode
import typings.rcTreeSelect.interfaceMod.SimpleModeConfig
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetLabelProp extends js.Object {
  var simpleMode: Boolean | SimpleModeConfig
  def getLabelProp(node: DataNode): ReactNode
}

object AnonGetLabelProp {
  @scala.inline
  def apply(getLabelProp: DataNode => ReactNode, simpleMode: Boolean | SimpleModeConfig): AnonGetLabelProp = {
    val __obj = js.Dynamic.literal(getLabelProp = js.Any.fromFunction1(getLabelProp), simpleMode = simpleMode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGetLabelProp]
  }
}

