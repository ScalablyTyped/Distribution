package typings.atPulumiAws

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Arguments extends js.Object {
  var arguments: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var jobName: String
  var timeout: js.UndefOr[Double] = js.undefined
}

object Anon_Arguments {
  @scala.inline
  def apply(jobName: String, arguments: StringDictionary[js.Any] = null, timeout: Int | Double = null): Anon_Arguments = {
    val __obj = js.Dynamic.literal(jobName = jobName)
    if (arguments != null) __obj.updateDynamic("arguments")(arguments)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Arguments]
  }
}

