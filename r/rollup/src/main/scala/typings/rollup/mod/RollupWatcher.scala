package typings.rollup.mod

import typings.rollup.anon.Change
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RollupWatcher extends TypedEventEmitter[Change] {
  
  def close(): Unit = js.native
}
