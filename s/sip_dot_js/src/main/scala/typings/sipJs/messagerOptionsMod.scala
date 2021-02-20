package typings.sipJs

import typings.sipJs.anon.FromDisplayName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messagerOptionsMod {
  
  @js.native
  trait MessagerOptions extends StObject {
    
    /** Array of extra headers added to the MESSAGE. */
    var extraHeaders: js.UndefOr[js.Array[String]] = js.native
    
    /** @deprecated TODO: provide alternative. */
    var params: js.UndefOr[FromDisplayName] = js.native
  }
  object MessagerOptions {
    
    @scala.inline
    def apply(): MessagerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessagerOptions]
    }
    
    @scala.inline
    implicit class MessagerOptionsMutableBuilder[Self <: MessagerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtraHeaders(value: js.Array[String]): Self = StObject.set(x, "extraHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraHeadersUndefined: Self = StObject.set(x, "extraHeaders", js.undefined)
      
      @scala.inline
      def setExtraHeadersVarargs(value: String*): Self = StObject.set(x, "extraHeaders", js.Array(value :_*))
      
      @scala.inline
      def setParams(value: FromDisplayName): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    }
  }
}
