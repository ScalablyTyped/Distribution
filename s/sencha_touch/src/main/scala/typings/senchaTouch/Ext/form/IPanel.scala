package typings.senchaTouch.Ext.form

import typings.senchaTouch.Ext.data.IConnection
import typings.senchaTouch.Ext.data.IModel
import typings.senchaTouch.Ext.dom.IElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPanel
  extends StObject
     with typings.senchaTouch.Ext.IPanel {
  
  /** [Config Option] (Object) */
  var api: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (Object) */
  var baseParams: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] A convenient method to disable all fields in this form
    * @param newDisabled Object
    * @returns Ext.form.Panel This form.
    */
  var doSetDisabled: js.UndefOr[js.Function1[/* newDisabled */ js.UndefOr[js.Any], this.type]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var enableSubmissionForm: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Object) */
  var enctype: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Returns the value of api
    * @returns Object
    */
  var getApi: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of baseParams
    * @returns Object
    */
  var getBaseParams: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of enableSubmissionForm
    * @returns Boolean
    */
  var getEnableSubmissionForm: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of enctype
    * @returns Object
    */
  var getEnctype: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of method
    * @returns String
    */
  var getMethod: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of multipartDetection
    * @returns Boolean
    */
  var getMultipartDetection: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of paramOrder
    * @returns String/String[]
    */
  var getParamOrder: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of paramsAsHash
    * @returns Boolean
    */
  var getParamsAsHash: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of standardSubmit
    * @returns Boolean
    */
  var getStandardSubmit: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of submitOnAction
    * @returns Object
    */
  var getSubmitOnAction: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of timeout
    * @returns Number
    */
  var getTimeout: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of trackResetOnLoad
    * @returns Boolean
    */
  var getTrackResetOnLoad: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of url
    * @returns String
    */
  var getUrl: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns an object containing the value of each field in the form keyed to the field s name
    * @param enabled Boolean true to return only enabled fields.
    * @param all Boolean true to return all fields even if they don't have a name configured.
    * @returns Object Object mapping field name to its value.
    */
  var getValues: js.UndefOr[
    js.Function2[/* enabled */ js.UndefOr[Boolean], /* all */ js.UndefOr[Boolean], js.Any]
  ] = js.undefined
  
  /** [Method] Hides a previously shown wait mask See showMask
    * @returns Ext.form.Panel this
    */
  var hideMask: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  /** [Method] Performs an Ajax or Ext Direct call to load values for this form
    * @param options Object The configuration when loading this form. The following are the configurations when loading via Ajax only:
    * @returns Ext.data.Connection The request object.
    */
  var load: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], IConnection]] = js.undefined
  
  /** [Method] Loads matching fields from a model instance into this form
    * @param record Ext.data.Model The model instance.
    * @returns Ext.form.Panel This form.
    */
  var loadModel: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], this.type]] = js.undefined
  
  /** [Method] Loads matching fields from a model instance into this form
    * @param record Ext.data.Model The model instance.
    * @returns Ext.form.Panel This form.
    */
  var loadRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], this.type]] = js.undefined
  
  /** [Config Option] (String) */
  var method: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Boolean) */
  var multipartDetection: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String/String[]) */
  var paramOrder: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (Boolean) */
  var paramsAsHash: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Resets all fields in the form back to their original values
    * @returns Ext.form.Panel This form.
    */
  var reset: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  /** [Method] Sets the value of api
    * @param api Object The new value.
    */
  var setApi: js.UndefOr[js.Function1[/* api */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of baseParams
    * @param baseParams Object The new value.
    */
  var setBaseParams: js.UndefOr[js.Function1[/* baseParams */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of enableSubmissionForm
    * @param enableSubmissionForm Boolean The new value.
    */
  var setEnableSubmissionForm: js.UndefOr[js.Function1[/* enableSubmissionForm */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of enctype
    * @param enctype Object The new value.
    */
  var setEnctype: js.UndefOr[js.Function1[/* enctype */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of method
    * @param method String The new value.
    */
  var setMethod: js.UndefOr[js.Function1[/* method */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of multipartDetection
    * @param multipartDetection Boolean The new value.
    */
  var setMultipartDetection: js.UndefOr[js.Function1[/* multipartDetection */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of paramOrder
    * @param paramOrder String/String[] The new value.
    */
  var setParamOrder: js.UndefOr[js.Function1[/* paramOrder */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of paramsAsHash
    * @param paramsAsHash Boolean The new value.
    */
  var setParamsAsHash: js.UndefOr[js.Function1[/* paramsAsHash */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of standardSubmit
    * @param standardSubmit Boolean The new value.
    */
  var setStandardSubmit: js.UndefOr[js.Function1[/* standardSubmit */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of submitOnAction
    * @param submitOnAction Object The new value.
    */
  var setSubmitOnAction: js.UndefOr[js.Function1[/* submitOnAction */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of timeout
    * @param timeout Number The new value.
    */
  var setTimeout: js.UndefOr[js.Function1[/* timeout */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of trackResetOnLoad
    * @param trackResetOnLoad Boolean The new value.
    */
  var setTrackResetOnLoad: js.UndefOr[js.Function1[/* trackResetOnLoad */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of url
    * @param url String The new value.
    */
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the values of form fields in bulk
    * @param values Object field name => value mapping object.
    * @returns Ext.form.Panel This form.
    */
  var setValues: js.UndefOr[js.Function1[/* values */ js.UndefOr[js.Any], this.type]] = js.undefined
  
  /** [Method] Shows a generic custom mask over a designated Element
    * @param cfg String/Object Either a string message or a configuration object supporting the following options: {  message : 'Please Wait',  cls : 'form-mask' }
    * @param target Object
    * @returns Ext.form.Panel This form
    */
  var showMask: js.UndefOr[
    js.Function2[/* cfg */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any], this.type]
  ] = js.undefined
  
  /** [Config Option] (Boolean) */
  var standardSubmit: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Performs a Ajax based submission of form values if standardSubmit is false or otherwise executes a standard HTML Fo
    * @param options Object The configuration when submitting this form. The following are the configurations when submitting via Ajax only:
    * @returns Ext.data.Connection The request object if the standardSubmit config is false. If the standardSubmit config is true, then the return value is undefined.
    */
  var submit: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], IConnection]] = js.undefined
  
  /** [Config Option] (Object) */
  var submitOnAction: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Boolean) */
  var trackResetOnLoad: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var url: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Ext.dom.Element) */
  var waitMsgTarget: js.UndefOr[IElement] = js.undefined
  
  /** [Config Option] (Ext.XTemplate/String/String[]) */
  var waitTpl: js.UndefOr[js.Any] = js.undefined
}
object IPanel {
  
  inline def apply(): IPanel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPanel]
  }
  
  extension [Self <: IPanel](x: Self) {
    
    inline def setApi(value: js.Any): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
    
    inline def setBaseParams(value: js.Any): Self = StObject.set(x, "baseParams", value.asInstanceOf[js.Any])
    
    inline def setBaseParamsUndefined: Self = StObject.set(x, "baseParams", js.undefined)
    
    inline def setDoSetDisabled(value: /* newDisabled */ js.UndefOr[js.Any] => IPanel): Self = StObject.set(x, "doSetDisabled", js.Any.fromFunction1(value))
    
    inline def setDoSetDisabledUndefined: Self = StObject.set(x, "doSetDisabled", js.undefined)
    
    inline def setEnableSubmissionForm(value: Boolean): Self = StObject.set(x, "enableSubmissionForm", value.asInstanceOf[js.Any])
    
    inline def setEnableSubmissionFormUndefined: Self = StObject.set(x, "enableSubmissionForm", js.undefined)
    
    inline def setEnctype(value: js.Any): Self = StObject.set(x, "enctype", value.asInstanceOf[js.Any])
    
    inline def setEnctypeUndefined: Self = StObject.set(x, "enctype", js.undefined)
    
    inline def setGetApi(value: () => js.Any): Self = StObject.set(x, "getApi", js.Any.fromFunction0(value))
    
    inline def setGetApiUndefined: Self = StObject.set(x, "getApi", js.undefined)
    
    inline def setGetBaseParams(value: () => js.Any): Self = StObject.set(x, "getBaseParams", js.Any.fromFunction0(value))
    
    inline def setGetBaseParamsUndefined: Self = StObject.set(x, "getBaseParams", js.undefined)
    
    inline def setGetEnableSubmissionForm(value: () => Boolean): Self = StObject.set(x, "getEnableSubmissionForm", js.Any.fromFunction0(value))
    
    inline def setGetEnableSubmissionFormUndefined: Self = StObject.set(x, "getEnableSubmissionForm", js.undefined)
    
    inline def setGetEnctype(value: () => js.Any): Self = StObject.set(x, "getEnctype", js.Any.fromFunction0(value))
    
    inline def setGetEnctypeUndefined: Self = StObject.set(x, "getEnctype", js.undefined)
    
    inline def setGetMethod(value: () => String): Self = StObject.set(x, "getMethod", js.Any.fromFunction0(value))
    
    inline def setGetMethodUndefined: Self = StObject.set(x, "getMethod", js.undefined)
    
    inline def setGetMultipartDetection(value: () => Boolean): Self = StObject.set(x, "getMultipartDetection", js.Any.fromFunction0(value))
    
    inline def setGetMultipartDetectionUndefined: Self = StObject.set(x, "getMultipartDetection", js.undefined)
    
    inline def setGetParamOrder(value: () => js.Any): Self = StObject.set(x, "getParamOrder", js.Any.fromFunction0(value))
    
    inline def setGetParamOrderUndefined: Self = StObject.set(x, "getParamOrder", js.undefined)
    
    inline def setGetParamsAsHash(value: () => Boolean): Self = StObject.set(x, "getParamsAsHash", js.Any.fromFunction0(value))
    
    inline def setGetParamsAsHashUndefined: Self = StObject.set(x, "getParamsAsHash", js.undefined)
    
    inline def setGetStandardSubmit(value: () => Boolean): Self = StObject.set(x, "getStandardSubmit", js.Any.fromFunction0(value))
    
    inline def setGetStandardSubmitUndefined: Self = StObject.set(x, "getStandardSubmit", js.undefined)
    
    inline def setGetSubmitOnAction(value: () => js.Any): Self = StObject.set(x, "getSubmitOnAction", js.Any.fromFunction0(value))
    
    inline def setGetSubmitOnActionUndefined: Self = StObject.set(x, "getSubmitOnAction", js.undefined)
    
    inline def setGetTimeout(value: () => Double): Self = StObject.set(x, "getTimeout", js.Any.fromFunction0(value))
    
    inline def setGetTimeoutUndefined: Self = StObject.set(x, "getTimeout", js.undefined)
    
    inline def setGetTrackResetOnLoad(value: () => Boolean): Self = StObject.set(x, "getTrackResetOnLoad", js.Any.fromFunction0(value))
    
    inline def setGetTrackResetOnLoadUndefined: Self = StObject.set(x, "getTrackResetOnLoad", js.undefined)
    
    inline def setGetUrl(value: () => String): Self = StObject.set(x, "getUrl", js.Any.fromFunction0(value))
    
    inline def setGetUrlUndefined: Self = StObject.set(x, "getUrl", js.undefined)
    
    inline def setGetValues(value: (/* enabled */ js.UndefOr[Boolean], /* all */ js.UndefOr[Boolean]) => js.Any): Self = StObject.set(x, "getValues", js.Any.fromFunction2(value))
    
    inline def setGetValuesUndefined: Self = StObject.set(x, "getValues", js.undefined)
    
    inline def setHideMask(value: () => IPanel): Self = StObject.set(x, "hideMask", js.Any.fromFunction0(value))
    
    inline def setHideMaskUndefined: Self = StObject.set(x, "hideMask", js.undefined)
    
    inline def setLoad(value: /* options */ js.UndefOr[js.Any] => IConnection): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
    
    inline def setLoadModel(value: /* record */ js.UndefOr[IModel] => IPanel): Self = StObject.set(x, "loadModel", js.Any.fromFunction1(value))
    
    inline def setLoadModelUndefined: Self = StObject.set(x, "loadModel", js.undefined)
    
    inline def setLoadRecord(value: /* record */ js.UndefOr[IModel] => IPanel): Self = StObject.set(x, "loadRecord", js.Any.fromFunction1(value))
    
    inline def setLoadRecordUndefined: Self = StObject.set(x, "loadRecord", js.undefined)
    
    inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setMultipartDetection(value: Boolean): Self = StObject.set(x, "multipartDetection", value.asInstanceOf[js.Any])
    
    inline def setMultipartDetectionUndefined: Self = StObject.set(x, "multipartDetection", js.undefined)
    
    inline def setParamOrder(value: js.Any): Self = StObject.set(x, "paramOrder", value.asInstanceOf[js.Any])
    
    inline def setParamOrderUndefined: Self = StObject.set(x, "paramOrder", js.undefined)
    
    inline def setParamsAsHash(value: Boolean): Self = StObject.set(x, "paramsAsHash", value.asInstanceOf[js.Any])
    
    inline def setParamsAsHashUndefined: Self = StObject.set(x, "paramsAsHash", js.undefined)
    
    inline def setReset(value: () => IPanel): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    inline def setSetApi(value: /* api */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setApi", js.Any.fromFunction1(value))
    
    inline def setSetApiUndefined: Self = StObject.set(x, "setApi", js.undefined)
    
    inline def setSetBaseParams(value: /* baseParams */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setBaseParams", js.Any.fromFunction1(value))
    
    inline def setSetBaseParamsUndefined: Self = StObject.set(x, "setBaseParams", js.undefined)
    
    inline def setSetEnableSubmissionForm(value: /* enableSubmissionForm */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setEnableSubmissionForm", js.Any.fromFunction1(value))
    
    inline def setSetEnableSubmissionFormUndefined: Self = StObject.set(x, "setEnableSubmissionForm", js.undefined)
    
    inline def setSetEnctype(value: /* enctype */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setEnctype", js.Any.fromFunction1(value))
    
    inline def setSetEnctypeUndefined: Self = StObject.set(x, "setEnctype", js.undefined)
    
    inline def setSetMethod(value: /* method */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setMethod", js.Any.fromFunction1(value))
    
    inline def setSetMethodUndefined: Self = StObject.set(x, "setMethod", js.undefined)
    
    inline def setSetMultipartDetection(value: /* multipartDetection */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setMultipartDetection", js.Any.fromFunction1(value))
    
    inline def setSetMultipartDetectionUndefined: Self = StObject.set(x, "setMultipartDetection", js.undefined)
    
    inline def setSetParamOrder(value: /* paramOrder */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setParamOrder", js.Any.fromFunction1(value))
    
    inline def setSetParamOrderUndefined: Self = StObject.set(x, "setParamOrder", js.undefined)
    
    inline def setSetParamsAsHash(value: /* paramsAsHash */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setParamsAsHash", js.Any.fromFunction1(value))
    
    inline def setSetParamsAsHashUndefined: Self = StObject.set(x, "setParamsAsHash", js.undefined)
    
    inline def setSetStandardSubmit(value: /* standardSubmit */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setStandardSubmit", js.Any.fromFunction1(value))
    
    inline def setSetStandardSubmitUndefined: Self = StObject.set(x, "setStandardSubmit", js.undefined)
    
    inline def setSetSubmitOnAction(value: /* submitOnAction */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setSubmitOnAction", js.Any.fromFunction1(value))
    
    inline def setSetSubmitOnActionUndefined: Self = StObject.set(x, "setSubmitOnAction", js.undefined)
    
    inline def setSetTimeout(value: /* timeout */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setTimeout", js.Any.fromFunction1(value))
    
    inline def setSetTimeoutUndefined: Self = StObject.set(x, "setTimeout", js.undefined)
    
    inline def setSetTrackResetOnLoad(value: /* trackResetOnLoad */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setTrackResetOnLoad", js.Any.fromFunction1(value))
    
    inline def setSetTrackResetOnLoadUndefined: Self = StObject.set(x, "setTrackResetOnLoad", js.undefined)
    
    inline def setSetUrl(value: /* url */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setUrl", js.Any.fromFunction1(value))
    
    inline def setSetUrlUndefined: Self = StObject.set(x, "setUrl", js.undefined)
    
    inline def setSetValues(value: /* values */ js.UndefOr[js.Any] => IPanel): Self = StObject.set(x, "setValues", js.Any.fromFunction1(value))
    
    inline def setSetValuesUndefined: Self = StObject.set(x, "setValues", js.undefined)
    
    inline def setShowMask(value: (/* cfg */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any]) => IPanel): Self = StObject.set(x, "showMask", js.Any.fromFunction2(value))
    
    inline def setShowMaskUndefined: Self = StObject.set(x, "showMask", js.undefined)
    
    inline def setStandardSubmit(value: Boolean): Self = StObject.set(x, "standardSubmit", value.asInstanceOf[js.Any])
    
    inline def setStandardSubmitUndefined: Self = StObject.set(x, "standardSubmit", js.undefined)
    
    inline def setSubmit(value: /* options */ js.UndefOr[js.Any] => IConnection): Self = StObject.set(x, "submit", js.Any.fromFunction1(value))
    
    inline def setSubmitOnAction(value: js.Any): Self = StObject.set(x, "submitOnAction", value.asInstanceOf[js.Any])
    
    inline def setSubmitOnActionUndefined: Self = StObject.set(x, "submitOnAction", js.undefined)
    
    inline def setSubmitUndefined: Self = StObject.set(x, "submit", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTrackResetOnLoad(value: Boolean): Self = StObject.set(x, "trackResetOnLoad", value.asInstanceOf[js.Any])
    
    inline def setTrackResetOnLoadUndefined: Self = StObject.set(x, "trackResetOnLoad", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setWaitMsgTarget(value: IElement): Self = StObject.set(x, "waitMsgTarget", value.asInstanceOf[js.Any])
    
    inline def setWaitMsgTargetUndefined: Self = StObject.set(x, "waitMsgTarget", js.undefined)
    
    inline def setWaitTpl(value: js.Any): Self = StObject.set(x, "waitTpl", value.asInstanceOf[js.Any])
    
    inline def setWaitTplUndefined: Self = StObject.set(x, "waitTpl", js.undefined)
  }
}
