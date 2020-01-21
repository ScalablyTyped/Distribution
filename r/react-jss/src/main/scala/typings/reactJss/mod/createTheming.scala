package typings.reactJss.mod

import typings.react.mod.Context
import typings.theming.mod.Theming
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-jss", "createTheming")
@js.native
object createTheming extends js.Object {
  def apply[Theme](context: Context[Theme]): Theming[Theme] = js.native
}

