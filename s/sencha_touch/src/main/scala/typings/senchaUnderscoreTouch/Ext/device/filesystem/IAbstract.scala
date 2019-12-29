package typings.senchaUnderscoreTouch.Ext.device.filesystem

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IBase
import typings.senchaUnderscoreTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAbstract extends IBase {
  /** [Method] Returns the value of fileSystemSize
  		* @returns Number
  		*/
  var getFileSystemSize: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of fileSystemType
  		* @returns Number
  		*/
  var getFileSystemType: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of readerType
  		* @returns String
  		*/
  var getReaderType: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of stringEncoding
  		* @returns String
  		*/
  var getStringEncoding: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Sets the value of fileSystemSize
  		* @param fileSystemSize Number The new value.
  		*/
  var setFileSystemSize: js.UndefOr[js.Function1[/* fileSystemSize */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of fileSystemType
  		* @param fileSystemType Number The new value.
  		*/
  var setFileSystemType: js.UndefOr[js.Function1[/* fileSystemType */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of readerType
  		* @param readerType String The new value.
  		*/
  var setReaderType: js.UndefOr[js.Function1[/* readerType */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of stringEncoding
  		* @param stringEncoding String The new value.
  		*/
  var setStringEncoding: js.UndefOr[js.Function1[/* stringEncoding */ js.UndefOr[String], Unit]] = js.undefined
}

object IAbstract {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    destroy: () => Unit = null,
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
    self: IClass = null,
    setFileSystemSize: /* fileSystemSize */ js.UndefOr[Double] => Unit = null,
    setFileSystemType: /* fileSystemType */ js.UndefOr[Double] => Unit = null,
    setReaderType: /* readerType */ js.UndefOr[String] => Unit = null,
    setStringEncoding: /* stringEncoding */ js.UndefOr[String] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IAbstract = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
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
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setFileSystemSize != null) __obj.updateDynamic("setFileSystemSize")(js.Any.fromFunction1(setFileSystemSize))
    if (setFileSystemType != null) __obj.updateDynamic("setFileSystemType")(js.Any.fromFunction1(setFileSystemType))
    if (setReaderType != null) __obj.updateDynamic("setReaderType")(js.Any.fromFunction1(setReaderType))
    if (setStringEncoding != null) __obj.updateDynamic("setStringEncoding")(js.Any.fromFunction1(setStringEncoding))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAbstract]
  }
}

