package typings
package reactDashJsonschemaDashFormLib.reactDashJsonschemaDashFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-jsonschema-form", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  @JSName("withTheme")
  def withTheme_schema[T](
    themeProps: stdLib.Omit[
      FormProps[T], 
      reactDashJsonschemaDashFormLib.reactDashJsonschemaDashFormLibStrings.schema
    ]
  ): (reactLib.reactMod.ComponentClass[FormProps[T], reactLib.reactMod.ComponentState]) | reactLib.reactMod.StatelessComponent[FormProps[T]] = js.native
}

