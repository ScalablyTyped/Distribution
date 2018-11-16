package typings
package scriptjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait $script extends js.Object {
  def apply(paths: java.lang.String, idOrDone: java.lang.String): $script = js.native
  def apply(paths: java.lang.String, idOrDone: java.lang.String, optDone: js.Function0[scala.Unit]): $script = js.native
  def apply(paths: java.lang.String, idOrDone: js.Function0[scala.Unit]): $script = js.native
  def apply(paths: java.lang.String, idOrDone: js.Function0[scala.Unit], optDone: js.Function0[scala.Unit]): $script = js.native
  def apply(paths: js.Array[java.lang.String], idOrDone: java.lang.String): $script = js.native
  def apply(paths: js.Array[java.lang.String], idOrDone: java.lang.String, optDone: js.Function0[scala.Unit]): $script = js.native
  def apply(paths: js.Array[java.lang.String], idOrDone: js.Function0[scala.Unit]): $script = js.native
  def apply(
    paths: js.Array[java.lang.String],
    idOrDone: js.Function0[scala.Unit],
    optDone: js.Function0[scala.Unit]
  ): $script = js.native
  def get(path: java.lang.String, fn: js.Function0[scala.Unit]): scala.Unit = js.native
  def order(scripts: js.Array[java.lang.String], id: java.lang.String, done: js.Function0[scala.Unit]): scala.Unit = js.native
  def path(p: java.lang.String): scala.Unit = js.native
  def ready(deps: java.lang.String, ready: js.Function0[scala.Unit]): $script = js.native
  def ready(
    deps: java.lang.String,
    ready: js.Function0[scala.Unit],
    req: js.Function1[/* missing */ js.Array[java.lang.String], scala.Unit]
  ): $script = js.native
  def ready(deps: js.Array[java.lang.String], ready: js.Function0[scala.Unit]): $script = js.native
  def ready(
    deps: js.Array[java.lang.String],
    ready: js.Function0[scala.Unit],
    req: js.Function1[/* missing */ js.Array[java.lang.String], scala.Unit]
  ): $script = js.native
  def urlArgs(str: java.lang.String): scala.Unit = js.native
}

