package typings.reactable

import typings.reactable.mod.TableComponentProperties
import typings.reactable.mod.TdProperties
import typings.reactable.mod.ThProperties
import typings.reactable.mod.TrProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait reactableProps {
  @scala.inline
  def TableProps: TableComponentProperties.type = TableComponentProperties
  type TableProps[T] = TableComponentProperties[T]
  @scala.inline
  def TdProps: TdProperties.type = TdProperties
  type TdProps = TdProperties
  @scala.inline
  def ThProps: ThProperties.type = ThProperties
  type ThProps = ThProperties
  @scala.inline
  def TrProps: TrProperties.type = TrProperties
  type TrProps[T] = TrProperties[T]
}

