package typings.storybookAddonA11y

import typings.redux.mod.Store
import typings.storybookAddonA11y.anon.Data
import typings.storybookAddonA11y.anon.HighlightedElementsMap
import typings.storybookAddonA11y.anon.Payload
import typings.storybookAddonA11y.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-a11y/dist/redux-config", JSImport.Namespace)
@js.native
object reduxConfigMod extends js.Object {
  val default: Store[HighlightedElementsMap, js.Any] = js.native
  def addElement(payload: Data): Payload = js.native
  def clearElements(): Type = js.native
}

