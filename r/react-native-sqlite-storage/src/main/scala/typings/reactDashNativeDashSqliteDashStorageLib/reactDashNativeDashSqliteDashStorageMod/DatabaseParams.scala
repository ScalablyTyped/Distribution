package typings
package reactDashNativeDashSqliteDashStorageLib.reactDashNativeDashSqliteDashStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabaseParams extends DatabaseOptionalParams {
  /**
    * Affects iOS database file location
    * 'default': Library/LocalDatabase subdirectory - NOT visible to iTunes and NOT backed up by iCloud
    * 'Library': Library subdirectory - backed up by iCloud, NOT visible to iTunes
    * 'Documents': Documents subdirectory - visible to iTunes and backed up by iCloud
    */
  var location: Location
  var name: java.lang.String
}

object DatabaseParams {
  @scala.inline
  def apply(
    location: Location,
    name: java.lang.String,
    createFromLocation: scala.Double | java.lang.String = null,
    key: java.lang.String = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined
  ): DatabaseParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("location")(location)
    __obj.updateDynamic("name")(name)
    if (createFromLocation != null) __obj.updateDynamic("createFromLocation")(createFromLocation.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    __obj.asInstanceOf[DatabaseParams]
  }
}

