package typings.senchaTouch.Ext.form

import typings.senchaTouch.Ext.data.IConnection
import typings.senchaTouch.Ext.data.IModel
import typings.senchaTouch.Ext.dom.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFormPanel
  extends typings.senchaTouch.Ext.IPanel {
  
  /** [Config Option] (Object) */
  var api: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Object) */
  var baseParams: js.UndefOr[js.Any] = js.native
  
  /** [Method] A convenient method to disable all fields in this form
    * @param newDisabled Object
    * @returns Ext.form.Panel This form.
    */
  var doSetDisabled: js.UndefOr[js.Function1[/* newDisabled */ js.UndefOr[js.Any], IPanel]] = js.native
  
  /** [Config Option] (Boolean) */
  var enableSubmissionForm: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Object) */
  var enctype: js.UndefOr[js.Any] = js.native
  
  /** [Method] Returns the value of api
    * @returns Object
    */
  var getApi: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of baseParams
    * @returns Object
    */
  var getBaseParams: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of enableSubmissionForm
    * @returns Boolean
    */
  var getEnableSubmissionForm: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of enctype
    * @returns Object
    */
  var getEnctype: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of method
    * @returns String
    */
  var getMethod: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of multipartDetection
    * @returns Boolean
    */
  var getMultipartDetection: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of paramOrder
    * @returns String/String[]
    */
  var getParamOrder: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of paramsAsHash
    * @returns Boolean
    */
  var getParamsAsHash: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of standardSubmit
    * @returns Boolean
    */
  var getStandardSubmit: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of submitOnAction
    * @returns Object
    */
  var getSubmitOnAction: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of timeout
    * @returns Number
    */
  var getTimeout: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of trackResetOnLoad
    * @returns Boolean
    */
  var getTrackResetOnLoad: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of url
    * @returns String
    */
  var getUrl: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns an object containing the value of each field in the form keyed to the field s name
    * @param enabled Boolean true to return only enabled fields.
    * @param all Boolean true to return all fields even if they don't have a name configured.
    * @returns Object Object mapping field name to its value.
    */
  var getValues: js.UndefOr[
    js.Function2[/* enabled */ js.UndefOr[Boolean], /* all */ js.UndefOr[Boolean], _]
  ] = js.native
  
  /** [Method] Hides a previously shown wait mask See showMask
    * @returns Ext.form.Panel this
    */
  var hideMask: js.UndefOr[js.Function0[IPanel]] = js.native
  
  /** [Method] Performs an Ajax or Ext Direct call to load values for this form
    * @param options Object The configuration when loading this form. The following are the configurations when loading via Ajax only:
    * @returns Ext.data.Connection The request object.
    */
  var load: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], IConnection]] = js.native
  
  /** [Method] Loads matching fields from a model instance into this form
    * @param record Ext.data.Model The model instance.
    * @returns Ext.form.Panel This form.
    */
  var loadModel: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], IPanel]] = js.native
  
  /** [Method] Loads matching fields from a model instance into this form
    * @param record Ext.data.Model The model instance.
    * @returns Ext.form.Panel This form.
    */
  var loadRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], IPanel]] = js.native
  
  /** [Config Option] (String) */
  var method: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var multipartDetection: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String/String[]) */
  var paramOrder: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var paramsAsHash: js.UndefOr[Boolean] = js.native
  
  /** [Method] Resets all fields in the form back to their original values
    * @returns Ext.form.Panel This form.
    */
  var reset: js.UndefOr[js.Function0[IPanel]] = js.native
  
  /** [Method] Sets the value of api
    * @param api Object The new value.
    */
  var setApi: js.UndefOr[js.Function1[/* api */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of baseParams
    * @param baseParams Object The new value.
    */
  var setBaseParams: js.UndefOr[js.Function1[/* baseParams */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of enableSubmissionForm
    * @param enableSubmissionForm Boolean The new value.
    */
  var setEnableSubmissionForm: js.UndefOr[js.Function1[/* enableSubmissionForm */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of enctype
    * @param enctype Object The new value.
    */
  var setEnctype: js.UndefOr[js.Function1[/* enctype */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of method
    * @param method String The new value.
    */
  var setMethod: js.UndefOr[js.Function1[/* method */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of multipartDetection
    * @param multipartDetection Boolean The new value.
    */
  var setMultipartDetection: js.UndefOr[js.Function1[/* multipartDetection */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of paramOrder
    * @param paramOrder String/String[] The new value.
    */
  var setParamOrder: js.UndefOr[js.Function1[/* paramOrder */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of paramsAsHash
    * @param paramsAsHash Boolean The new value.
    */
  var setParamsAsHash: js.UndefOr[js.Function1[/* paramsAsHash */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Loads matching fields from a model instance into this form
    * @param record Ext.data.Model The model instance.
    * @returns Ext.form.Panel This form.
    */
  @JSName("setRecord")
  var setRecord_IFormPanel: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], IPanel]] = js.native
  
  /** [Method] Sets the value of standardSubmit
    * @param standardSubmit Boolean The new value.
    */
  var setStandardSubmit: js.UndefOr[js.Function1[/* standardSubmit */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of submitOnAction
    * @param submitOnAction Object The new value.
    */
  var setSubmitOnAction: js.UndefOr[js.Function1[/* submitOnAction */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of timeout
    * @param timeout Number The new value.
    */
  var setTimeout: js.UndefOr[js.Function1[/* timeout */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of trackResetOnLoad
    * @param trackResetOnLoad Boolean The new value.
    */
  var setTrackResetOnLoad: js.UndefOr[js.Function1[/* trackResetOnLoad */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of url
    * @param url String The new value.
    */
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the values of form fields in bulk
    * @param values Object field name => value mapping object.
    * @returns Ext.form.Panel This form.
    */
  var setValues: js.UndefOr[js.Function1[/* values */ js.UndefOr[js.Any], IPanel]] = js.native
  
  /** [Method] Shows a generic custom mask over a designated Element
    * @param cfg String/Object Either a string message or a configuration object supporting the following options: {  message : 'Please Wait',  cls : 'form-mask' }
    * @param target Object
    * @returns Ext.form.Panel This form
    */
  var showMask: js.UndefOr[
    js.Function2[/* cfg */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any], IPanel]
  ] = js.native
  
  /** [Config Option] (Boolean) */
  var standardSubmit: js.UndefOr[Boolean] = js.native
  
  /** [Method] Performs a Ajax based submission of form values if standardSubmit is false or otherwise executes a standard HTML Fo
    * @param options Object The configuration when submitting this form. The following are the configurations when submitting via Ajax only:
    * @returns Ext.data.Connection The request object if the standardSubmit config is false. If the standardSubmit config is true, then the return value is undefined.
    */
  var submit: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], IConnection]] = js.native
  
  /** [Config Option] (Object) */
  var submitOnAction: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Boolean) */
  var trackResetOnLoad: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var url: js.UndefOr[String] = js.native
  
  /** [Config Option] (Ext.dom.Element) */
  var waitMsgTarget: js.UndefOr[IElement] = js.native
  
  /** [Config Option] (Ext.XTemplate/String/String[]) */
  var waitTpl: js.UndefOr[js.Any] = js.native
}
object IFormPanel {
  
  @scala.inline
  def apply(): IFormPanel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFormPanel]
  }
  
  @scala.inline
  implicit class IFormPanelOps[Self <: IFormPanel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApi(value: js.Any): Self = this.set("api", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApi: Self = this.set("api", js.undefined)
    
    @scala.inline
    def setBaseParams(value: js.Any): Self = this.set("baseParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseParams: Self = this.set("baseParams", js.undefined)
    
    @scala.inline
    def setDoSetDisabled(value: /* newDisabled */ js.UndefOr[js.Any] => IPanel): Self = this.set("doSetDisabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDoSetDisabled: Self = this.set("doSetDisabled", js.undefined)
    
    @scala.inline
    def setEnableSubmissionForm(value: Boolean): Self = this.set("enableSubmissionForm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSubmissionForm: Self = this.set("enableSubmissionForm", js.undefined)
    
    @scala.inline
    def setEnctype(value: js.Any): Self = this.set("enctype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnctype: Self = this.set("enctype", js.undefined)
    
    @scala.inline
    def setGetApi(value: () => _): Self = this.set("getApi", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetApi: Self = this.set("getApi", js.undefined)
    
    @scala.inline
    def setGetBaseParams(value: () => _): Self = this.set("getBaseParams", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetBaseParams: Self = this.set("getBaseParams", js.undefined)
    
    @scala.inline
    def setGetEnableSubmissionForm(value: () => Boolean): Self = this.set("getEnableSubmissionForm", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetEnableSubmissionForm: Self = this.set("getEnableSubmissionForm", js.undefined)
    
    @scala.inline
    def setGetEnctype(value: () => _): Self = this.set("getEnctype", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetEnctype: Self = this.set("getEnctype", js.undefined)
    
    @scala.inline
    def setGetMethod(value: () => String): Self = this.set("getMethod", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMethod: Self = this.set("getMethod", js.undefined)
    
    @scala.inline
    def setGetMultipartDetection(value: () => Boolean): Self = this.set("getMultipartDetection", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMultipartDetection: Self = this.set("getMultipartDetection", js.undefined)
    
    @scala.inline
    def setGetParamOrder(value: () => _): Self = this.set("getParamOrder", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetParamOrder: Self = this.set("getParamOrder", js.undefined)
    
    @scala.inline
    def setGetParamsAsHash(value: () => Boolean): Self = this.set("getParamsAsHash", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetParamsAsHash: Self = this.set("getParamsAsHash", js.undefined)
    
    @scala.inline
    def setGetStandardSubmit(value: () => Boolean): Self = this.set("getStandardSubmit", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetStandardSubmit: Self = this.set("getStandardSubmit", js.undefined)
    
    @scala.inline
    def setGetSubmitOnAction(value: () => _): Self = this.set("getSubmitOnAction", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetSubmitOnAction: Self = this.set("getSubmitOnAction", js.undefined)
    
    @scala.inline
    def setGetTimeout(value: () => Double): Self = this.set("getTimeout", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetTimeout: Self = this.set("getTimeout", js.undefined)
    
    @scala.inline
    def setGetTrackResetOnLoad(value: () => Boolean): Self = this.set("getTrackResetOnLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetTrackResetOnLoad: Self = this.set("getTrackResetOnLoad", js.undefined)
    
    @scala.inline
    def setGetUrl(value: () => String): Self = this.set("getUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetUrl: Self = this.set("getUrl", js.undefined)
    
    @scala.inline
    def setGetValues(value: (/* enabled */ js.UndefOr[Boolean], /* all */ js.UndefOr[Boolean]) => _): Self = this.set("getValues", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetValues: Self = this.set("getValues", js.undefined)
    
    @scala.inline
    def setHideMask(value: () => IPanel): Self = this.set("hideMask", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteHideMask: Self = this.set("hideMask", js.undefined)
    
    @scala.inline
    def setLoad(value: /* options */ js.UndefOr[js.Any] => IConnection): Self = this.set("load", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    
    @scala.inline
    def setLoadModel(value: /* record */ js.UndefOr[IModel] => IPanel): Self = this.set("loadModel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLoadModel: Self = this.set("loadModel", js.undefined)
    
    @scala.inline
    def setLoadRecord(value: /* record */ js.UndefOr[IModel] => IPanel): Self = this.set("loadRecord", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLoadRecord: Self = this.set("loadRecord", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setMultipartDetection(value: Boolean): Self = this.set("multipartDetection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultipartDetection: Self = this.set("multipartDetection", js.undefined)
    
    @scala.inline
    def setParamOrder(value: js.Any): Self = this.set("paramOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParamOrder: Self = this.set("paramOrder", js.undefined)
    
    @scala.inline
    def setParamsAsHash(value: Boolean): Self = this.set("paramsAsHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParamsAsHash: Self = this.set("paramsAsHash", js.undefined)
    
    @scala.inline
    def setReset(value: () => IPanel): Self = this.set("reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteReset: Self = this.set("reset", js.undefined)
    
    @scala.inline
    def setSetApi(value: /* api */ js.UndefOr[js.Any] => Unit): Self = this.set("setApi", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetApi: Self = this.set("setApi", js.undefined)
    
    @scala.inline
    def setSetBaseParams(value: /* baseParams */ js.UndefOr[js.Any] => Unit): Self = this.set("setBaseParams", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetBaseParams: Self = this.set("setBaseParams", js.undefined)
    
    @scala.inline
    def setSetEnableSubmissionForm(value: /* enableSubmissionForm */ js.UndefOr[Boolean] => Unit): Self = this.set("setEnableSubmissionForm", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetEnableSubmissionForm: Self = this.set("setEnableSubmissionForm", js.undefined)
    
    @scala.inline
    def setSetEnctype(value: /* enctype */ js.UndefOr[js.Any] => Unit): Self = this.set("setEnctype", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetEnctype: Self = this.set("setEnctype", js.undefined)
    
    @scala.inline
    def setSetMethod(value: /* method */ js.UndefOr[String] => Unit): Self = this.set("setMethod", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMethod: Self = this.set("setMethod", js.undefined)
    
    @scala.inline
    def setSetMultipartDetection(value: /* multipartDetection */ js.UndefOr[Boolean] => Unit): Self = this.set("setMultipartDetection", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMultipartDetection: Self = this.set("setMultipartDetection", js.undefined)
    
    @scala.inline
    def setSetParamOrder(value: /* paramOrder */ js.UndefOr[js.Any] => Unit): Self = this.set("setParamOrder", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetParamOrder: Self = this.set("setParamOrder", js.undefined)
    
    @scala.inline
    def setSetParamsAsHash(value: /* paramsAsHash */ js.UndefOr[Boolean] => Unit): Self = this.set("setParamsAsHash", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetParamsAsHash: Self = this.set("setParamsAsHash", js.undefined)
    
    @scala.inline
    def setSetRecord(value: /* record */ js.UndefOr[IModel] => IPanel): Self = this.set("setRecord", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetRecord: Self = this.set("setRecord", js.undefined)
    
    @scala.inline
    def setSetStandardSubmit(value: /* standardSubmit */ js.UndefOr[Boolean] => Unit): Self = this.set("setStandardSubmit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetStandardSubmit: Self = this.set("setStandardSubmit", js.undefined)
    
    @scala.inline
    def setSetSubmitOnAction(value: /* submitOnAction */ js.UndefOr[js.Any] => Unit): Self = this.set("setSubmitOnAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetSubmitOnAction: Self = this.set("setSubmitOnAction", js.undefined)
    
    @scala.inline
    def setSetTimeout(value: /* timeout */ js.UndefOr[Double] => Unit): Self = this.set("setTimeout", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetTimeout: Self = this.set("setTimeout", js.undefined)
    
    @scala.inline
    def setSetTrackResetOnLoad(value: /* trackResetOnLoad */ js.UndefOr[Boolean] => Unit): Self = this.set("setTrackResetOnLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetTrackResetOnLoad: Self = this.set("setTrackResetOnLoad", js.undefined)
    
    @scala.inline
    def setSetUrl(value: /* url */ js.UndefOr[String] => Unit): Self = this.set("setUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetUrl: Self = this.set("setUrl", js.undefined)
    
    @scala.inline
    def setSetValues(value: /* values */ js.UndefOr[js.Any] => IPanel): Self = this.set("setValues", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetValues: Self = this.set("setValues", js.undefined)
    
    @scala.inline
    def setShowMask(value: (/* cfg */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any]) => IPanel): Self = this.set("showMask", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteShowMask: Self = this.set("showMask", js.undefined)
    
    @scala.inline
    def setStandardSubmit(value: Boolean): Self = this.set("standardSubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStandardSubmit: Self = this.set("standardSubmit", js.undefined)
    
    @scala.inline
    def setSubmit(value: /* options */ js.UndefOr[js.Any] => IConnection): Self = this.set("submit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSubmit: Self = this.set("submit", js.undefined)
    
    @scala.inline
    def setSubmitOnAction(value: js.Any): Self = this.set("submitOnAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmitOnAction: Self = this.set("submitOnAction", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setTrackResetOnLoad(value: Boolean): Self = this.set("trackResetOnLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackResetOnLoad: Self = this.set("trackResetOnLoad", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setWaitMsgTarget(value: IElement): Self = this.set("waitMsgTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitMsgTarget: Self = this.set("waitMsgTarget", js.undefined)
    
    @scala.inline
    def setWaitTpl(value: js.Any): Self = this.set("waitTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitTpl: Self = this.set("waitTpl", js.undefined)
  }
}
