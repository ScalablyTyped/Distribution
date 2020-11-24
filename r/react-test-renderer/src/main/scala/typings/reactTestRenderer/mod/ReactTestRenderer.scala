package typings.reactTestRenderer.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactTestRenderer extends js.Object {
  
  def getInstance(): Null | ReactTestInstance = js.native
  
  var root: ReactTestInstance = js.native
  
  def toJSON(): Null | ReactTestRendererJSON | js.Array[ReactTestRendererJSON] = js.native
  
  def toTree(): Null | ReactTestRendererTree = js.native
  
  def unmount(): Unit = js.native
  def unmount(nextElement: ReactElement): Unit = js.native
  
  def update(nextElement: ReactElement): Unit = js.native
}
