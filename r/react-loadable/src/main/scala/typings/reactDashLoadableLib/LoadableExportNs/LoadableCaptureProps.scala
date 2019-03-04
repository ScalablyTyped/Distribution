package typings
package reactDashLoadableLib.LoadableExportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadableCaptureProps extends js.Object {
  /**
    * Function called for every moduleName that is rendered via React Loadable.
    */
  def report(moduleName: java.lang.String): scala.Unit
}

object LoadableCaptureProps {
  @scala.inline
  def apply(report: js.Function1[java.lang.String, scala.Unit]): LoadableCaptureProps = {
    val __obj = js.Dynamic.literal(report = report)
  
    __obj.asInstanceOf[LoadableCaptureProps]
  }
}

