package typings
package protocolDashBuffersDashSchemaLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Enum extends js.Object {
  var name: java.lang.String
  var options: Options
  var values: org.scalablytyped.runtime.StringDictionary[protocolDashBuffersDashSchemaLib.Anon_Options]
}

object Enum {
  @scala.inline
  def apply(
    name: java.lang.String,
    options: Options,
    values: org.scalablytyped.runtime.StringDictionary[protocolDashBuffersDashSchemaLib.Anon_Options]
  ): Enum = {
    val __obj = js.Dynamic.literal(name = name, options = options, values = values)
  
    __obj.asInstanceOf[Enum]
  }
}

