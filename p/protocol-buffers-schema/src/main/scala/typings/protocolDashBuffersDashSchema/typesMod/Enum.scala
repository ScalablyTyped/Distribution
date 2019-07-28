package typings.protocolDashBuffersDashSchema.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.protocolDashBuffersDashSchema.Anon_Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Enum extends js.Object {
  var name: String
  var options: Options
  var values: StringDictionary[Anon_Options]
}

object Enum {
  @scala.inline
  def apply(name: String, options: Options, values: StringDictionary[Anon_Options]): Enum = {
    val __obj = js.Dynamic.literal(name = name, options = options, values = values)
  
    __obj.asInstanceOf[Enum]
  }
}

