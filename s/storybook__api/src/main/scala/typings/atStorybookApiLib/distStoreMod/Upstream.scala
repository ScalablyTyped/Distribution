package typings
package atStorybookApiLib.distStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Upstream extends js.Object {
  var getState: GetState
  var setState: SetState
}

object Upstream {
  @scala.inline
  def apply(getState: GetState, setState: SetState): Upstream = {
    val __obj = js.Dynamic.literal(getState = getState, setState = setState)
  
    __obj.asInstanceOf[Upstream]
  }
}

