package typings.storybookAddonJest.provideJestResultMod

import typings.storybookAddonJest.AnonAssertionResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Test extends js.Object {
  var name: String
  var result: AnonAssertionResults
}

object Test {
  @scala.inline
  def apply(name: String, result: AnonAssertionResults): Test = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Test]
  }
}

