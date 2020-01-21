package typings.storybookAddonStoryshots.frameworksLoaderMod

import typings.storybookAddonStoryshots.AnonFramework
import typings.storybookAddonStoryshots.storyshotsOptionsMod.StoryshotsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Loader extends js.Object {
  def load(options: StoryshotsOptions): AnonFramework
  def test(options: StoryshotsOptions): Boolean
}

object Loader {
  @scala.inline
  def apply(load: StoryshotsOptions => AnonFramework, test: StoryshotsOptions => Boolean): Loader = {
    val __obj = js.Dynamic.literal(load = js.Any.fromFunction1(load), test = js.Any.fromFunction1(test))
  
    __obj.asInstanceOf[Loader]
  }
}

