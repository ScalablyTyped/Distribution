package typings
package senchaUnderscoreTouchLib.ExtNs.deviceNs.sqliteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatabase
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Method] Verifies and changes the version of the database at the same time as doing a schema update with a Ext device sqlite S
  		* @param config Object The object which contains the following config options:
  		*/
  var changeVersion: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Returns the current version of the database
  		* @returns String The database current version.
  		*/
  var getVersion: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Works the same way as transaction but performs a Ext device sqlite SQLTransaction instance in a read only mode
  		* @param config Object
  		*/
  var readTransaction: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Performs a Ext device sqlite SQLTransaction instance in a read write mode
  		* @param config Object The object which contains the following config options:
  		*/
  var transaction: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

