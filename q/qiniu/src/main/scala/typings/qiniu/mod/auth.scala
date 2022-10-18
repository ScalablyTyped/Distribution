package typings.qiniu.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object auth {
  
  object digest {
    
    @JSImport("qiniu", "auth.digest.Mac")
    @js.native
    open class Mac () extends StObject {
      def this(accessKey: String) = this()
      def this(accessKey: String, secretKey: String) = this()
      def this(accessKey: Unit, secretKey: String) = this()
      def this(accessKey: String, secretKey: String, options: MacOptions) = this()
      def this(accessKey: String, secretKey: Unit, options: MacOptions) = this()
      def this(accessKey: Unit, secretKey: String, options: MacOptions) = this()
      def this(accessKey: Unit, secretKey: Unit, options: MacOptions) = this()
      
      var accessKey: String = js.native
      
      var secretKey: String = js.native
    }
    
    trait MacOptions extends StObject {
      
      var disableQiniuTimestampSignature: js.UndefOr[Boolean] = js.undefined
    }
    object MacOptions {
      
      inline def apply(): MacOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MacOptions]
      }
      
      extension [Self <: MacOptions](x: Self) {
        
        inline def setDisableQiniuTimestampSignature(value: Boolean): Self = StObject.set(x, "disableQiniuTimestampSignature", value.asInstanceOf[js.Any])
        
        inline def setDisableQiniuTimestampSignatureUndefined: Self = StObject.set(x, "disableQiniuTimestampSignature", js.undefined)
      }
    }
  }
}
