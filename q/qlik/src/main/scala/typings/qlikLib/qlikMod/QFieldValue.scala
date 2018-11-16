package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QFieldValue extends js.Object {
  var qElemNumber: scala.Double = js.native
  var qFrequency: js.UndefOr[java.lang.String] = js.native
   // TODO
  var qNum: js.UndefOr[java.lang.String] = js.native
  var qState: js.Any = js.native
  var qText: java.lang.String = js.native
  def select(): stdLib.Promise[_] = js.native
  def select(toggle: scala.Boolean): stdLib.Promise[_] = js.native
  def select(toggle: scala.Boolean, softlock: scala.Boolean): stdLib.Promise[_] = js.native
}

