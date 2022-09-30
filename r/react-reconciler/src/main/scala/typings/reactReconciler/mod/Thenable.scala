package typings.reactReconciler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Thenable[T] extends StObject {
  
  def `then`(resolve: js.Function0[T]): T = js.native
  def `then`(resolve: js.Function0[T], reject: js.Function0[T]): T = js.native
}
