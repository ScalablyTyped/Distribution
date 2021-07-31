package typings.qlikVisualizationextensions

import org.scalablytyped.runtime.Shortcut
import typings.qlikVisualizationextensions.RootAPI.IRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("qlik", JSImport.Namespace)
  @js.native
  val ^ : IRoot = js.native
  
  /**
    * promise object
    * Promise utility that can be used for asynchronous operations.
    * Very useful for the paint method to indicate when the rendering is completed.
    * executor
    * Type: Function
    * The executing function with two parameters:
    * resolve
    * reject
    */
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("qlik", "Promise")
  @js.native
  class Promise[T] protected ()
    extends StObject
       with typings.std.Promise[T] {
    /**
      * Creates a new Promise.
      * @param executor A callback used to initialize the promise. This callback is passed two arguments:
      * a resolve callback used to resolve the promise with a value or the result of another promise,
      * and a reject callback used to reject the promise with a provided reason or error.
      */
    def this(executor: js.Function2[
            /* resolve */ js.Function1[/* value */ T | js.Thenable[T], Unit], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
            Unit
          ]) = this()
  }
  
  type _To = IRoot
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: IRoot = ^
}
