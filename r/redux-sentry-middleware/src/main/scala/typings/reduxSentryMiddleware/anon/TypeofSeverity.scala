package typings.reduxSentryMiddleware.anon

import typings.sentryTypes.severityMod.Severity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofSeverity extends js.Object {
  
  /**
    * Converts a string-based level into a {@link Severity}.
    *
    * @param level string representation of Severity
    * @returns Severity
    */
  def fromString(level: String): Severity = js.native
}
object TypeofSeverity {
  
  @scala.inline
  def apply(fromString: String => Severity): TypeofSeverity = {
    val __obj = js.Dynamic.literal(fromString = js.Any.fromFunction1(fromString))
    __obj.asInstanceOf[TypeofSeverity]
  }
  
  @scala.inline
  implicit class TypeofSeverityOps[Self <: TypeofSeverity] (val x: Self) extends AnyVal {
    
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
    def setFromString(value: String => Severity): Self = this.set("fromString", js.Any.fromFunction1(value))
  }
}
