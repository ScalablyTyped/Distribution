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
  def TableProps: TableComponentProperties.type = typings.reactable.mod.TableComponentProperties
  type TableProps[T] = TableComponentProperties[T]
  @scala.inline
  def TdProps: TdProperties.type = typings.reactable.mod.TdProperties
  type TdProps = TdProperties
  @scala.inline
  def ThProps: ThProperties.type = typings.reactable.mod.ThProperties
  type ThProps = ThProperties
  @scala.inline
  def TrProps: TrProperties.type = typings.reactable.mod.TrProperties
  type TrProps[T] = TrProperties[T]
}

