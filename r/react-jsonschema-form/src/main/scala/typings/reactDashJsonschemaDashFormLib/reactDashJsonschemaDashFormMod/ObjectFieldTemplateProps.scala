package typings
package reactDashJsonschemaDashFormLib.reactDashJsonschemaDashFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectFieldTemplateProps extends js.Object {
  @JSName("DescriptionField")
  var DescriptionField_Original: reactLib.reactMod.ReactNs.StatelessComponent[reactDashJsonschemaDashFormLib.Anon_Description] = js.native
  @JSName("TitleField")
  var TitleField_Original: reactLib.reactMod.ReactNs.StatelessComponent[reactDashJsonschemaDashFormLib.Anon_Id] = js.native
  var description: java.lang.String = js.native
  var formContext: js.Any = js.native
  var formData: js.Any = js.native
  var idSchema: IdSchema = js.native
  var properties: js.Array[reactDashJsonschemaDashFormLib.Anon_Content] = js.native
  var required: scala.Boolean = js.native
  var schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema6 = js.native
  var title: java.lang.String = js.native
  var uiSchema: UiSchema = js.native
  def DescriptionField(props: reactDashJsonschemaDashFormLib.Anon_Description with reactLib.Anon_Children): reactLib.reactMod.ReactNs.ReactElement | scala.Null = js.native
  def DescriptionField(
    props: reactDashJsonschemaDashFormLib.Anon_Description with reactLib.Anon_Children,
    context: js.Any
  ): reactLib.reactMod.ReactNs.ReactElement | scala.Null = js.native
  def TitleField(props: reactDashJsonschemaDashFormLib.Anon_Id with reactLib.Anon_Children): reactLib.reactMod.ReactNs.ReactElement | scala.Null = js.native
  def TitleField(props: reactDashJsonschemaDashFormLib.Anon_Id with reactLib.Anon_Children, context: js.Any): reactLib.reactMod.ReactNs.ReactElement | scala.Null = js.native
}

