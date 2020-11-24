package typings.rsocketCore.compositeMetadataMod

import typings.node.Buffer
import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rsocket-core/CompositeMetadata", "CompositeMetadata")
@js.native
class CompositeMetadata protected () extends js.Object {
  def this(buffer: Buffer) = this()
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[Iterator[Entry, _, js.UndefOr[scala.Nothing]]] = js.native
}
