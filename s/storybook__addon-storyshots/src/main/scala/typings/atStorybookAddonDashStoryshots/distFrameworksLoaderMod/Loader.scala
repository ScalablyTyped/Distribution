package typings.atStorybookAddonDashStoryshots.distFrameworksLoaderMod

import typings.atStorybookAddonDashStoryshots.Anon_Framework
import typings.atStorybookAddonDashStoryshots.distApiStoryshotsOptionsMod.StoryshotsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Loader extends js.Object {
  def load(options: StoryshotsOptions): Anon_Framework
  def test(options: StoryshotsOptions): Boolean
}

object Loader {
  @scala.inline
  def apply(load: StoryshotsOptions => Anon_Framework, test: StoryshotsOptions => Boolean): Loader = {
    val __obj = js.Dynamic.literal(load = js.Any.fromFunction1(load), test = js.Any.fromFunction1(test))
  
    __obj.asInstanceOf[Loader]
  }
}

