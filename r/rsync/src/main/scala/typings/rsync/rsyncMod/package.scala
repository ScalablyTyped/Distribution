package typings.rsync

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rsyncMod {
  type Flag = StringDictionary[Boolean]
  type StreamDataHandler = js.Function1[/* data */ js.Any, Unit]
}
