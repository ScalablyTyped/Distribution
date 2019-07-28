package typings.relayDashRuntime.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderVariable extends ReaderArgument {
  val kind: String
   // 'Variable';
  val name: String
  val `type`: js.UndefOr[String | Null] = js.undefined
  val variableName: String
}

object ReaderVariable {
  @scala.inline
  def apply(kind: String, name: String, variableName: String, `type`: String = null): ReaderVariable = {
    val __obj = js.Dynamic.literal(kind = kind, name = name, variableName = variableName)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ReaderVariable]
  }
}

