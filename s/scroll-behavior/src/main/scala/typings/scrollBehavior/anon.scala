package typings.scrollBehavior

import typings.scrollBehavior.mod.LocationBase
import typings.scrollBehavior.mod.ScrollPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object anon extends js.Object {
  @js.native
  trait Read[TLocation /* <: LocationBase */] extends js.Object {
    def read(location: TLocation): js.UndefOr[ScrollPosition | Null] = js.native
    def read(location: TLocation, key: String): js.UndefOr[ScrollPosition | Null] = js.native
    def save(location: TLocation, key: String, value: ScrollPosition): Unit = js.native
    def save(location: TLocation, key: Null, value: ScrollPosition): Unit = js.native
  }
  
}

