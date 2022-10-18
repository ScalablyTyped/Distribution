package typings.rcSelect

import typings.rcSelect.libSelectMod.DefaultOptionType
import typings.rcSelect.libSelectMod.FieldNames
import typings.rcSelect.libSelectMod.SelectProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsWarningPropsUtilMod {
  
  @JSImport("rc-select/lib/utils/warningPropsUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: SelectProps[Any, DefaultOptionType]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def warningNullOptions(options: js.Array[DefaultOptionType], fieldNames: FieldNames): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warningNullOptions")(options.asInstanceOf[js.Any], fieldNames.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
