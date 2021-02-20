package typings.reactPose

import org.scalablytyped.runtime.StringDictionary
import typings.popmotionPose.typesMod.DomPopmotionConfig
import typings.popmotionPose.typesMod.DomPopmotionPoser
import typings.reactPose.anon.Current
import typings.reactPose.reactPoseStrings.absolute
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait ChildRegistration extends StObject {
    
    var element: Element = js.native
    
    def onRegistered(poser: DomPopmotionPoser): Unit = js.native
    
    var poseConfig: DomPopmotionConfig = js.native
  }
  object ChildRegistration {
    
    @scala.inline
    def apply(element: Element, onRegistered: DomPopmotionPoser => Unit, poseConfig: DomPopmotionConfig): ChildRegistration = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], onRegistered = js.Any.fromFunction1(onRegistered), poseConfig = poseConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChildRegistration]
    }
    
    @scala.inline
    implicit class ChildRegistrationMutableBuilder[Self <: ChildRegistration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnRegistered(value: DomPopmotionPoser => Unit): Self = StObject.set(x, "onRegistered", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPoseConfig(value: DomPopmotionConfig): Self = StObject.set(x, "poseConfig", value.asInstanceOf[js.Any])
    }
  }
  
  type ConfigFactory = js.Function1[/* props */ PoseElementProps, DomPopmotionConfig]
  
  type CurrentPose = String | js.Array[String]
  
  @js.native
  trait PopStyle extends StObject {
    
    var height: Double = js.native
    
    var left: Double = js.native
    
    var position: absolute = js.native
    
    var top: Double = js.native
    
    var width: Double = js.native
  }
  object PopStyle {
    
    @scala.inline
    def apply(height: Double, left: Double, position: absolute, top: Double, width: Double): PopStyle = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopStyle]
    }
    
    @scala.inline
    implicit class PopStyleMutableBuilder[Self <: PopStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: absolute): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PoseContextProps extends StObject {
    
    var getInitialPoseFromParent: js.UndefOr[js.Function0[CurrentPose | Unit]] = js.native
    
    var getParentPoseConfig: js.UndefOr[js.Function0[DomPopmotionConfig]] = js.native
    
    var onUnmount: js.UndefOr[js.Function1[/* child */ DomPopmotionPoser, _]] = js.native
    
    var registerChild: js.UndefOr[js.Function1[/* props */ ChildRegistration, Unit]] = js.native
  }
  object PoseContextProps {
    
    @scala.inline
    def apply(): PoseContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PoseContextProps]
    }
    
    @scala.inline
    implicit class PoseContextPropsMutableBuilder[Self <: PoseContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetInitialPoseFromParent(value: () => CurrentPose | Unit): Self = StObject.set(x, "getInitialPoseFromParent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetInitialPoseFromParentUndefined: Self = StObject.set(x, "getInitialPoseFromParent", js.undefined)
      
      @scala.inline
      def setGetParentPoseConfig(value: () => DomPopmotionConfig): Self = StObject.set(x, "getParentPoseConfig", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetParentPoseConfigUndefined: Self = StObject.set(x, "getParentPoseConfig", js.undefined)
      
      @scala.inline
      def setOnUnmount(value: /* child */ DomPopmotionPoser => _): Self = StObject.set(x, "onUnmount", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnUnmountUndefined: Self = StObject.set(x, "onUnmount", js.undefined)
      
      @scala.inline
      def setRegisterChild(value: /* props */ ChildRegistration => Unit): Self = StObject.set(x, "registerChild", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRegisterChildUndefined: Self = StObject.set(x, "registerChild", js.undefined)
    }
  }
  
  /* Inlined react-pose.react-pose/lib/components/PoseElement/types.PoseElementProps & {  elementType :any,   poseConfig :popmotion-pose.popmotion-pose.DomPopmotionConfig | react-pose.react-pose/lib/components/PoseElement/types.ConfigFactory} */
  @js.native
  trait PoseElementInternalProps
    extends /* key */ StringDictionary[js.Any] {
    
    var _pose: js.UndefOr[CurrentPose] = js.native
    
    var children: js.UndefOr[js.Any] = js.native
    
    var elementType: js.Any = js.native
    
    var getInitialPoseFromParent: js.UndefOr[js.Function0[CurrentPose | Unit]] = js.native
    
    var getParentPoseConfig: js.UndefOr[js.Function0[DomPopmotionConfig]] = js.native
    
    var initialPose: js.UndefOr[CurrentPose] = js.native
    
    var innerRef: js.UndefOr[Current | RefFunc] = js.native
    
    var onPoseComplete: js.UndefOr[js.Function1[/* pose */ CurrentPose, _]] = js.native
    
    var onUnmount: js.UndefOr[js.Function1[/* child */ DomPopmotionPoser, _]] = js.native
    
    var onValueChange: js.UndefOr[StringDictionary[js.Function1[/* v */ js.Any, _]]] = js.native
    
    var pose: js.UndefOr[CurrentPose] = js.native
    
    var poseConfig: DomPopmotionConfig | ConfigFactory = js.native
    
    var registerChild: js.UndefOr[js.Function1[/* props */ ChildRegistration, Unit]] = js.native
    
    var withParent: js.UndefOr[Boolean] = js.native
  }
  object PoseElementInternalProps {
    
    @scala.inline
    def apply(elementType: js.Any, poseConfig: DomPopmotionConfig | ConfigFactory): PoseElementInternalProps = {
      val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any], poseConfig = poseConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[PoseElementInternalProps]
    }
    
    @scala.inline
    implicit class PoseElementInternalPropsMutableBuilder[Self <: PoseElementInternalProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setElementType(value: js.Any): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetInitialPoseFromParent(value: () => CurrentPose | Unit): Self = StObject.set(x, "getInitialPoseFromParent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetInitialPoseFromParentUndefined: Self = StObject.set(x, "getInitialPoseFromParent", js.undefined)
      
      @scala.inline
      def setGetParentPoseConfig(value: () => DomPopmotionConfig): Self = StObject.set(x, "getParentPoseConfig", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetParentPoseConfigUndefined: Self = StObject.set(x, "getParentPoseConfig", js.undefined)
      
      @scala.inline
      def setInitialPose(value: CurrentPose): Self = StObject.set(x, "initialPose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialPoseUndefined: Self = StObject.set(x, "initialPose", js.undefined)
      
      @scala.inline
      def setInitialPoseVarargs(value: String*): Self = StObject.set(x, "initialPose", js.Array(value :_*))
      
      @scala.inline
      def setInnerRef(value: Current | RefFunc): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* el */ Element => js.Any): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      @scala.inline
      def setOnPoseComplete(value: /* pose */ CurrentPose => _): Self = StObject.set(x, "onPoseComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPoseCompleteUndefined: Self = StObject.set(x, "onPoseComplete", js.undefined)
      
      @scala.inline
      def setOnUnmount(value: /* child */ DomPopmotionPoser => _): Self = StObject.set(x, "onUnmount", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnUnmountUndefined: Self = StObject.set(x, "onUnmount", js.undefined)
      
      @scala.inline
      def setOnValueChange(value: StringDictionary[js.Function1[/* v */ js.Any, _]]): Self = StObject.set(x, "onValueChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      @scala.inline
      def setPose(value: CurrentPose): Self = StObject.set(x, "pose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoseConfig(value: DomPopmotionConfig | ConfigFactory): Self = StObject.set(x, "poseConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoseConfigFunction1(value: /* props */ PoseElementProps => DomPopmotionConfig): Self = StObject.set(x, "poseConfig", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPoseUndefined: Self = StObject.set(x, "pose", js.undefined)
      
      @scala.inline
      def setPoseVarargs(value: String*): Self = StObject.set(x, "pose", js.Array(value :_*))
      
      @scala.inline
      def setRegisterChild(value: /* props */ ChildRegistration => Unit): Self = StObject.set(x, "registerChild", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRegisterChildUndefined: Self = StObject.set(x, "registerChild", js.undefined)
      
      @scala.inline
      def setWithParent(value: Boolean): Self = StObject.set(x, "withParent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithParentUndefined: Self = StObject.set(x, "withParent", js.undefined)
      
      @scala.inline
      def set_pose(value: CurrentPose): Self = StObject.set(x, "_pose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_poseUndefined: Self = StObject.set(x, "_pose", js.undefined)
      
      @scala.inline
      def set_poseVarargs(value: String*): Self = StObject.set(x, "_pose", js.Array(value :_*))
    }
  }
  
  /* Inlined {  children :any | undefined,   pose :react-pose.react-pose/lib/components/PoseElement/types.CurrentPose | undefined,   _pose :react-pose.react-pose/lib/components/PoseElement/types.CurrentPose | undefined,   initialPose :react-pose.react-pose/lib/components/PoseElement/types.CurrentPose | undefined,   withParent :boolean | undefined,   onPoseComplete :(pose : react-pose.react-pose/lib/components/PoseElement/types.CurrentPose): any | undefined,   onValueChange :{[key: string] : (v : any): any} | undefined,   innerRef :{  current :any} | react-pose.react-pose/lib/components/PoseElement/types.RefFunc | undefined, [key: string] : any} & react-pose.react-pose/lib/components/PoseElement/types.PoseContextProps */
  @js.native
  trait PoseElementProps
    extends /* key */ StringDictionary[js.Any] {
    
    var _pose: js.UndefOr[CurrentPose] = js.native
    
    var children: js.UndefOr[js.Any] = js.native
    
    var getInitialPoseFromParent: js.UndefOr[js.Function0[CurrentPose | Unit]] = js.native
    
    var getParentPoseConfig: js.UndefOr[js.Function0[DomPopmotionConfig]] = js.native
    
    var initialPose: js.UndefOr[CurrentPose] = js.native
    
    var innerRef: js.UndefOr[Current | RefFunc] = js.native
    
    var onPoseComplete: js.UndefOr[js.Function1[/* pose */ CurrentPose, _]] = js.native
    
    var onUnmount: js.UndefOr[js.Function1[/* child */ DomPopmotionPoser, _]] = js.native
    
    var onValueChange: js.UndefOr[StringDictionary[js.Function1[/* v */ js.Any, _]]] = js.native
    
    var pose: js.UndefOr[CurrentPose] = js.native
    
    var registerChild: js.UndefOr[js.Function1[/* props */ ChildRegistration, Unit]] = js.native
    
    var withParent: js.UndefOr[Boolean] = js.native
  }
  object PoseElementProps {
    
    @scala.inline
    def apply(): PoseElementProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PoseElementProps]
    }
    
    @scala.inline
    implicit class PoseElementPropsMutableBuilder[Self <: PoseElementProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setGetInitialPoseFromParent(value: () => CurrentPose | Unit): Self = StObject.set(x, "getInitialPoseFromParent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetInitialPoseFromParentUndefined: Self = StObject.set(x, "getInitialPoseFromParent", js.undefined)
      
      @scala.inline
      def setGetParentPoseConfig(value: () => DomPopmotionConfig): Self = StObject.set(x, "getParentPoseConfig", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetParentPoseConfigUndefined: Self = StObject.set(x, "getParentPoseConfig", js.undefined)
      
      @scala.inline
      def setInitialPose(value: CurrentPose): Self = StObject.set(x, "initialPose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialPoseUndefined: Self = StObject.set(x, "initialPose", js.undefined)
      
      @scala.inline
      def setInitialPoseVarargs(value: String*): Self = StObject.set(x, "initialPose", js.Array(value :_*))
      
      @scala.inline
      def setInnerRef(value: Current | RefFunc): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* el */ Element => js.Any): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      @scala.inline
      def setOnPoseComplete(value: /* pose */ CurrentPose => _): Self = StObject.set(x, "onPoseComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPoseCompleteUndefined: Self = StObject.set(x, "onPoseComplete", js.undefined)
      
      @scala.inline
      def setOnUnmount(value: /* child */ DomPopmotionPoser => _): Self = StObject.set(x, "onUnmount", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnUnmountUndefined: Self = StObject.set(x, "onUnmount", js.undefined)
      
      @scala.inline
      def setOnValueChange(value: StringDictionary[js.Function1[/* v */ js.Any, _]]): Self = StObject.set(x, "onValueChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      @scala.inline
      def setPose(value: CurrentPose): Self = StObject.set(x, "pose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoseUndefined: Self = StObject.set(x, "pose", js.undefined)
      
      @scala.inline
      def setPoseVarargs(value: String*): Self = StObject.set(x, "pose", js.Array(value :_*))
      
      @scala.inline
      def setRegisterChild(value: /* props */ ChildRegistration => Unit): Self = StObject.set(x, "registerChild", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRegisterChildUndefined: Self = StObject.set(x, "registerChild", js.undefined)
      
      @scala.inline
      def setWithParent(value: Boolean): Self = StObject.set(x, "withParent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithParentUndefined: Self = StObject.set(x, "withParent", js.undefined)
      
      @scala.inline
      def set_pose(value: CurrentPose): Self = StObject.set(x, "_pose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_poseUndefined: Self = StObject.set(x, "_pose", js.undefined)
      
      @scala.inline
      def set_poseVarargs(value: String*): Self = StObject.set(x, "_pose", js.Array(value :_*))
    }
  }
  
  type RefFunc = js.Function1[/* el */ Element, js.Any]
}
