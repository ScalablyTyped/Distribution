package typings.senchaUnderscoreTouch.Ext.device.filesystem

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileEntry extends IEntry {
  /** [Method] Requests a File Handle from the Local File System
  		* @param config Object
  		*/
  var getEntry: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Returns the byte offset into the file at which the next read write will occur
  		* @returns Number The file offset.
  		*/
  var getOffset: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Reads the data from the file starting at the file offset
  		* @param config Object The object which contains the following config options:
  		*/
  var read: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the byte offset into the file at which the next read write will occur
  		* @param config Object The object which contains the following config options:
  		*/
  var seek: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Truncates or extends the file to the specified size in bytes
  		* @param config Object The object which contains the following config options:
  		*/
  var truncate: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Writes the data to the file starting at the file offset
  		* @param config Object The object which contains the following config options:
  		*/
  var write: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object IFileEntry {
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
    getEntry: /* config */ js.UndefOr[js.Any] => Unit = null,
    getFileSystem: () => IFileSystem = null,
    getFullPath: () => String = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getName: () => String = null,
    getOffset: () => Double = null,
    getParent: /* config */ js.UndefOr[js.Any] => Unit = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    isDirectory: () => Boolean = null,
    isFile: () => Boolean = null,
    mixins: js.Any = null,
    moveTo: /* config */ js.UndefOr[js.Any] => Unit = null,
    platformConfig: js.Any = null,
    read: /* config */ js.UndefOr[js.Any] => Unit = null,
    remove: /* config */ js.UndefOr[js.Any] => Unit = null,
    seek: /* config */ js.UndefOr[js.Any] => Unit = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    truncate: /* config */ js.UndefOr[js.Any] => Unit = null,
    uses: Array = null,
    write: /* config */ js.UndefOr[js.Any] => Unit = null
  ): IFileEntry = {
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
    if (getEntry != null) __obj.updateDynamic("getEntry")(js.Any.fromFunction1(getEntry))
    if (getFileSystem != null) __obj.updateDynamic("getFileSystem")(js.Any.fromFunction0(getFileSystem))
    if (getFullPath != null) __obj.updateDynamic("getFullPath")(js.Any.fromFunction0(getFullPath))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getName != null) __obj.updateDynamic("getName")(js.Any.fromFunction0(getName))
    if (getOffset != null) __obj.updateDynamic("getOffset")(js.Any.fromFunction0(getOffset))
    if (getParent != null) __obj.updateDynamic("getParent")(js.Any.fromFunction1(getParent))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (isDirectory != null) __obj.updateDynamic("isDirectory")(js.Any.fromFunction0(isDirectory))
    if (isFile != null) __obj.updateDynamic("isFile")(js.Any.fromFunction0(isFile))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (moveTo != null) __obj.updateDynamic("moveTo")(js.Any.fromFunction1(moveTo))
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(js.Any.fromFunction1(read))
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction1(remove))
    if (seek != null) __obj.updateDynamic("seek")(js.Any.fromFunction1(seek))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (truncate != null) __obj.updateDynamic("truncate")(js.Any.fromFunction1(truncate))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (write != null) __obj.updateDynamic("write")(js.Any.fromFunction1(write))
    __obj.asInstanceOf[IFileEntry]
  }
}

