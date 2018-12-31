package typings
package reactDashLoadableLib.LoadableExportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsWithoutRender[Props] extends CommonOptions {
  /**
    * Function returning a promise which returns a React component displayed on success.
    *
    * Resulting React component receives all the props passed to the generated component.
    */
  def loader(): js.Promise[
    reactLib.reactMod.ReactNs.ComponentType[Props] | reactDashLoadableLib.Anon_Default[Props]
  ]
}

