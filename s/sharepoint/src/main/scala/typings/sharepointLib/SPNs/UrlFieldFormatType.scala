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
  
  val hyperlink: hyperlink with java.lang.String = js.native
  val image: image with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.UrlFieldFormatType with java.lang.String] = js.native
}

