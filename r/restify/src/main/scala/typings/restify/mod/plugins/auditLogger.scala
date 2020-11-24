package typings.restify.mod.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("restify", "plugins.auditLogger")
@js.native
object auditLogger extends js.Object {
  
  /**
    * An audit logger for recording all handled requests
    */
  def apply(options: AuditLoggerOptions): js.Function1[/* repeated */ js.Any, Unit] = js.native
}
