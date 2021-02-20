package typings.reactOverlays.anon

import typings.reactOverlays.usePopperMod.State
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrowProps extends StObject {
  
  var arrowProps: (Record[String, _]) with Ref = js.native
  
  def forceUpdate(): Unit = js.native
  
  var placement: typings.reactOverlays.usePopperMod.Placement = js.native
  
  var props: (Record[String, _]) with Style = js.native
  
  var show: Boolean = js.native
  
  var state: js.UndefOr[State] = js.native
  
  def update(): Unit = js.native
}
object ArrowProps {
  
  @scala.inline
  def apply(
    arrowProps: (Record[String, _]) with Ref,
    forceUpdate: () => Unit,
    placement: typings.reactOverlays.usePopperMod.Placement,
    props: (Record[String, _]) with Style,
    show: Boolean,
    update: () => Unit
  ): ArrowProps = {
    val __obj = js.Dynamic.literal(arrowProps = arrowProps.asInstanceOf[js.Any], forceUpdate = js.Any.fromFunction0(forceUpdate), placement = placement.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[ArrowProps]
  }
  
  @scala.inline
  implicit class ArrowPropsMutableBuilder[Self <: ArrowProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrowProps(value: (Record[String, _]) with Ref): Self = StObject.set(x, "arrowProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUpdate(value: () => Unit): Self = StObject.set(x, "forceUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPlacement(value: typings.reactOverlays.usePopperMod.Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: (Record[String, _]) with Style): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
  }
}
