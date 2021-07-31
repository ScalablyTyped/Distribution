package typings.reactInspector.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectRootLabelProps extends StObject {
  
  var data: js.UndefOr[js.Any] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object ObjectRootLabelProps {
  
  @scala.inline
  def apply(): ObjectRootLabelProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectRootLabelProps]
  }
  
  @scala.inline
  implicit class ObjectRootLabelPropsMutableBuilder[Self <: ObjectRootLabelProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
