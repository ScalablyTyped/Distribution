package typings.reactPose

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactElement
import typings.reactPose.reactPoseBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transitionTypesMod {
  
  trait Props
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var animateOnMount: js.UndefOr[Boolean] = js.undefined
    
    var children: TransitionChildren[js.Any]
    
    var enterAfterExit: js.UndefOr[Boolean] = js.undefined
    
    var enterPose: js.UndefOr[String] = js.undefined
    
    var exitPose: js.UndefOr[String] = js.undefined
    
    var flipMove: js.UndefOr[Boolean] = js.undefined
    
    var onRest: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var preEnterPose: js.UndefOr[String] = js.undefined
  }
  object Props {
    
    @scala.inline
    def apply(children: TransitionChildren[js.Any]): Props = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimateOnMount(value: Boolean): Self = StObject.set(x, "animateOnMount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateOnMountUndefined: Self = StObject.set(x, "animateOnMount", js.undefined)
      
      @scala.inline
      def setChildren(value: TransitionChildren[js.Any]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: TransitionChild[js.Any]*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setEnterAfterExit(value: Boolean): Self = StObject.set(x, "enterAfterExit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnterAfterExitUndefined: Self = StObject.set(x, "enterAfterExit", js.undefined)
      
      @scala.inline
      def setEnterPose(value: String): Self = StObject.set(x, "enterPose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnterPoseUndefined: Self = StObject.set(x, "enterPose", js.undefined)
      
      @scala.inline
      def setExitPose(value: String): Self = StObject.set(x, "exitPose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitPoseUndefined: Self = StObject.set(x, "exitPose", js.undefined)
      
      @scala.inline
      def setFlipMove(value: Boolean): Self = StObject.set(x, "flipMove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipMoveUndefined: Self = StObject.set(x, "flipMove", js.undefined)
      
      @scala.inline
      def setOnRest(value: () => Unit): Self = StObject.set(x, "onRest", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnRestUndefined: Self = StObject.set(x, "onRest", js.undefined)
      
      @scala.inline
      def setPreEnterPose(value: String): Self = StObject.set(x, "preEnterPose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreEnterPoseUndefined: Self = StObject.set(x, "preEnterPose", js.undefined)
    }
  }
  
  trait State extends StObject {
    
    var displayedChildren: js.Array[ReactElement]
    
    var finishedLeaving: StringDictionary[Boolean]
    
    var hasInitialized: Boolean
    
    var indexedChildren: StringDictionary[ReactElement]
    
    def scheduleChildRemoval(key: String): Unit
  }
  object State {
    
    @scala.inline
    def apply(
      displayedChildren: js.Array[ReactElement],
      finishedLeaving: StringDictionary[Boolean],
      hasInitialized: Boolean,
      indexedChildren: StringDictionary[ReactElement],
      scheduleChildRemoval: String => Unit
    ): State = {
      val __obj = js.Dynamic.literal(displayedChildren = displayedChildren.asInstanceOf[js.Any], finishedLeaving = finishedLeaving.asInstanceOf[js.Any], hasInitialized = hasInitialized.asInstanceOf[js.Any], indexedChildren = indexedChildren.asInstanceOf[js.Any], scheduleChildRemoval = js.Any.fromFunction1(scheduleChildRemoval))
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayedChildren(value: js.Array[ReactElement]): Self = StObject.set(x, "displayedChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayedChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "displayedChildren", js.Array(value :_*))
      
      @scala.inline
      def setFinishedLeaving(value: StringDictionary[Boolean]): Self = StObject.set(x, "finishedLeaving", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasInitialized(value: Boolean): Self = StObject.set(x, "hasInitialized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexedChildren(value: StringDictionary[ReactElement]): Self = StObject.set(x, "indexedChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScheduleChildRemoval(value: String => Unit): Self = StObject.set(x, "scheduleChildRemoval", js.Any.fromFunction1(value))
    }
  }
  
  type TransitionChild[T] = ReactElement | `false` | Unit
  
  type TransitionChildren[T] = TransitionChild[T] | js.Array[TransitionChild[T]]
}
