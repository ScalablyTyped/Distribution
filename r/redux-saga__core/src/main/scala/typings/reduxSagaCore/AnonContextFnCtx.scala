package typings.reduxSagaCore

import typings.reduxSagaCore.reduxSagaCoreStrings.Anon_ContextFnCtx
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContextFnCtx[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in Name ]: (this : Ctx, args : ...any): void}
  */ Anon_ContextFnCtx with js.Any */, Name /* <: String */] extends js.Object {
  var context: Ctx
  var fn: Name
}

object AnonContextFnCtx {
  @scala.inline
  def apply[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): void}
    */ Anon_ContextFnCtx with js.Any */, Name /* <: String */](context: Ctx, fn: Name): AnonContextFnCtx[Ctx, Name] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContextFnCtx[Ctx, Name]]
  }
}

