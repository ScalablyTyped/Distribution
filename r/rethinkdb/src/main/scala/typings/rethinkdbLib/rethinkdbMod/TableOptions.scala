package typings
package rethinkdbLib.rethinkdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableOptions extends js.Object {
   // 'soft'
  var cache_size: js.UndefOr[scala.Double] = js.undefined
  var datacenter: js.UndefOr[java.lang.String] = js.undefined
   // 'id'
  var durability: js.UndefOr[java.lang.String] = js.undefined
  var primary_key: js.UndefOr[java.lang.String] = js.undefined
}

object TableOptions {
  @scala.inline
  def apply(
    cache_size: scala.Int | scala.Double = null,
    datacenter: java.lang.String = null,
    durability: java.lang.String = null,
    primary_key: java.lang.String = null
  ): TableOptions = {
    val __obj = js.Dynamic.literal()
    if (cache_size != null) __obj.updateDynamic("cache_size")(cache_size.asInstanceOf[js.Any])
    if (datacenter != null) __obj.updateDynamic("datacenter")(datacenter)
    if (durability != null) __obj.updateDynamic("durability")(durability)
    if (primary_key != null) __obj.updateDynamic("primary_key")(primary_key)
    __obj.asInstanceOf[TableOptions]
  }
}

