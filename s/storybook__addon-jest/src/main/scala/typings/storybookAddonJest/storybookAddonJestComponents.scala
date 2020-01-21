package typings.storybookAddonJest

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object storybookAddonJestComponents extends storybookAddonJestProps {
  @scala.inline
  def Message: ComponentType[js.Any] = typings.storybookAddonJest.messageMod.asInstanceOf[js.Dynamic].selectDynamic("Message").asInstanceOf[typings.react.mod.ComponentType[js.Any]]
  @scala.inline
  def Result: ComponentType[ResultProps] = typings.storybookAddonJest.resultMod.default.asInstanceOf[typings.react.mod.ComponentType[ResultProps]]
}

