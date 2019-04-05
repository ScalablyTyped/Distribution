package typings
package realmLib.RealmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * realm configuration
  * @see { @link https://realm.io/docs/javascript/latest/api/Realm.html#~Configuration }
  */
trait Configuration extends js.Object {
  var deleteRealmIfMigrationNeeded: js.UndefOr[scala.Boolean] = js.undefined
  var disableFormatUpgrade: js.UndefOr[scala.Boolean] = js.undefined
  var encryptionKey: js.UndefOr[stdLib.ArrayBuffer | stdLib.ArrayBufferView | stdLib.Int8Array] = js.undefined
  var fifoFilesFallbackPath: js.UndefOr[java.lang.String] = js.undefined
  var inMemory: js.UndefOr[scala.Boolean] = js.undefined
  var migration: js.UndefOr[MigrationCallback] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  var schema: js.UndefOr[js.Array[ObjectClass | ObjectSchema]] = js.undefined
  var schemaVersion: js.UndefOr[scala.Double] = js.undefined
  var shouldCompactOnLaunch: js.UndefOr[
    js.Function2[/* totalBytes */ scala.Double, /* usedBytes */ scala.Double, scala.Boolean]
  ] = js.undefined
  var sync: js.UndefOr[stdLib.Partial[realmLib.RealmNs.SyncNs.SyncConfiguration]] = js.undefined
}

object Configuration {
  @scala.inline
  def apply(
    deleteRealmIfMigrationNeeded: js.UndefOr[scala.Boolean] = js.undefined,
    disableFormatUpgrade: js.UndefOr[scala.Boolean] = js.undefined,
    encryptionKey: stdLib.ArrayBuffer | stdLib.ArrayBufferView | stdLib.Int8Array = null,
    fifoFilesFallbackPath: java.lang.String = null,
    inMemory: js.UndefOr[scala.Boolean] = js.undefined,
    migration: MigrationCallback = null,
    path: java.lang.String = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    schema: js.Array[ObjectClass | ObjectSchema] = null,
    schemaVersion: scala.Int | scala.Double = null,
    shouldCompactOnLaunch: (/* totalBytes */ scala.Double, /* usedBytes */ scala.Double) => scala.Boolean = null,
    sync: stdLib.Partial[realmLib.RealmNs.SyncNs.SyncConfiguration] = null
  ): Configuration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deleteRealmIfMigrationNeeded)) __obj.updateDynamic("deleteRealmIfMigrationNeeded")(deleteRealmIfMigrationNeeded)
    if (!js.isUndefined(disableFormatUpgrade)) __obj.updateDynamic("disableFormatUpgrade")(disableFormatUpgrade)
    if (encryptionKey != null) __obj.updateDynamic("encryptionKey")(encryptionKey.asInstanceOf[js.Any])
    if (fifoFilesFallbackPath != null) __obj.updateDynamic("fifoFilesFallbackPath")(fifoFilesFallbackPath)
    if (!js.isUndefined(inMemory)) __obj.updateDynamic("inMemory")(inMemory)
    if (migration != null) __obj.updateDynamic("migration")(migration)
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    if (schemaVersion != null) __obj.updateDynamic("schemaVersion")(schemaVersion.asInstanceOf[js.Any])
    if (shouldCompactOnLaunch != null) __obj.updateDynamic("shouldCompactOnLaunch")(js.Any.fromFunction2(shouldCompactOnLaunch))
    if (sync != null) __obj.updateDynamic("sync")(sync)
    __obj.asInstanceOf[Configuration]
  }
}

