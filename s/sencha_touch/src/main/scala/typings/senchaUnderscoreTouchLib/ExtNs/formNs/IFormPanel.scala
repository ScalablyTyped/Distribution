package typings
package senchaUnderscoreTouchLib.ExtNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFormPanel
  extends senchaUnderscoreTouchLib.ExtNs.IPanel {
  /** [Config Option] (Object) */
  var api: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var baseParams: js.UndefOr[js.Any] = js.undefined
  /** [Method] A convenient method to disable all fields in this form
  		* @param newDisabled Object
  		* @returns Ext.form.Panel This form.
  		*/
  var doSetDisabled: js.UndefOr[js.Function1[/* newDisabled */ js.UndefOr[js.Any], IPanel]] = js.undefined
  /** [Config Option] (Boolean) */
  var enableSubmissionForm: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Object) */
  var enctype: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of api
  		* @returns Object
  		*/
  var getApi: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of baseParams
  		* @returns Object
  		*/
  var getBaseParams: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of enableSubmissionForm
  		* @returns Boolean
  		*/
  var getEnableSubmissionForm: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of enctype
  		* @returns Object
  		*/
  var getEnctype: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of method
  		* @returns String
  		*/
  var getMethod: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of multipartDetection
  		* @returns Boolean
  		*/
  var getMultipartDetection: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of paramOrder
  		* @returns String/String[]
  		*/
  var getParamOrder: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of paramsAsHash
  		* @returns Boolean
  		*/
  var getParamsAsHash: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of standardSubmit
  		* @returns Boolean
  		*/
  var getStandardSubmit: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of submitOnAction
  		* @returns Object
  		*/
  var getSubmitOnAction: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of timeout
  		* @returns Number
  		*/
  var getTimeout: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of trackResetOnLoad
  		* @returns Boolean
  		*/
  var getTrackResetOnLoad: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of url
  		* @returns String
  		*/
  var getUrl: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns an object containing the value of each field in the form keyed to the field s name
  		* @param enabled Boolean true to return only enabled fields.
  		* @param all Boolean true to return all fields even if they don't have a name configured.
  		* @returns Object Object mapping field name to its value.
  		*/
  var getValues: js.UndefOr[
    js.Function2[/* enabled */ js.UndefOr[scala.Boolean], /* all */ js.UndefOr[scala.Boolean], _]
  ] = js.undefined
  /** [Method] Hides a previously shown wait mask See showMask
  		* @returns Ext.form.Panel this
  		*/
  var hideMask: js.UndefOr[js.Function0[IPanel]] = js.undefined
  /** [Method] Performs an Ajax or Ext Direct call to load values for this form
  		* @param options Object The configuration when loading this form. The following are the configurations when loading via Ajax only:
  		* @returns Ext.data.Connection The request object.
  		*/
  var load: js.UndefOr[
    js.Function1[
      /* options */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.dataNs.IConnection
    ]
  ] = js.undefined
  /** [Method] Loads matching fields from a model instance into this form
  		* @param record Ext.data.Model The model instance.
  		* @returns Ext.form.Panel This form.
  		*/
  var loadModel: js.UndefOr[
    js.Function1[/* record */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IModel], IPanel]
  ] = js.undefined
  /** [Method] Loads matching fields from a model instance into this form
  		* @param record Ext.data.Model The model instance.
  		* @returns Ext.form.Panel This form.
  		*/
  var loadRecord: js.UndefOr[
    js.Function1[/* record */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IModel], IPanel]
  ] = js.undefined
  /** [Config Option] (String) */
  var method: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var multipartDetection: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String/String[]) */
  var paramOrder: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var paramsAsHash: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Resets all fields in the form back to their original values
  		* @returns Ext.form.Panel This form.
  		*/
  var reset: js.UndefOr[js.Function0[IPanel]] = js.undefined
  /** [Method] Sets the value of api
  		* @param api Object The new value.
  		*/
  var setApi: js.UndefOr[js.Function1[/* api */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of baseParams
  		* @param baseParams Object The new value.
  		*/
  var setBaseParams: js.UndefOr[js.Function1[/* baseParams */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of enableSubmissionForm
  		* @param enableSubmissionForm Boolean The new value.
  		*/
  var setEnableSubmissionForm: js.UndefOr[js.Function1[/* enableSubmissionForm */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of enctype
  		* @param enctype Object The new value.
  		*/
  var setEnctype: js.UndefOr[js.Function1[/* enctype */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of method
  		* @param method String The new value.
  		*/
  var setMethod: js.UndefOr[js.Function1[/* method */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of multipartDetection
  		* @param multipartDetection Boolean The new value.
  		*/
  var setMultipartDetection: js.UndefOr[js.Function1[/* multipartDetection */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of paramOrder
  		* @param paramOrder String/String[] The new value.
  		*/
  var setParamOrder: js.UndefOr[js.Function1[/* paramOrder */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of paramsAsHash
  		* @param paramsAsHash Boolean The new value.
  		*/
  var setParamsAsHash: js.UndefOr[js.Function1[/* paramsAsHash */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Loads matching fields from a model instance into this form
  		* @param record Ext.data.Model The model instance.
  		* @returns Ext.form.Panel This form.
  		*/
  @JSName("setRecord")
  var setRecord_IFormPanel: js.UndefOr[
    js.Function1[/* record */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IModel], IPanel]
  ] = js.undefined
  /** [Method] Sets the value of standardSubmit
  		* @param standardSubmit Boolean The new value.
  		*/
  var setStandardSubmit: js.UndefOr[js.Function1[/* standardSubmit */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of submitOnAction
  		* @param submitOnAction Object The new value.
  		*/
  var setSubmitOnAction: js.UndefOr[js.Function1[/* submitOnAction */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of timeout
  		* @param timeout Number The new value.
  		*/
  var setTimeout: js.UndefOr[js.Function1[/* timeout */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of trackResetOnLoad
  		* @param trackResetOnLoad Boolean The new value.
  		*/
  var setTrackResetOnLoad: js.UndefOr[js.Function1[/* trackResetOnLoad */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of url
  		* @param url String The new value.
  		*/
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the values of form fields in bulk
  		* @param values Object field name => value mapping object.
  		* @returns Ext.form.Panel This form.
  		*/
  var setValues: js.UndefOr[js.Function1[/* values */ js.UndefOr[js.Any], IPanel]] = js.undefined
  /** [Method] Shows a generic custom mask over a designated Element
  		* @param cfg String/Object Either a string message or a configuration object supporting the following options: {  message : 'Please Wait',  cls : 'form-mask' }
  		* @param target Object
  		* @returns Ext.form.Panel This form
  		*/
  var showMask: js.UndefOr[
    js.Function2[/* cfg */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any], IPanel]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var standardSubmit: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Performs a Ajax based submission of form values if standardSubmit is false or otherwise executes a standard HTML Fo
  		* @param options Object The configuration when submitting this form. The following are the configurations when submitting via Ajax only:
  		* @returns Ext.data.Connection The request object if the standardSubmit config is false. If the standardSubmit config is true, then the return value is undefined.
  		*/
  var submit: js.UndefOr[
    js.Function1[
      /* options */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.dataNs.IConnection
    ]
  ] = js.undefined
  /** [Config Option] (Object) */
  var submitOnAction: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean) */
  var trackResetOnLoad: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Ext.dom.Element) */
  var waitMsgTarget: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.domNs.IElement] = js.undefined
  /** [Config Option] (Ext.XTemplate/String/String[]) */
  var waitTpl: js.UndefOr[js.Any] = js.undefined
}

object IFormPanel {
  @scala.inline
  def apply(
    IPanel: senchaUnderscoreTouchLib.ExtNs.IPanel = null,
    api: js.Any = null,
    baseCls: java.lang.String = null,
    baseParams: js.Any = null,
    doSetDisabled: /* newDisabled */ js.UndefOr[js.Any] => IPanel = null,
    enableSubmissionForm: js.UndefOr[scala.Boolean] = js.undefined,
    enctype: js.Any = null,
    getApi: () => _ = null,
    getBaseCls: () => java.lang.String = null,
    getBaseParams: () => _ = null,
    getEnableSubmissionForm: () => scala.Boolean = null,
    getEnctype: () => _ = null,
    getMethod: () => java.lang.String = null,
    getMultipartDetection: () => scala.Boolean = null,
    getParamOrder: () => _ = null,
    getParamsAsHash: () => scala.Boolean = null,
    getRecord: () => senchaUnderscoreTouchLib.ExtNs.dataNs.IModel = null,
    getStandardSubmit: () => scala.Boolean = null,
    getSubmitOnAction: () => _ = null,
    getTimeout: () => scala.Double = null,
    getTrackResetOnLoad: () => scala.Boolean = null,
    getUrl: () => java.lang.String = null,
    getValues: (/* enabled */ js.UndefOr[scala.Boolean], /* all */ js.UndefOr[scala.Boolean]) => _ = null,
    hideMask: () => IPanel = null,
    load: /* options */ js.UndefOr[js.Any] => senchaUnderscoreTouchLib.ExtNs.dataNs.IConnection = null,
    loadModel: /* record */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IModel] => IPanel = null,
    loadRecord: /* record */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IModel] => IPanel = null,
    method: java.lang.String = null,
    multipartDetection: js.UndefOr[scala.Boolean] = js.undefined,
    paramOrder: js.Any = null,
    paramsAsHash: js.UndefOr[scala.Boolean] = js.undefined,
    record: senchaUnderscoreTouchLib.ExtNs.dataNs.IModel = null,
    reset: () => IPanel = null,
    scrollable: js.Any = null,
    setApi: /* api */ js.UndefOr[js.Any] => scala.Unit = null,
    setBaseCls: /* baseCls */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setBaseParams: /* baseParams */ js.UndefOr[js.Any] => scala.Unit = null,
    setEnableSubmissionForm: /* enableSubmissionForm */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setEnctype: /* enctype */ js.UndefOr[js.Any] => scala.Unit = null,
    setMethod: /* method */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setMultipartDetection: /* multipartDetection */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setParamOrder: /* paramOrder */ js.UndefOr[js.Any] => scala.Unit = null,
    setParamsAsHash: /* paramsAsHash */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setRecord: /* record */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IModel] => IPanel = null,
    setStandardSubmit: /* standardSubmit */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setSubmitOnAction: /* submitOnAction */ js.UndefOr[js.Any] => scala.Unit = null,
    setTimeout: /* timeout */ js.UndefOr[scala.Double] => scala.Unit = null,
    setTrackResetOnLoad: /* trackResetOnLoad */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setUrl: /* url */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setValues: /* values */ js.UndefOr[js.Any] => IPanel = null,
    showMask: (/* cfg */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any]) => IPanel = null,
    standardSubmit: js.UndefOr[scala.Boolean] = js.undefined,
    submit: /* options */ js.UndefOr[js.Any] => senchaUnderscoreTouchLib.ExtNs.dataNs.IConnection = null,
    submitOnAction: js.Any = null,
    timeout: scala.Int | scala.Double = null,
    trackResetOnLoad: js.UndefOr[scala.Boolean] = js.undefined,
    url: java.lang.String = null,
    waitMsgTarget: senchaUnderscoreTouchLib.ExtNs.domNs.IElement = null,
    waitTpl: js.Any = null
  ): IFormPanel = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IPanel)
    if (api != null) __obj.updateDynamic("api")(api)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (baseParams != null) __obj.updateDynamic("baseParams")(baseParams)
    if (doSetDisabled != null) __obj.updateDynamic("doSetDisabled")(js.Any.fromFunction1(doSetDisabled))
    if (!js.isUndefined(enableSubmissionForm)) __obj.updateDynamic("enableSubmissionForm")(enableSubmissionForm)
    if (enctype != null) __obj.updateDynamic("enctype")(enctype)
    if (getApi != null) __obj.updateDynamic("getApi")(js.Any.fromFunction0(getApi))
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(js.Any.fromFunction0(getBaseCls))
    if (getBaseParams != null) __obj.updateDynamic("getBaseParams")(js.Any.fromFunction0(getBaseParams))
    if (getEnableSubmissionForm != null) __obj.updateDynamic("getEnableSubmissionForm")(js.Any.fromFunction0(getEnableSubmissionForm))
    if (getEnctype != null) __obj.updateDynamic("getEnctype")(js.Any.fromFunction0(getEnctype))
    if (getMethod != null) __obj.updateDynamic("getMethod")(js.Any.fromFunction0(getMethod))
    if (getMultipartDetection != null) __obj.updateDynamic("getMultipartDetection")(js.Any.fromFunction0(getMultipartDetection))
    if (getParamOrder != null) __obj.updateDynamic("getParamOrder")(js.Any.fromFunction0(getParamOrder))
    if (getParamsAsHash != null) __obj.updateDynamic("getParamsAsHash")(js.Any.fromFunction0(getParamsAsHash))
    if (getRecord != null) __obj.updateDynamic("getRecord")(js.Any.fromFunction0(getRecord))
    if (getStandardSubmit != null) __obj.updateDynamic("getStandardSubmit")(js.Any.fromFunction0(getStandardSubmit))
    if (getSubmitOnAction != null) __obj.updateDynamic("getSubmitOnAction")(js.Any.fromFunction0(getSubmitOnAction))
    if (getTimeout != null) __obj.updateDynamic("getTimeout")(js.Any.fromFunction0(getTimeout))
    if (getTrackResetOnLoad != null) __obj.updateDynamic("getTrackResetOnLoad")(js.Any.fromFunction0(getTrackResetOnLoad))
    if (getUrl != null) __obj.updateDynamic("getUrl")(js.Any.fromFunction0(getUrl))
    if (getValues != null) __obj.updateDynamic("getValues")(js.Any.fromFunction2(getValues))
    if (hideMask != null) __obj.updateDynamic("hideMask")(js.Any.fromFunction0(hideMask))
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1(load))
    if (loadModel != null) __obj.updateDynamic("loadModel")(js.Any.fromFunction1(loadModel))
    if (loadRecord != null) __obj.updateDynamic("loadRecord")(js.Any.fromFunction1(loadRecord))
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(multipartDetection)) __obj.updateDynamic("multipartDetection")(multipartDetection)
    if (paramOrder != null) __obj.updateDynamic("paramOrder")(paramOrder)
    if (!js.isUndefined(paramsAsHash)) __obj.updateDynamic("paramsAsHash")(paramsAsHash)
    if (record != null) __obj.updateDynamic("record")(record)
    if (reset != null) __obj.updateDynamic("reset")(js.Any.fromFunction0(reset))
    if (scrollable != null) __obj.updateDynamic("scrollable")(scrollable)
    if (setApi != null) __obj.updateDynamic("setApi")(js.Any.fromFunction1(setApi))
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(js.Any.fromFunction1(setBaseCls))
    if (setBaseParams != null) __obj.updateDynamic("setBaseParams")(js.Any.fromFunction1(setBaseParams))
    if (setEnableSubmissionForm != null) __obj.updateDynamic("setEnableSubmissionForm")(js.Any.fromFunction1(setEnableSubmissionForm))
    if (setEnctype != null) __obj.updateDynamic("setEnctype")(js.Any.fromFunction1(setEnctype))
    if (setMethod != null) __obj.updateDynamic("setMethod")(js.Any.fromFunction1(setMethod))
    if (setMultipartDetection != null) __obj.updateDynamic("setMultipartDetection")(js.Any.fromFunction1(setMultipartDetection))
    if (setParamOrder != null) __obj.updateDynamic("setParamOrder")(js.Any.fromFunction1(setParamOrder))
    if (setParamsAsHash != null) __obj.updateDynamic("setParamsAsHash")(js.Any.fromFunction1(setParamsAsHash))
    if (setRecord != null) __obj.updateDynamic("setRecord")(js.Any.fromFunction1(setRecord))
    if (setStandardSubmit != null) __obj.updateDynamic("setStandardSubmit")(js.Any.fromFunction1(setStandardSubmit))
    if (setSubmitOnAction != null) __obj.updateDynamic("setSubmitOnAction")(js.Any.fromFunction1(setSubmitOnAction))
    if (setTimeout != null) __obj.updateDynamic("setTimeout")(js.Any.fromFunction1(setTimeout))
    if (setTrackResetOnLoad != null) __obj.updateDynamic("setTrackResetOnLoad")(js.Any.fromFunction1(setTrackResetOnLoad))
    if (setUrl != null) __obj.updateDynamic("setUrl")(js.Any.fromFunction1(setUrl))
    if (setValues != null) __obj.updateDynamic("setValues")(js.Any.fromFunction1(setValues))
    if (showMask != null) __obj.updateDynamic("showMask")(js.Any.fromFunction2(showMask))
    if (!js.isUndefined(standardSubmit)) __obj.updateDynamic("standardSubmit")(standardSubmit)
    if (submit != null) __obj.updateDynamic("submit")(js.Any.fromFunction1(submit))
    if (submitOnAction != null) __obj.updateDynamic("submitOnAction")(submitOnAction)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(trackResetOnLoad)) __obj.updateDynamic("trackResetOnLoad")(trackResetOnLoad)
    if (url != null) __obj.updateDynamic("url")(url)
    if (waitMsgTarget != null) __obj.updateDynamic("waitMsgTarget")(waitMsgTarget)
    if (waitTpl != null) __obj.updateDynamic("waitTpl")(waitTpl)
    __obj.asInstanceOf[IFormPanel]
  }
}

