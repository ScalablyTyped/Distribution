package typings.speakeasy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedOptions extends StObject {
  
  /**
    * Algorithm, defaults to sha1
    */
  var algorithm: js.UndefOr[Algorithm] = js.undefined
  
  /**
    * Key encoding, defaults to ascii
    */
  var encoding: js.UndefOr[Encoding] = js.undefined
}
object SharedOptions {
  
  @scala.inline
  def apply(): SharedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedOptions]
  }
  
  @scala.inline
  implicit class SharedOptionsMutableBuilder[Self <: SharedOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithm(value: Algorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    @scala.inline
    def setEncoding(value: Encoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
  }
}
