package typings.proxyLists.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.proxyLists.proxyListsStrings.transparent
  - typings.proxyLists.proxyListsStrings.anonymous
  - typings.proxyLists.proxyListsStrings.elite
*/
trait AnonymityLevel extends js.Object

object AnonymityLevel {
  @scala.inline
  def anonymous: typings.proxyLists.proxyListsStrings.anonymous = this.cast("anonymous")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def elite: typings.proxyLists.proxyListsStrings.elite = this.cast("elite")
  @scala.inline
  def transparent: typings.proxyLists.proxyListsStrings.transparent = this.cast("transparent")
}

