package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * OleDbProvider...
  */
@js.native
trait IOleDbProvider extends StObject {
  
  /**
    * This parameter is optional. Default is false.
    * Is set to true if the version of the OLEDB provider is 32-bit.
    */
  var qBit32: js.UndefOr[Boolean] = js.native
  
  /**
    * Description of the OLEDB provider.
    */
  var qDescription: String = js.native
  
  /**
    * Name of the OLEDB provider.
    */
  var qName: String = js.native
}
object IOleDbProvider {
  
  @scala.inline
  def apply(qDescription: String, qName: String): IOleDbProvider = {
    val __obj = js.Dynamic.literal(qDescription = qDescription.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOleDbProvider]
  }
  
  @scala.inline
  implicit class IOleDbProviderMutableBuilder[Self <: IOleDbProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQBit32(value: Boolean): Self = StObject.set(x, "qBit32", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQBit32Undefined: Self = StObject.set(x, "qBit32", js.undefined)
    
    @scala.inline
    def setQDescription(value: String): Self = StObject.set(x, "qDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQName(value: String): Self = StObject.set(x, "qName", value.asInstanceOf[js.Any])
  }
}
