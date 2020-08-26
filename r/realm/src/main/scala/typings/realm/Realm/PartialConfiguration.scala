package typings.realm.Realm

import typings.realm.anon.PartialSyncConfiguration
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Int8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * realm configuration used for overriding default configuration values.
  * @see { @link https://realm.io/docs/javascript/latest/api/Realm.html#~Configuration }
  */
/* Inlined parent std.Partial<realm.Realm.Configuration> */
@js.native
trait PartialConfiguration extends js.Object {
  var deleteRealmIfMigrationNeeded: js.UndefOr[Boolean] = js.native
  var disableFormatUpgrade: js.UndefOr[Boolean] = js.native
  var encryptionKey: js.UndefOr[ArrayBuffer | ArrayBufferView | Int8Array] = js.native
  var fifoFilesFallbackPath: js.UndefOr[String] = js.native
  var inMemory: js.UndefOr[Boolean] = js.native
  var migration: js.UndefOr[MigrationCallback] = js.native
  var path: js.UndefOr[String] = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var schema: js.UndefOr[js.Array[ObjectClass | ObjectSchema]] = js.native
  var schemaVersion: js.UndefOr[Double] = js.native
  var shouldCompactOnLaunch: js.UndefOr[js.Function2[/* totalBytes */ Double, /* usedBytes */ Double, Boolean]] = js.native
  var sync: js.UndefOr[PartialSyncConfiguration] = js.native
}

object PartialConfiguration {
  @scala.inline
  def apply(): PartialConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialConfiguration]
  }
  @scala.inline
  implicit class PartialConfigurationOps[Self <: PartialConfiguration] (val x: Self) extends AnyVal {
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
    def setDeleteRealmIfMigrationNeeded(value: Boolean): Self = this.set("deleteRealmIfMigrationNeeded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteRealmIfMigrationNeeded: Self = this.set("deleteRealmIfMigrationNeeded", js.undefined)
    @scala.inline
    def setDisableFormatUpgrade(value: Boolean): Self = this.set("disableFormatUpgrade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableFormatUpgrade: Self = this.set("disableFormatUpgrade", js.undefined)
    @scala.inline
    def setEncryptionKey(value: ArrayBuffer | ArrayBufferView | Int8Array): Self = this.set("encryptionKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionKey: Self = this.set("encryptionKey", js.undefined)
    @scala.inline
    def setFifoFilesFallbackPath(value: String): Self = this.set("fifoFilesFallbackPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFifoFilesFallbackPath: Self = this.set("fifoFilesFallbackPath", js.undefined)
    @scala.inline
    def setInMemory(value: Boolean): Self = this.set("inMemory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInMemory: Self = this.set("inMemory", js.undefined)
    @scala.inline
    def setMigration(value: (/* oldRealm */ typings.realm.Realm, /* newRealm */ typings.realm.Realm) => Unit): Self = this.set("migration", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMigration: Self = this.set("migration", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setSchemaVarargs(value: (ObjectClass | ObjectSchema)*): Self = this.set("schema", js.Array(value :_*))
    @scala.inline
    def setSchema(value: js.Array[ObjectClass | ObjectSchema]): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    @scala.inline
    def setSchemaVersion(value: Double): Self = this.set("schemaVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemaVersion: Self = this.set("schemaVersion", js.undefined)
    @scala.inline
    def setShouldCompactOnLaunch(value: (/* totalBytes */ Double, /* usedBytes */ Double) => Boolean): Self = this.set("shouldCompactOnLaunch", js.Any.fromFunction2(value))
    @scala.inline
    def deleteShouldCompactOnLaunch: Self = this.set("shouldCompactOnLaunch", js.undefined)
    @scala.inline
    def setSync(value: PartialSyncConfiguration): Self = this.set("sync", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSync: Self = this.set("sync", js.undefined)
  }
  
}

