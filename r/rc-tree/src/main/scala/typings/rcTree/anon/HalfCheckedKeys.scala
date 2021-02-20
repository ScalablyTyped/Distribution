package typings.rcTree.anon

import typings.rcTree.rcTreeBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HalfCheckedKeys extends StObject {
  
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
  implicit class HalfCheckedKeysMutableBuilder[Self <: HalfCheckedKeys] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecked(value: `false`): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHalfCheckedKeys(value: js.Array[typings.rcTree.interfaceMod.Key]): Self = StObject.set(x, "halfCheckedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHalfCheckedKeysVarargs(value: typings.rcTree.interfaceMod.Key*): Self = StObject.set(x, "halfCheckedKeys", js.Array(value :_*))
  }
}
