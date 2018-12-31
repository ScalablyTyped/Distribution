package typings
package routieLib.routieNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route extends js.Object {
  def addHandler(fn: js.Function): scala.Unit
  def `match`(path: java.lang.String, params: js.Any): scala.Boolean
  def removeHandler(fn: js.Function): scala.Unit
  def run(params: js.Any): scala.Unit
  def toURL(params: js.Any): java.lang.String
}

