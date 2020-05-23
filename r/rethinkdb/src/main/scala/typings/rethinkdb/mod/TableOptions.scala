package typings.rethinkdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableOptions extends js.Object {
   // 'soft'
  var cache_size: js.UndefOr[Double] = js.undefined
  var datacenter: js.UndefOr[String] = js.undefined
   // 'id'
  var durability: js.UndefOr[String] = js.undefined
  var primary_key: js.UndefOr[String] = js.undefined
}

object TableOptions {
  @scala.inline
  def apply(
    cache_size: js.UndefOr[Double] = js.undefined,
    datacenter: String = null,
    durability: String = null,
    primary_key: String = null
  ): TableOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cache_size)) __obj.updateDynamic("cache_size")(cache_size.get.asInstanceOf[js.Any])
    if (datacenter != null) __obj.updateDynamic("datacenter")(datacenter.asInstanceOf[js.Any])
    if (durability != null) __obj.updateDynamic("durability")(durability.asInstanceOf[js.Any])
    if (primary_key != null) __obj.updateDynamic("primary_key")(primary_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableOptions]
  }
}

