package typings.rcMotion

import org.scalablytyped.runtime.Shortcut
import typings.rcMotion.anon.CSSMotionPropsrefRefanyun
import typings.rcMotion.anon.Dictkey
import typings.rcMotion.anon.Dictname
import typings.rcMotion.cssmotionMod.MotionName
import typings.rcMotion.diffMod.KeyObject
import typings.rcMotion.interfaceMod.MotionEndEventHandler
import typings.rcMotion.interfaceMod.MotionEvent
import typings.rcMotion.interfaceMod.MotionEventHandler
import typings.rcMotion.interfaceMod.MotionPrepareEventHandler
import typings.rcMotion.rcMotionBooleans.`false`
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.Key
import typings.react.mod.ReactElement
import typings.react.mod.Ref
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssmotionlistMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rc-motion/es/CSSMotionList", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[CSSMotionListProps, js.Any, js.Any] {
    def this(props: CSSMotionListProps) = this()
    def this(props: CSSMotionListProps, context: js.Any) = this()
  }
  @JSImport("rc-motion/es/CSSMotionList", JSImport.Default)
  @js.native
  val default: ComponentClass[CSSMotionListProps, js.Any] = js.native
  
  @JSImport("rc-motion/es/CSSMotionList", "genCSSMotionList")
  @js.native
  def genCSSMotionList(transitionSupport: Boolean): ComponentClass[CSSMotionListProps, ComponentState] = js.native
  @JSImport("rc-motion/es/CSSMotionList", "genCSSMotionList")
  @js.native
  def genCSSMotionList(transitionSupport: Boolean, CSSMotion: ForwardRefExoticComponent[CSSMotionPropsrefRefanyun]): ComponentClass[CSSMotionListProps, ComponentState] = js.native
  
  /* Inlined parent std.Omit<rc-motion.rc-motion/es/CSSMotion.CSSMotionProps, 'onVisibleChanged'> */
  @js.native
  trait CSSMotionListProps extends StObject {
    
    var children: js.UndefOr[
        js.Function2[/* props */ Dictkey, /* ref */ js.Function1[/* node */ js.Any, Unit], ReactElement]
      ] = js.native
    
    var component: js.UndefOr[String | ComponentType[js.Object] | `false`] = js.native
    
    var eventProps: js.UndefOr[js.Object] = js.native
    
    var forceRender: js.UndefOr[Boolean] = js.native
    
    var internalRef: js.UndefOr[Ref[_]] = js.native
    
    var keys: js.Array[Key | Dictname] = js.native
    
    var leavedClassName: js.UndefOr[String] = js.native
    
    var motionAppear: js.UndefOr[Boolean] = js.native
    
    var motionDeadline: js.UndefOr[Double] = js.native
    
    var motionEnter: js.UndefOr[Boolean] = js.native
    
    var motionLeave: js.UndefOr[Boolean] = js.native
    
    var motionLeaveImmediately: js.UndefOr[Boolean] = js.native
    
    var motionName: js.UndefOr[MotionName] = js.native
    
    var onAppearActive: js.UndefOr[MotionEventHandler] = js.native
    
    var onAppearEnd: js.UndefOr[MotionEndEventHandler] = js.native
    
    var onAppearPrepare: js.UndefOr[MotionPrepareEventHandler] = js.native
    
    var onAppearStart: js.UndefOr[MotionEventHandler] = js.native
    
    var onEnterActive: js.UndefOr[MotionEventHandler] = js.native
    
    var onEnterEnd: js.UndefOr[MotionEndEventHandler] = js.native
    
    var onEnterPrepare: js.UndefOr[MotionPrepareEventHandler] = js.native
    
    var onEnterStart: js.UndefOr[MotionEventHandler] = js.native
    
    var onLeaveActive: js.UndefOr[MotionEventHandler] = js.native
    
    var onLeaveEnd: js.UndefOr[MotionEndEventHandler] = js.native
    
    var onLeavePrepare: js.UndefOr[MotionPrepareEventHandler] = js.native
    
    var onLeaveStart: js.UndefOr[MotionEventHandler] = js.native
    
    /** This will always trigger after final visible changed. Even if no motion configured. */
    var onVisibleChanged: js.UndefOr[js.Function2[/* visible */ Boolean, /* info */ typings.rcMotion.anon.Key, Unit]] = js.native
    
    var removeOnLeave: js.UndefOr[Boolean] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
  }
  object CSSMotionListProps {
    
    @scala.inline
    def apply(keys: js.Array[Key | Dictname]): CSSMotionListProps = {
      val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
      __obj.asInstanceOf[CSSMotionListProps]
    }
    
    @scala.inline
    implicit class CSSMotionListPropsMutableBuilder[Self <: CSSMotionListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: (/* props */ Dictkey, /* ref */ js.Function1[/* node */ js.Any, Unit]) => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction2(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setComponent(value: String | ComponentType[js.Object] | `false`): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setEventProps(value: js.Object): Self = StObject.set(x, "eventProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventPropsUndefined: Self = StObject.set(x, "eventProps", js.undefined)
      
      @scala.inline
      def setForceRender(value: Boolean): Self = StObject.set(x, "forceRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceRenderUndefined: Self = StObject.set(x, "forceRender", js.undefined)
      
      @scala.inline
      def setInternalRef(value: Ref[_]): Self = StObject.set(x, "internalRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInternalRefFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "internalRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInternalRefNull: Self = StObject.set(x, "internalRef", null)
      
      @scala.inline
      def setInternalRefUndefined: Self = StObject.set(x, "internalRef", js.undefined)
      
      @scala.inline
      def setKeys(value: js.Array[Key | Dictname]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeysVarargs(value: (Key | Dictname)*): Self = StObject.set(x, "keys", js.Array(value :_*))
      
      @scala.inline
      def setLeavedClassName(value: String): Self = StObject.set(x, "leavedClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeavedClassNameUndefined: Self = StObject.set(x, "leavedClassName", js.undefined)
      
      @scala.inline
      def setMotionAppear(value: Boolean): Self = StObject.set(x, "motionAppear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionAppearUndefined: Self = StObject.set(x, "motionAppear", js.undefined)
      
      @scala.inline
      def setMotionDeadline(value: Double): Self = StObject.set(x, "motionDeadline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionDeadlineUndefined: Self = StObject.set(x, "motionDeadline", js.undefined)
      
      @scala.inline
      def setMotionEnter(value: Boolean): Self = StObject.set(x, "motionEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionEnterUndefined: Self = StObject.set(x, "motionEnter", js.undefined)
      
      @scala.inline
      def setMotionLeave(value: Boolean): Self = StObject.set(x, "motionLeave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionLeaveImmediately(value: Boolean): Self = StObject.set(x, "motionLeaveImmediately", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionLeaveImmediatelyUndefined: Self = StObject.set(x, "motionLeaveImmediately", js.undefined)
      
      @scala.inline
      def setMotionLeaveUndefined: Self = StObject.set(x, "motionLeave", js.undefined)
      
      @scala.inline
      def setMotionName(value: MotionName): Self = StObject.set(x, "motionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionNameUndefined: Self = StObject.set(x, "motionName", js.undefined)
      
      @scala.inline
      def setOnAppearActive(value: (/* element */ HTMLElement, /* event */ MotionEvent) => CSSProperties | Unit): Self = StObject.set(x, "onAppearActive", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnAppearActiveUndefined: Self = StObject.set(x, "onAppearActive", js.undefined)
      
      @scala.inline
      def setOnAppearEnd(value: (/* element */ HTMLElement, /* event */ MotionEvent) => Boolean | Unit): Self = StObject.set(x, "onAppearEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnAppearEndUndefined: Self = StObject.set(x, "onAppearEnd", js.undefined)
      
      @scala.inline
      def setOnAppearPrepare(value: /* element */ HTMLElement => js.Promise[js.Any] | Unit): Self = StObject.set(x, "onAppearPrepare", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAppearPrepareUndefined: Self = StObject.set(x, "onAppearPrepare", js.undefined)
      
      @scala.inline
      def setOnAppearStart(value: (/* element */ HTMLElement, /* event */ MotionEvent) => CSSProperties | Unit): Self = StObject.set(x, "onAppearStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnAppearStartUndefined: Self = StObject.set(x, "onAppearStart", js.undefined)
      
      @scala.inline
      def setOnEnterActive(value: (/* element */ HTMLElement, /* event */ MotionEvent) => CSSProperties | Unit): Self = StObject.set(x, "onEnterActive", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnEnterActiveUndefined: Self = StObject.set(x, "onEnterActive", js.undefined)
      
      @scala.inline
      def setOnEnterEnd(value: (/* element */ HTMLElement, /* event */ MotionEvent) => Boolean | Unit): Self = StObject.set(x, "onEnterEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnEnterEndUndefined: Self = StObject.set(x, "onEnterEnd", js.undefined)
      
      @scala.inline
      def setOnEnterPrepare(value: /* element */ HTMLElement => js.Promise[js.Any] | Unit): Self = StObject.set(x, "onEnterPrepare", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEnterPrepareUndefined: Self = StObject.set(x, "onEnterPrepare", js.undefined)
      
      @scala.inline
      def setOnEnterStart(value: (/* element */ HTMLElement, /* event */ MotionEvent) => CSSProperties | Unit): Self = StObject.set(x, "onEnterStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnEnterStartUndefined: Self = StObject.set(x, "onEnterStart", js.undefined)
      
      @scala.inline
      def setOnLeaveActive(value: (/* element */ HTMLElement, /* event */ MotionEvent) => CSSProperties | Unit): Self = StObject.set(x, "onLeaveActive", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnLeaveActiveUndefined: Self = StObject.set(x, "onLeaveActive", js.undefined)
      
      @scala.inline
      def setOnLeaveEnd(value: (/* element */ HTMLElement, /* event */ MotionEvent) => Boolean | Unit): Self = StObject.set(x, "onLeaveEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnLeaveEndUndefined: Self = StObject.set(x, "onLeaveEnd", js.undefined)
      
      @scala.inline
      def setOnLeavePrepare(value: /* element */ HTMLElement => js.Promise[js.Any] | Unit): Self = StObject.set(x, "onLeavePrepare", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLeavePrepareUndefined: Self = StObject.set(x, "onLeavePrepare", js.undefined)
      
      @scala.inline
      def setOnLeaveStart(value: (/* element */ HTMLElement, /* event */ MotionEvent) => CSSProperties | Unit): Self = StObject.set(x, "onLeaveStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnLeaveStartUndefined: Self = StObject.set(x, "onLeaveStart", js.undefined)
      
      @scala.inline
      def setOnVisibleChanged(value: (/* visible */ Boolean, /* info */ typings.rcMotion.anon.Key) => Unit): Self = StObject.set(x, "onVisibleChanged", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnVisibleChangedUndefined: Self = StObject.set(x, "onVisibleChanged", js.undefined)
      
      @scala.inline
      def setRemoveOnLeave(value: Boolean): Self = StObject.set(x, "removeOnLeave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveOnLeaveUndefined: Self = StObject.set(x, "removeOnLeave", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait CSSMotionListState extends StObject {
    
    var keyEntities: js.Array[KeyObject] = js.native
  }
  object CSSMotionListState {
    
    @scala.inline
    def apply(keyEntities: js.Array[KeyObject]): CSSMotionListState = {
      val __obj = js.Dynamic.literal(keyEntities = keyEntities.asInstanceOf[js.Any])
      __obj.asInstanceOf[CSSMotionListState]
    }
    
    @scala.inline
    implicit class CSSMotionListStateMutableBuilder[Self <: CSSMotionListState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeyEntities(value: js.Array[KeyObject]): Self = StObject.set(x, "keyEntities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyEntitiesVarargs(value: KeyObject*): Self = StObject.set(x, "keyEntities", js.Array(value :_*))
    }
  }
  
  type _To = ComponentClass[CSSMotionListProps, js.Any]
  
  /* This means you don't have to write `default`, but can instead just say `cssmotionlistMod.foo` */
  override def _to: ComponentClass[CSSMotionListProps, js.Any] = default
}
