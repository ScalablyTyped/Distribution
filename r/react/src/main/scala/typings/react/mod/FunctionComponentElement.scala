package typings.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionComponentElement[P]
  extends StObject
     with ReactElement {
  
  var ref: js.UndefOr[js.Any] = js.undefined
}
object FunctionComponentElement {
  
  @scala.inline
  def apply[P](props: js.Any, `type`: js.Any): FunctionComponentElement[P] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], key = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionComponentElement[P]]
  }
  
  @scala.inline
  implicit class FunctionComponentElementMutableBuilder[Self <: FunctionComponentElement[?], P] (val x: Self & FunctionComponentElement[P]) extends AnyVal {
    
    @scala.inline
    def setRef(value: js.Any): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
