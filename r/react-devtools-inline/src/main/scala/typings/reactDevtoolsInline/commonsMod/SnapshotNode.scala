package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotNode extends StObject {
  
  var children: js.Array[Double]
  
  var displayName: String | Null
  
  var hocDisplayNames: js.Array[String] | Null
  
  var id: Double
  
  var key: Double | String | Null
  
  var `type`: ElementType
}
object SnapshotNode {
  
  inline def apply(children: js.Array[Double], id: Double, `type`: ElementType): SnapshotNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], displayName = null, hocDisplayNames = null, key = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotNode]
  }
  
  extension [Self <: SnapshotNode](x: Self) {
    
    inline def setChildren(value: js.Array[Double]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: Double*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setHocDisplayNames(value: js.Array[String]): Self = StObject.set(x, "hocDisplayNames", value.asInstanceOf[js.Any])
    
    inline def setHocDisplayNamesNull: Self = StObject.set(x, "hocDisplayNames", null)
    
    inline def setHocDisplayNamesVarargs(value: String*): Self = StObject.set(x, "hocDisplayNames", js.Array(value*))
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Double | String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setType(value: ElementType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
