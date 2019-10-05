package typings.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SPClientTemplates.TemplateManager")
@js.native
class TemplateManager () extends js.Object

/* static members */
@JSGlobal("SPClientTemplates.TemplateManager")
@js.native
object TemplateManager extends js.Object {
  def GetTemplates(renderCtx: RenderContext): Templates = js.native
  def RegisterTemplateOverrides(renderCtx: TemplateOverridesOptions): Unit = js.native
}

