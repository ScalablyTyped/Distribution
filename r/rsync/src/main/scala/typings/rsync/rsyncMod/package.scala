package typings.rsync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rsyncMod {
  import org.scalablytyped.runtime.StringDictionary

  type Flag = StringDictionary[Boolean]
  type StreamDataHandler = js.Function1[/* data */ js.Any, Unit]
}
