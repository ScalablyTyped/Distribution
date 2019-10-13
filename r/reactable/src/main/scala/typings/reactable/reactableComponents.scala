package typings.reactable

import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactableComponents extends reactableProps {
  @scala.inline
  def Table[T]: ComponentType[TableProps[T]] = js.constructorOf[typings.reactable.reactableMod.Table[T]].asInstanceOf[typings.react.reactMod.ComponentType[TableProps[T]]]
  @scala.inline
  def Td: ComponentType[TdProps] = js.constructorOf[typings.reactable.reactableMod.Td].asInstanceOf[typings.react.reactMod.ComponentType[TdProps]]
  @scala.inline
  def Tfoot: ComponentType[js.Object] = js.constructorOf[typings.reactable.reactableMod.Tfoot].asInstanceOf[typings.react.reactMod.ComponentType[js.Object]]
  @scala.inline
  def Th: ComponentType[ThProps] = js.constructorOf[typings.reactable.reactableMod.Th].asInstanceOf[typings.react.reactMod.ComponentType[ThProps]]
  @scala.inline
  def Thead: ComponentType[js.Object] = js.constructorOf[typings.reactable.reactableMod.Thead].asInstanceOf[typings.react.reactMod.ComponentType[js.Object]]
  @scala.inline
  def Tr[T]: ComponentType[TrProps[T]] = js.constructorOf[typings.reactable.reactableMod.Tr[T]].asInstanceOf[typings.react.reactMod.ComponentType[TrProps[T]]]
}

