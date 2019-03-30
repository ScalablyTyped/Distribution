package typings
package reactDashJsonschemaDashFormLib.reactDashJsonschemaDashFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldProps[T]
  extends reactLib.reactMod.ReactNs.HTMLAttributes[stdLib.HTMLElement]
     with /* prop */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var autofocus: scala.Boolean = js.native
  var disabled: scala.Boolean = js.native
  var errorSchema: ErrorSchema = js.native
  var formContext: js.Any = js.native
  var formData: T = js.native
  var idSchema: IdSchema = js.native
  var name: java.lang.String = js.native
  var readonly: scala.Boolean = js.native
  var registry: reactDashJsonschemaDashFormLib.Anon_Definitions = js.native
  var required: scala.Boolean = js.native
  var schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema6 = js.native
  var uiSchema: UiSchema = js.native
  @JSName("onChange")
  def onChange_MFieldProps(e: js.Any): js.Any = js.native
  @JSName("onChange")
  def onChange_MFieldProps(e: js.Any, es: ErrorSchema): js.Any = js.native
  @JSName("onChange")
  def onChange_MFieldProps(e: IChangeEvent[T]): js.Any = js.native
  @JSName("onChange")
  def onChange_MFieldProps(e: IChangeEvent[T], es: ErrorSchema): js.Any = js.native
}

