package typings.pullStream

import typings.pullStream.mod.EndOrError
import typings.pullStream.mod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pull-stream/sources/error", JSImport.Namespace)
@js.native
object errorMod extends js.Object {
  
  /**
    * Create a stream with no contents (it just ends immediately).
    */
  def apply(err: EndOrError): Source[scala.Nothing] = js.native
}
