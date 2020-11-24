package typings.rcTreeSelect.anon

import typings.rcTreeSelect.interfaceMod.DataNode
import typings.rcTreeSelect.interfaceMod.SimpleModeConfig
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLabelProp extends js.Object {
  
  def getLabelProp(node: DataNode): ReactNode = js.native
  
  var simpleMode: Boolean | SimpleModeConfig = js.native
}
object GetLabelProp {
  
  @scala.inline
  def apply(getLabelProp: DataNode => ReactNode, simpleMode: Boolean | SimpleModeConfig): GetLabelProp = {
    val __obj = js.Dynamic.literal(getLabelProp = js.Any.fromFunction1(getLabelProp), simpleMode = simpleMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLabelProp]
  }
  
  @scala.inline
  implicit class GetLabelPropOps[Self <: GetLabelProp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetLabelProp(value: DataNode => ReactNode): Self = this.set("getLabelProp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSimpleMode(value: Boolean | SimpleModeConfig): Self = this.set("simpleMode", value.asInstanceOf[js.Any])
  }
}
