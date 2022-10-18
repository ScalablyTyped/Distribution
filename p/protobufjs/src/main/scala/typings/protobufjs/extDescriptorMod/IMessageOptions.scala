package typings.protobufjs.extDescriptorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMessageOptions extends StObject {
  
  var mapEntry: js.UndefOr[Boolean] = js.undefined
}
object IMessageOptions {
  
  inline def apply(): IMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMessageOptions]
  }
  
  extension [Self <: IMessageOptions](x: Self) {
    
    inline def setMapEntry(value: Boolean): Self = StObject.set(x, "mapEntry", value.asInstanceOf[js.Any])
    
    inline def setMapEntryUndefined: Self = StObject.set(x, "mapEntry", js.undefined)
  }
}
