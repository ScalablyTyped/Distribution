package typings.reflectMetadata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait FnCall extends js.Object {
    
    def apply(target: js.Function): Unit = js.native
    def apply(target: js.Object, targetKey: String): Unit = js.native
    def apply(target: js.Object, targetKey: js.Symbol): Unit = js.native
  }
}
