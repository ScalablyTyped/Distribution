package typings.purifycssWebpack

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Info extends StObject {
    
    var info: js.UndefOr[Boolean] = js.native
    
    var minify: js.UndefOr[Boolean] = js.native
    
    var output: js.UndefOr[String | Boolean] = js.native
    
    var rejected: js.UndefOr[Boolean] = js.native
    
    var whitelist: js.UndefOr[js.Array[String]] = js.native
  }
  object Info {
    
    @scala.inline
    def apply(): Info = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Info]
    }
    
    @scala.inline
    implicit class InfoMutableBuilder[Self <: Info] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInfo(value: Boolean): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      @scala.inline
      def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
      
      @scala.inline
      def setOutput(value: String | Boolean): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      @scala.inline
      def setRejected(value: Boolean): Self = StObject.set(x, "rejected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRejectedUndefined: Self = StObject.set(x, "rejected", js.undefined)
      
      @scala.inline
      def setWhitelist(value: js.Array[String]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
      
      @scala.inline
      def setWhitelistVarargs(value: String*): Self = StObject.set(x, "whitelist", js.Array(value :_*))
    }
  }
}
