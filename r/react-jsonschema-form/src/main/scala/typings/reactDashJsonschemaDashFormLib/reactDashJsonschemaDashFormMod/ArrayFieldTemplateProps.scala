package typings
package reactDashJsonschemaDashFormLib.reactDashJsonschemaDashFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayFieldTemplateProps extends js.Object {
  @JSName("DescriptionField")
  var DescriptionField_Original: reactLib.reactMod.ReactNs.StatelessComponent[reactDashJsonschemaDashFormLib.Anon_Description] = js.native
  @JSName("TitleField")
  var TitleField_Original: reactLib.reactMod.ReactNs.StatelessComponent[reactDashJsonschemaDashFormLib.Anon_Id] = js.native
  var canAdd: scala.Boolean = js.native
  var className: java.lang.String = js.native
  var disabled: scala.Boolean = js.native
  var formContext: js.Any = js.native
  var formData: js.Any = js.native
  var idSchema: IdSchema = js.native
  var items: js.Array[reactDashJsonschemaDashFormLib.Anon_Children] = js.native
  var readonly: scala.Boolean = js.native
  var required: scala.Boolean = js.native
  var schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema6 = js.native
  var title: java.lang.String = js.native
  var uiSchema: UiSchema = js.native
  def DescriptionField(props: reactDashJsonschemaDashFormLib.Anon_Description with reactLib.Anon_Children): reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null = js.native
  def DescriptionField(
    props: reactDashJsonschemaDashFormLib.Anon_Description with reactLib.Anon_Children,
    context: js.Any
  ): reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null = js.native
  def TitleField(props: reactDashJsonschemaDashFormLib.Anon_Id with reactLib.Anon_Children): reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null = js.native
  def TitleField(props: reactDashJsonschemaDashFormLib.Anon_Id with reactLib.Anon_Children, context: js.Any): reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null = js.native
  def onAddClick(event: js.Any): js.Function1[/* event */ js.Any, scala.Unit] = js.native
}

