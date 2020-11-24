package typings.reactNavigationCore.anon

import typings.reactNavigationCore.reactNavigationCoreBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Serializable extends js.Object {
  
  var serializable: `true` = js.native
}
object Serializable {
  
  @scala.inline
  def apply(serializable: `true`): Serializable = {
    val __obj = js.Dynamic.literal(serializable = serializable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Serializable]
  }
  
  @scala.inline
  implicit class SerializableOps[Self <: Serializable] (val x: Self) extends AnyVal {
    
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
    def setSerializable(value: `true`): Self = this.set("serializable", value.asInstanceOf[js.Any])
  }
}
