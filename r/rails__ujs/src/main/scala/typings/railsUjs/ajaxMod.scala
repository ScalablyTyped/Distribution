package typings.railsUjs

import typings.std.BodyInit
import typings.std.Document
import typings.std.HTMLElement
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ajaxMod {
  
  @JSImport("@rails/ujs/utils/ajax", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def ajax(options: AjaxOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ajax")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def href(element: HTMLElement): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("href")(element.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  @scala.inline
  def isCrossDomain(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCrossDomain")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait AjaxOptions extends StObject {
    
    var accept: js.UndefOr[String] = js.undefined
    
    var beforeSend: js.UndefOr[js.Function2[/* xhr */ XMLHttpRequest, /* options */ this.type, Unit]] = js.undefined
    
    var complete: js.UndefOr[js.Function2[/* xhr */ XMLHttpRequest, /* statusText */ String, Unit]] = js.undefined
    
    var crossDomain: js.UndefOr[Boolean] = js.undefined
    
    var data: js.UndefOr[Document | BodyInit | Null] = js.undefined
    
    var dataType: js.UndefOr[String] = js.undefined
    
    var error: js.UndefOr[
        js.Function3[/* response */ js.Any, /* statusText */ String, /* xhr */ XMLHttpRequest, Unit]
      ] = js.undefined
    
    var success: js.UndefOr[
        js.Function3[/* response */ js.Any, /* statusText */ String, /* xhr */ XMLHttpRequest, Unit]
      ] = js.undefined
    
    var `type`: String
    
    var url: String
    
    var withCredentials: js.UndefOr[Boolean] = js.undefined
  }
  object AjaxOptions {
    
    @scala.inline
    def apply(`type`: String, url: String): AjaxOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AjaxOptions]
    }
    
    @scala.inline
    implicit class AjaxOptionsMutableBuilder[Self <: AjaxOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      @scala.inline
      def setBeforeSend(value: (/* xhr */ XMLHttpRequest, AjaxOptions) => Unit): Self = StObject.set(x, "beforeSend", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBeforeSendUndefined: Self = StObject.set(x, "beforeSend", js.undefined)
      
      @scala.inline
      def setComplete(value: (/* xhr */ XMLHttpRequest, /* statusText */ String) => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      @scala.inline
      def setCrossDomain(value: Boolean): Self = StObject.set(x, "crossDomain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossDomainUndefined: Self = StObject.set(x, "crossDomain", js.undefined)
      
      @scala.inline
      def setData(value: Document | BodyInit): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataNull: Self = StObject.set(x, "data", null)
      
      @scala.inline
      def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setError(value: (/* response */ js.Any, /* statusText */ String, /* xhr */ XMLHttpRequest) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction3(value))
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setSuccess(value: (/* response */ js.Any, /* statusText */ String, /* xhr */ XMLHttpRequest) => Unit): Self = StObject.set(x, "success", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
}
