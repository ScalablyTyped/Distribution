package typings.relayDashRuntime.relayDashRuntimeMod

import typings.relayDashRuntime.relayDashRuntimeStrings.ClientExtension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderClientExtension extends ReaderSelection {
  val kind: ClientExtension
  val selections: js.Array[ReaderSelection]
}

object ReaderClientExtension {
  @scala.inline
  def apply(kind: ClientExtension, selections: js.Array[ReaderSelection]): ReaderClientExtension = {
    val __obj = js.Dynamic.literal(kind = kind, selections = selections)
  
    __obj.asInstanceOf[ReaderClientExtension]
  }
}

