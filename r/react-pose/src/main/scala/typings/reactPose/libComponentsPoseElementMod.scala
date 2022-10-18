package typings.reactPose

import org.scalablytyped.runtime.StringDictionary
import typings.popmotionPose.libTypesMod.DomPopmotionConfig
import typings.popmotionPose.libTypesMod.DomPopmotionPoser
import typings.react.mod.ConsumerProps
import typings.react.mod.ExoticComponent
import typings.react.mod.PureComponent
import typings.reactPose.anon.Dictkey
import typings.reactPose.libComponentsPoseElementTypesMod.ChildRegistration
import typings.reactPose.libComponentsPoseElementTypesMod.CurrentPose
import typings.reactPose.libComponentsPoseElementTypesMod.PopStyle
import typings.reactPose.libComponentsPoseElementTypesMod.PoseElementInternalProps
import typings.std.Element
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsPoseElementMod {
  
  @JSImport("react-pose/lib/components/PoseElement", "PoseElement")
  @js.native
  open class PoseElement protected ()
    extends PureComponent[PoseElementInternalProps, js.Object, Any] {
    def this(props: PoseElementInternalProps) = this()
    
    var children: Set[ChildRegistration] = js.native
    
    /* private */ var childrenHandlers: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MPoseElement(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MPoseElement(prevProps: PoseElementInternalProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MPoseElement(): Unit = js.native
    
    def flushChildren(): Unit = js.native
    
    def getFirstPose(): CurrentPose | Unit = js.native
    
    def getInitialPose(): CurrentPose | Unit = js.native
    
    def getSetProps(): Dictkey = js.native
    
    @JSName("getSnapshotBeforeUpdate")
    def getSnapshotBeforeUpdate_MPoseElement(): Null = js.native
    
    def initPoser(poser: DomPopmotionPoser): Unit = js.native
    
    var popStyle: js.UndefOr[PopStyle] = js.native
    
    var poseConfig: DomPopmotionConfig = js.native
    
    var poser: DomPopmotionPoser = js.native
    
    var ref: Element = js.native
    
    def setPose(pose: CurrentPose): Unit = js.native
    
    def setRef(ref: Element): Unit = js.native
    
    def shouldForwardProp(key: String): Boolean = js.native
    
    var styleProps: StringDictionary[Any] = js.native
  }
  
  @JSImport("react-pose/lib/components/PoseElement", "PoseParentConsumer")
  @js.native
  val PoseParentConsumer: ExoticComponent[ConsumerProps[js.Object]] = js.native
}
