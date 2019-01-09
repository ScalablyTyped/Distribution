package typings
package reDashReselectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsCache[S, P, R, C] extends js.Object {
  var cache: reDashReselectLib.reDashReselectMod.ICacheObject
  def clearCache(): scala.Unit
  def getMatchingSelector(state: S, props: P, args: js.Any*): reDashReselectLib.reDashReselectMod.OutputParametricSelector[S, P, R, C]
  def removeMatchingSelector(state: S, props: P, args: js.Any*): scala.Unit
}

