package typings.reduxSagaCore.anon

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in Name ]: (this : Ctx, args : ...any): any}
  */ typings.reduxSagaCore.reduxSagaCoreStrings.Context with TopLevel[js.Any] */, Name /* <: String */] extends js.Object {
  var context: Ctx
  var fn: Name
}

object Context {
  @scala.inline
  def apply[/* <: / * import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    * / typings.reduxSagaCore.reduxSagaCoreStrings.Context with org.scalablytyped.runtime.TopLevel[js.Any] */ Ctx, /* <: java.lang.String */ Name](context: Ctx, fn: Name): Context[Ctx, Name] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context[Ctx, Name]]
  }
}

