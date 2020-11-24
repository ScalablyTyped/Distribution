package typings.rcTree.anon

import typings.rcTree.rcTreeBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HalfCheckedKeys extends js.Object {
  
  var checked: `false` = js.native
  
  var halfCheckedKeys: js.Array[typings.rcTree.interfaceMod.Key] = js.native
}
object HalfCheckedKeys {
  
  @scala.inline
  def apply(checked: `false`, halfCheckedKeys: js.Array[typings.rcTree.interfaceMod.Key]): HalfCheckedKeys = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], halfCheckedKeys = halfCheckedKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[HalfCheckedKeys]
  }
  
  @scala.inline
  implicit class HalfCheckedKeysOps[Self <: HalfCheckedKeys] (val x: Self) extends AnyVal {
    
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
    def setChecked(value: `false`): Self = this.set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHalfCheckedKeysVarargs(value: typings.rcTree.interfaceMod.Key*): Self = this.set("halfCheckedKeys", js.Array(value :_*))
    
    @scala.inline
    def setHalfCheckedKeys(value: js.Array[typings.rcTree.interfaceMod.Key]): Self = this.set("halfCheckedKeys", value.asInstanceOf[js.Any])
  }
}
