package typings.select2.mod

import typings.jquery.JQueryAjaxSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in select2.select2.Sub<keyof jquery.JQueryAjaxSettings, 'url'> ]: jquery.JQueryAjaxSettings[P]} */ @js.native
trait AjaxOptions[Result, RemoteResult] extends js.Object {
  
  var data: js.UndefOr[js.Function1[/* params */ QueryOptions, PlainObject[_]]] = js.native
  
  var delay: js.UndefOr[Double] = js.native
  
  var processResults: js.UndefOr[
    js.Function2[/* data */ RemoteResult, /* params */ QueryOptions, ProcessedResult[Result]]
  ] = js.native
  
  var transport: js.UndefOr[
    js.Function3[
      /* settings */ JQueryAjaxSettings, 
      /* success */ js.UndefOr[js.Function1[/* data */ RemoteResult, js.UndefOr[scala.Nothing]]], 
      /* failure */ js.UndefOr[js.Function0[js.UndefOr[scala.Nothing]]], 
      Unit
    ]
  ] = js.native
  
  var url: js.UndefOr[String | (js.Function1[/* params */ QueryOptions, String])] = js.native
}
object AjaxOptions {
  
  @scala.inline
  def apply[Result, RemoteResult](): AjaxOptions[Result, RemoteResult] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AjaxOptions[Result, RemoteResult]]
  }
  
  @scala.inline
  implicit class AjaxOptionsOps[Self <: AjaxOptions[_, _], Result, RemoteResult] (val x: Self with (AjaxOptions[Result, RemoteResult])) extends AnyVal {
    
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
    def setData(value: /* params */ QueryOptions => PlainObject[_]): Self = this.set("data", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setProcessResults(value: (/* data */ RemoteResult, /* params */ QueryOptions) => ProcessedResult[Result]): Self = this.set("processResults", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteProcessResults: Self = this.set("processResults", js.undefined)
    
    @scala.inline
    def setTransport(
      value: (/* settings */ JQueryAjaxSettings, /* success */ js.UndefOr[js.Function1[/* data */ RemoteResult, js.UndefOr[scala.Nothing]]], /* failure */ js.UndefOr[js.Function0[js.UndefOr[scala.Nothing]]]) => Unit
    ): Self = this.set("transport", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTransport: Self = this.set("transport", js.undefined)
    
    @scala.inline
    def setUrlFunction1(value: /* params */ QueryOptions => String): Self = this.set("url", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUrl(value: String | (js.Function1[/* params */ QueryOptions, String])): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
