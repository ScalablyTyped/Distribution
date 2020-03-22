package typings.rascal.mod

import typings.rascal.rascalStrings.exchange
import typings.rascal.rascalStrings.queue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindingConfig extends js.Object {
  var bindingKey: js.UndefOr[String] = js.undefined
  var bindingKeys: js.UndefOr[js.Array[String]] = js.undefined
  var destination: js.UndefOr[String] = js.undefined
  var destinationType: js.UndefOr[queue | exchange] = js.undefined
  var options: js.UndefOr[js.Any] = js.undefined
  var source: js.UndefOr[String] = js.undefined
}

object BindingConfig {
  @scala.inline
  def apply(
    bindingKey: String = null,
    bindingKeys: js.Array[String] = null,
    destination: String = null,
    destinationType: queue | exchange = null,
    options: js.Any = null,
    source: String = null
  ): BindingConfig = {
    val __obj = js.Dynamic.literal()
    if (bindingKey != null) __obj.updateDynamic("bindingKey")(bindingKey.asInstanceOf[js.Any])
    if (bindingKeys != null) __obj.updateDynamic("bindingKeys")(bindingKeys.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (destinationType != null) __obj.updateDynamic("destinationType")(destinationType.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingConfig]
  }
}

