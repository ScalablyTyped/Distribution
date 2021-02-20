package typings.rcDrawer

import typings.rcDrawer.anon.PrevProps
import typings.rcDrawer.anon.PrevPropsIDrawerChildProps
import typings.rcDrawer.idrawerproptypesMod.IDrawerChildProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawerChildMod {
  
  @JSImport("rc-drawer/es/DrawerChild", JSImport.Default)
  @js.native
  class default protected () extends DrawerChild {
    def this(props: IDrawerChildProps) = this()
  }
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("rc-drawer/es/DrawerChild", "default.defaultProps.switchScrollingEffect")
      @js.native
      def switchScrollingEffect(): Unit = js.native
    }
    
    /* static member */
    @JSImport("rc-drawer/es/DrawerChild", "default.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(props: IDrawerChildProps, hasPrevProps_self: PrevProps): PrevPropsIDrawerChildProps = js.native
  }
  
  @js.native
  trait DrawerChild
    extends Component[IDrawerChildProps, IState, js.Any] {
    
    var addScrollingEffect: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MDrawerChild(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDrawerChild(prevProps: IDrawerChildProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MDrawerChild(): Unit = js.native
    
    var contentDom: js.Any = js.native
    
    var contentWrapper: js.Any = js.native
    
    var dom: js.Any = js.native
    
    var domFocus: js.Any = js.native
    
    var drawerId: js.Any = js.native
    
    var getCurrentDrawerSome: js.Any = js.native
    
    var getHorizontalBoolAndPlacementName: js.Any = js.native
    
    var getLevelDom: js.Any = js.native
    
    var handlerDom: js.Any = js.native
    
    var levelDom: js.Any = js.native
    
    var maskDom: js.Any = js.native
    
    var onKeyDown: js.Any = js.native
    
    var onWrapperTransitionEnd: js.Any = js.native
    
    var openLevelTransition: js.Any = js.native
    
    var passive: js.Any = js.native
    
    var remScrollingEffect: js.Any = js.native
    
    var removeMoveHandler: js.Any = js.native
    
    var removeStartHandler: js.Any = js.native
    
    var setLevelAndScrolling: js.Any = js.native
    
    var setLevelTransform: js.Any = js.native
    
    var startPos: js.Any = js.native
    
    var timeout: js.Any = js.native
    
    var toggleScrollingToDrawerAndBody: js.Any = js.native
    
    var transitionEnd: js.Any = js.native
  }
  
  @js.native
  trait IState extends StObject {
    
    var _self: DrawerChild = js.native
    
    var prevProps: js.UndefOr[IDrawerChildProps] = js.native
  }
  object IState {
    
    @scala.inline
    def apply(_self: DrawerChild): IState = {
      val __obj = js.Dynamic.literal(_self = _self.asInstanceOf[js.Any])
      __obj.asInstanceOf[IState]
    }
    
    @scala.inline
    implicit class IStateMutableBuilder[Self <: IState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrevProps(value: IDrawerChildProps): Self = StObject.set(x, "prevProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevPropsUndefined: Self = StObject.set(x, "prevProps", js.undefined)
      
      @scala.inline
      def set_self(value: DrawerChild): Self = StObject.set(x, "_self", value.asInstanceOf[js.Any])
    }
  }
}
