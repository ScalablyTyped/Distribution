package typings.storybookAddonJest

import typings.react.mod.ComponentType
import typings.storybookAddonJest.messageMod
import typings.storybookAddonJest.resultMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object storybookAddonJestComponents extends storybookAddonJestProps {
  @scala.inline
  def Message: ComponentType[js.Any] = messageMod.asInstanceOf[js.Dynamic].selectDynamic("Message").asInstanceOf[ComponentType[js.Any]]
  @scala.inline
  def Result: ComponentType[ResultProps] = default.asInstanceOf[ComponentType[ResultProps]]
}

