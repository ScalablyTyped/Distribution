package typings.rrc

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Inject extends js.Object {
  var inject: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object Anon_Inject {
  @scala.inline
  def apply(inject: StringDictionary[js.Any] = null): Anon_Inject = {
    val __obj = js.Dynamic.literal()
    if (inject != null) __obj.updateDynamic("inject")(inject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Inject]
  }
}

