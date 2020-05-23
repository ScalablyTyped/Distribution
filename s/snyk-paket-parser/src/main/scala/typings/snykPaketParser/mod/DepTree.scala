package typings.snykPaketParser.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DepTree extends js.Object {
  var depType: js.UndefOr[DepType] = js.undefined
  var dependencies: StringDictionary[DepTree]
  var hasDevDependencies: js.UndefOr[Boolean] = js.undefined
  var missingLockFileEntry: js.UndefOr[Boolean] = js.undefined
  var name: String
  var targetFrameworks: js.UndefOr[js.Array[String]] = js.undefined
  var version: String
}

object DepTree {
  @scala.inline
  def apply(
    dependencies: StringDictionary[DepTree],
    name: String,
    version: String,
    depType: DepType = null,
    hasDevDependencies: js.UndefOr[Boolean] = js.undefined,
    missingLockFileEntry: js.UndefOr[Boolean] = js.undefined,
    targetFrameworks: js.Array[String] = null
  ): DepTree = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (depType != null) __obj.updateDynamic("depType")(depType.asInstanceOf[js.Any])
    if (!js.isUndefined(hasDevDependencies)) __obj.updateDynamic("hasDevDependencies")(hasDevDependencies.get.asInstanceOf[js.Any])
    if (!js.isUndefined(missingLockFileEntry)) __obj.updateDynamic("missingLockFileEntry")(missingLockFileEntry.get.asInstanceOf[js.Any])
    if (targetFrameworks != null) __obj.updateDynamic("targetFrameworks")(targetFrameworks.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepTree]
  }
}

