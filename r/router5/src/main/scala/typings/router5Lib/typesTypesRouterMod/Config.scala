package typings
package router5Lib.typesTypesRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var decoders: stdLib.Record[java.lang.String, _]
  var defaultParams: stdLib.Record[java.lang.String, _]
  var encoders: stdLib.Record[java.lang.String, _]
  var forwardMap: stdLib.Record[java.lang.String, _]
}

object Config {
  @scala.inline
  def apply(
    decoders: stdLib.Record[java.lang.String, _],
    defaultParams: stdLib.Record[java.lang.String, _],
    encoders: stdLib.Record[java.lang.String, _],
    forwardMap: stdLib.Record[java.lang.String, _]
  ): Config = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decoders")(decoders)
    __obj.updateDynamic("defaultParams")(defaultParams)
    __obj.updateDynamic("encoders")(encoders)
    __obj.updateDynamic("forwardMap")(forwardMap)
    __obj.asInstanceOf[Config]
  }
}

