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

object IDirectoryEntry {
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
    getDirectory: js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit] = null,
    getEntry: js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit] = null,
    getFile: js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit] = null,
    getFileSystem: js.Function0[IFileSystem] = null,
    getFullPath: js.Function0[java.lang.String] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getName: js.Function0[java.lang.String] = null,
    getParent: js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    isDirectory: js.Function0[scala.Boolean] = null,
    isFile: js.Function0[scala.Boolean] = null,
    mixins: js.Any = null,
    moveTo: js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit] = null,
    platformConfig: js.Any = null,
    readEntries: js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit] = null,
    remove: js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit] = null,
    removeRecursively: js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit] = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IDirectoryEntry = {
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
    if (getDirectory != null) __obj.updateDynamic("getDirectory")(getDirectory)
    if (getEntry != null) __obj.updateDynamic("getEntry")(getEntry)
    if (getFile != null) __obj.updateDynamic("getFile")(getFile)
    if (getFileSystem != null) __obj.updateDynamic("getFileSystem")(getFileSystem)
    if (getFullPath != null) __obj.updateDynamic("getFullPath")(getFullPath)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getName != null) __obj.updateDynamic("getName")(getName)
    if (getParent != null) __obj.updateDynamic("getParent")(getParent)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (isDirectory != null) __obj.updateDynamic("isDirectory")(isDirectory)
    if (isFile != null) __obj.updateDynamic("isFile")(isFile)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (moveTo != null) __obj.updateDynamic("moveTo")(moveTo)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (readEntries != null) __obj.updateDynamic("readEntries")(readEntries)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (removeRecursively != null) __obj.updateDynamic("removeRecursively")(removeRecursively)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IDirectoryEntry]
  }
}

