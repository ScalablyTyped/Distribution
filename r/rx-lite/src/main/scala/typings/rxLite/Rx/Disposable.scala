package typings.rxLite.Rx

import typings.rxCore.Rx.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Disposable
  extends StObject
     with IDisposable
object Disposable {
  
  @scala.inline
  def apply(dispose: () => Unit): Disposable = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
    __obj.asInstanceOf[Disposable]
  }
}
