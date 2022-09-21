package typings.reactWidgets

import typings.reactWidgets.anon.FindOrSelf
import typings.reactWidgets.typesMod.DataItem
import typings.reactWidgets.typesMod.Value
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accessorsMod {
  
  @JSImport("react-widgets/cjs/Accessors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dataIndexOf(data: js.Array[DataItem], value: Value): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dataIndexOf")(data.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def dataIndexOf(data: js.Array[DataItem], value: Value, dataKey: DataKeyAccessor): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dataIndexOf")(data.asInstanceOf[js.Any], value.asInstanceOf[js.Any], dataKey.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def dataItem[TDataItem](data: js.Array[TDataItem], value: Value): TDataItem = (^.asInstanceOf[js.Dynamic].applyDynamic("dataItem")(data.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[TDataItem]
  inline def dataItem[TDataItem](data: js.Array[TDataItem], value: Value, dataKey: DataKeyAccessor): TDataItem = (^.asInstanceOf[js.Dynamic].applyDynamic("dataItem")(data.asInstanceOf[js.Any], value.asInstanceOf[js.Any], dataKey.asInstanceOf[js.Any])).asInstanceOf[TDataItem]
  
  inline def dataText(dataItem: DataItem): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dataText")(dataItem.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def dataText(dataItem: DataItem, textField: TextAccessor): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dataText")(dataItem.asInstanceOf[js.Any], textField.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def dataValue(dataItem: DataItem): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("dataValue")(dataItem.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def dataValue(dataItem: DataItem, field: DataKeyAccessor): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("dataValue")(dataItem.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def useAccessors(): FindOrSelf = ^.asInstanceOf[js.Dynamic].applyDynamic("useAccessors")().asInstanceOf[FindOrSelf]
  inline def useAccessors(textField: Unit, dataKey: DataKeyAccessor): FindOrSelf = (^.asInstanceOf[js.Dynamic].applyDynamic("useAccessors")(textField.asInstanceOf[js.Any], dataKey.asInstanceOf[js.Any])).asInstanceOf[FindOrSelf]
  inline def useAccessors(textField: TextAccessor): FindOrSelf = ^.asInstanceOf[js.Dynamic].applyDynamic("useAccessors")(textField.asInstanceOf[js.Any]).asInstanceOf[FindOrSelf]
  inline def useAccessors(textField: TextAccessor, dataKey: DataKeyAccessor): FindOrSelf = (^.asInstanceOf[js.Dynamic].applyDynamic("useAccessors")(textField.asInstanceOf[js.Any], dataKey.asInstanceOf[js.Any])).asInstanceOf[FindOrSelf]
  
  inline def valueMatcher(a: DataItem, b: DataItem): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("valueMatcher")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def valueMatcher(a: DataItem, b: DataItem, dataKey: DataKeyAccessor): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("valueMatcher")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], dataKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type Accessors = ReturnType[
    js.Function2[
      /* textField */ js.UndefOr[TextAccessor], 
      /* dataKey */ js.UndefOr[DataKeyAccessor], 
      FindOrSelf
    ]
  ]
  
  type DataKeyAccessor = String | DataKeyAccessorFn
  
  type DataKeyAccessorFn = js.Function1[/* item */ DataItem, DataItem]
  
  type TextAccessor = String | TextAccessorFn
  
  type TextAccessorFn = js.Function1[/* item */ DataItem, String]
}
