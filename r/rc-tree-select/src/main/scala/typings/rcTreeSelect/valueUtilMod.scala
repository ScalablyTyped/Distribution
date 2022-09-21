package typings.rcTreeSelect

import typings.rcTreeSelect.anon.Key
import typings.rcTreeSelect.interfaceMod.DataNode
import typings.rcTreeSelect.interfaceMod.FieldNames
import typings.rcTreeSelect.treeSelectMod.DefaultOptionType
import typings.rcTreeSelect.treeSelectMod.InternalFieldName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valueUtilMod {
  
  @JSImport("rc-tree-select/es/utils/valueUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fillFieldNames(): Key = ^.asInstanceOf[js.Dynamic].applyDynamic("fillFieldNames")().asInstanceOf[Key]
  inline def fillFieldNames(fieldNames: FieldNames): Key = ^.asInstanceOf[js.Dynamic].applyDynamic("fillFieldNames")(fieldNames.asInstanceOf[js.Any]).asInstanceOf[Key]
  
  inline def getAllKeys(treeData: js.Array[DefaultOptionType], fieldNames: InternalFieldName): js.Array[typings.react.mod.Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAllKeys")(treeData.asInstanceOf[js.Any], fieldNames.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.react.mod.Key]]
  
  inline def isCheckDisabled(node: DataNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCheckDisabled")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNil(`val`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNil")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def toArray[T](value: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def toArray[T](value: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
}
