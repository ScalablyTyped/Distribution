package typings
package protocolDashBuffersDashSchemaLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Service extends js.Object {
  var methods: js.Array[Method]
  var name: java.lang.String
  var options: Options
}

object Service {
  @scala.inline
  def apply(methods: js.Array[Method], name: java.lang.String, options: Options): Service = {
    val __obj = js.Dynamic.literal(methods = methods, name = name, options = options)
  
    __obj.asInstanceOf[Service]
  }
}

