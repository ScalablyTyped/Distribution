package typings.rsocketCore.compositeMetadataMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rsocket-core/CompositeMetadata", "ExplicitMimeTimeEntry")
@js.native
class ExplicitMimeTimeEntry protected () extends Entry {
  def this(content: Buffer, `type`: String) = this()
  
  @JSName("mimeType")
  val mimeType_ExplicitMimeTimeEntry: String = js.native
}
