package typings.ravenDashJs.ravenDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ravenDashJs.ravenDashJsStrings.navigation
  - typings.ravenDashJs.ravenDashJsStrings.http
*/
trait BreadcrumbType extends js.Object

object BreadcrumbType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def http: typings.ravenDashJs.ravenDashJsStrings.http = this.cast("http")
  @scala.inline
  def navigation: typings.ravenDashJs.ravenDashJsStrings.navigation = this.cast("navigation")
}

