package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UrlFieldFormatType extends js.Object

@JSGlobal("SP.UrlFieldFormatType")
@js.native
object UrlFieldFormatType extends js.Object {
  @js.native
  sealed trait hyperlink
    extends sharepointLib.SPNs.UrlFieldFormatType
  
  @js.native
  sealed trait image
    extends sharepointLib.SPNs.UrlFieldFormatType
  
  /* 0 */ val hyperlink: hyperlink with scala.Double = js.native
  /* 1 */ val image: image with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.UrlFieldFormatType with scala.Double] = js.native
}

