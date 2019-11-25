package typings.relayDashRuntime.libUtilReaderNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.relayDashRuntime.libUtilReaderNodeMod.ReaderLiteral
  - typings.relayDashRuntime.libUtilReaderNodeMod.ReaderVariable
*/
trait ReaderArgument extends js.Object

object ReaderArgument {
  @scala.inline
  def ReaderLiteral(kind: String, name: String, value: js.Any): ReaderArgument = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReaderArgument]
  }
  @scala.inline
  def ReaderVariable(kind: String, name: String, variableName: String, `type`: String = null): ReaderArgument = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], variableName = variableName.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderArgument]
  }
}

