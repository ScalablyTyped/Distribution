package typings.reactRemoveScroll

import typings.react.mod.CSSProperties
import typings.react.mod.ElementType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.RefAttributes
import typings.react.mod.RefObject
import typings.reactRemoveScroll.anon.FullWidth
import typings.reactRemoveScroll.anon.SideCar
import typings.reactRemoveScroll.reactRemoveScrollBooleans.`false`
import typings.reactRemoveScroll.reactRemoveScrollBooleans.`true`
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactRemoveScroll.reactRemoveScrollStrings.v
    - typings.reactRemoveScroll.reactRemoveScrollStrings.h
  */
  trait Axis extends StObject
  object Axis {
    
    inline def h: typings.reactRemoveScroll.reactRemoveScrollStrings.h = "h".asInstanceOf[typings.reactRemoveScroll.reactRemoveScrollStrings.h]
    
    inline def v: typings.reactRemoveScroll.reactRemoveScrollStrings.v = "v".asInstanceOf[typings.reactRemoveScroll.reactRemoveScrollStrings.v]
  }
  
  trait ChildrenForward extends StObject {
    
    var children: ReactElement
    
    /**
      * if forwardProps is true - children should be single Element
      * which would NOT with a div
      * @see {@link IRemoveScrollSelfProps.as}
      */
    var forwardProps: `true`
  }
  object ChildrenForward {
    
    inline def apply(children: ReactElement): ChildrenForward = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], forwardProps = true)
      __obj.asInstanceOf[ChildrenForward]
    }
    
    extension [Self <: ChildrenForward](x: Self) {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setForwardProps(value: `true`): Self = StObject.set(x, "forwardProps", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChildrenNode extends StObject {
    
    var children: ReactNode
    
    /**
      * if forwardProps is false - children should be ReactNode
      * and it would be wrapper with a div
      * @see {@link IRemoveScrollSelfProps.as}
      */
    var forwardProps: js.UndefOr[`false`] = js.undefined
  }
  object ChildrenNode {
    
    inline def apply(): ChildrenNode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChildrenNode]
    }
    
    extension [Self <: ChildrenNode](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setForwardProps(value: `false`): Self = StObject.set(x, "forwardProps", value.asInstanceOf[js.Any])
      
      inline def setForwardPropsUndefined: Self = StObject.set(x, "forwardProps", js.undefined)
    }
  }
  
  trait IRemoveScrollEffectProps extends StObject {
    
    var allowPinchZoom: Boolean
    
    var inert: js.UndefOr[Boolean] = js.undefined
    
    var lockRef: RefObject[HTMLElement]
    
    var noIsolation: js.UndefOr[Boolean] = js.undefined
    
    var removeScrollBar: js.UndefOr[Boolean] = js.undefined
    
    def setCallbacks(cb: RemoveScrollEffectCallbacks): Unit
    
    var shards: js.UndefOr[js.Array[RefObject[Any] | HTMLElement]] = js.undefined
  }
  object IRemoveScrollEffectProps {
    
    inline def apply(
      allowPinchZoom: Boolean,
      lockRef: RefObject[HTMLElement],
      setCallbacks: RemoveScrollEffectCallbacks => Unit
    ): IRemoveScrollEffectProps = {
      val __obj = js.Dynamic.literal(allowPinchZoom = allowPinchZoom.asInstanceOf[js.Any], lockRef = lockRef.asInstanceOf[js.Any], setCallbacks = js.Any.fromFunction1(setCallbacks))
      __obj.asInstanceOf[IRemoveScrollEffectProps]
    }
    
    extension [Self <: IRemoveScrollEffectProps](x: Self) {
      
      inline def setAllowPinchZoom(value: Boolean): Self = StObject.set(x, "allowPinchZoom", value.asInstanceOf[js.Any])
      
      inline def setInert(value: Boolean): Self = StObject.set(x, "inert", value.asInstanceOf[js.Any])
      
      inline def setInertUndefined: Self = StObject.set(x, "inert", js.undefined)
      
      inline def setLockRef(value: RefObject[HTMLElement]): Self = StObject.set(x, "lockRef", value.asInstanceOf[js.Any])
      
      inline def setNoIsolation(value: Boolean): Self = StObject.set(x, "noIsolation", value.asInstanceOf[js.Any])
      
      inline def setNoIsolationUndefined: Self = StObject.set(x, "noIsolation", js.undefined)
      
      inline def setRemoveScrollBar(value: Boolean): Self = StObject.set(x, "removeScrollBar", value.asInstanceOf[js.Any])
      
      inline def setRemoveScrollBarUndefined: Self = StObject.set(x, "removeScrollBar", js.undefined)
      
      inline def setSetCallbacks(value: RemoveScrollEffectCallbacks => Unit): Self = StObject.set(x, "setCallbacks", js.Any.fromFunction1(value))
      
      inline def setShards(value: js.Array[RefObject[Any] | HTMLElement]): Self = StObject.set(x, "shards", value.asInstanceOf[js.Any])
      
      inline def setShardsUndefined: Self = StObject.set(x, "shards", js.undefined)
      
      inline def setShardsVarargs(value: (RefObject[Any] | HTMLElement)*): Self = StObject.set(x, "shards", js.Array(value*))
    }
  }
  
  type IRemoveScrollProps = (ChildrenForward & IRemoveScrollSelfProps) | (ChildrenNode & IRemoveScrollSelfProps)
  
  trait IRemoveScrollSelfProps extends StObject {
    
    /**
      * allows pinch-zoom, however might work not perfectly for normal scroll
      */
    var allowPinchZoom: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Control host node used for the lock.
      * @default 'div'
      */
    var as: js.UndefOr[String | ElementType[Any]] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * switches on/off the behavior of the component
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * enabled complete Lock isolation using `pointer-events:none` for anything outside the Lock
      * you probably don't need it, except you do
      * @default false
      * @see {IRemoveScrollSelfProps.noIsolation}
      */
    var inert: js.UndefOr[Boolean] = js.undefined
    
    /**
      * disables "event isolation" (suppressing of events happening outside of the Lock)
      * @default false
      */
    var noIsolation: js.UndefOr[Boolean] = js.undefined
    
    var ref: js.UndefOr[Ref[HTMLElement]] = js.undefined
    
    /**
      * Controls the body scroll bar removal
      * @default false
      */
    var removeScrollBar: js.UndefOr[Boolean] = js.undefined
    
    /**
      * array of refs to other Elements, which should be considered as a part of the Lock
      */
    var shards: js.UndefOr[js.Array[RefObject[Any] | HTMLElement]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object IRemoveScrollSelfProps {
    
    inline def apply(): IRemoveScrollSelfProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRemoveScrollSelfProps]
    }
    
    extension [Self <: IRemoveScrollSelfProps](x: Self) {
      
      inline def setAllowPinchZoom(value: Boolean): Self = StObject.set(x, "allowPinchZoom", value.asInstanceOf[js.Any])
      
      inline def setAllowPinchZoomUndefined: Self = StObject.set(x, "allowPinchZoom", js.undefined)
      
      inline def setAs(value: String | ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setInert(value: Boolean): Self = StObject.set(x, "inert", value.asInstanceOf[js.Any])
      
      inline def setInertUndefined: Self = StObject.set(x, "inert", js.undefined)
      
      inline def setNoIsolation(value: Boolean): Self = StObject.set(x, "noIsolation", value.asInstanceOf[js.Any])
      
      inline def setNoIsolationUndefined: Self = StObject.set(x, "noIsolation", js.undefined)
      
      inline def setRef(value: Ref[HTMLElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setRemoveScrollBar(value: Boolean): Self = StObject.set(x, "removeScrollBar", value.asInstanceOf[js.Any])
      
      inline def setRemoveScrollBarUndefined: Self = StObject.set(x, "removeScrollBar", js.undefined)
      
      inline def setShards(value: js.Array[RefObject[Any] | HTMLElement]): Self = StObject.set(x, "shards", value.asInstanceOf[js.Any])
      
      inline def setShardsUndefined: Self = StObject.set(x, "shards", js.undefined)
      
      inline def setShardsVarargs(value: (RefObject[Any] | HTMLElement)*): Self = StObject.set(x, "shards", js.Array(value*))
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type IRemoveScrollUIProps = IRemoveScrollProps & SideCar
  
  @js.native
  trait RefForwarded[T]
    extends StObject
       with ForwardRefExoticComponent[T & RefAttributes[HTMLElement]]
       with WithClassNames
  
  trait RemoveScrollEffectCallbacks extends StObject {
    
    def onScrollCapture(event: Any): Unit
    
    def onTouchMoveCapture(event: Any): Unit
    
    def onWheelCapture(event: Any): Unit
  }
  object RemoveScrollEffectCallbacks {
    
    inline def apply(onScrollCapture: Any => Unit, onTouchMoveCapture: Any => Unit, onWheelCapture: Any => Unit): RemoveScrollEffectCallbacks = {
      val __obj = js.Dynamic.literal(onScrollCapture = js.Any.fromFunction1(onScrollCapture), onTouchMoveCapture = js.Any.fromFunction1(onTouchMoveCapture), onWheelCapture = js.Any.fromFunction1(onWheelCapture))
      __obj.asInstanceOf[RemoveScrollEffectCallbacks]
    }
    
    extension [Self <: RemoveScrollEffectCallbacks](x: Self) {
      
      inline def setOnScrollCapture(value: Any => Unit): Self = StObject.set(x, "onScrollCapture", js.Any.fromFunction1(value))
      
      inline def setOnTouchMoveCapture(value: Any => Unit): Self = StObject.set(x, "onTouchMoveCapture", js.Any.fromFunction1(value))
      
      inline def setOnWheelCapture(value: Any => Unit): Self = StObject.set(x, "onWheelCapture", js.Any.fromFunction1(value))
    }
  }
  
  type RemoveScrollType = RefForwarded[IRemoveScrollProps]
  
  type RemoveScrollUIType = RefForwarded[IRemoveScrollUIProps]
  
  trait WithClassNames extends StObject {
    
    var classNames: FullWidth
  }
  object WithClassNames {
    
    inline def apply(classNames: FullWidth): WithClassNames = {
      val __obj = js.Dynamic.literal(classNames = classNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithClassNames]
    }
    
    extension [Self <: WithClassNames](x: Self) {
      
      inline def setClassNames(value: FullWidth): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
    }
  }
}
