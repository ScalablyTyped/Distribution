package typings.relayRuntime.libStoreRelayStoreTypesMod

import typings.relayRuntime.libNetworkRelayNetworkTypesMod.PayloadData
import typings.relayRuntime.relayRuntimeStrings.defer_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeferPlaceholder
  extends StObject
     with IncrementalDataPlaceholder {
  
  val data: PayloadData
  
  val kind: defer_
  
  val label: String
  
  val path: js.Array[String]
  
  val selector: NormalizationSelector
  
  val typeName: String
}
object DeferPlaceholder {
  
  inline def apply(
    data: PayloadData,
    label: String,
    path: js.Array[String],
    selector: NormalizationSelector,
    typeName: String
  ): DeferPlaceholder = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], kind = "defer", label = label.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeferPlaceholder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeferPlaceholder] (val x: Self) extends AnyVal {
    
    inline def setData(value: PayloadData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setKind(value: defer_): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setSelector(value: NormalizationSelector): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setTypeName(value: String): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
  }
}
