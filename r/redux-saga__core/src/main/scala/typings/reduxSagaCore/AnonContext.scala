package typings.reduxSagaCore

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContext[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in Name ]: (this : Ctx, args : ...any): any}
  */ typings.reduxSagaCore.reduxSagaCoreStrings.AnonContext with TopLevel[js.Any] */, Name /* <: String */] extends js.Object {
  var context: Ctx
  var fn: Name
}

object AnonContext {
  @scala.inline
  def apply[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ typings.reduxSagaCore.reduxSagaCoreStrings.AnonContext with TopLevel[js.Any] */, Name /* <: String */](context: Ctx, fn: Name): AnonContext[Ctx, Name] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContext[Ctx, Name]]
  }
}

