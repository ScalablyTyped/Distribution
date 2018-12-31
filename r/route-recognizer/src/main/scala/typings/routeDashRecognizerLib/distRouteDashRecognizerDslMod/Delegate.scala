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

