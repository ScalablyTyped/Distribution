package typings.storybookAddonKnobs.propFormMod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropForm
  extends Component[PropFormProps, js.Object, js.Any] {
  def makeChangeHandler(name: String, `type`: String): js.Function1[/* value */ js.UndefOr[String], Unit] = js.native
}

