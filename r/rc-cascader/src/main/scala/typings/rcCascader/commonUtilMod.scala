package typings.rcCascader

import typings.rcCascader.cascaderMod.DefaultOptionType
import typings.rcCascader.cascaderMod.FieldNames
import typings.rcCascader.cascaderMod.InternalFieldNames
import typings.rcCascader.cascaderMod.SingleValueType
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonUtilMod {
  
  @JSImport("rc-cascader/es/utils/commonUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rc-cascader/es/utils/commonUtil", "SHOW_CHILD")
  @js.native
  val SHOW_CHILD: /* "SHOW_CHILD" */ String = js.native
  
  @JSImport("rc-cascader/es/utils/commonUtil", "SHOW_PARENT")
  @js.native
  val SHOW_PARENT: /* "SHOW_PARENT" */ String = js.native
  
  @JSImport("rc-cascader/es/utils/commonUtil", "VALUE_SPLIT")
  @js.native
  val VALUE_SPLIT: /* "__RC_CASCADER_SPLIT__" */ String = js.native
  
  inline def fillFieldNames(): InternalFieldNames = ^.asInstanceOf[js.Dynamic].applyDynamic("fillFieldNames")().asInstanceOf[InternalFieldNames]
  inline def fillFieldNames(fieldNames: FieldNames): InternalFieldNames = ^.asInstanceOf[js.Dynamic].applyDynamic("fillFieldNames")(fieldNames.asInstanceOf[js.Any]).asInstanceOf[InternalFieldNames]
  
  inline def isLeaf(option: DefaultOptionType, fieldNames: FieldNames): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isLeaf")(option.asInstanceOf[js.Any], fieldNames.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def scrollIntoParentView(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollIntoParentView")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def toPathKey(value: SingleValueType): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toPathKey")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toPathKeys(value: js.Array[SingleValueType]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("toPathKeys")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def toPathValueStr(pathKey: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("toPathValueStr")(pathKey.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
