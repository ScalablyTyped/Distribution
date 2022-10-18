package typings.reactSpringCore

import typings.reactSpringCore.anon.Pause
import typings.reactSpringCore.distDeclarationsSrcRunAsyncMod.RunAsyncState
import typings.reactSpringCore.distDeclarationsSrcTypesCommonMod.StringKeys
import typings.reactSpringCore.distDeclarationsSrcTypesInternalMod.AnimationTarget
import typings.reactSpringCore.distDeclarationsSrcTypesInternalMod.InferProps
import typings.reactSpringCore.distDeclarationsSrcTypesInternalMod.InferState
import typings.reactSpringCore.distDeclarationsSrcTypesObjectsMod.AnimationResult
import typings.reactSpringCore.distDeclarationsSrcTypesPropsMod.MatchProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcSchedulePropsMod {
  
  @JSImport("@react-spring/core/dist/declarations/src/scheduleProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def scheduleProps[T /* <: AnimationTarget[Any] */](callId: Double, hasKeyPropsDefaultPropsStateActions: ScheduledProps[T]): js.Promise[AnimationResult[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleProps")(callId.asInstanceOf[js.Any], hasKeyPropsDefaultPropsStateActions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AnimationResult[T]]]
  
  trait DefaultProps[T] extends StObject {
    
    var cancel: js.UndefOr[MatchProp[T]] = js.undefined
    
    var pause: js.UndefOr[MatchProp[T]] = js.undefined
  }
  object DefaultProps {
    
    inline def apply[T](): DefaultProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultProps[T]]
    }
    
    extension [Self <: DefaultProps[?], T](x: Self & DefaultProps[T]) {
      
      inline def setCancel(value: MatchProp[T]): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelFunction1(value: /* key */ StringKeys[T] => Boolean): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCancelVarargs(value: StringKeys[T]*): Self = StObject.set(x, "cancel", js.Array(value*))
      
      inline def setPause(value: MatchProp[T]): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
      
      inline def setPauseFunction1(value: /* key */ StringKeys[T] => Boolean): Self = StObject.set(x, "pause", js.Any.fromFunction1(value))
      
      inline def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
      
      inline def setPauseVarargs(value: StringKeys[T]*): Self = StObject.set(x, "pause", js.Array(value*))
    }
  }
  
  trait ScheduledProps[T /* <: AnimationTarget[Any] */] extends StObject {
    
    var actions: Pause[T]
    
    var defaultProps: js.UndefOr[DefaultProps[InferState[T]]] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var props: InferProps[T]
    
    var state: RunAsyncState[T]
  }
  object ScheduledProps {
    
    inline def apply[T /* <: AnimationTarget[Any] */](actions: Pause[T], props: InferProps[T], state: RunAsyncState[T]): ScheduledProps[T] = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScheduledProps[T]]
    }
    
    extension [Self <: ScheduledProps[?], T /* <: AnimationTarget[Any] */](x: Self & ScheduledProps[T]) {
      
      inline def setActions(value: Pause[T]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setDefaultProps(value: DefaultProps[InferState[T]]): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
      
      inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setProps(value: InferProps[T]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setState(value: RunAsyncState[T]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
