package typings
package snapsvgLib.snapsvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fragment extends js.Object {
  //TODO: The documentation says that selectAll returns a set, but the getting started guide
  // uses .attr on the returned object. That's not supported by a set
  def select(query: java.lang.String): Element = js.native
  def selectAll(): Set = js.native
  def selectAll(query: java.lang.String): Set = js.native
}

