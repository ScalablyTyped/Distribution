package typings.sentryTypes.dsnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dsn extends DsnComponents {
  
  /**
    * Renders the string representation of this Dsn.
    *
    * By default, this will render the public representation without the password
    * component. To get the deprecated private representation, set `withPassword`
    * to true.
    *
    * @param withPassword When set to true, the password will be included.
    */
  def toString(withPassword: Boolean): String = js.native
}
object Dsn {
  
  @scala.inline
  def apply(host: String, projectId: String, protocol: DsnProtocol, toString: Boolean => String, user: String): Dsn = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], toString = js.Any.fromFunction1(toString), user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dsn]
  }
  
  @scala.inline
  implicit class DsnOps[Self <: Dsn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setToString(value: Boolean => String): Self = this.set("toString", js.Any.fromFunction1(value))
  }
}
