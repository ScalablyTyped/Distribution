package typings.rsocketDashCore.compositeMetadataMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-core/CompositeMetadata", "ExplicitMimeTimeEntry")
@js.native
class ExplicitMimeTimeEntry protected () extends Entry {
  def this(content: Buffer, `type`: String) = this()
  /**
    * Returns the un-decoded content of the {@link Entry}.
    *
    * @return the un-decoded content of the {@link Entry}
    */
  /* CompleteClass */
  override val content: Buffer = js.native
  @JSName("mimeType")
  val mimeType_ExplicitMimeTimeEntry: String = js.native
}

