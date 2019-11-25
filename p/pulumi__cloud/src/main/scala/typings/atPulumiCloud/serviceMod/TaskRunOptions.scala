package typings.atPulumiCloud.serviceMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskRunOptions extends js.Object {
  /**
    * Optional environment variables to override those set in the container definition.
    */
  var environment: js.UndefOr[Record[String, String]] = js.undefined
  /**
    * The properties of the host where this task can run.
    */
  var host: js.UndefOr[HostProperties] = js.undefined
}

object TaskRunOptions {
  @scala.inline
  def apply(environment: Record[String, String] = null, host: HostProperties = null): TaskRunOptions = {
    val __obj = js.Dynamic.literal()
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskRunOptions]
  }
}

