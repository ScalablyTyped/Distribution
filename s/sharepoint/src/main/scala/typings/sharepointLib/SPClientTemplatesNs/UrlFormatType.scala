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
  
  val Hyperlink: Hyperlink with java.lang.String = js.native
  val Image: Image with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPClientTemplatesNs.UrlFormatType with java.lang.String] = js.native
}

