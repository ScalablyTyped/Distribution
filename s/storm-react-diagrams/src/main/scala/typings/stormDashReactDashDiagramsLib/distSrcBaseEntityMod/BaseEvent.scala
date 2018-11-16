package typings
package stormDashReactDashDiagramsLib.distSrcBaseEntityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BaseEvent[T /* <: BaseEntity[BaseListener[_]] */] extends js.Object {
  var entity: BaseEntity[BaseListener[_]]
  var firing: scala.Boolean
  var id: java.lang.String
  def stopPropagation(): js.Any
}

