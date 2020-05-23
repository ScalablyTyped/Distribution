package typings.senchaTouch.Ext.device.filesystem

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDirectoryEntry extends IEntry {
  /** [Method] Works the same way as getFile but creates or looks up a directory
    * @param config Object
    */
  var getDirectory: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Requests a Directory from the Local File System
    * @param config Object
    */
  var getEntry: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Creates or looks up a file
    * @param config Object The object which contains the following config options:
    */
  var getFile: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Lists all the entries in the directory
    * @param config Object The object which contains the following config options:
    */
  var readEntries: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Works the same way as Ext device filesystem Entry remove but removes the directory and all of its contents if any
    * @param config Object
    */
  var removeRecursively: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object IDirectoryEntry {
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
    getDirectory: /* config */ js.UndefOr[js.Any] => Unit = null,
    getEntry: /* config */ js.UndefOr[js.Any] => Unit = null,
    getFile: /* config */ js.UndefOr[js.Any] => Unit = null,
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
    readEntries: /* config */ js.UndefOr[js.Any] => Unit = null,
    remove: /* config */ js.UndefOr[js.Any] => Unit = null,
    removeRecursively: /* config */ js.UndefOr[js.Any] => Unit = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IDirectoryEntry = {
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
    if (getDirectory != null) __obj.updateDynamic("getDirectory")(js.Any.fromFunction1(getDirectory))
    if (getEntry != null) __obj.updateDynamic("getEntry")(js.Any.fromFunction1(getEntry))
    if (getFile != null) __obj.updateDynamic("getFile")(js.Any.fromFunction1(getFile))
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
    if (readEntries != null) __obj.updateDynamic("readEntries")(js.Any.fromFunction1(readEntries))
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction1(remove))
    if (removeRecursively != null) __obj.updateDynamic("removeRecursively")(js.Any.fromFunction1(removeRecursively))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.get.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDirectoryEntry]
  }
}

