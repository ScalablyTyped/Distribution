package typings.reactTagcloud.global

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.reactTagcloud.ReactTagCloud_.DefaultRendererFactory
import typings.reactTagcloud.ReactTagCloud_.TagCloudClass
import typings.reactTagcloud.ReactTagCloud_.TagCloudProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// export = TagCloud
@JSGlobal("reactTagCloud")
@js.native
object reactTagCloud extends js.Object {
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

