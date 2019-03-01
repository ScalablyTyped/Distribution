package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionOnTimeout extends js.Object {
  var actionOnTimeout: js.UndefOr[java.lang.String] = js.undefined
  var waitTimeInMinutes: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ActionOnTimeout {
  @scala.inline
  def apply(actionOnTimeout: java.lang.String = null, waitTimeInMinutes: scala.Int | scala.Double = null): Anon_ActionOnTimeout = {
    val __obj = js.Dynamic.literal()
    if (actionOnTimeout != null) __obj.updateDynamic("actionOnTimeout")(actionOnTimeout)
    if (waitTimeInMinutes != null) __obj.updateDynamic("waitTimeInMinutes")(waitTimeInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ActionOnTimeout]
  }
}

