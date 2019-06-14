package typings
package sharepointLib.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UrlFormatType extends js.Object

@JSGlobal("SPClientTemplates.UrlFormatType")
@js.native
object UrlFormatType extends js.Object {
  @js.native
  sealed trait Hyperlink
    extends sharepointLib.SPClientTemplatesNs.UrlFormatType
  
  @js.native
  sealed trait Image
    extends sharepointLib.SPClientTemplatesNs.UrlFormatType
  
  /* 0 */ val Hyperlink: Hyperlink with scala.Double = js.native
  /* 1 */ val Image: Image with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPClientTemplatesNs.UrlFormatType with scala.Double] = js.native
}

