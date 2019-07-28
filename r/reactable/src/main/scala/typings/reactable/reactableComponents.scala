package typings.reactable

import typings.react.reactMod.ComponentType
import typings.reactable.reactableMod.TableComponentProperties
import typings.reactable.reactableMod.TdProperties
import typings.reactable.reactableMod.ThProperties
import typings.reactable.reactableMod.TrProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactableComponents extends reactableProps {
  @scala.inline
  def Table[T]: ComponentType[TableComponentProperties[T]] = js.constructorOf[typings.reactable.reactableMod.Table[T]].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactable.reactableMod.TableComponentProperties[T]]]
  @scala.inline
  def Td: ComponentType[TdProperties] = js.constructorOf[typings.reactable.reactableMod.Td].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactable.reactableMod.TdProperties]]
  @scala.inline
  def Tfoot: ComponentType[js.Object] = js.constructorOf[typings.reactable.reactableMod.Tfoot].asInstanceOf[typings.react.reactMod.ComponentType[js.Object]]
  @scala.inline
  def Th: ComponentType[ThProperties] = js.constructorOf[typings.reactable.reactableMod.Th].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactable.reactableMod.ThProperties]]
  @scala.inline
  def Thead: ComponentType[js.Object] = js.constructorOf[typings.reactable.reactableMod.Thead].asInstanceOf[typings.react.reactMod.ComponentType[js.Object]]
  @scala.inline
  def Tr[T]: ComponentType[TrProperties[T]] = js.constructorOf[typings.reactable.reactableMod.Tr[T]].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactable.reactableMod.TrProperties[T]]]
}

