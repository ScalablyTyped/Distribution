package typings.storybookAddonLinks

import typings.react.mod.ComponentType
import typings.storybookAddonLinks.linkMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object storybookAddonLinksComponents extends storybookAddonLinksProps {
  @scala.inline
  def Link: ComponentType[LinkProps] = js.constructorOf[default].asInstanceOf[ComponentType[LinkProps]]
  @scala.inline
  def React: ComponentType[ReactProps] = js.constructorOf[typings.storybookAddonLinks.reactMod.default].asInstanceOf[ComponentType[ReactProps]]
}

