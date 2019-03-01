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
    doSetDisabled: js.Function1[/* newDisabled */ js.UndefOr[js.Any], IPanel] = null,
    enableSubmissionForm: js.UndefOr[scala.Boolean] = js.undefined,
    enctype: js.Any = null,
    getApi: js.Function0[_] = null,
    getBaseCls: js.Function0[java.lang.String] = null,
    getBaseParams: js.Function0[_] = null,
    getEnableSubmissionForm: js.Function0[scala.Boolean] = null,
    getEnctype: js.Function0[_] = null,
    getMethod: js.Function0[java.lang.String] = null,
    getMultipartDetection: js.Function0[scala.Boolean] = null,
    getParamOrder: js.Function0[_] = null,
    getParamsAsHash: js.Function0[scala.Boolean] = null,
    getRecord: js.Function0[senchaUnderscoreTouchLib.ExtNs.dataNs.IModel] = null,
    getStandardSubmit: js.Function0[scala.Boolean] = null,
    getSubmitOnAction: js.Function0[_] = null,
    getTimeout: js.Function0[scala.Double] = null,
    getTrackResetOnLoad: js.Function0[scala.Boolean] = null,
    getUrl: js.Function0[java.lang.String] = null,
    getValues: js.Function2[/* enabled */ js.UndefOr[scala.Boolean], /* all */ js.UndefOr[scala.Boolean], _] = null,
    hideMask: js.Function0[IPanel] = null,
    load: js.Function1[
      /* options */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.dataNs.IConnection
    ] = null,
    loadModel: js.Function1[/* record */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IModel], IPanel] = null,
    loadRecord: js.Function1[/* record */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IModel], IPanel] = null,
    method: java.lang.String = null,
    multipartDetection: js.UndefOr[scala.Boolean] = js.undefined,
    paramOrder: js.Any = null,
    paramsAsHash: js.UndefOr[scala.Boolean] = js.undefined,
    record: senchaUnderscoreTouchLib.ExtNs.dataNs.IModel = null,
    reset: js.Function0[IPanel] = null,
    scrollable: js.Any = null,
    setApi: js.Function1[/* api */ js.UndefOr[js.Any], scala.Unit] = null,
    setBaseCls: js.Function1[/* baseCls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setBaseParams: js.Function1[/* baseParams */ js.UndefOr[js.Any], scala.Unit] = null,
    setEnableSubmissionForm: js.Function1[/* enableSubmissionForm */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setEnctype: js.Function1[/* enctype */ js.UndefOr[js.Any], scala.Unit] = null,
    setMethod: js.Function1[/* method */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setMultipartDetection: js.Function1[/* multipartDetection */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setParamOrder: js.Function1[/* paramOrder */ js.UndefOr[js.Any], scala.Unit] = null,
    setParamsAsHash: js.Function1[/* paramsAsHash */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setRecord: js.Function1[/* record */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IModel], IPanel] = null,
    setStandardSubmit: js.Function1[/* standardSubmit */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setSubmitOnAction: js.Function1[/* submitOnAction */ js.UndefOr[js.Any], scala.Unit] = null,
    setTimeout: js.Function1[/* timeout */ js.UndefOr[scala.Double], scala.Unit] = null,
    setTrackResetOnLoad: js.Function1[/* trackResetOnLoad */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setUrl: js.Function1[/* url */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setValues: js.Function1[/* values */ js.UndefOr[js.Any], IPanel] = null,
    showMask: js.Function2[/* cfg */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any], IPanel] = null,
    standardSubmit: js.UndefOr[scala.Boolean] = js.undefined,
    submit: js.Function1[
      /* options */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.dataNs.IConnection
    ] = null,
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
    if (doSetDisabled != null) __obj.updateDynamic("doSetDisabled")(doSetDisabled)
    if (!js.isUndefined(enableSubmissionForm)) __obj.updateDynamic("enableSubmissionForm")(enableSubmissionForm)
    if (enctype != null) __obj.updateDynamic("enctype")(enctype)
    if (getApi != null) __obj.updateDynamic("getApi")(getApi)
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(getBaseCls)
    if (getBaseParams != null) __obj.updateDynamic("getBaseParams")(getBaseParams)
    if (getEnableSubmissionForm != null) __obj.updateDynamic("getEnableSubmissionForm")(getEnableSubmissionForm)
    if (getEnctype != null) __obj.updateDynamic("getEnctype")(getEnctype)
    if (getMethod != null) __obj.updateDynamic("getMethod")(getMethod)
    if (getMultipartDetection != null) __obj.updateDynamic("getMultipartDetection")(getMultipartDetection)
    if (getParamOrder != null) __obj.updateDynamic("getParamOrder")(getParamOrder)
    if (getParamsAsHash != null) __obj.updateDynamic("getParamsAsHash")(getParamsAsHash)
    if (getRecord != null) __obj.updateDynamic("getRecord")(getRecord)
    if (getStandardSubmit != null) __obj.updateDynamic("getStandardSubmit")(getStandardSubmit)
    if (getSubmitOnAction != null) __obj.updateDynamic("getSubmitOnAction")(getSubmitOnAction)
    if (getTimeout != null) __obj.updateDynamic("getTimeout")(getTimeout)
    if (getTrackResetOnLoad != null) __obj.updateDynamic("getTrackResetOnLoad")(getTrackResetOnLoad)
    if (getUrl != null) __obj.updateDynamic("getUrl")(getUrl)
    if (getValues != null) __obj.updateDynamic("getValues")(getValues)
    if (hideMask != null) __obj.updateDynamic("hideMask")(hideMask)
    if (load != null) __obj.updateDynamic("load")(load)
    if (loadModel != null) __obj.updateDynamic("loadModel")(loadModel)
    if (loadRecord != null) __obj.updateDynamic("loadRecord")(loadRecord)
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(multipartDetection)) __obj.updateDynamic("multipartDetection")(multipartDetection)
    if (paramOrder != null) __obj.updateDynamic("paramOrder")(paramOrder)
    if (!js.isUndefined(paramsAsHash)) __obj.updateDynamic("paramsAsHash")(paramsAsHash)
    if (record != null) __obj.updateDynamic("record")(record)
    if (reset != null) __obj.updateDynamic("reset")(reset)
    if (scrollable != null) __obj.updateDynamic("scrollable")(scrollable)
    if (setApi != null) __obj.updateDynamic("setApi")(setApi)
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(setBaseCls)
    if (setBaseParams != null) __obj.updateDynamic("setBaseParams")(setBaseParams)
    if (setEnableSubmissionForm != null) __obj.updateDynamic("setEnableSubmissionForm")(setEnableSubmissionForm)
    if (setEnctype != null) __obj.updateDynamic("setEnctype")(setEnctype)
    if (setMethod != null) __obj.updateDynamic("setMethod")(setMethod)
    if (setMultipartDetection != null) __obj.updateDynamic("setMultipartDetection")(setMultipartDetection)
    if (setParamOrder != null) __obj.updateDynamic("setParamOrder")(setParamOrder)
    if (setParamsAsHash != null) __obj.updateDynamic("setParamsAsHash")(setParamsAsHash)
    if (setRecord != null) __obj.updateDynamic("setRecord")(setRecord)
    if (setStandardSubmit != null) __obj.updateDynamic("setStandardSubmit")(setStandardSubmit)
    if (setSubmitOnAction != null) __obj.updateDynamic("setSubmitOnAction")(setSubmitOnAction)
    if (setTimeout != null) __obj.updateDynamic("setTimeout")(setTimeout)
    if (setTrackResetOnLoad != null) __obj.updateDynamic("setTrackResetOnLoad")(setTrackResetOnLoad)
    if (setUrl != null) __obj.updateDynamic("setUrl")(setUrl)
    if (setValues != null) __obj.updateDynamic("setValues")(setValues)
    if (showMask != null) __obj.updateDynamic("showMask")(showMask)
    if (!js.isUndefined(standardSubmit)) __obj.updateDynamic("standardSubmit")(standardSubmit)
    if (submit != null) __obj.updateDynamic("submit")(submit)
    if (submitOnAction != null) __obj.updateDynamic("submitOnAction")(submitOnAction)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(trackResetOnLoad)) __obj.updateDynamic("trackResetOnLoad")(trackResetOnLoad)
    if (url != null) __obj.updateDynamic("url")(url)
    if (waitMsgTarget != null) __obj.updateDynamic("waitMsgTarget")(waitMsgTarget)
    if (waitTpl != null) __obj.updateDynamic("waitTpl")(waitTpl)
    __obj.asInstanceOf[IFormPanel]
  }
}

