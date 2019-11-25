package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.`text/html`
  - typings.std.stdStrings.`text/xml`
  - typings.std.stdStrings.`application/xml`
  - typings.std.stdStrings.`application/xhtml+xml`
  - typings.std.stdStrings.`image/svg+xml`
*/
trait SupportedType extends js.Object

object SupportedType {
  @scala.inline
  def `application/xhtml+xml`: typings.std.stdStrings.`application/xhtml+xml` = this.cast("application/xhtml+xml")
  @scala.inline
  def `application/xml`: typings.std.stdStrings.`application/xml` = this.cast("application/xml")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `image/svg+xml`: typings.std.stdStrings.`image/svg+xml` = this.cast("image/svg+xml")
  @scala.inline
  def `text/html`: typings.std.stdStrings.`text/html` = this.cast("text/html")
  @scala.inline
  def `text/xml`: typings.std.stdStrings.`text/xml` = this.cast("text/xml")
}

