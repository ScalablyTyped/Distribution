package typings
package simmerjsLib.simmerjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Queryable extends Scope {
  @JSName("querySelectorAll")
  var querySelectorAll_Original: QueryEngine = js.native
  def querySelectorAll(selector: java.lang.String, onError: js.Function1[/* error */ js.Any, scala.Unit]): stdLib.ArrayLike[stdLib.Element] = js.native
}

