package typings.reactNativeSqliteStorage.mod

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
  var name: String
}

object DatabaseParams {
  @scala.inline
  def apply(
    location: Location,
    name: String,
    createFromLocation: Double | String = null,
    key: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined
  ): DatabaseParams = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (createFromLocation != null) __obj.updateDynamic("createFromLocation")(createFromLocation.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseParams]
  }
}

