package typings.rcDrawer

import typings.rcDrawer.anon.PrevProps
import typings.rcDrawer.anon.PrevPropsIDrawerChildProps
import typings.rcDrawer.idrawerproptypesMod.IDrawerChildProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawerChildMod {
  
  @JSImport("rc-drawer/es/DrawerChild", JSImport.Default)
  @js.native
  class default protected () extends DrawerChild {
    def this(props: IDrawerChildProps) = this()
  }
  object default {
    
    @JSImport("rc-drawer/es/DrawerChild", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("rc-drawer/es/DrawerChild", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      inline def switchScrollingEffect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("switchScrollingEffect")().asInstanceOf[Unit]
    }
    
    /* static member */
    inline def getDerivedStateFromProps(props: IDrawerChildProps, hasPrevProps_self: PrevProps): PrevPropsIDrawerChildProps = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], hasPrevProps_self.asInstanceOf[js.Any])).asInstanceOf[PrevPropsIDrawerChildProps]
  }
  
  @js.native
  trait DrawerChild
    extends Component[IDrawerChildProps, IState, js.Any] {
    
    /* private */ var addScrollingEffect: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MDrawerChild(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDrawerChild(prevProps: IDrawerChildProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MDrawerChild(): Unit = js.native
    
    /* private */ var contentDom: js.Any = js.native
    
    /* private */ var contentWrapper: js.Any = js.native
    
    /* private */ var dom: js.Any = js.native
    
    /* private */ var domFocus: js.Any = js.native
    
    /* private */ var drawerId: js.Any = js.native
    
    /* private */ var getCurrentDrawerSome: js.Any = js.native
    
    /* private */ var getHorizontalBoolAndPlacementName: js.Any = js.native
    
    /* private */ var getLevelDom: js.Any = js.native
    
    /* private */ var handlerDom: js.Any = js.native
    
    /* private */ var levelDom: js.Any = js.native
    
    /* private */ var maskDom: js.Any = js.native
    
    /* private */ var onKeyDown: js.Any = js.native
    
    /* private */ var onWrapperTransitionEnd: js.Any = js.native
    
    /* private */ var openLevelTransition: js.Any = js.native
    
    /* private */ var passive: js.Any = js.native
    
    /* private */ var remScrollingEffect: js.Any = js.native
    
    /* private */ var removeMoveHandler: js.Any = js.native
    
    /* private */ var removeStartHandler: js.Any = js.native
    
    /* private */ var setLevelAndScrolling: js.Any = js.native
    
    /* private */ var setLevelTransform: js.Any = js.native
    
    /* private */ var startPos: js.Any = js.native
    
    /* private */ var timeout: js.Any = js.native
    
    /* private */ var toggleScrollingToDrawerAndBody: js.Any = js.native
    
    /* private */ var transitionEnd: js.Any = js.native
  }
  
  trait IState extends StObject {
    
    var _self: DrawerChild
    
    var prevProps: js.UndefOr[IDrawerChildProps] = js.undefined
  }
  object IState {
    
    inline def apply(_self: DrawerChild): IState = {
      val __obj = js.Dynamic.literal(_self = _self.asInstanceOf[js.Any])
      __obj.asInstanceOf[IState]
    }
    
    extension [Self <: IState](x: Self) {
      
      inline def setPrevProps(value: IDrawerChildProps): Self = StObject.set(x, "prevProps", value.asInstanceOf[js.Any])
      
      inline def setPrevPropsUndefined: Self = StObject.set(x, "prevProps", js.undefined)
      
      inline def set_self(value: DrawerChild): Self = StObject.set(x, "_self", value.asInstanceOf[js.Any])
    }
  }
}
