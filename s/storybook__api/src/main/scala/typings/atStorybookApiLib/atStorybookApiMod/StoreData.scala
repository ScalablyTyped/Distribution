package typings
package atStorybookApiLib.atStorybookApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreData extends js.Object {
  var store: atStorybookApiLib.distStoreMod.default
}

object StoreData {
  @scala.inline
  def apply(store: atStorybookApiLib.distStoreMod.default): StoreData = {
    val __obj = js.Dynamic.literal(store = store)
  
    __obj.asInstanceOf[StoreData]
  }
}

