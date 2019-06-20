package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderLocalArgument extends ReaderArgumentDefinition {
  val defaultValue: js.Any
  val kind: java.lang.String
   // 'LocalArgument';
  val name: java.lang.String
  val `type`: java.lang.String
}

object ReaderLocalArgument {
  @scala.inline
  def apply(defaultValue: js.Any, kind: java.lang.String, name: java.lang.String, `type`: java.lang.String): ReaderLocalArgument = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue, kind = kind, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ReaderLocalArgument]
  }
}

