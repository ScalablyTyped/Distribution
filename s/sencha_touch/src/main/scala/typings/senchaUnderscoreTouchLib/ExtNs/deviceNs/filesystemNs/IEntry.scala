package typings
package senchaUnderscoreTouchLib.ExtNs.deviceNs.filesystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEntry
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Method] Works the same way as moveTo but copies the entry
  		* @param config Object
  		*/
  var copyTo: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Returns the file system on which the entry resides
  		* @returns Ext.device.filesystem.FileSystem The entry file system.
  		*/
  var getFileSystem: js.UndefOr[js.Function0[IFileSystem]] = js.undefined
  /** [Method] Returns the full absolute path from the root to the entry
  		* @returns String The entry full path.
  		*/
  var getFullPath: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the name of the entry excluding the path leading to it
  		* @returns String The entry name.
  		*/
  var getName: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Looks up the parent directory containing the entry
  		* @param config Object The object which contains the following config options:
  		*/
  var getParent: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Returns whether the entry is a directory
  		* @returns Boolean The entry is a directory.
  		*/
  var isDirectory: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns whether the entry is a file
  		* @returns Boolean The entry is a file.
  		*/
  var isFile: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Moves the entry to a different location on the file system
  		* @param config Object The object which contains the following config options:
  		*/
  var moveTo: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Removes the entry from the file system
  		* @param config Object The object which contains the following config options:
  		*/
  var remove: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

