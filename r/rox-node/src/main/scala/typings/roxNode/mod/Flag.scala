package typings.roxNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rox-node", "Flag")
@js.native
class Flag () extends js.Object {
  def this(defaultValue: Boolean) = this()
  
  // Default value of the Flag
  val defaultValue: Boolean = js.native
  
  // Returns true when the flag is enabled
  def isEnabled(): Boolean = js.native
  def isEnabled(context: js.Any): Boolean = js.native
  
  // The name of the Flag
  val name: String = js.native
}
