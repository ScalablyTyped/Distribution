package typings.storybookAddonA11y

import typings.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-a11y/dist/redux-config", JSImport.Namespace)
@js.native
object reduxConfigMod extends js.Object {
  val default: Store[AnonHighlightedElementsMap, js.Any] = js.native
  def addElement(payload: AnonData): AnonPayload = js.native
  def clearElements(): AnonType = js.native
}

