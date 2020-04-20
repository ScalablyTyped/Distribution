package typings.relayRuntime.relayStoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptimisticUpdateFunction extends OptimisticUpdate {
  def storeUpdater(store: RecordSourceProxy): Unit
}

object OptimisticUpdateFunction {
  @scala.inline
  def apply(storeUpdater: RecordSourceProxy => Unit): OptimisticUpdateFunction = {
    val __obj = js.Dynamic.literal(storeUpdater = js.Any.fromFunction1(storeUpdater))
    __obj.asInstanceOf[OptimisticUpdateFunction]
  }
}

