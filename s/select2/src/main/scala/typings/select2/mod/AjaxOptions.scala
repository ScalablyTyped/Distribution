package typings.select2.mod

import typings.jquery.JQueryAjaxSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in select2.select2.Sub<keyof jquery.JQueryAjaxSettings, 'url'> ]: jquery.JQueryAjaxSettings[P]} */ @js.native
trait AjaxOptions[Result, RemoteResult] extends StObject {
  
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
  implicit class AjaxOptionsMutableBuilder[Self <: AjaxOptions[_, _], Result, RemoteResult] (val x: Self with (AjaxOptions[Result, RemoteResult])) extends AnyVal {
    
    @scala.inline
    def setData(value: /* params */ QueryOptions => PlainObject[_]): Self = StObject.set(x, "data", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setProcessResults(value: (/* data */ RemoteResult, /* params */ QueryOptions) => ProcessedResult[Result]): Self = StObject.set(x, "processResults", js.Any.fromFunction2(value))
    
    @scala.inline
    def setProcessResultsUndefined: Self = StObject.set(x, "processResults", js.undefined)
    
    @scala.inline
    def setTransport(
      value: (/* settings */ JQueryAjaxSettings, /* success */ js.UndefOr[js.Function1[/* data */ RemoteResult, js.UndefOr[scala.Nothing]]], /* failure */ js.UndefOr[js.Function0[js.UndefOr[scala.Nothing]]]) => Unit
    ): Self = StObject.set(x, "transport", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
    
    @scala.inline
    def setUrl(value: String | (js.Function1[/* params */ QueryOptions, String])): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlFunction1(value: /* params */ QueryOptions => String): Self = StObject.set(x, "url", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
