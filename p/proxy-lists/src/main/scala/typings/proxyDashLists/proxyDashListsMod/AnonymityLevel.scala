package typings.proxyDashLists.proxyDashListsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.proxyDashLists.proxyDashListsStrings.transparent
  - typings.proxyDashLists.proxyDashListsStrings.anonymous
  - typings.proxyDashLists.proxyDashListsStrings.elite
*/
trait AnonymityLevel extends js.Object

object AnonymityLevel {
  @scala.inline
  def anonymous: typings.proxyDashLists.proxyDashListsStrings.anonymous = this.cast("anonymous")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def elite: typings.proxyDashLists.proxyDashListsStrings.elite = this.cast("elite")
  @scala.inline
  def transparent: typings.proxyDashLists.proxyDashListsStrings.transparent = this.cast("transparent")
}

