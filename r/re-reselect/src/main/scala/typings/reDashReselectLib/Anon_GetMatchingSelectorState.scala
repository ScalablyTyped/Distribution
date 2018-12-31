package typings
package reDashReselectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetMatchingSelectorState[S, R, C] extends js.Object {
  var cache: reDashReselectLib.reDashReselectMod.ICacheObject
  var clearCache: js.Function0[scala.Unit]
  var getMatchingSelector: js.Function2[
    /* state */ S, 
    /* repeated */ js.Any, 
    reDashReselectLib.reDashReselectMod.OutputSelector[S, R, C]
  ]
  var removeMatchingSelector: js.Function2[/* state */ S, /* repeated */ js.Any, scala.Unit]
}

