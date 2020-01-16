package typings.atStorybookAddonDashStoryshotsDashPuppeteer.distAxeTestMod._Global_.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Matchers[R, T] extends js.Object {
  def toPassAxeTests(parameters: js.Any): R
}

object Matchers {
  @scala.inline
  def apply[R, T](toPassAxeTests: js.Any => R): Matchers[R, T] = {
    val __obj = js.Dynamic.literal(toPassAxeTests = js.Any.fromFunction1(toPassAxeTests))
  
    __obj.asInstanceOf[Matchers[R, T]]
  }
}

