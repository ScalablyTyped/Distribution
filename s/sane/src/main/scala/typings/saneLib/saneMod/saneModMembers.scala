package typings
package saneLib.saneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sane", JSImport.Namespace)
@js.native
object saneModMembers extends js.Object {
  val FSEventsWatcher: ScalablyTyped.runtime.Instantiable2[
    /* dir */ java.lang.String, 
    /* options */ js.UndefOr[/* options */ saneLib.saneMod.saneNs.Options], 
    SaneWatcher
  ] = js.native
  val NodeWatcher: ScalablyTyped.runtime.Instantiable2[
    /* dir */ java.lang.String, 
    /* options */ js.UndefOr[/* options */ saneLib.saneMod.saneNs.Options], 
    SaneWatcher
  ] = js.native
  val PollWatcher: ScalablyTyped.runtime.Instantiable2[
    /* dir */ java.lang.String, 
    /* options */ js.UndefOr[/* options */ saneLib.saneMod.saneNs.Options], 
    SaneWatcher
  ] = js.native
  val WatchmanWatcher: ScalablyTyped.runtime.Instantiable2[
    /* dir */ java.lang.String, 
    /* options */ js.UndefOr[/* options */ saneLib.saneMod.saneNs.Options], 
    SaneWatcher
  ] = js.native
  def apply(dir: java.lang.String): saneLib.saneMod.saneNs.Watcher = js.native
  def apply(dir: java.lang.String, options: saneLib.saneMod.saneNs.Options): saneLib.saneMod.saneNs.Watcher = js.native
}

