package typings.sigmajs

import org.scalablytyped.runtime.TopLevel
import typings.sigmajs.SigmaJs.CustomShapes
import typings.sigmajs.SigmaJs.Sigma
import typings.sigmajs.SigmaJs.SigmaConfigs
import typings.sigmajs.SigmaJs.SigmaFactory
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class sigma () extends Sigma {
    def this(configuration: SigmaConfigs) = this()
    def this(container: String) = this()
    def this(container: Element) = this()
  }
  
  var CustomShapes: typings.sigmajs.SigmaJs.CustomShapes = js.native
  var ShapeLibrary: CustomShapes = js.native
  @js.native
  object sigma extends TopLevel[SigmaFactory]
  
}

