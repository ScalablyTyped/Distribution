package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Source extends js.Object {
  var source: java.lang.String
  var target: java.lang.String
  var targetParameter: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Source {
  @scala.inline
  def apply(source: java.lang.String, target: java.lang.String, targetParameter: java.lang.String = null): Anon_Source = {
    val __obj = js.Dynamic.literal(source = source, target = target)
    if (targetParameter != null) __obj.updateDynamic("targetParameter")(targetParameter)
    __obj.asInstanceOf[Anon_Source]
  }
}

