package typings
package rrcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Inject extends js.Object {
  var inject: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object Anon_Inject {
  @scala.inline
  def apply(inject: org.scalablytyped.runtime.StringDictionary[js.Any] = null): Anon_Inject = {
    val __obj = js.Dynamic.literal()
    if (inject != null) __obj.updateDynamic("inject")(inject)
    __obj.asInstanceOf[Anon_Inject]
  }
}

