package typings.qlikDashEngineapi.EngineAPINs

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
  var qLastReloadTime: String
  /**
    * Internal property reserved for app migration.
    * Patch version of the app.
    * Do not update.
    */
  var qMigrationHash: String
  /**
    * Internal property reserved for app migration.
    * The app is saved in this version of the product.
    * Do not update.
    */
  var qSavedInProductVersion: String
  /**
    * App thumbnail.
    */
  var qThumbnail: IStaticContentUrlDef
  /**
    * App title.
    */
  var qTitle: String
}

object INxAppProperties {
  @scala.inline
  def apply(
    qLastReloadTime: String,
    qMigrationHash: String,
    qSavedInProductVersion: String,
    qThumbnail: IStaticContentUrlDef,
    qTitle: String
  ): INxAppProperties = {
    val __obj = js.Dynamic.literal(qLastReloadTime = qLastReloadTime, qMigrationHash = qMigrationHash, qSavedInProductVersion = qSavedInProductVersion, qThumbnail = qThumbnail, qTitle = qTitle)
  
    __obj.asInstanceOf[INxAppProperties]
  }
}

