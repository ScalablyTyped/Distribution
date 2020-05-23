package typings.protocolBuffersSchema.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Enum extends js.Object {
  var name: String
  var options: Options
  var values: StringDictionary[typings.protocolBuffersSchema.anon.Options]
}

object Enum {
  @scala.inline
  def apply(
    name: String,
    options: Options,
    values: StringDictionary[typings.protocolBuffersSchema.anon.Options]
  ): Enum = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enum]
  }
}

