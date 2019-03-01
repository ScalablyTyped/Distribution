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
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    extend: java.lang.String = null,
    getFileSystemSize: js.Function0[scala.Double] = null,
    getFileSystemType: js.Function0[scala.Double] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getReaderType: js.Function0[java.lang.String] = null,
    getStringEncoding: js.Function0[java.lang.String] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setFileSystemSize: js.Function1[/* fileSystemSize */ js.UndefOr[scala.Double], scala.Unit] = null,
    setFileSystemType: js.Function1[/* fileSystemType */ js.UndefOr[scala.Double], scala.Unit] = null,
    setReaderType: js.Function1[/* readerType */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setStringEncoding: js.Function1[/* stringEncoding */ js.UndefOr[java.lang.String], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IAbstract = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getFileSystemSize != null) __obj.updateDynamic("getFileSystemSize")(getFileSystemSize)
    if (getFileSystemType != null) __obj.updateDynamic("getFileSystemType")(getFileSystemType)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getReaderType != null) __obj.updateDynamic("getReaderType")(getReaderType)
    if (getStringEncoding != null) __obj.updateDynamic("getStringEncoding")(getStringEncoding)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setFileSystemSize != null) __obj.updateDynamic("setFileSystemSize")(setFileSystemSize)
    if (setFileSystemType != null) __obj.updateDynamic("setFileSystemType")(setFileSystemType)
    if (setReaderType != null) __obj.updateDynamic("setReaderType")(setReaderType)
    if (setStringEncoding != null) __obj.updateDynamic("setStringEncoding")(setStringEncoding)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IAbstract]
  }
}

