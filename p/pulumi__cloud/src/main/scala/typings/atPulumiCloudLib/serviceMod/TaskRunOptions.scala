package typings
package atPulumiCloudLib.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskRunOptions extends js.Object {
  /**
    * Optional environment variables to override those set in the container definition.
    */
  var environment: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /**
    * The properties of the host where this task can run.
    */
  var host: js.UndefOr[HostProperties] = js.undefined
}

object TaskRunOptions {
  @scala.inline
  def apply(environment: stdLib.Record[java.lang.String, java.lang.String] = null, host: HostProperties = null): TaskRunOptions = {
    val __obj = js.Dynamic.literal()
    if (environment != null) __obj.updateDynamic("environment")(environment)
    if (host != null) __obj.updateDynamic("host")(host)
    __obj.asInstanceOf[TaskRunOptions]
  }
}

