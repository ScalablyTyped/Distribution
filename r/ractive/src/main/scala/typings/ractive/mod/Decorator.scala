package typings.ractive.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Decorator[T /* <: Ractive[T] */] extends StObject {
  
  def apply(node: HTMLElement, args: js.Any*): DecoratorHandle = js.native
}
