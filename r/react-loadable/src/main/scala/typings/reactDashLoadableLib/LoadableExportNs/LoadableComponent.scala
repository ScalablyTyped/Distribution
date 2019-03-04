package typings
package reactDashLoadableLib.LoadableExportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadableComponent extends js.Object {
  /**
    * The generated component has a static method preload() for calling the loader function ahead of time.
    * This is useful for scenarios where you think the user might do something next and want to load the
    * next component eagerly.
    *
    * Note: preload() intentionally does not return a promise. You should not be depending on the timing of
    * preload(). It's meant as a performance optimization, not for creating UI logic.
    */
  def preload(): scala.Unit
}

object LoadableComponent {
  @scala.inline
  def apply(preload: js.Function0[scala.Unit]): LoadableComponent = {
    val __obj = js.Dynamic.literal(preload = preload)
  
    __obj.asInstanceOf[LoadableComponent]
  }
}

