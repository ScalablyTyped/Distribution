package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommitTreeNode extends StObject {
  
  var children: js.Array[Double]
  
  var displayName: String | Null
  
  var hocDisplayNames: js.Array[String] | Null
  
  var id: Double
  
  var key: Double | String | Null
  
  var parentID: Double
  
  var treeBaseDuration: Double
  
  var `type`: ElementType
}
object CommitTreeNode {
  
  inline def apply(
    children: js.Array[Double],
    id: Double,
    parentID: Double,
    treeBaseDuration: Double,
    `type`: ElementType
  ): CommitTreeNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], parentID = parentID.asInstanceOf[js.Any], treeBaseDuration = treeBaseDuration.asInstanceOf[js.Any], displayName = null, hocDisplayNames = null, key = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitTreeNode]
  }
  
  extension [Self <: CommitTreeNode](x: Self) {
    
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
    
    inline def setParentID(value: Double): Self = StObject.set(x, "parentID", value.asInstanceOf[js.Any])
    
    inline def setTreeBaseDuration(value: Double): Self = StObject.set(x, "treeBaseDuration", value.asInstanceOf[js.Any])
    
    inline def setType(value: ElementType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
