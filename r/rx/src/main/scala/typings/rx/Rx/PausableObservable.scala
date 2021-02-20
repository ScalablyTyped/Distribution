package typings.rx.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PausableObservable[T] extends Observable[T] {
  
  def pause(): Unit = js.native
  
  def resume(): Unit = js.native
}
