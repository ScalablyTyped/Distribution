package typings.reactOverlays.anon

import typings.reactOverlays.esmUsePopperMod.State
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForceUpdate extends StObject {
  
  var arrowProps: (Record[String, Any]) & Ref
  
  def forceUpdate(): Unit
  
  var placement: typings.reactOverlays.esmUsePopperMod.Placement
  
  var props: (Record[String, Any]) & Style
  
  var show: Boolean
  
  var state: js.UndefOr[State] = js.undefined
  
  def update(): Unit
}
object ForceUpdate {
  
  inline def apply(
    arrowProps: (Record[String, Any]) & Ref,
    forceUpdate: () => Unit,
    placement: typings.reactOverlays.esmUsePopperMod.Placement,
    props: (Record[String, Any]) & Style,
    show: Boolean,
    update: () => Unit
  ): ForceUpdate = {
    val __obj = js.Dynamic.literal(arrowProps = arrowProps.asInstanceOf[js.Any], forceUpdate = js.Any.fromFunction0(forceUpdate), placement = placement.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[ForceUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ForceUpdate] (val x: Self) extends AnyVal {
    
    inline def setArrowProps(value: (Record[String, Any]) & Ref): Self = StObject.set(x, "arrowProps", value.asInstanceOf[js.Any])
    
    inline def setForceUpdate(value: () => Unit): Self = StObject.set(x, "forceUpdate", js.Any.fromFunction0(value))
    
    inline def setPlacement(value: typings.reactOverlays.esmUsePopperMod.Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setProps(value: (Record[String, Any]) & Style): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
  }
}
