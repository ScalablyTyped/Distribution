package typings.rxDashAngular.rxNs.angularNs

import typings.angular.angularMod.IRootScopeService
import typings.rxDashLiteDashAggregates.RxNs.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRxScope extends IRootScopeService {
  @JSName("$toObservable")
  def $toObservable(property: String): Observable[_] = js.native
}

