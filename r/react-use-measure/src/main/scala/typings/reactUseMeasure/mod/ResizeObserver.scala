package typings.reactUseMeasure.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResizeObserver extends js.Object {
  
  def disconnect(): Unit = js.native
  
  def observe(target: Element): Unit = js.native
  def observe(target: Element, options: js.Any): Unit = js.native
  
  def unobserve(target: Element): Unit = js.native
}
