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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conductUtilMod {
  
  @JSImport("rc-tree/es/utils/conductUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def conductCheck(keyList: js.Array[Key], checked: HalfCheckedKeys, keyEntities: Record[Key, DataEntity]): ConductReturnType = (^.asInstanceOf[js.Dynamic].applyDynamic("conductCheck")(keyList.asInstanceOf[js.Any], checked.asInstanceOf[js.Any], keyEntities.asInstanceOf[js.Any])).asInstanceOf[ConductReturnType]
  @scala.inline
  def conductCheck(
    keyList: js.Array[Key],
    checked: HalfCheckedKeys,
    keyEntities: Record[Key, DataEntity],
    getCheckDisabled: GetCheckDisabled[DataNode]
  ): ConductReturnType = (^.asInstanceOf[js.Dynamic].applyDynamic("conductCheck")(keyList.asInstanceOf[js.Any], checked.asInstanceOf[js.Any], keyEntities.asInstanceOf[js.Any], getCheckDisabled.asInstanceOf[js.Any])).asInstanceOf[ConductReturnType]
  
  @scala.inline
  def conductCheck_true(keyList: js.Array[Key], checked: `true`, keyEntities: Record[Key, DataEntity]): ConductReturnType = (^.asInstanceOf[js.Dynamic].applyDynamic("conductCheck")(keyList.asInstanceOf[js.Any], checked.asInstanceOf[js.Any], keyEntities.asInstanceOf[js.Any])).asInstanceOf[ConductReturnType]
  @scala.inline
  def conductCheck_true(
    keyList: js.Array[Key],
    checked: `true`,
    keyEntities: Record[Key, DataEntity],
    getCheckDisabled: GetCheckDisabled[DataNode]
  ): ConductReturnType = (^.asInstanceOf[js.Dynamic].applyDynamic("conductCheck")(keyList.asInstanceOf[js.Any], checked.asInstanceOf[js.Any], keyEntities.asInstanceOf[js.Any], getCheckDisabled.asInstanceOf[js.Any])).asInstanceOf[ConductReturnType]
  
  @scala.inline
  def isCheckDisabled(node: DataNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCheckDisabled")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait ConductReturnType extends StObject {
    
    var checkedKeys: js.Array[Key]
    
    var halfCheckedKeys: js.Array[Key]
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
