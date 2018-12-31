package typings
package reDashReselectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetMatchingSelector[S, P, R, C] extends js.Object {
  var cache: reDashReselectLib.reDashReselectMod.ICacheObject
  var clearCache: js.Function0[scala.Unit]
  var getMatchingSelector: js.Function3[
    /* state */ S, 
    /* props */ P, 
    /* repeated */ js.Any, 
    reDashReselectLib.reDashReselectMod.OutputParametricSelector[S, P, R, C]
  ]
  var removeMatchingSelector: js.Function3[/* state */ S, /* props */ P, /* repeated */ js.Any, scala.Unit]
}

