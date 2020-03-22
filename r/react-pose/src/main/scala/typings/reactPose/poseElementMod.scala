package typings.reactPose

import org.scalablytyped.runtime.StringDictionary
import typings.popmotionPose.typesMod.DomPopmotionConfig
import typings.popmotionPose.typesMod.DomPopmotionPoser
import typings.react.mod.Component
import typings.react.mod.ConsumerProps
import typings.react.mod.ExoticComponent
import typings.reactPose.typesMod.ChildRegistration
import typings.reactPose.typesMod.CurrentPose
import typings.reactPose.typesMod.PopStyle
import typings.reactPose.typesMod.PoseElementInternalProps
import typings.std.Element
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-pose/lib/components/PoseElement", JSImport.Namespace)
@js.native
object poseElementMod extends js.Object {
  @js.native
  class PoseElement protected ()
    extends Component[PoseElementInternalProps, js.Object, js.Any] {
    def this(props: PoseElementInternalProps) = this()
    var children: Set[ChildRegistration] = js.native
    var childrenHandlers: js.Any = js.native
    var popStyle: js.UndefOr[PopStyle] = js.native
    var poseConfig: DomPopmotionConfig = js.native
    var poser: DomPopmotionPoser = js.native
    @JSName("props")
    var props_PoseElement: PoseElementInternalProps = js.native
    var ref: Element = js.native
    var styleProps: StringDictionary[js.Any] = js.native
    @JSName("componentDidMount")
    def componentDidMount_MPoseElement(): Unit = js.native
    @JSName("componentDidUpdate")
    def componentDidUpdate_MPoseElement(prevProps: PoseElementInternalProps): Unit = js.native
    @JSName("componentWillUnmount")
    def componentWillUnmount_MPoseElement(): Unit = js.native
    def flushChildren(): Unit = js.native
    def getFirstPose(): CurrentPose | Unit = js.native
    def getInitialPose(): CurrentPose | Unit = js.native
    def getSetProps(): AnonDictkey = js.native
    @JSName("getSnapshotBeforeUpdate")
    def getSnapshotBeforeUpdate_MPoseElement(): Null = js.native
    def initPoser(poser: DomPopmotionPoser): Unit = js.native
    def setPose(pose: CurrentPose): Unit = js.native
    def setRef(ref: Element): Unit = js.native
    def shouldForwardProp(key: String): Boolean = js.native
  }
  
  val PoseParentConsumer: ExoticComponent[ConsumerProps[js.Object]] = js.native
}

