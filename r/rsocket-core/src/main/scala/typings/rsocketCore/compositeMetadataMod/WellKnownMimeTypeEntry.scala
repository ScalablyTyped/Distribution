package typings.rsocketCore.compositeMetadataMod

import typings.node.Buffer
import typings.rsocketCore.wellKnownMimeTypeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-core/CompositeMetadata", "WellKnownMimeTypeEntry")
@js.native
class WellKnownMimeTypeEntry protected () extends Entry {
  def this(content: Buffer, `type`: default) = this()
  /**
    * Returns the un-decoded content of the {@link Entry}.
    *
    * @return the un-decoded content of the {@link Entry}
    */
  /* CompleteClass */
  override val content: Buffer = js.native
  @JSName("mimeType")
  val mimeType_WellKnownMimeTypeEntry: String = js.native
  /**
    * Returns the {@link WellKnownMimeType} for this entry.
    *
    * @return the {@link WellKnownMimeType} for this entry
    */
  val `type`: default = js.native
}

