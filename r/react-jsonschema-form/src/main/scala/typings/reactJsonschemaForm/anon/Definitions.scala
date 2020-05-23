package typings.reactJsonschemaForm.anon

import org.scalablytyped.runtime.StringDictionary
import typings.reactJsonschemaForm.mod.Field
import typings.reactJsonschemaForm.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Definitions extends js.Object {
  var definitions: StringDictionary[js.Any]
  var fields: StringDictionary[Field]
  var formContext: js.Any
  var widgets: StringDictionary[Widget]
}

object Definitions {
  @scala.inline
  def apply(
    definitions: StringDictionary[js.Any],
    fields: StringDictionary[Field],
    formContext: js.Any,
    widgets: StringDictionary[Widget]
  ): Definitions = {
    val __obj = js.Dynamic.literal(definitions = definitions.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], formContext = formContext.asInstanceOf[js.Any], widgets = widgets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definitions]
  }
}

