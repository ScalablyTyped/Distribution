package typings
package seenLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_F extends js.Object {
  def f(f: js.Any): js.Any
  def v(v: js.Any): js.Any
}

object Anon_F {
  @scala.inline
  def apply(f: js.Function1[js.Any, js.Any], v: js.Function1[js.Any, js.Any]): Anon_F = {
    val __obj = js.Dynamic.literal(f = f, v = v)
  
    __obj.asInstanceOf[Anon_F]
  }
}

