package typings.rxAngular

import typings.angular.mod.IRootScopeService
import typings.rxLiteAggregates.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("rx")
@js.native
object rx extends js.Object {
  @js.native
  object angular extends js.Object {
    @js.native
    trait IRxScope extends IRootScopeService {
      @JSName("$toObservable")
      def $toObservable(property: String): Observable[_] = js.native
    }
    
  }
  
}

