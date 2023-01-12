package typings.reactNativeCryptoJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration options.
  */
trait BlockCipherOption extends StObject {
  
  /**
    * The block mode to use. Default: CBC
    */
  var mode: Mode_
  
  /**
    * The padding strategy to use. Default: Pkcs7
    */
  var padding: Padding
}
object BlockCipherOption {
  
  inline def apply(mode: Mode_, padding: Padding): BlockCipherOption = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockCipherOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlockCipherOption] (val x: Self) extends AnyVal {
    
    inline def setMode(value: Mode_): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
  }
}
