package typings
package siestaLib.SiestaNs.HarnessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITestGroupDescriptor extends js.Object {
  var group: java.lang.String
  var items: js.Array[_]
}

object ITestGroupDescriptor {
  @scala.inline
  def apply(group: java.lang.String, items: js.Array[_]): ITestGroupDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("group")(group)
    __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[ITestGroupDescriptor]
  }
}

