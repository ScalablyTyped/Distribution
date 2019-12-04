package typings.atStorybookAddonDashJest.distHocProvideJestResultMod

import typings.atStorybookAddonDashJest.Anon_AssertionResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Test extends js.Object {
  var name: String
  var result: Anon_AssertionResults
}

object Test {
  @scala.inline
  def apply(name: String, result: Anon_AssertionResults): Test = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Test]
  }
}

