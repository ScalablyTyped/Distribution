package typings.senchaTouch.Ext.device.filesystem

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPhoneGap extends IHTML5 {
  /** [Method] Downloads a file from the server saving it into the Local File System
  		* @param config Object
  		* @returns FileTransfer
  		*/
  var download: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method]
  		* @param config Object
  		*/
  var readMetadata: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Send a file to a server
  		* @param config Object
  		* @returns FileTransfer
  		*/
  var upload: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method]
  		* @param config Object
  		*/
  var writeMetadata: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object IPhoneGap {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    destroy: () => Unit = null,
    download: /* config */ js.UndefOr[js.Any] => _ = null,
    extend: String = null,
    getFileSystemSize: () => Double = null,
    getFileSystemType: () => Double = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getReaderType: () => String = null,
    getStringEncoding: () => String = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    readMetadata: /* config */ js.UndefOr[js.Any] => Unit = null,
    requestFileSystem: /* config */ js.UndefOr[js.Any] => Unit = null,
    self: IClass = null,
    setFileSystemSize: /* fileSystemSize */ js.UndefOr[Double] => Unit = null,
    setFileSystemType: /* fileSystemType */ js.UndefOr[Double] => Unit = null,
    setReaderType: /* readerType */ js.UndefOr[String] => Unit = null,
    setStringEncoding: /* stringEncoding */ js.UndefOr[String] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    upload: /* config */ js.UndefOr[js.Any] => _ = null,
    uses: Array = null,
    writeMetadata: /* config */ js.UndefOr[js.Any] => Unit = null
  ): IPhoneGap = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (download != null) __obj.updateDynamic("download")(js.Any.fromFunction1(download))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getFileSystemSize != null) __obj.updateDynamic("getFileSystemSize")(js.Any.fromFunction0(getFileSystemSize))
    if (getFileSystemType != null) __obj.updateDynamic("getFileSystemType")(js.Any.fromFunction0(getFileSystemType))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getReaderType != null) __obj.updateDynamic("getReaderType")(js.Any.fromFunction0(getReaderType))
    if (getStringEncoding != null) __obj.updateDynamic("getStringEncoding")(js.Any.fromFunction0(getStringEncoding))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (readMetadata != null) __obj.updateDynamic("readMetadata")(js.Any.fromFunction1(readMetadata))
    if (requestFileSystem != null) __obj.updateDynamic("requestFileSystem")(js.Any.fromFunction1(requestFileSystem))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setFileSystemSize != null) __obj.updateDynamic("setFileSystemSize")(js.Any.fromFunction1(setFileSystemSize))
    if (setFileSystemType != null) __obj.updateDynamic("setFileSystemType")(js.Any.fromFunction1(setFileSystemType))
    if (setReaderType != null) __obj.updateDynamic("setReaderType")(js.Any.fromFunction1(setReaderType))
    if (setStringEncoding != null) __obj.updateDynamic("setStringEncoding")(js.Any.fromFunction1(setStringEncoding))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (upload != null) __obj.updateDynamic("upload")(js.Any.fromFunction1(upload))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (writeMetadata != null) __obj.updateDynamic("writeMetadata")(js.Any.fromFunction1(writeMetadata))
    __obj.asInstanceOf[IPhoneGap]
  }
}

