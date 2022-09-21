package typings.reactPose

import org.scalablytyped.runtime.StringDictionary
import typings.popmotionPose.typesMod.DomPopmotionConfig
import typings.popmotionPose.typesMod.DomPopmotionPoser
import typings.reactPose.anon.Current
import typings.reactPose.reactPoseStrings.absolute
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait ChildRegistration extends StObject {
    
    var element: Element
    
    def onRegistered(poser: DomPopmotionPoser): Unit
    
    var poseConfig: DomPopmotionConfig
  }
  object ChildRegistration {
    
    inline def apply(element: Element, onRegistered: DomPopmotionPoser => Unit, poseConfig: DomPopmotionConfig): ChildRegistration = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], onRegistered = js.Any.fromFunction1(onRegistered), poseConfig = poseConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChildRegistration]
    }
    
    extension [Self <: ChildRegistration](x: Self) {
      
      inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setOnRegistered(value: DomPopmotionPoser => Unit): Self = StObject.set(x, "onRegistered", js.Any.fromFunction1(value))
      
      inline def setPoseConfig(value: DomPopmotionConfig): Self = StObject.set(x, "poseConfig", value.asInstanceOf[js.Any])
    }
  }
  
  type ConfigFactory = js.Function1[/* props */ PoseElementProps, DomPopmotionConfig]
  
  type CurrentPose = String | js.Array[String]
  
  trait PopStyle extends StObject {
    
    var height: Double
    
    var left: Double
    
    var position: absolute
    
    var top: Double
    
    var width: Double
  }
  object PopStyle {
    
    inline def apply(height: Double, left: Double, top: Double, width: Double): PopStyle = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], position = "absolute", top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopStyle]
    }
    
    extension [Self <: PopStyle](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: absolute): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait PoseContextProps extends StObject {
    
    var getInitialPoseFromParent: js.UndefOr[js.Function0[CurrentPose | Unit]] = js.undefined
    
    var getParentPoseConfig: js.UndefOr[js.Function0[DomPopmotionConfig]] = js.undefined
    
    var onUnmount: js.UndefOr[js.Function1[/* child */ DomPopmotionPoser, Any]] = js.undefined
    
    var registerChild: js.UndefOr[js.Function1[/* props */ ChildRegistration, Unit]] = js.undefined
  }
  object PoseContextProps {
    
    inline def apply(): PoseContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PoseContextProps]
    }
    
    extension [Self <: PoseContextProps](x: Self) {
      
      inline def setGetInitialPoseFromParent(value: () => CurrentPose | Unit): Self = StObject.set(x, "getInitialPoseFromParent", js.Any.fromFunction0(value))
      
      inline def setGetInitialPoseFromParentUndefined: Self = StObject.set(x, "getInitialPoseFromParent", js.undefined)
      
      inline def setGetParentPoseConfig(value: () => DomPopmotionConfig): Self = StObject.set(x, "getParentPoseConfig", js.Any.fromFunction0(value))
      
      inline def setGetParentPoseConfigUndefined: Self = StObject.set(x, "getParentPoseConfig", js.undefined)
      
      inline def setOnUnmount(value: /* child */ DomPopmotionPoser => Any): Self = StObject.set(x, "onUnmount", js.Any.fromFunction1(value))
      
      inline def setOnUnmountUndefined: Self = StObject.set(x, "onUnmount", js.undefined)
      
      inline def setRegisterChild(value: /* props */ ChildRegistration => Unit): Self = StObject.set(x, "registerChild", js.Any.fromFunction1(value))
      
      inline def setRegisterChildUndefined: Self = StObject.set(x, "registerChild", js.undefined)
    }
  }
  
  /* Inlined react-pose.react-pose/lib/components/PoseElement/types.PoseElementProps & {  elementType :any,   poseConfig :popmotion-pose.popmotion-pose.DomPopmotionConfig | react-pose.react-pose/lib/components/PoseElement/types.ConfigFactory} */
  trait PoseElementInternalProps
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var _pose: js.UndefOr[CurrentPose] = js.undefined
    
    var children: js.UndefOr[Any] = js.undefined
    
    var elementType: Any
    
    var getInitialPoseFromParent: js.UndefOr[js.Function0[CurrentPose | Unit]] = js.undefined
    
    var getParentPoseConfig: js.UndefOr[js.Function0[DomPopmotionConfig]] = js.undefined
    
    var initialPose: js.UndefOr[CurrentPose] = js.undefined
    
    var innerRef: js.UndefOr[Current | RefFunc] = js.undefined
    
    var onPoseComplete: js.UndefOr[js.Function1[/* pose */ CurrentPose, Any]] = js.undefined
    
    var onUnmount: js.UndefOr[js.Function1[/* child */ DomPopmotionPoser, Any]] = js.undefined
    
    var onValueChange: js.UndefOr[StringDictionary[js.Function1[/* v */ Any, Any]]] = js.undefined
    
    var pose: js.UndefOr[CurrentPose] = js.undefined
    
    var poseConfig: DomPopmotionConfig | ConfigFactory
    
    var registerChild: js.UndefOr[js.Function1[/* props */ ChildRegistration, Unit]] = js.undefined
    
    var withParent: js.UndefOr[Boolean] = js.undefined
  }
  object PoseElementInternalProps {
    
    inline def apply(elementType: Any, poseConfig: DomPopmotionConfig | ConfigFactory): PoseElementInternalProps = {
      val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any], poseConfig = poseConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[PoseElementInternalProps]
    }
    
    extension [Self <: PoseElementInternalProps](x: Self) {
      
      inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setElementType(value: Any): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
      
      inline def setGetInitialPoseFromParent(value: () => CurrentPose | Unit): Self = StObject.set(x, "getInitialPoseFromParent", js.Any.fromFunction0(value))
      
      inline def setGetInitialPoseFromParentUndefined: Self = StObject.set(x, "getInitialPoseFromParent", js.undefined)
      
      inline def setGetParentPoseConfig(value: () => DomPopmotionConfig): Self = StObject.set(x, "getParentPoseConfig", js.Any.fromFunction0(value))
      
      inline def setGetParentPoseConfigUndefined: Self = StObject.set(x, "getParentPoseConfig", js.undefined)
      
      inline def setInitialPose(value: CurrentPose): Self = StObject.set(x, "initialPose", value.asInstanceOf[js.Any])
      
      inline def setInitialPoseUndefined: Self = StObject.set(x, "initialPose", js.undefined)
      
      inline def setInitialPoseVarargs(value: String*): Self = StObject.set(x, "initialPose", js.Array(value*))
      
      inline def setInnerRef(value: Current | RefFunc): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: /* el */ Element => Any): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      inline def setOnPoseComplete(value: /* pose */ CurrentPose => Any): Self = StObject.set(x, "onPoseComplete", js.Any.fromFunction1(value))
      
      inline def setOnPoseCompleteUndefined: Self = StObject.set(x, "onPoseComplete", js.undefined)
      
      inline def setOnUnmount(value: /* child */ DomPopmotionPoser => Any): Self = StObject.set(x, "onUnmount", js.Any.fromFunction1(value))
      
      inline def setOnUnmountUndefined: Self = StObject.set(x, "onUnmount", js.undefined)
      
      inline def setOnValueChange(value: StringDictionary[js.Function1[/* v */ Any, Any]]): Self = StObject.set(x, "onValueChange", value.asInstanceOf[js.Any])
      
      inline def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      inline def setPose(value: CurrentPose): Self = StObject.set(x, "pose", value.asInstanceOf[js.Any])
      
      inline def setPoseConfig(value: DomPopmotionConfig | ConfigFactory): Self = StObject.set(x, "poseConfig", value.asInstanceOf[js.Any])
      
      inline def setPoseConfigFunction1(value: /* props */ PoseElementProps => DomPopmotionConfig): Self = StObject.set(x, "poseConfig", js.Any.fromFunction1(value))
      
      inline def setPoseUndefined: Self = StObject.set(x, "pose", js.undefined)
      
      inline def setPoseVarargs(value: String*): Self = StObject.set(x, "pose", js.Array(value*))
      
      inline def setRegisterChild(value: /* props */ ChildRegistration => Unit): Self = StObject.set(x, "registerChild", js.Any.fromFunction1(value))
      
      inline def setRegisterChildUndefined: Self = StObject.set(x, "registerChild", js.undefined)
      
      inline def setWithParent(value: Boolean): Self = StObject.set(x, "withParent", value.asInstanceOf[js.Any])
      
      inline def setWithParentUndefined: Self = StObject.set(x, "withParent", js.undefined)
      
      inline def set_pose(value: CurrentPose): Self = StObject.set(x, "_pose", value.asInstanceOf[js.Any])
      
      inline def set_poseUndefined: Self = StObject.set(x, "_pose", js.undefined)
      
      inline def set_poseVarargs(value: String*): Self = StObject.set(x, "_pose", js.Array(value*))
    }
  }
  
  trait PoseElementProps
    extends StObject
       with PoseContextProps
       with /* key */ StringDictionary[Any] {
    
    var _pose: js.UndefOr[CurrentPose] = js.undefined
    
    var children: js.UndefOr[Any] = js.undefined
    
    var initialPose: js.UndefOr[CurrentPose] = js.undefined
    
    var innerRef: js.UndefOr[Current | RefFunc] = js.undefined
    
    var onPoseComplete: js.UndefOr[js.Function1[/* pose */ CurrentPose, Any]] = js.undefined
    
    var onValueChange: js.UndefOr[StringDictionary[js.Function1[/* v */ Any, Any]]] = js.undefined
    
    var pose: js.UndefOr[CurrentPose] = js.undefined
    
    var withParent: js.UndefOr[Boolean] = js.undefined
  }
  object PoseElementProps {
    
    inline def apply(): PoseElementProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PoseElementProps]
    }
    
    extension [Self <: PoseElementProps](x: Self) {
      
      inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setInitialPose(value: CurrentPose): Self = StObject.set(x, "initialPose", value.asInstanceOf[js.Any])
      
      inline def setInitialPoseUndefined: Self = StObject.set(x, "initialPose", js.undefined)
      
      inline def setInitialPoseVarargs(value: String*): Self = StObject.set(x, "initialPose", js.Array(value*))
      
      inline def setInnerRef(value: Current | RefFunc): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: /* el */ Element => Any): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      inline def setOnPoseComplete(value: /* pose */ CurrentPose => Any): Self = StObject.set(x, "onPoseComplete", js.Any.fromFunction1(value))
      
      inline def setOnPoseCompleteUndefined: Self = StObject.set(x, "onPoseComplete", js.undefined)
      
      inline def setOnValueChange(value: StringDictionary[js.Function1[/* v */ Any, Any]]): Self = StObject.set(x, "onValueChange", value.asInstanceOf[js.Any])
      
      inline def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      inline def setPose(value: CurrentPose): Self = StObject.set(x, "pose", value.asInstanceOf[js.Any])
      
      inline def setPoseUndefined: Self = StObject.set(x, "pose", js.undefined)
      
      inline def setPoseVarargs(value: String*): Self = StObject.set(x, "pose", js.Array(value*))
      
      inline def setWithParent(value: Boolean): Self = StObject.set(x, "withParent", value.asInstanceOf[js.Any])
      
      inline def setWithParentUndefined: Self = StObject.set(x, "withParent", js.undefined)
      
      inline def set_pose(value: CurrentPose): Self = StObject.set(x, "_pose", value.asInstanceOf[js.Any])
      
      inline def set_poseUndefined: Self = StObject.set(x, "_pose", js.undefined)
      
      inline def set_poseVarargs(value: String*): Self = StObject.set(x, "_pose", js.Array(value*))
    }
  }
  
  type RefFunc = js.Function1[/* el */ Element, Any]
}
