package typings.rcTree.anon

import typings.rcTree.rcTreeBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HalfCheckedKeys extends StObject {
  
  var checked: `false`
  
  var halfCheckedKeys: js.Array[typings.rcTree.interfaceMod.Key]
}
object HalfCheckedKeys {
  
  inline def apply(halfCheckedKeys: js.Array[typings.rcTree.interfaceMod.Key]): HalfCheckedKeys = {
    val __obj = js.Dynamic.literal(checked = false, halfCheckedKeys = halfCheckedKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[HalfCheckedKeys]
  }
  
  extension [Self <: HalfCheckedKeys](x: Self) {
    
    inline def setChecked(value: `false`): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setHalfCheckedKeys(value: js.Array[typings.rcTree.interfaceMod.Key]): Self = StObject.set(x, "halfCheckedKeys", value.asInstanceOf[js.Any])
    
    inline def setHalfCheckedKeysVarargs(value: typings.rcTree.interfaceMod.Key*): Self = StObject.set(x, "halfCheckedKeys", js.Array(value*))
  }
}
