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

