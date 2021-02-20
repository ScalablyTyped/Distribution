package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INxPageTreeNode extends StObject {
  
  /**
    * When set to true, generated nodes (based on current selection) will be inserted into the returned tree even when
    * there is no actual value. For example, suppose you are looking for hybrid car sales at all car dealerships.
    * Normally, only dealerships where hybrid cars are sold would be part of the returned tree but with qAllValues set to true,
    * all available dealerships will be included regardless if they sold any hybrid cars or not.
    */
  var qAllValues: Boolean = js.native
  
  /**
    * The area of the tree to be fetched. If no area is defined on a dimension, all existing nodes are included.
    */
  var qArea: IRect = js.native
}
object INxPageTreeNode {
  
  @scala.inline
  def apply(qAllValues: Boolean, qArea: IRect): INxPageTreeNode = {
    val __obj = js.Dynamic.literal(qAllValues = qAllValues.asInstanceOf[js.Any], qArea = qArea.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxPageTreeNode]
  }
  
  @scala.inline
  implicit class INxPageTreeNodeMutableBuilder[Self <: INxPageTreeNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQAllValues(value: Boolean): Self = StObject.set(x, "qAllValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQArea(value: IRect): Self = StObject.set(x, "qArea", value.asInstanceOf[js.Any])
  }
}
