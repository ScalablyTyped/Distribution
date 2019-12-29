package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.textSlashhtml
  - typings.std.stdStrings.textSlashxml
  - typings.std.stdStrings.applicationSlashxml
  - typings.std.stdStrings.applicationSlashxhtmlPlussignxml
  - typings.std.stdStrings.imageSlashsvgPlussignxml
*/
trait SupportedType extends js.Object

object SupportedType {
  @scala.inline
  def applicationSlashxhtmlPlussignxml: typings.std.stdStrings.applicationSlashxhtmlPlussignxml = this.cast("application/xhtml+xml")
  @scala.inline
  def applicationSlashxml: typings.std.stdStrings.applicationSlashxml = this.cast("application/xml")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def imageSlashsvgPlussignxml: typings.std.stdStrings.imageSlashsvgPlussignxml = this.cast("image/svg+xml")
  @scala.inline
  def textSlashhtml: typings.std.stdStrings.textSlashhtml = this.cast("text/html")
  @scala.inline
  def textSlashxml: typings.std.stdStrings.textSlashxml = this.cast("text/xml")
}

