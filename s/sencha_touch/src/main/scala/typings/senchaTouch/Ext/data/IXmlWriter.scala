package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlWriter
  extends typings.senchaTouch.Ext.data.writer.IWriter {
  /** [Config Option] (String) */
  var defaultDocumentRoot: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var documentRoot: js.UndefOr[String] = js.undefined
  /** [Method] Returns the value of defaultDocumentRoot
  		* @returns String
  		*/
  var getDefaultDocumentRoot: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of documentRoot
  		* @returns String
  		*/
  var getDocumentRoot: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of header
  		* @returns String
  		*/
  var getHeader: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of record
  		* @returns String
  		*/
  var getRecord: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Config Option] (String) */
  var header: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var record: js.UndefOr[String] = js.undefined
  /** [Method] Sets the value of defaultDocumentRoot
  		* @param defaultDocumentRoot String The new value.
  		*/
  var setDefaultDocumentRoot: js.UndefOr[js.Function1[/* defaultDocumentRoot */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of documentRoot
  		* @param documentRoot String The new value.
  		*/
  var setDocumentRoot: js.UndefOr[js.Function1[/* documentRoot */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of header
  		* @param header String The new value.
  		*/
  var setHeader: js.UndefOr[js.Function1[/* header */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of record
  		* @param record String The new value.
  		*/
  var setRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method]
  		* @param request Object
  		* @param data Array
  		* @returns Object
  		*/
  var writeRecords: js.UndefOr[js.Function2[/* request */ js.UndefOr[js.Any], /* data */ js.UndefOr[Array], _]] = js.undefined
}

object IXmlWriter {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    defaultDocumentRoot: String = null,
    destroy: () => Unit = null,
    documentRoot: String = null,
    extend: String = null,
    getDefaultDocumentRoot: () => String = null,
    getDocumentRoot: () => String = null,
    getHeader: () => String = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getNameProperty: () => String = null,
    getRecord: () => String = null,
    getRecordData: /* record */ js.UndefOr[js.Any] => _ = null,
    getWriteAllFields: () => Boolean = null,
    header: String = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    nameProperty: String = null,
    platformConfig: js.Any = null,
    record: String = null,
    self: IClass = null,
    setDefaultDocumentRoot: /* defaultDocumentRoot */ js.UndefOr[String] => Unit = null,
    setDocumentRoot: /* documentRoot */ js.UndefOr[String] => Unit = null,
    setHeader: /* header */ js.UndefOr[String] => Unit = null,
    setNameProperty: /* nameProperty */ js.UndefOr[String] => Unit = null,
    setRecord: /* record */ js.UndefOr[String] => Unit = null,
    setWriteAllFields: /* writeAllFields */ js.UndefOr[Boolean] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null,
    write: /* request */ js.UndefOr[IRequest] => IRequest = null,
    writeAllFields: js.UndefOr[Boolean] = js.undefined,
    writeRecords: (/* request */ js.UndefOr[js.Any], /* data */ js.UndefOr[Array]) => _ = null
  ): IXmlWriter = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (defaultDocumentRoot != null) __obj.updateDynamic("defaultDocumentRoot")(defaultDocumentRoot.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (documentRoot != null) __obj.updateDynamic("documentRoot")(documentRoot.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getDefaultDocumentRoot != null) __obj.updateDynamic("getDefaultDocumentRoot")(js.Any.fromFunction0(getDefaultDocumentRoot))
    if (getDocumentRoot != null) __obj.updateDynamic("getDocumentRoot")(js.Any.fromFunction0(getDocumentRoot))
    if (getHeader != null) __obj.updateDynamic("getHeader")(js.Any.fromFunction0(getHeader))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getNameProperty != null) __obj.updateDynamic("getNameProperty")(js.Any.fromFunction0(getNameProperty))
    if (getRecord != null) __obj.updateDynamic("getRecord")(js.Any.fromFunction0(getRecord))
    if (getRecordData != null) __obj.updateDynamic("getRecordData")(js.Any.fromFunction1(getRecordData))
    if (getWriteAllFields != null) __obj.updateDynamic("getWriteAllFields")(js.Any.fromFunction0(getWriteAllFields))
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (nameProperty != null) __obj.updateDynamic("nameProperty")(nameProperty.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (record != null) __obj.updateDynamic("record")(record.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setDefaultDocumentRoot != null) __obj.updateDynamic("setDefaultDocumentRoot")(js.Any.fromFunction1(setDefaultDocumentRoot))
    if (setDocumentRoot != null) __obj.updateDynamic("setDocumentRoot")(js.Any.fromFunction1(setDocumentRoot))
    if (setHeader != null) __obj.updateDynamic("setHeader")(js.Any.fromFunction1(setHeader))
    if (setNameProperty != null) __obj.updateDynamic("setNameProperty")(js.Any.fromFunction1(setNameProperty))
    if (setRecord != null) __obj.updateDynamic("setRecord")(js.Any.fromFunction1(setRecord))
    if (setWriteAllFields != null) __obj.updateDynamic("setWriteAllFields")(js.Any.fromFunction1(setWriteAllFields))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (write != null) __obj.updateDynamic("write")(js.Any.fromFunction1(write))
    if (!js.isUndefined(writeAllFields)) __obj.updateDynamic("writeAllFields")(writeAllFields.asInstanceOf[js.Any])
    if (writeRecords != null) __obj.updateDynamic("writeRecords")(js.Any.fromFunction2(writeRecords))
    __obj.asInstanceOf[IXmlWriter]
  }
}

