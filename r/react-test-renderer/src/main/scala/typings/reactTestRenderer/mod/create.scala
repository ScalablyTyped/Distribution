package typings.reactTestRenderer.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-test-renderer", "create")
@js.native
object create extends js.Object {
  
  def apply(nextElement: ReactElement): ReactTestRenderer = js.native
  def apply(nextElement: ReactElement, options: TestRendererOptions): ReactTestRenderer = js.native
}
