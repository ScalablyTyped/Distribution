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
  var inMemory: js.UndefOr[scala.Boolean] = js.undefined
  var migration: js.UndefOr[
    js.Function2[/* oldRealm */ realmLib.Realm, /* newRealm */ realmLib.Realm, scala.Unit]
  ] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  var schema: js.UndefOr[js.Array[ObjectClass | ObjectSchema]] = js.undefined
  var schemaVersion: js.UndefOr[scala.Double] = js.undefined
  var shouldCompactOnLaunch: js.UndefOr[
    js.Function2[/* totalBytes */ scala.Double, /* usedBytes */ scala.Double, scala.Boolean]
  ] = js.undefined
  var sync: js.UndefOr[stdLib.Partial[realmLib.RealmNs.SyncNs.SyncConfiguration]] = js.undefined
}

