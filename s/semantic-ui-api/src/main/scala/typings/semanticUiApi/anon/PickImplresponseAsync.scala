package typings.semanticUiApi.anon

import typings.semanticUiApi.SemanticUI.ApiSettings
import typings.semanticUiApi.semanticUiApiBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'responseAsync'> */
@js.native
trait PickImplresponseAsync extends js.Object {
  var responseAsync: (js.Function2[
    /* settings */ ApiSettings, 
    /* callback */ js.Function1[/* response */ js.Any, Unit], 
    Unit
  ]) | `false` = js.native
}

object PickImplresponseAsync {
  @scala.inline
  def apply(
    responseAsync: (js.Function2[
      /* settings */ ApiSettings, 
      /* callback */ js.Function1[/* response */ js.Any, Unit], 
      Unit
    ]) | `false`
  ): PickImplresponseAsync = {
    val __obj = js.Dynamic.literal(responseAsync = responseAsync.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplresponseAsync]
  }
  @scala.inline
  implicit class PickImplresponseAsyncOps[Self <: PickImplresponseAsync] (val x: Self) extends AnyVal {
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
    def setResponseAsyncFunction2(
      value: (/* settings */ ApiSettings, /* callback */ js.Function1[/* response */ js.Any, Unit]) => Unit
    ): Self = this.set("responseAsync", js.Any.fromFunction2(value))
    @scala.inline
    def setResponseAsync(
      value: (js.Function2[
          /* settings */ ApiSettings, 
          /* callback */ js.Function1[/* response */ js.Any, Unit], 
          Unit
        ]) | `false`
    ): Self = this.set("responseAsync", value.asInstanceOf[js.Any])
  }
  
}

