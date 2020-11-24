package typings.smartFoxServer.SFS2X.Entities.Variables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MMOItemVariable extends SFSUserVariable
object MMOItemVariable {
  
  @scala.inline
  def apply(getTypeName: Double => String, isNull: () => Boolean, name: String, value: Double): MMOItemVariable = {
    val __obj = js.Dynamic.literal(getTypeName = js.Any.fromFunction1(getTypeName), isNull = js.Any.fromFunction0(isNull), name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MMOItemVariable]
  }
}
