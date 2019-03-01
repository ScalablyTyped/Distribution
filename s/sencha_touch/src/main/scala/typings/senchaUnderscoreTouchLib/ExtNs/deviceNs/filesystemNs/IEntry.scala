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

object IEntry {
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
    remove: js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit] = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IEntry = {
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
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IEntry]
  }
}

