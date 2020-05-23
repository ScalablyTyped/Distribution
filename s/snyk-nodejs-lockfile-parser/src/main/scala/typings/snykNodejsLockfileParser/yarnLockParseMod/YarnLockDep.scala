package typings.snykNodejsLockfileParser.yarnLockParseMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YarnLockDep extends js.Object {
  var dependencies: js.UndefOr[StringDictionary[String]] = js.undefined
  var optionalDependencies: js.UndefOr[StringDictionary[String]] = js.undefined
  var version: String
}

object YarnLockDep {
  @scala.inline
  def apply(
    version: String,
    dependencies: StringDictionary[String] = null,
    optionalDependencies: StringDictionary[String] = null
  ): YarnLockDep = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (optionalDependencies != null) __obj.updateDynamic("optionalDependencies")(optionalDependencies.asInstanceOf[js.Any])
    __obj.asInstanceOf[YarnLockDep]
  }
}

