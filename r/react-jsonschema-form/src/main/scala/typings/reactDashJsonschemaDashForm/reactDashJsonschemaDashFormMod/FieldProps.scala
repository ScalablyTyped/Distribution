package typings.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormMod

import org.scalablytyped.runtime.StringDictionary
import typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema6
import typings.react.reactMod.HTMLAttributes
import typings.reactDashJsonschemaDashForm.Anon_Definitions
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldProps[T]
  extends HTMLAttributes[HTMLElement]
     with /* prop */ StringDictionary[js.Any] {
  var autofocus: Boolean = js.native
  var disabled: Boolean = js.native
  var errorSchema: ErrorSchema = js.native
  var formContext: js.Any = js.native
  var formData: T = js.native
  var idSchema: IdSchema = js.native
  var name: String = js.native
  var readonly: Boolean = js.native
  var registry: Anon_Definitions = js.native
  var required: Boolean = js.native
  var schema: JSONSchema6 = js.native
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

