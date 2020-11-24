package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
