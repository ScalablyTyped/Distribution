package typings.storybookAddonStoryshots.integrityTestTemplateMod._Global_.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Matchers[R, T] extends js.Object {
  def notToBeAbandoned(stories2snapsConverter: js.Any): R
}

object Matchers {
  @scala.inline
  def apply[R, T](notToBeAbandoned: js.Any => R): Matchers[R, T] = {
    val __obj = js.Dynamic.literal(notToBeAbandoned = js.Any.fromFunction1(notToBeAbandoned))
    __obj.asInstanceOf[Matchers[R, T]]
  }
}

