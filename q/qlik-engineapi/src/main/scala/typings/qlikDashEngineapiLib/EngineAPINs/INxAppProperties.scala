package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxAppProperties
  */
trait INxAppProperties extends js.Object {
  /**
    * Last reload time of the app.
    */
  var qLastReloadTime: java.lang.String
  /**
    * Internal property reserved for app migration.
    * Patch version of the app.
    * Do not update.
    */
  var qMigrationHash: java.lang.String
  /**
    * Internal property reserved for app migration.
    * The app is saved in this version of the product.
    * Do not update.
    */
  var qSavedInProductVersion: java.lang.String
  /**
    * App thumbnail.
    */
  var qThumbnail: IStaticContentUrlDef
  /**
    * App title.
    */
  var qTitle: java.lang.String
}

object INxAppProperties {
  @scala.inline
  def apply(
    qLastReloadTime: java.lang.String,
    qMigrationHash: java.lang.String,
    qSavedInProductVersion: java.lang.String,
    qThumbnail: IStaticContentUrlDef,
    qTitle: java.lang.String
  ): INxAppProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qLastReloadTime")(qLastReloadTime)
    __obj.updateDynamic("qMigrationHash")(qMigrationHash)
    __obj.updateDynamic("qSavedInProductVersion")(qSavedInProductVersion)
    __obj.updateDynamic("qThumbnail")(qThumbnail)
    __obj.updateDynamic("qTitle")(qTitle)
    __obj.asInstanceOf[INxAppProperties]
  }
}

