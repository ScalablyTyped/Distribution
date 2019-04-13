package typings
package saneLib.saneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sane", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val FSEventsWatcher: org.scalablytyped.runtime.Instantiable2[
    /* dir */ java.lang.String, 
    /* options */ js.UndefOr[/* options */ Options], 
    SaneWatcher
  ] = js.native
  val NodeWatcher: org.scalablytyped.runtime.Instantiable2[
    /* dir */ java.lang.String, 
    /* options */ js.UndefOr[/* options */ Options], 
    SaneWatcher
  ] = js.native
  val PollWatcher: org.scalablytyped.runtime.Instantiable2[
    /* dir */ java.lang.String, 
    /* options */ js.UndefOr[/* options */ Options], 
    SaneWatcher
  ] = js.native
  val WatchmanWatcher: org.scalablytyped.runtime.Instantiable2[
    /* dir */ java.lang.String, 
    /* options */ js.UndefOr[/* options */ Options], 
    SaneWatcher
  ] = js.native
  def apply(dir: java.lang.String): Watcher = js.native
  def apply(dir: java.lang.String, options: Options): Watcher = js.native
}

