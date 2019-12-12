package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.SP.TemplateFileType.formPage
import typings.sharepoint.SP.TemplateFileType.standardPage
import typings.sharepoint.SP.TemplateFileType.wikiPage
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TemplateFileType with Double] = js.native
  /* 2 */ @js.native
  object formPage extends TopLevel[formPage with Double]
  
  /* 0 */ @js.native
  object standardPage extends TopLevel[standardPage with Double]
  
  /* 1 */ @js.native
  object wikiPage extends TopLevel[wikiPage with Double]
  
}

