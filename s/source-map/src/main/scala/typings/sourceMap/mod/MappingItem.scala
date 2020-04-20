package typings.sourceMap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MappingItem extends js.Object {
  var generatedColumn: Double
  var generatedLine: Double
  var name: String
  var originalColumn: Double
  var originalLine: Double
  var source: String
}

object MappingItem {
  @scala.inline
  def apply(
    generatedColumn: Double,
    generatedLine: Double,
    name: String,
    originalColumn: Double,
    originalLine: Double,
    source: String
  ): MappingItem = {
    val __obj = js.Dynamic.literal(generatedColumn = generatedColumn.asInstanceOf[js.Any], generatedLine = generatedLine.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], originalColumn = originalColumn.asInstanceOf[js.Any], originalLine = originalLine.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[MappingItem]
  }
}

