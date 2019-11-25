package typings.atStorybookApi.atStorybookApiMod

import typings.atStorybookApi.distStoreMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreData extends js.Object {
  var store: default
}

object StoreData {
  @scala.inline
  def apply(store: default): StoreData = {
    val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StoreData]
  }
}

