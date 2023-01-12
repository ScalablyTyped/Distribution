package typings.reactTypesShared.srcDndMod

import typings.reactTypesShared.reactTypesSharedStrings.root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RootDropTarget
  extends StObject
     with DropTarget {
  
  /** The event type. */
  var `type`: root
}
object RootDropTarget {
  
  inline def apply(): RootDropTarget = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("root")
    __obj.asInstanceOf[RootDropTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RootDropTarget] (val x: Self) extends AnyVal {
    
    inline def setType(value: root): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
