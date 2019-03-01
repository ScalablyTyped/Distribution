package typings
package reactDashJsonschemaDashFormLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Definitions extends js.Object {
  var definitions: js.Object
  var fields: org.scalablytyped.runtime.StringDictionary[reactDashJsonschemaDashFormLib.reactDashJsonschemaDashFormMod.Field]
  var formContext: js.Any
  var widgets: org.scalablytyped.runtime.StringDictionary[reactDashJsonschemaDashFormLib.reactDashJsonschemaDashFormMod.Widget]
}

object Anon_Definitions {
  @scala.inline
  def apply(
    definitions: js.Object,
    fields: org.scalablytyped.runtime.StringDictionary[reactDashJsonschemaDashFormLib.reactDashJsonschemaDashFormMod.Field],
    formContext: js.Any,
    widgets: org.scalablytyped.runtime.StringDictionary[reactDashJsonschemaDashFormLib.reactDashJsonschemaDashFormMod.Widget]
  ): Anon_Definitions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("definitions")(definitions)
    __obj.updateDynamic("fields")(fields)
    __obj.updateDynamic("formContext")(formContext)
    __obj.updateDynamic("widgets")(widgets)
    __obj.asInstanceOf[Anon_Definitions]
  }
}

