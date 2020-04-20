package typings.reactLoadable.LoadableExport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadableCaptureProps extends js.Object {
  /**
    * Function called for every moduleName that is rendered via React Loadable.
    */
  def report(moduleName: String): Unit
}

object LoadableCaptureProps {
  @scala.inline
  def apply(report: String => Unit): LoadableCaptureProps = {
    val __obj = js.Dynamic.literal(report = js.Any.fromFunction1(report))
    __obj.asInstanceOf[LoadableCaptureProps]
  }
}

