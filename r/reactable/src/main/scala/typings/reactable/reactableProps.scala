package typings.reactable

import typings.reactable.reactableMod.TableComponentProperties
import typings.reactable.reactableMod.TdProperties
import typings.reactable.reactableMod.ThProperties
import typings.reactable.reactableMod.TrProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait reactableProps {
  @scala.inline
  def TableProps: TableComponentProperties.type = typings.reactable.reactableMod.TableComponentProperties
  type TableProps[T] = TableComponentProperties[T]
  @scala.inline
  def TdProps: TdProperties.type = typings.reactable.reactableMod.TdProperties
  type TdProps = TdProperties
  @scala.inline
  def ThProps: ThProperties.type = typings.reactable.reactableMod.ThProperties
  type ThProps = ThProperties
  @scala.inline
  def TrProps: TrProperties.type = typings.reactable.reactableMod.TrProperties
  type TrProps[T] = TrProperties[T]
}

