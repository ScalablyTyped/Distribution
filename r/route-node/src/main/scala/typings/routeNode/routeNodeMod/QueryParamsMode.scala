package typings.routeNode.routeNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.routeNode.routeNodeStrings.default
  - typings.routeNode.routeNodeStrings.strict
  - typings.routeNode.routeNodeStrings.loose
*/
trait QueryParamsMode extends js.Object

object QueryParamsMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typings.routeNode.routeNodeStrings.default = this.cast("default")
  @scala.inline
  def loose: typings.routeNode.routeNodeStrings.loose = this.cast("loose")
  @scala.inline
  def strict: typings.routeNode.routeNodeStrings.strict = this.cast("strict")
}

