package typings.reduxSagaCore.anon

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fn[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in Name ]: (this : Ctx, args : ...any): void}
  */ typings.reduxSagaCore.reduxSagaCoreStrings.Fn with TopLevel[js.Any] */, Name /* <: String */] extends js.Object {
  var context: Ctx
  var fn: Name
}

object Fn {
  @scala.inline
  def apply[Ctx, Name](context: Ctx, fn: Name): Fn[Ctx, Name] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fn[Ctx, Name]]
  }
}

