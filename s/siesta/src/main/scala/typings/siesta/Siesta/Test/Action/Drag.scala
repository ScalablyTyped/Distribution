package typings.siesta.Siesta.Test.Action

import typings.siesta.Siesta.Test.IAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @class
  */
trait Drag
  extends StObject
     with IAction {
  
  var by: js.UndefOr[js.Any] = js.undefined
  
  var dragOnly: js.UndefOr[Boolean] = js.undefined
  
  var source: js.UndefOr[js.Any] = js.undefined
  
  var target: js.UndefOr[js.Any] = js.undefined
  
  var to: js.UndefOr[js.Any] = js.undefined
}
object Drag {
  
  @scala.inline
  def apply(): Drag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Drag]
  }
  
  @scala.inline
  implicit class DragMutableBuilder[Self <: Drag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBy(value: js.Any): Self = StObject.set(x, "by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByUndefined: Self = StObject.set(x, "by", js.undefined)
    
    @scala.inline
    def setDragOnly(value: Boolean): Self = StObject.set(x, "dragOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragOnlyUndefined: Self = StObject.set(x, "dragOnly", js.undefined)
    
    @scala.inline
    def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setTo(value: js.Any): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
