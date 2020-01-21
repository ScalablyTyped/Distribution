package typings.reactJsonschemaForm.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-jsonschema-form", "withTheme")
@js.native
object withTheme extends js.Object {
  def apply[T](themeProps: ThemeProps[T]): (ComponentClass[FormProps[T], ComponentState]) | StatelessComponent[FormProps[T]] = js.native
}

