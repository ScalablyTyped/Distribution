package typings.relayCompiler.graphQLIRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Handle extends js.Object {
  var dynamicKey: Variable | Null
  var filters: js.UndefOr[String] = js.undefined
  var key: String
  var name: String
}

object Handle {
  @scala.inline
  def apply(key: String, name: String, dynamicKey: Variable = null, filters: String = null): Handle = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (dynamicKey != null) __obj.updateDynamic("dynamicKey")(dynamicKey.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handle]
  }
}

