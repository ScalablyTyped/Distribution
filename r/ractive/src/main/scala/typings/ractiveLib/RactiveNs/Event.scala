package typings
package ractiveLib.RactiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var component: js.UndefOr[Ractive] = js.undefined
  var context: js.Any
  var index: org.scalablytyped.runtime.StringDictionary[scala.Double]
  var keypath: java.lang.String
  // Since 0.6.0
  var name: java.lang.String
  var node: stdLib.HTMLElement
  var original: ractiveLib._RactiveEvent
}

object Event {
  @scala.inline
  def apply(
    context: js.Any,
    index: org.scalablytyped.runtime.StringDictionary[scala.Double],
    keypath: java.lang.String,
    name: java.lang.String,
    node: stdLib.HTMLElement,
    original: ractiveLib._RactiveEvent,
    component: Ractive = null
  ): Event = {
    val __obj = js.Dynamic.literal(context = context, index = index, keypath = keypath, name = name, node = node, original = original)
    if (component != null) __obj.updateDynamic("component")(component)
    __obj.asInstanceOf[Event]
  }
}

