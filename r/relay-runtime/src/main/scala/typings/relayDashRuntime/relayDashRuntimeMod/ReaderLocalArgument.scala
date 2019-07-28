package typings.relayDashRuntime.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderLocalArgument extends ReaderArgumentDefinition {
  val defaultValue: js.Any
  val kind: String
   // 'LocalArgument';
  val name: String
  val `type`: String
}

object ReaderLocalArgument {
  @scala.inline
  def apply(defaultValue: js.Any, kind: String, name: String, `type`: String): ReaderLocalArgument = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue, kind = kind, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ReaderLocalArgument]
  }
}

