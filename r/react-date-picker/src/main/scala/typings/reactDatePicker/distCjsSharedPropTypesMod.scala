package typings.reactDatePicker

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import typings.reactDatePicker.anon.Current
import typings.std.NonNullable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsSharedPropTypesMod {
  
  @JSImport("react-date-picker/dist/cjs/shared/propTypes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isMaxDate(props: Record[String, Any], propName: String, componentName: String): js.Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("isMaxDate")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any])).asInstanceOf[js.Error | Null]
  
  inline def isMinDate(props: Record[String, Any], propName: String, componentName: String): js.Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("isMinDate")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any])).asInstanceOf[js.Error | Null]
  
  @JSImport("react-date-picker/dist/cjs/shared/propTypes", "isRef")
  @js.native
  val isRef: Requireable[
    NonNullable[js.UndefOr[(js.Function1[/* repeated */ Any, Any]) | InferProps[Current] | Null]]
  ] = js.native
  
  @JSImport("react-date-picker/dist/cjs/shared/propTypes", "isValueType")
  @js.native
  val isValueType: Requireable[String] = js.native
}
