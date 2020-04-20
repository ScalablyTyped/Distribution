package typings.reactTimeago

import typings.react.mod.ComponentProps
import typings.react.mod.ComponentType
import typings.reactTimeago.mod.ReactTimeagoProps
import typings.reactTimeago.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactTimeagoComponents extends reactTimeagoProps {
  @scala.inline
  def ReactTimeago[T /* <: ComponentType[js.Object] */]: ComponentType[ReactTimeagoProps[T] with ComponentProps[T]] = js.constructorOf[^[T]].asInstanceOf[ComponentType[ReactTimeagoProps[T] with ComponentProps[T]]]
}

