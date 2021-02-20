package typings.reactMdStates

import typings.reactMdStates.typesMod.RippleEvent
import typings.reactMdStates.typesMod.RippleState
import typings.reactMdStates.typesMod.RipplesState
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reducerMod {
  
  @JSImport("@react-md/states/types/ripples/reducer", "CANCEL")
  @js.native
  val CANCEL: /* "CANCEL" */ String = js.native
  
  @JSImport("@react-md/states/types/ripples/reducer", "CREATE")
  @js.native
  val CREATE: /* "CREATE" */ String = js.native
  
  @JSImport("@react-md/states/types/ripples/reducer", "ENTERED")
  @js.native
  val ENTERED: /* "ENTERED" */ String = js.native
  
  @JSImport("@react-md/states/types/ripples/reducer", "RELEASE")
  @js.native
  val RELEASE: /* "RELEASE" */ String = js.native
  
  @JSImport("@react-md/states/types/ripples/reducer", "REMOVE")
  @js.native
  val REMOVE: /* "REMOVE" */ String = js.native
  
  @JSImport("@react-md/states/types/ripples/reducer", "createRippleAction")
  @js.native
  def createRippleAction[E /* <: HTMLElement */](event: RippleEvent[E], disableSpacebarClick: Boolean): CreateAction[E] = js.native
  
  @JSImport("@react-md/states/types/ripples/reducer", "reducer")
  @js.native
  def reducer[E /* <: HTMLElement */](state: js.UndefOr[scala.Nothing], action: RippleStateAction[E]): RipplesState = js.native
  @JSImport("@react-md/states/types/ripples/reducer", "reducer")
  @js.native
  def reducer[E /* <: HTMLElement */](state: RipplesState, action: RippleStateAction[E]): RipplesState = js.native
  
  @JSImport("@react-md/states/types/ripples/reducer", "useRippleTransition")
  @js.native
  def useRippleTransition[E /* <: HTMLElement */](): ReturnValue[E] = js.native
  @JSImport("@react-md/states/types/ripples/reducer", "useRippleTransition")
  @js.native
  def useRippleTransition[E /* <: HTMLElement */](disableSpacebarClick: Boolean): ReturnValue[E] = js.native
  
  @js.native
  trait CancelAction
    extends RippleStateAction[js.Any] {
    
    var ease: Boolean = js.native
    
    var `type`: /* "CANCEL" */ String = js.native
  }
  object CancelAction {
    
    @scala.inline
    def apply(ease: Boolean, `type`: /* "CANCEL" */ String): CancelAction = {
      val __obj = js.Dynamic.literal(ease = ease.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CancelAction]
    }
    
    @scala.inline
    implicit class CancelActionMutableBuilder[Self <: CancelAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEase(value: Boolean): Self = StObject.set(x, "ease", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: /* "CANCEL" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CreateAction[E /* <: HTMLElement */] extends RippleStateAction[E] {
    
    var disableSpacebarClick: Boolean = js.native
    
    var event: RippleEvent[E] = js.native
    
    var `type`: /* "CREATE" */ String = js.native
  }
  object CreateAction {
    
    @scala.inline
    def apply[E /* <: HTMLElement */](disableSpacebarClick: Boolean, event: RippleEvent[E], `type`: /* "CREATE" */ String): CreateAction[E] = {
      val __obj = js.Dynamic.literal(disableSpacebarClick = disableSpacebarClick.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateAction[E]]
    }
    
    @scala.inline
    implicit class CreateActionMutableBuilder[Self <: CreateAction[_], E /* <: HTMLElement */] (val x: Self with CreateAction[E]) extends AnyVal {
      
      @scala.inline
      def setDisableSpacebarClick(value: Boolean): Self = StObject.set(x, "disableSpacebarClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvent(value: RippleEvent[E]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: /* "CREATE" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EnteredAction
    extends RippleStateAction[js.Any] {
    
    var ripple: RippleState = js.native
    
    var `type`: /* "ENTERED" */ String = js.native
  }
  object EnteredAction {
    
    @scala.inline
    def apply(ripple: RippleState, `type`: /* "ENTERED" */ String): EnteredAction = {
      val __obj = js.Dynamic.literal(ripple = ripple.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnteredAction]
    }
    
    @scala.inline
    implicit class EnteredActionMutableBuilder[Self <: EnteredAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRipple(value: RippleState): Self = StObject.set(x, "ripple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: /* "ENTERED" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReleaseAction[E /* <: HTMLElement */] extends RippleStateAction[E] {
    
    var event: RippleEvent[E] = js.native
    
    var `type`: /* "RELEASE" */ String = js.native
  }
  object ReleaseAction {
    
    @scala.inline
    def apply[E /* <: HTMLElement */](event: RippleEvent[E], `type`: /* "RELEASE" */ String): ReleaseAction[E] = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReleaseAction[E]]
    }
    
    @scala.inline
    implicit class ReleaseActionMutableBuilder[Self <: ReleaseAction[_], E /* <: HTMLElement */] (val x: Self with ReleaseAction[E]) extends AnyVal {
      
      @scala.inline
      def setEvent(value: RippleEvent[E]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: /* "RELEASE" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RemoveAction
    extends RippleStateAction[js.Any] {
    
    var ripple: RippleState = js.native
    
    var `type`: /* "REMOVE" */ String = js.native
  }
  object RemoveAction {
    
    @scala.inline
    def apply(ripple: RippleState, `type`: /* "REMOVE" */ String): RemoveAction = {
      val __obj = js.Dynamic.literal(ripple = ripple.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveAction]
    }
    
    @scala.inline
    implicit class RemoveActionMutableBuilder[Self <: RemoveAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRipple(value: RippleState): Self = StObject.set(x, "ripple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: /* "REMOVE" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReturnValue[E /* <: HTMLElement */] extends StObject {
    
    def cancel(): Unit = js.native
    def cancel(ease: Boolean): Unit = js.native
    
    def create(event: RippleEvent[E]): Unit = js.native
    
    def entered(ripple: RippleState): Unit = js.native
    
    def release(event: RippleEvent[E]): Unit = js.native
    
    def remove(ripple: RippleState): Unit = js.native
    
    var state: RipplesState = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdStates.reducerMod.CreateAction[E]
    - typings.reactMdStates.reducerMod.ReleaseAction[E]
    - typings.reactMdStates.reducerMod.CancelAction
    - typings.reactMdStates.reducerMod.EnteredAction
    - typings.reactMdStates.reducerMod.RemoveAction
  */
  trait RippleStateAction[E /* <: HTMLElement */] extends StObject
  object RippleStateAction {
    
    @scala.inline
    def CancelAction(ease: Boolean, `type`: /* "CANCEL" */ String): typings.reactMdStates.reducerMod.CancelAction = {
      val __obj = js.Dynamic.literal(ease = ease.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactMdStates.reducerMod.CancelAction]
    }
    
    @scala.inline
    def CreateAction[E /* <: HTMLElement */](disableSpacebarClick: Boolean, event: RippleEvent[E], `type`: /* "CREATE" */ String): typings.reactMdStates.reducerMod.CreateAction[E] = {
      val __obj = js.Dynamic.literal(disableSpacebarClick = disableSpacebarClick.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactMdStates.reducerMod.CreateAction[E]]
    }
    
    @scala.inline
    def EnteredAction(ripple: RippleState, `type`: /* "ENTERED" */ String): typings.reactMdStates.reducerMod.EnteredAction = {
      val __obj = js.Dynamic.literal(ripple = ripple.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactMdStates.reducerMod.EnteredAction]
    }
    
    @scala.inline
    def ReleaseAction[E /* <: HTMLElement */](event: RippleEvent[E], `type`: /* "RELEASE" */ String): typings.reactMdStates.reducerMod.ReleaseAction[E] = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactMdStates.reducerMod.ReleaseAction[E]]
    }
    
    @scala.inline
    def RemoveAction(ripple: RippleState, `type`: /* "REMOVE" */ String): typings.reactMdStates.reducerMod.RemoveAction = {
      val __obj = js.Dynamic.literal(ripple = ripple.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactMdStates.reducerMod.RemoveAction]
    }
  }
}
