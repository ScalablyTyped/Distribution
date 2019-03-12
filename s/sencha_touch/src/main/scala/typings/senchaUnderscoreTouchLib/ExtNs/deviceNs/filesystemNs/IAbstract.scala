package typings
package senchaUnderscoreTouchLib.ExtNs.deviceNs.filesystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAbstract
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Method] Returns the value of fileSystemSize
  		* @returns Number
  		*/
  var getFileSystemSize: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of fileSystemType
  		* @returns Number
  		*/
  var getFileSystemType: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of readerType
  		* @returns String
  		*/
  var getReaderType: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of stringEncoding
  		* @returns String
  		*/
  var getStringEncoding: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Sets the value of fileSystemSize
  		* @param fileSystemSize Number The new value.
  		*/
  var setFileSystemSize: js.UndefOr[js.Function1[/* fileSystemSize */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of fileSystemType
  		* @param fileSystemType Number The new value.
  		*/
  var setFileSystemType: js.UndefOr[js.Function1[/* fileSystemType */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of readerType
  		* @param readerType String The new value.
  		*/
  var setReaderType: js.UndefOr[js.Function1[/* readerType */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of stringEncoding
  		* @param stringEncoding String The new value.
  		*/
  var setStringEncoding: js.UndefOr[js.Function1[/* stringEncoding */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
}

object IAbstract {
  @scala.inline
  def apply(
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    destroy: () => scala.Unit = null,
    extend: java.lang.String = null,
    getFileSystemSize: () => scala.Double = null,
    getFileSystemType: () => scala.Double = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getReaderType: () => java.lang.String = null,
    getStringEncoding: () => java.lang.String = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setFileSystemSize: /* fileSystemSize */ js.UndefOr[scala.Double] => scala.Unit = null,
    setFileSystemType: /* fileSystemType */ js.UndefOr[scala.Double] => scala.Unit = null,
    setReaderType: /* readerType */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setStringEncoding: /* stringEncoding */ js.UndefOr[java.lang.String] => scala.Unit = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IAbstract = {
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
    if (self != null) __obj.updateDynamic("self")(self)
    if (setFileSystemSize != null) __obj.updateDynamic("setFileSystemSize")(js.Any.fromFunction1(setFileSystemSize))
    if (setFileSystemType != null) __obj.updateDynamic("setFileSystemType")(js.Any.fromFunction1(setFileSystemType))
    if (setReaderType != null) __obj.updateDynamic("setReaderType")(js.Any.fromFunction1(setReaderType))
    if (setStringEncoding != null) __obj.updateDynamic("setStringEncoding")(js.Any.fromFunction1(setStringEncoding))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IAbstract]
  }
}

