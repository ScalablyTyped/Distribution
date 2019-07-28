package typings.sharepoint.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TemplateFileType extends js.Object

@JSGlobal("SP.TemplateFileType")
@js.native
object TemplateFileType extends js.Object {
  @js.native
  sealed trait formPage extends TemplateFileType
  
  @js.native
  sealed trait standardPage extends TemplateFileType
  
  @js.native
  sealed trait wikiPage extends TemplateFileType
  
  /* 2 */ val formPage: typings.sharepoint.SPNs.TemplateFileType.formPage with Double = js.native
  /* 0 */ val standardPage: typings.sharepoint.SPNs.TemplateFileType.standardPage with Double = js.native
  /* 1 */ val wikiPage: typings.sharepoint.SPNs.TemplateFileType.wikiPage with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TemplateFileType with Double] = js.native
}

