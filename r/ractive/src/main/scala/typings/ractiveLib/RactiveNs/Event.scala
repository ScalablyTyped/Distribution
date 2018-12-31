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

