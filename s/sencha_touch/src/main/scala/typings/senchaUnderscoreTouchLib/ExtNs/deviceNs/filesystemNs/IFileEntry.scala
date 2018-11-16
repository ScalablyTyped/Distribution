package typings
package senchaUnderscoreTouchLib.ExtNs.deviceNs.filesystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IFileEntry extends IEntry {
  /** [Method] Requests a File Handle from the Local File System
  		* @param config Object
  		*/
  var getEntry: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Returns the byte offset into the file at which the next read write will occur
  		* @returns Number The file offset.
  		*/
  var getOffset: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Reads the data from the file starting at the file offset
  		* @param config Object The object which contains the following config options:
  		*/
  var read: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the byte offset into the file at which the next read write will occur
  		* @param config Object The object which contains the following config options:
  		*/
  var seek: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Truncates or extends the file to the specified size in bytes
  		* @param config Object The object which contains the following config options:
  		*/
  var truncate: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Writes the data to the file starting at the file offset
  		* @param config Object The object which contains the following config options:
  		*/
  var write: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

