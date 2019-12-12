package typings.reactDashTagcloud

import org.scalablytyped.runtime.TopLevel
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentState
import typings.reactDashTagcloud.ReactTagCloud.DefaultRendererFactory
import typings.reactDashTagcloud.ReactTagCloud.TagCloudClass
import typings.reactDashTagcloud.ReactTagCloud.TagCloudProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-tagcloud", JSImport.Namespace)
@js.native
object reactDashTagcloudMod extends js.Object {
  @js.native
  class TagCloud protected ()
    extends Component[TagCloudProps, ComponentState, js.Any] {
    def this(props: TagCloudProps) = this()
    def this(props: TagCloudProps, context: js.Any) = this()
  }
  
  val DefaultRenderer: DefaultRendererFactory = js.native
  @js.native
  object TagCloud extends TopLevel[TagCloudClass]
  
}

