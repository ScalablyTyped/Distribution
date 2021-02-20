package typings.rcTree

import typings.rcTree.anon.HalfCheckedKeys
import typings.rcTree.interfaceMod.DataEntity
import typings.rcTree.interfaceMod.DataNode
import typings.rcTree.interfaceMod.GetCheckDisabled
import typings.rcTree.interfaceMod.Key
import typings.rcTree.rcTreeBooleans.`true`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conductUtilMod {
  
  @JSImport("rc-tree/es/utils/conductUtil", "conductCheck")
  @js.native
  def conductCheck(keyList: js.Array[Key], checked: HalfCheckedKeys, keyEntities: Record[Key, DataEntity]): ConductReturnType = js.native
  @JSImport("rc-tree/es/utils/conductUtil", "conductCheck")
  @js.native
  def conductCheck(
    keyList: js.Array[Key],
    checked: HalfCheckedKeys,
    keyEntities: Record[Key, DataEntity],
    getCheckDisabled: GetCheckDisabled[DataNode]
  ): ConductReturnType = js.native
  @JSImport("rc-tree/es/utils/conductUtil", "conductCheck")
  @js.native
  def conductCheck_true(keyList: js.Array[Key], checked: `true`, keyEntities: Record[Key, DataEntity]): ConductReturnType = js.native
  @JSImport("rc-tree/es/utils/conductUtil", "conductCheck")
  @js.native
  def conductCheck_true(
    keyList: js.Array[Key],
    checked: `true`,
    keyEntities: Record[Key, DataEntity],
    getCheckDisabled: GetCheckDisabled[DataNode]
  ): ConductReturnType = js.native
  
  @JSImport("rc-tree/es/utils/conductUtil", "isCheckDisabled")
  @js.native
  def isCheckDisabled(node: DataNode): Boolean = js.native
  
  @js.native
  trait ConductReturnType extends StObject {
    
    var checkedKeys: js.Array[Key] = js.native
    
    var halfCheckedKeys: js.Array[Key] = js.native
  }
  object ConductReturnType {
    
    @scala.inline
    def apply(checkedKeys: js.Array[Key], halfCheckedKeys: js.Array[Key]): ConductReturnType = {
      val __obj = js.Dynamic.literal(checkedKeys = checkedKeys.asInstanceOf[js.Any], halfCheckedKeys = halfCheckedKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConductReturnType]
    }
    
    @scala.inline
    implicit class ConductReturnTypeMutableBuilder[Self <: ConductReturnType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckedKeys(value: js.Array[Key]): Self = StObject.set(x, "checkedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedKeysVarargs(value: Key*): Self = StObject.set(x, "checkedKeys", js.Array(value :_*))
      
      @scala.inline
      def setHalfCheckedKeys(value: js.Array[Key]): Self = StObject.set(x, "halfCheckedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHalfCheckedKeysVarargs(value: Key*): Self = StObject.set(x, "halfCheckedKeys", js.Array(value :_*))
    }
  }
}
