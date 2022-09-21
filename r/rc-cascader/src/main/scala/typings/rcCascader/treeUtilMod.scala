package typings.rcCascader

import typings.rcCascader.anon.Index
import typings.rcCascader.cascaderMod.DefaultOptionType
import typings.rcCascader.cascaderMod.InternalFieldNames
import typings.rcCascader.cascaderMod.ShowCheckedStrategy
import typings.rcCascader.cascaderMod.SingleValueType
import typings.rcCascader.useEntitiesMod.GetEntities
import typings.react.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeUtilMod {
  
  @JSImport("rc-cascader/es/utils/treeUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatStrategyValues(pathKeys: js.Array[Key], getKeyPathEntities: GetEntities, showCheckedStrategy: ShowCheckedStrategy): js.Array[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatStrategyValues")(pathKeys.asInstanceOf[js.Any], getKeyPathEntities.asInstanceOf[js.Any], showCheckedStrategy.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key]]
  
  inline def toPathOptions(valueCells: SingleValueType, options: js.Array[DefaultOptionType], fieldNames: InternalFieldNames): js.Array[Index] = (^.asInstanceOf[js.Dynamic].applyDynamic("toPathOptions")(valueCells.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fieldNames.asInstanceOf[js.Any])).asInstanceOf[js.Array[Index]]
  inline def toPathOptions(
    valueCells: SingleValueType,
    options: js.Array[DefaultOptionType],
    fieldNames: InternalFieldNames,
    stringMode: Boolean
  ): js.Array[Index] = (^.asInstanceOf[js.Dynamic].applyDynamic("toPathOptions")(valueCells.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fieldNames.asInstanceOf[js.Any], stringMode.asInstanceOf[js.Any])).asInstanceOf[js.Array[Index]]
}
