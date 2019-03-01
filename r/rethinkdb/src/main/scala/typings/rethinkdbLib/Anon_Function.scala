package typings
package rethinkdbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Function extends js.Object {
  var function: scala.Double
  var geo: scala.Boolean
  var index: java.lang.String
  var multi: scala.Boolean
  var outdated: scala.Boolean
  var ready: rethinkdbLib.rethinkdbLibNumbers.`true`
}

object Anon_Function {
  @scala.inline
  def apply(
    function: scala.Double,
    geo: scala.Boolean,
    index: java.lang.String,
    multi: scala.Boolean,
    outdated: scala.Boolean,
    ready: rethinkdbLib.rethinkdbLibNumbers.`true`
  ): Anon_Function = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("function")(function)
    __obj.updateDynamic("geo")(geo)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("multi")(multi)
    __obj.updateDynamic("outdated")(outdated)
    __obj.updateDynamic("ready")(ready)
    __obj.asInstanceOf[Anon_Function]
  }
}

