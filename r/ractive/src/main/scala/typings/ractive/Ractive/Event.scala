package typings.ractive.Ractive

import org.scalablytyped.runtime.StringDictionary
import typings.ractive._RactiveEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var component: js.UndefOr[typings.ractive.Ractive.Ractive] = js.undefined
  var context: js.Any
  var index: StringDictionary[Double]
  var keypath: String
  // Since 0.6.0
  var name: String
  var node: HTMLElement
  var original: _RactiveEvent
}

object Event {
  @scala.inline
  def apply(
    context: js.Any,
    index: StringDictionary[Double],
    keypath: String,
    name: String,
    node: HTMLElement,
    original: _RactiveEvent,
    component: typings.ractive.Ractive.Ractive = null
  ): Event = {
    val __obj = js.Dynamic.literal(context = context, index = index, keypath = keypath, name = name, node = node, original = original)
    if (component != null) __obj.updateDynamic("component")(component)
    __obj.asInstanceOf[Event]
  }
}

