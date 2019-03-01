package typings
package sharepointLib.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderContext extends js.Object {
  var BaseViewID: js.UndefOr[scala.Double] = js.undefined
  var ControlMode: js.UndefOr[ClientControlMode] = js.undefined
  var CurrentCultureName: js.UndefOr[java.lang.String] = js.undefined
  var CurrentLanguage: js.UndefOr[scala.Double] = js.undefined
  var CurrentSelectedItems: js.UndefOr[js.Any] = js.undefined
  var CurrentUICultureName: js.UndefOr[java.lang.String] = js.undefined
  var ListTemplateType: js.UndefOr[scala.Double] = js.undefined
  var OnPostRender: js.UndefOr[RenderCallback | js.Array[RenderCallback]] = js.undefined
  var OnPreRender: js.UndefOr[RenderCallback | js.Array[RenderCallback]] = js.undefined
  var RenderBody: js.UndefOr[js.Function1[/* renderContext */ this.type, java.lang.String]] = js.undefined
  var RenderFieldByName: js.UndefOr[
    js.Function2[/* renderContext */ this.type, /* fieldName */ java.lang.String, java.lang.String]
  ] = js.undefined
  var RenderFields: js.UndefOr[js.Function1[/* renderContext */ this.type, java.lang.String]] = js.undefined
  var RenderFooter: js.UndefOr[js.Function1[/* renderContext */ this.type, java.lang.String]] = js.undefined
  var RenderGroups: js.UndefOr[js.Function1[/* renderContext */ this.type, java.lang.String]] = js.undefined
  var RenderHeader: js.UndefOr[js.Function1[/* renderContext */ this.type, java.lang.String]] = js.undefined
  var RenderItems: js.UndefOr[js.Function1[/* renderContext */ this.type, java.lang.String]] = js.undefined
  var RenderView: js.UndefOr[js.Function1[/* renderContext */ this.type, java.lang.String]] = js.undefined
  var SiteClientTag: js.UndefOr[java.lang.String] = js.undefined
  var Templates: js.UndefOr[Templates] = js.undefined
  var onRefreshFailed: js.UndefOr[js.Any] = js.undefined
}

object RenderContext {
  @scala.inline
  def apply(
    BaseViewID: scala.Int | scala.Double = null,
    ControlMode: ClientControlMode = null,
    CurrentCultureName: java.lang.String = null,
    CurrentLanguage: scala.Int | scala.Double = null,
    CurrentSelectedItems: js.Any = null,
    CurrentUICultureName: java.lang.String = null,
    ListTemplateType: scala.Int | scala.Double = null,
    OnPostRender: RenderCallback | js.Array[RenderCallback] = null,
    OnPreRender: RenderCallback | js.Array[RenderCallback] = null,
    RenderBody: js.Function1[RenderContext, java.lang.String] = null,
    RenderFieldByName: js.Function2[RenderContext, /* fieldName */ java.lang.String, java.lang.String] = null,
    RenderFields: js.Function1[RenderContext, java.lang.String] = null,
    RenderFooter: js.Function1[RenderContext, java.lang.String] = null,
    RenderGroups: js.Function1[RenderContext, java.lang.String] = null,
    RenderHeader: js.Function1[RenderContext, java.lang.String] = null,
    RenderItems: js.Function1[RenderContext, java.lang.String] = null,
    RenderView: js.Function1[RenderContext, java.lang.String] = null,
    SiteClientTag: java.lang.String = null,
    Templates: Templates = null,
    onRefreshFailed: js.Any = null
  ): RenderContext = {
    val __obj = js.Dynamic.literal()
    if (BaseViewID != null) __obj.updateDynamic("BaseViewID")(BaseViewID.asInstanceOf[js.Any])
    if (ControlMode != null) __obj.updateDynamic("ControlMode")(ControlMode)
    if (CurrentCultureName != null) __obj.updateDynamic("CurrentCultureName")(CurrentCultureName)
    if (CurrentLanguage != null) __obj.updateDynamic("CurrentLanguage")(CurrentLanguage.asInstanceOf[js.Any])
    if (CurrentSelectedItems != null) __obj.updateDynamic("CurrentSelectedItems")(CurrentSelectedItems)
    if (CurrentUICultureName != null) __obj.updateDynamic("CurrentUICultureName")(CurrentUICultureName)
    if (ListTemplateType != null) __obj.updateDynamic("ListTemplateType")(ListTemplateType.asInstanceOf[js.Any])
    if (OnPostRender != null) __obj.updateDynamic("OnPostRender")(OnPostRender.asInstanceOf[js.Any])
    if (OnPreRender != null) __obj.updateDynamic("OnPreRender")(OnPreRender.asInstanceOf[js.Any])
    if (RenderBody != null) __obj.updateDynamic("RenderBody")(RenderBody)
    if (RenderFieldByName != null) __obj.updateDynamic("RenderFieldByName")(RenderFieldByName)
    if (RenderFields != null) __obj.updateDynamic("RenderFields")(RenderFields)
    if (RenderFooter != null) __obj.updateDynamic("RenderFooter")(RenderFooter)
    if (RenderGroups != null) __obj.updateDynamic("RenderGroups")(RenderGroups)
    if (RenderHeader != null) __obj.updateDynamic("RenderHeader")(RenderHeader)
    if (RenderItems != null) __obj.updateDynamic("RenderItems")(RenderItems)
    if (RenderView != null) __obj.updateDynamic("RenderView")(RenderView)
    if (SiteClientTag != null) __obj.updateDynamic("SiteClientTag")(SiteClientTag)
    if (Templates != null) __obj.updateDynamic("Templates")(Templates)
    if (onRefreshFailed != null) __obj.updateDynamic("onRefreshFailed")(onRefreshFailed)
    __obj.asInstanceOf[RenderContext]
  }
}

