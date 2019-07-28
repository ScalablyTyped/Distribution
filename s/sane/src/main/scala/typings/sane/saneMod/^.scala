package typings.sane.saneMod

import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sane", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val FSEventsWatcher: Instantiable2[/* dir */ String, js.UndefOr[/* options */ Options], SaneWatcher] = js.native
  val NodeWatcher: Instantiable2[/* dir */ String, js.UndefOr[/* options */ Options], SaneWatcher] = js.native
  val PollWatcher: Instantiable2[/* dir */ String, js.UndefOr[/* options */ Options], SaneWatcher] = js.native
  val WatchmanWatcher: Instantiable2[/* dir */ String, js.UndefOr[/* options */ Options], SaneWatcher] = js.native
  def apply(dir: String): Watcher = js.native
  def apply(dir: String, options: Options): Watcher = js.native
}

