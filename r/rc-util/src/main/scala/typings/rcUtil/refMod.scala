package typings.rcUtil

import typings.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refMod {
  
  @JSImport("rc-util/lib/ref", "composeRef")
  @js.native
  def composeRef[T](refs: Ref[T]*): Ref[T] = js.native
  
  @JSImport("rc-util/lib/ref", "fillRef")
  @js.native
  def fillRef[T](ref: Ref[T], node: T): Unit = js.native
  
  @JSImport("rc-util/lib/ref", "supportRef")
  @js.native
  def supportRef(nodeOrComponent: js.Any): Boolean = js.native
}
