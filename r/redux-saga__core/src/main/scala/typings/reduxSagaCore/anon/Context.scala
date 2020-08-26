package typings.reduxSagaCore.anon

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in Name ]: (this : Ctx, args : ...any): any}
  */ typings.reduxSagaCore.reduxSagaCoreStrings.Context with TopLevel[js.Any] */, Name /* <: String */] extends js.Object {
  var context: Ctx = js.native
  var fn: Name = js.native
}

object Context {
  @scala.inline
  def apply[/* <: / * import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    * / typings.reduxSagaCore.reduxSagaCoreStrings.Context with org.scalablytyped.runtime.TopLevel[js.Any] */ Ctx, /* <: java.lang.String */ Name](context: Ctx, fn: Name): Context[Ctx, Name] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context[Ctx, Name]]
  }
  @scala.inline
  implicit class ContextOps[Self <: Context[_, _], /* <: / * import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    * / typings.reduxSagaCore.reduxSagaCoreStrings.Context with org.scalablytyped.runtime.TopLevel[js.Any] */ Ctx, /* <: java.lang.String */ Name] (val x: Self with (Context[Ctx, Name])) extends AnyVal {
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
    def setContext(value: Ctx): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setFn(value: Name): Self = this.set("fn", value.asInstanceOf[js.Any])
  }
  
}

