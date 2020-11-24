package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IQVersion extends js.Object {
  
  var qComponentVersion: String = js.native
}
object IQVersion {
  
  @scala.inline
  def apply(qComponentVersion: String): IQVersion = {
    val __obj = js.Dynamic.literal(qComponentVersion = qComponentVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQVersion]
  }
  
  @scala.inline
  implicit class IQVersionOps[Self <: IQVersion] (val x: Self) extends AnyVal {
    
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
    def setQComponentVersion(value: String): Self = this.set("qComponentVersion", value.asInstanceOf[js.Any])
  }
}
