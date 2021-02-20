package typings.scriptjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait script extends StObject {
  
  def apply(paths: String, idOrDone: String): script = js.native
  def apply(paths: String, idOrDone: String, optDone: js.Function0[Unit]): script = js.native
  def apply(paths: String, idOrDone: js.Function0[Unit]): script = js.native
  def apply(paths: String, idOrDone: js.Function0[Unit], optDone: js.Function0[Unit]): script = js.native
  def apply(paths: js.Array[String], idOrDone: String): script = js.native
  def apply(paths: js.Array[String], idOrDone: String, optDone: js.Function0[Unit]): script = js.native
  def apply(paths: js.Array[String], idOrDone: js.Function0[Unit]): script = js.native
  def apply(paths: js.Array[String], idOrDone: js.Function0[Unit], optDone: js.Function0[Unit]): script = js.native
  
  def get(path: String, fn: js.Function0[Unit]): Unit = js.native
  
  def order(scripts: js.Array[String], id: String, done: js.Function0[Unit]): Unit = js.native
  
  def path(p: String): Unit = js.native
  
  def ready(deps: String, ready: js.Function0[Unit]): script = js.native
  def ready(deps: String, ready: js.Function0[Unit], req: js.Function1[/* missing */ js.Array[String], Unit]): script = js.native
  def ready(deps: js.Array[String], ready: js.Function0[Unit]): script = js.native
  def ready(
    deps: js.Array[String],
    ready: js.Function0[Unit],
    req: js.Function1[/* missing */ js.Array[String], Unit]
  ): script = js.native
  
  def urlArgs(str: String): Unit = js.native
}
