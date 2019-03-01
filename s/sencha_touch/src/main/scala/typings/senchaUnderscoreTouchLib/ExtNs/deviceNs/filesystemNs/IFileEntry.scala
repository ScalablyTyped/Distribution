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

object IFileEntry {
  @scala.inline
  def apply(
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    copyTo: js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit] = null,
    destroy: js.Function0[scala.Unit] = null,
    extend: java.lang.String = null,
    getEntry: js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit] = null,
    getFileSystem: js.Function0[IFileSystem] = null,
    getFullPath: js.Function0[java.lang.String] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getName: js.Function0[java.lang.String] = null,
    getOffset: js.Function0[scala.Double] = null,
    getParent: js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    isDirectory: js.Function0[scala.Boolean] = null,
    isFile: js.Function0[scala.Boolean] = null,
    mixins: js.Any = null,
    moveTo: js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit] = null,
    platformConfig: js.Any = null,
    read: js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit] = null,
    remove: js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit] = null,
    seek: js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit] = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    truncate: js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit] = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null,
    write: js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit] = null
  ): IFileEntry = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (copyTo != null) __obj.updateDynamic("copyTo")(copyTo)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getEntry != null) __obj.updateDynamic("getEntry")(getEntry)
    if (getFileSystem != null) __obj.updateDynamic("getFileSystem")(getFileSystem)
    if (getFullPath != null) __obj.updateDynamic("getFullPath")(getFullPath)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getName != null) __obj.updateDynamic("getName")(getName)
    if (getOffset != null) __obj.updateDynamic("getOffset")(getOffset)
    if (getParent != null) __obj.updateDynamic("getParent")(getParent)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (isDirectory != null) __obj.updateDynamic("isDirectory")(isDirectory)
    if (isFile != null) __obj.updateDynamic("isFile")(isFile)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (moveTo != null) __obj.updateDynamic("moveTo")(moveTo)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (read != null) __obj.updateDynamic("read")(read)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (seek != null) __obj.updateDynamic("seek")(seek)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (truncate != null) __obj.updateDynamic("truncate")(truncate)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (write != null) __obj.updateDynamic("write")(write)
    __obj.asInstanceOf[IFileEntry]
  }
}

