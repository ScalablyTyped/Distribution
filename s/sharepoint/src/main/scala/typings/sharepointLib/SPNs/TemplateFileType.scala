package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TemplateFileType extends js.Object

@JSGlobal("SP.TemplateFileType")
@js.native
object TemplateFileType extends js.Object {
  @js.native
  sealed trait formPage
    extends sharepointLib.SPNs.TemplateFileType
  
  @js.native
  sealed trait standardPage
    extends sharepointLib.SPNs.TemplateFileType
  
  @js.native
  sealed trait wikiPage
    extends sharepointLib.SPNs.TemplateFileType
  
  val formPage: formPage with java.lang.String = js.native
  val standardPage: standardPage with java.lang.String = js.native
  val wikiPage: wikiPage with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.TemplateFileType with java.lang.String] = js.native
}

