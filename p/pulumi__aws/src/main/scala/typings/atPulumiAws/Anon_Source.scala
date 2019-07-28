package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Source extends js.Object {
  var source: String
  var target: String
  var targetParameter: js.UndefOr[String] = js.undefined
}

object Anon_Source {
  @scala.inline
  def apply(source: String, target: String, targetParameter: String = null): Anon_Source = {
    val __obj = js.Dynamic.literal(source = source, target = target)
    if (targetParameter != null) __obj.updateDynamic("targetParameter")(targetParameter)
    __obj.asInstanceOf[Anon_Source]
  }
}

