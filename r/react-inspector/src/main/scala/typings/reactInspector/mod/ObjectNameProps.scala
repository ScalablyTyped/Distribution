package typings.reactInspector.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectNameProps extends StObject {
  
  var dimmed: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var styles: js.UndefOr[js.Object] = js.undefined
}
object ObjectNameProps {
  
  @scala.inline
  def apply(): ObjectNameProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectNameProps]
  }
  
  @scala.inline
  implicit class ObjectNamePropsMutableBuilder[Self <: ObjectNameProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimmed(value: Boolean): Self = StObject.set(x, "dimmed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimmedUndefined: Self = StObject.set(x, "dimmed", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setStyles(value: js.Object): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
