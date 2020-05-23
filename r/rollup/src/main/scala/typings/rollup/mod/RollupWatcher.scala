package typings.rollup.mod

import typings.rollup.anon.Change
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RollupWatcher extends TypedEventEmitter[Change] {
  def close(): Unit = js.native
}

