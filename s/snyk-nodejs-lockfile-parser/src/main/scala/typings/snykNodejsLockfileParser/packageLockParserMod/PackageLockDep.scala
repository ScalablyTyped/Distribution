package typings.snykNodejsLockfileParser.packageLockParserMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageLockDep extends js.Object {
  var dependencies: js.UndefOr[PackageLockDeps] = js.undefined
  var dev: js.UndefOr[Boolean] = js.undefined
  var requires: js.UndefOr[StringDictionary[String]] = js.undefined
  var version: String
}

object PackageLockDep {
  @scala.inline
  def apply(
    version: String,
    dependencies: PackageLockDeps = null,
    dev: js.UndefOr[Boolean] = js.undefined,
    requires: StringDictionary[String] = null
  ): PackageLockDep = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (!js.isUndefined(dev)) __obj.updateDynamic("dev")(dev.get.asInstanceOf[js.Any])
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageLockDep]
  }
}

