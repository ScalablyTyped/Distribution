package typings
package shipitLib.shipitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Task extends js.Object {
  var blocking: scala.Boolean
  var dep: js.Array[java.lang.String]
  var name: java.lang.String
  def fn(): scala.Unit
}

