package typings.senchaUnderscoreTouch.Ext.device.filesystem

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IBase
import typings.senchaUnderscoreTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEntry extends IBase {
  /** [Method] Works the same way as moveTo but copies the entry
  		* @param config Object
  		*/
  var copyTo: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Returns the file system on which the entry resides
  		* @returns Ext.device.filesystem.FileSystem The entry file system.
  		*/
  var getFileSystem: js.UndefOr[js.Function0[IFileSystem]] = js.undefined
  /** [Method] Returns the full absolute path from the root to the entry
  		* @returns String The entry full path.
  		*/
  var getFullPath: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the name of the entry excluding the path leading to it
  		* @returns String The entry name.
  		*/
  var getName: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Looks up the parent directory containing the entry
  		* @param config Object The object which contains the following config options:
  		*/
  var getParent: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Returns whether the entry is a directory
  		* @returns Boolean The entry is a directory.
  		*/
  var isDirectory: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns whether the entry is a file
  		* @returns Boolean The entry is a file.
  		*/
  var isFile: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Moves the entry to a different location on the file system
  		* @param config Object The object which contains the following config options:
  		*/
  var moveTo: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Removes the entry from the file system
  		* @param config Object The object which contains the following config options:
  		*/
  var remove: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object IEntry {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    copyTo: /* config */ js.UndefOr[js.Any] => Unit = null,
    destroy: () => Unit = null,
    extend: String = null,
    getFileSystem: () => IFileSystem = null,
    getFullPath: () => String = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getName: () => String = null,
    getParent: /* config */ js.UndefOr[js.Any] => Unit = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    isDirectory: () => Boolean = null,
    isFile: () => Boolean = null,
    mixins: js.Any = null,
    moveTo: /* config */ js.UndefOr[js.Any] => Unit = null,
    platformConfig: js.Any = null,
    remove: /* config */ js.UndefOr[js.Any] => Unit = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IEntry = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (copyTo != null) __obj.updateDynamic("copyTo")(js.Any.fromFunction1(copyTo))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getFileSystem != null) __obj.updateDynamic("getFileSystem")(js.Any.fromFunction0(getFileSystem))
    if (getFullPath != null) __obj.updateDynamic("getFullPath")(js.Any.fromFunction0(getFullPath))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getName != null) __obj.updateDynamic("getName")(js.Any.fromFunction0(getName))
    if (getParent != null) __obj.updateDynamic("getParent")(js.Any.fromFunction1(getParent))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (isDirectory != null) __obj.updateDynamic("isDirectory")(js.Any.fromFunction0(isDirectory))
    if (isFile != null) __obj.updateDynamic("isFile")(js.Any.fromFunction0(isFile))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (moveTo != null) __obj.updateDynamic("moveTo")(js.Any.fromFunction1(moveTo))
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction1(remove))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntry]
  }
}

