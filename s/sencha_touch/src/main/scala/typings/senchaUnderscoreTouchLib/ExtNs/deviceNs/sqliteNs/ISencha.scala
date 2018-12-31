package typings
package senchaUnderscoreTouchLib.ExtNs.deviceNs.sqliteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISencha
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Method] Returns a Ext device sqlite Database instance
  		* @param config Object The object which contains the following config options:
  		* @returns Ext.device.sqlite.Database The opened database, null if an error occured.
  		*/
  var openDatabase: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], IDatabase]] = js.undefined
}

