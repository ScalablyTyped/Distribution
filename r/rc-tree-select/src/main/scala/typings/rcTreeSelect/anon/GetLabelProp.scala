package typings.rcTreeSelect.anon

import typings.rcTreeSelect.interfaceMod.DataNode
import typings.rcTreeSelect.interfaceMod.SimpleModeConfig
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLabelProp extends js.Object {
  var simpleMode: Boolean | SimpleModeConfig
  def getLabelProp(node: DataNode): ReactNode
}

object GetLabelProp {
  @scala.inline
  def apply(getLabelProp: DataNode => ReactNode, simpleMode: Boolean | SimpleModeConfig): GetLabelProp = {
    val __obj = js.Dynamic.literal(getLabelProp = js.Any.fromFunction1(getLabelProp), simpleMode = simpleMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLabelProp]
  }
}

