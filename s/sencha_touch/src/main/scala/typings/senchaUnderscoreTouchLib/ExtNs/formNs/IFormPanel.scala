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

