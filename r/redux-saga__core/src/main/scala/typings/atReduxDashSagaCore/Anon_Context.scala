package typings.atReduxDashSagaCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context[Ctx /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
{[ P in Name ]: (this : Ctx, args : ...any): any}
  */ typings.atReduxDashSagaCore.atReduxDashSagaCoreStrings.Anon_Context with js.Any */, Name /* <: String */] extends js.Object {
  var context: Ctx
  var fn: Name
}

object Anon_Context {
  @scala.inline
  def apply[Ctx /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ typings.atReduxDashSagaCore.atReduxDashSagaCoreStrings.Anon_Context with js.Any */, Name /* <: String */](context: Ctx, fn: Name): Anon_Context[Ctx, Name] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Context[Ctx, Name]]
  }
}

