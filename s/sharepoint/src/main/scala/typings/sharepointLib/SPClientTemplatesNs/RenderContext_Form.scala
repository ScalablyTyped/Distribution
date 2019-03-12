package typings
package sharepointLib.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderContext_Form extends RenderContext {
  var CSRCustomLayout: js.UndefOr[scala.Boolean] = js.undefined
  var CurrentItem: Item
  var FieldControlModes: org.scalablytyped.runtime.StringDictionary[ClientControlMode]
  var FormContext: ClientFormContext
  var FormUniqueId: java.lang.String
  var ListData: ListData_InForm
  var ListSchema: ListSchema_InForm
}

object RenderContext_Form {
  @scala.inline
  def apply(
    CurrentItem: Item,
    FieldControlModes: org.scalablytyped.runtime.StringDictionary[ClientControlMode],
    FormContext: ClientFormContext,
    FormUniqueId: java.lang.String,
    ListData: ListData_InForm,
    ListSchema: ListSchema_InForm,
    BaseViewID: scala.Int | scala.Double = null,
    CSRCustomLayout: js.UndefOr[scala.Boolean] = js.undefined,
    ControlMode: ClientControlMode = null,
    CurrentCultureName: java.lang.String = null,
    CurrentLanguage: scala.Int | scala.Double = null,
    CurrentSelectedItems: js.Any = null,
    CurrentUICultureName: java.lang.String = null,
    ListTemplateType: scala.Int | scala.Double = null,
    OnPostRender: RenderCallback | js.Array[RenderCallback] = null,
    OnPreRender: RenderCallback | js.Array[RenderCallback] = null,
    RenderBody: RenderContext_Form => java.lang.String = null,
    RenderFieldByName: (RenderContext_Form, /* fieldName */ java.lang.String) => java.lang.String = null,
    RenderFields: RenderContext_Form => java.lang.String = null,
    RenderFooter: RenderContext_Form => java.lang.String = null,
    RenderGroups: RenderContext_Form => java.lang.String = null,
    RenderHeader: RenderContext_Form => java.lang.String = null,
    RenderItems: RenderContext_Form => java.lang.String = null,
    RenderView: RenderContext_Form => java.lang.String = null,
    SiteClientTag: java.lang.String = null,
    Templates: Templates = null,
    onRefreshFailed: js.Any = null
  ): RenderContext_Form = {
    val __obj = js.Dynamic.literal(CurrentItem = CurrentItem, FieldControlModes = FieldControlModes, FormContext = FormContext, FormUniqueId = FormUniqueId, ListData = ListData, ListSchema = ListSchema)
    if (BaseViewID != null) __obj.updateDynamic("BaseViewID")(BaseViewID.asInstanceOf[js.Any])
    if (!js.isUndefined(CSRCustomLayout)) __obj.updateDynamic("CSRCustomLayout")(CSRCustomLayout)
    if (ControlMode != null) __obj.updateDynamic("ControlMode")(ControlMode)
    if (CurrentCultureName != null) __obj.updateDynamic("CurrentCultureName")(CurrentCultureName)
    if (CurrentLanguage != null) __obj.updateDynamic("CurrentLanguage")(CurrentLanguage.asInstanceOf[js.Any])
    if (CurrentSelectedItems != null) __obj.updateDynamic("CurrentSelectedItems")(CurrentSelectedItems)
    if (CurrentUICultureName != null) __obj.updateDynamic("CurrentUICultureName")(CurrentUICultureName)
    if (ListTemplateType != null) __obj.updateDynamic("ListTemplateType")(ListTemplateType.asInstanceOf[js.Any])
    if (OnPostRender != null) __obj.updateDynamic("OnPostRender")(OnPostRender.asInstanceOf[js.Any])
    if (OnPreRender != null) __obj.updateDynamic("OnPreRender")(OnPreRender.asInstanceOf[js.Any])
    if (RenderBody != null) __obj.updateDynamic("RenderBody")(js.Any.fromFunction1(RenderBody))
    if (RenderFieldByName != null) __obj.updateDynamic("RenderFieldByName")(js.Any.fromFunction2(RenderFieldByName))
    if (RenderFields != null) __obj.updateDynamic("RenderFields")(js.Any.fromFunction1(RenderFields))
    if (RenderFooter != null) __obj.updateDynamic("RenderFooter")(js.Any.fromFunction1(RenderFooter))
    if (RenderGroups != null) __obj.updateDynamic("RenderGroups")(js.Any.fromFunction1(RenderGroups))
    if (RenderHeader != null) __obj.updateDynamic("RenderHeader")(js.Any.fromFunction1(RenderHeader))
    if (RenderItems != null) __obj.updateDynamic("RenderItems")(js.Any.fromFunction1(RenderItems))
    if (RenderView != null) __obj.updateDynamic("RenderView")(js.Any.fromFunction1(RenderView))
    if (SiteClientTag != null) __obj.updateDynamic("SiteClientTag")(SiteClientTag)
    if (Templates != null) __obj.updateDynamic("Templates")(Templates)
    if (onRefreshFailed != null) __obj.updateDynamic("onRefreshFailed")(onRefreshFailed)
    __obj.asInstanceOf[RenderContext_Form]
  }
}

