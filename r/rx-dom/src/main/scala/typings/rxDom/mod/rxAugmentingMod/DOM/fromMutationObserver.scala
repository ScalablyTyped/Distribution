package typings.rxDom.mod.rxAugmentingMod.DOM

import typings.rx.Rx.Observable
import typings.std.MutationEvent
import typings.std.MutationObserverInit
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "DOM.fromMutationObserver")
@js.native
object fromMutationObserver extends js.Object {
  // Mutation Observers
  def apply(target: Node, options: MutationObserverInit): Observable[MutationEvent] = js.native
}

