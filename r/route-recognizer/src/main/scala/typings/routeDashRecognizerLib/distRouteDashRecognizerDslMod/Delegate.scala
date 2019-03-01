package typings
package routeDashRecognizerLib.distRouteDashRecognizerDslMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delegate extends js.Object {
  var contextEntered: js.UndefOr[js.Function2[/* context */ java.lang.String, /* route */ MatchDSL, scala.Unit]] = js.undefined
  var willAddRoute: js.UndefOr[
    js.Function2[
      /* context */ js.UndefOr[java.lang.String], 
      /* route */ java.lang.String, 
      java.lang.String
    ]
  ] = js.undefined
}

object Delegate {
  @scala.inline
  def apply(
    contextEntered: js.Function2[/* context */ java.lang.String, /* route */ MatchDSL, scala.Unit] = null,
    willAddRoute: js.Function2[
      /* context */ js.UndefOr[java.lang.String], 
      /* route */ java.lang.String, 
      java.lang.String
    ] = null
  ): Delegate = {
    val __obj = js.Dynamic.literal()
    if (contextEntered != null) __obj.updateDynamic("contextEntered")(contextEntered)
    if (willAddRoute != null) __obj.updateDynamic("willAddRoute")(willAddRoute)
    __obj.asInstanceOf[Delegate]
  }
}

