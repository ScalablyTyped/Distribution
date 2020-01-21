package typings.reactable

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactableComponents extends reactableProps {
  @scala.inline
  def Table[T]: ComponentType[TableProps[T]] = js.constructorOf[typings.reactable.mod.Table[T]].asInstanceOf[typings.react.mod.ComponentType[TableProps[T]]]
  @scala.inline
  def Td: ComponentType[TdProps] = js.constructorOf[typings.reactable.mod.Td].asInstanceOf[typings.react.mod.ComponentType[TdProps]]
  @scala.inline
  def Tfoot: ComponentType[js.Object] = js.constructorOf[typings.reactable.mod.Tfoot].asInstanceOf[typings.react.mod.ComponentType[js.Object]]
  @scala.inline
  def Th: ComponentType[ThProps] = js.constructorOf[typings.reactable.mod.Th].asInstanceOf[typings.react.mod.ComponentType[ThProps]]
  @scala.inline
  def Thead: ComponentType[js.Object] = js.constructorOf[typings.reactable.mod.Thead].asInstanceOf[typings.react.mod.ComponentType[js.Object]]
  @scala.inline
  def Tr[T]: ComponentType[TrProps[T]] = js.constructorOf[typings.reactable.mod.Tr[T]].asInstanceOf[typings.react.mod.ComponentType[TrProps[T]]]
}

