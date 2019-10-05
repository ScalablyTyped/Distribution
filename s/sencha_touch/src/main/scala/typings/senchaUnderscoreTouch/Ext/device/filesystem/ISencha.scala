package typings.senchaUnderscoreTouch.Ext.device.filesystem

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISencha extends IAbstract {
  /** [Method] Requests a Ext device filesystem FileSystem instance
  		* @param config Object The object which contains the following config options:
  		*/
  var requestFileSystem: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object ISencha {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    destroy: () => Unit = null,
    extend: java.lang.String = null,
    getFileSystemSize: () => Double = null,
    getFileSystemType: () => Double = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getReaderType: () => java.lang.String = null,
    getStringEncoding: () => java.lang.String = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    requestFileSystem: /* config */ js.UndefOr[js.Any] => Unit = null,
    self: IClass = null,
    setFileSystemSize: /* fileSystemSize */ js.UndefOr[Double] => Unit = null,
    setFileSystemType: /* fileSystemType */ js.UndefOr[Double] => Unit = null,
    setReaderType: /* readerType */ js.UndefOr[java.lang.String] => Unit = null,
    setStringEncoding: /* stringEncoding */ js.UndefOr[java.lang.String] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): ISencha = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getFileSystemSize != null) __obj.updateDynamic("getFileSystemSize")(js.Any.fromFunction0(getFileSystemSize))
    if (getFileSystemType != null) __obj.updateDynamic("getFileSystemType")(js.Any.fromFunction0(getFileSystemType))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getReaderType != null) __obj.updateDynamic("getReaderType")(js.Any.fromFunction0(getReaderType))
    if (getStringEncoding != null) __obj.updateDynamic("getStringEncoding")(js.Any.fromFunction0(getStringEncoding))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (requestFileSystem != null) __obj.updateDynamic("requestFileSystem")(js.Any.fromFunction1(requestFileSystem))
    if (self != null) __obj.updateDynamic("self")(self)
    if (setFileSystemSize != null) __obj.updateDynamic("setFileSystemSize")(js.Any.fromFunction1(setFileSystemSize))
    if (setFileSystemType != null) __obj.updateDynamic("setFileSystemType")(js.Any.fromFunction1(setFileSystemType))
    if (setReaderType != null) __obj.updateDynamic("setReaderType")(js.Any.fromFunction1(setReaderType))
    if (setStringEncoding != null) __obj.updateDynamic("setStringEncoding")(js.Any.fromFunction1(setStringEncoding))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[ISencha]
  }
}

