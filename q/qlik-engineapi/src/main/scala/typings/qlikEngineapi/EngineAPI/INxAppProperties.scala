package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxAppProperties
  */
@js.native
trait INxAppProperties extends js.Object {
  /**
    * Last reload time of the app.
    */
  var qLastReloadTime: String = js.native
  /**
    * Internal property reserved for app migration.
    * Patch version of the app.
    * Do not update.
    */
  var qMigrationHash: String = js.native
  /**
    * Internal property reserved for app migration.
    * The app is saved in this version of the product.
    * Do not update.
    */
  var qSavedInProductVersion: String = js.native
  /**
    * App thumbnail.
    */
  var qThumbnail: IStaticContentUrlDef = js.native
  /**
    * App title.
    */
  var qTitle: String = js.native
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
    val __obj = js.Dynamic.literal(qLastReloadTime = qLastReloadTime.asInstanceOf[js.Any], qMigrationHash = qMigrationHash.asInstanceOf[js.Any], qSavedInProductVersion = qSavedInProductVersion.asInstanceOf[js.Any], qThumbnail = qThumbnail.asInstanceOf[js.Any], qTitle = qTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxAppProperties]
  }
  @scala.inline
  implicit class INxAppPropertiesOps[Self <: INxAppProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQLastReloadTime(value: String): Self = this.set("qLastReloadTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setQMigrationHash(value: String): Self = this.set("qMigrationHash", value.asInstanceOf[js.Any])
    @scala.inline
    def setQSavedInProductVersion(value: String): Self = this.set("qSavedInProductVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setQThumbnail(value: IStaticContentUrlDef): Self = this.set("qThumbnail", value.asInstanceOf[js.Any])
    @scala.inline
    def setQTitle(value: String): Self = this.set("qTitle", value.asInstanceOf[js.Any])
  }
  
}

