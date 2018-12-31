package typings
package senchaUnderscoreTouchLib.ExtNs.deviceNs.filesystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDirectoryEntry extends IEntry {
  /** [Method] Works the same way as getFile but creates or looks up a directory
  		* @param config Object
  		*/
  var getDirectory: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Requests a Directory from the Local File System
  		* @param config Object
  		*/
  var getEntry: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Creates or looks up a file
  		* @param config Object The object which contains the following config options:
  		*/
  var getFile: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Lists all the entries in the directory
  		* @param config Object The object which contains the following config options:
  		*/
  var readEntries: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Works the same way as Ext device filesystem Entry remove but removes the directory and all of its contents if any
  		* @param config Object
  		*/
  var removeRecursively: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

