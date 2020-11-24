package typings.reactAddonsTestUtils.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShallowRenderer extends js.Object {
  
  def getRenderOutput[E /* <: ReactElement */](): E = js.native
  
  def render(element: ReactElement): Unit = js.native
  def render(element: ReactElement, context: js.Any): Unit = js.native
  
  def unmount(): Unit = js.native
}
