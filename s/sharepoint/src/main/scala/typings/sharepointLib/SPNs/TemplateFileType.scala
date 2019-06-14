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
  
  /* 2 */ val formPage: formPage with scala.Double = js.native
  /* 0 */ val standardPage: standardPage with scala.Double = js.native
  /* 1 */ val wikiPage: wikiPage with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.TemplateFileType with scala.Double] = js.native
}

