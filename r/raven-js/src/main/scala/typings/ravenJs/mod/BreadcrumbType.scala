package typings.ravenJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ravenJs.ravenJsStrings.navigation
  - typings.ravenJs.ravenJsStrings.http
*/
trait BreadcrumbType extends js.Object

object BreadcrumbType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def http: typings.ravenJs.ravenJsStrings.http = this.cast("http")
  @scala.inline
  def navigation: typings.ravenJs.ravenJsStrings.navigation = this.cast("navigation")
}

