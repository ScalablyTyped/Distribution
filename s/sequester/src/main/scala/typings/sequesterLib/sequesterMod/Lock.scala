package typings
package sequesterLib.sequesterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lock extends js.Object {
  var count: scala.Double
  def dispose(): scala.Unit
  def downgrade(): scala.Unit
  def exclude(cb: sequesterLib.Callback): scala.Unit
  def share(cb: sequesterLib.Callback): scala.Unit
  def unlock(): scala.Unit
}

