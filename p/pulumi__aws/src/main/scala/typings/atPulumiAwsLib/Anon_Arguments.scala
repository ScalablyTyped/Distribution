package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Arguments extends js.Object {
  var arguments: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var jobName: java.lang.String
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Arguments {
  @scala.inline
  def apply(
    jobName: java.lang.String,
    arguments: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    timeout: scala.Int | scala.Double = null
  ): Anon_Arguments = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("jobName")(jobName)
    if (arguments != null) __obj.updateDynamic("arguments")(arguments)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Arguments]
  }
}

