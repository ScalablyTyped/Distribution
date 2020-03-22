package typings.reduxSagaCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContextFn[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in Name ]: (this : Ctx, args : ...any): void}
  */ typings.reduxSagaCore.reduxSagaCoreStrings.AnonContextFn with js.Any */, Name /* <: String */] extends js.Object {
  var context: Ctx
  var fn: Name
}

object AnonContextFn {
  @scala.inline
  def apply[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): void}
    */ typings.reduxSagaCore.reduxSagaCoreStrings.AnonContextFn with js.Any */, Name /* <: String */](context: Ctx, fn: Name): AnonContextFn[Ctx, Name] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContextFn[Ctx, Name]]
  }
}

