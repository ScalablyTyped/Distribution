package typings.relayDashCompiler.libCoreGraphQLIRMod

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
    val __obj = js.Dynamic.literal(key = key, name = name)
    if (dynamicKey != null) __obj.updateDynamic("dynamicKey")(dynamicKey)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    __obj.asInstanceOf[Handle]
  }
}

