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

