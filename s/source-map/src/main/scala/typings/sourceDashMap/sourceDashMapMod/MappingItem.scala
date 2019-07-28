package typings.sourceDashMap.sourceDashMapMod

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
    val __obj = js.Dynamic.literal(generatedColumn = generatedColumn, generatedLine = generatedLine, name = name, originalColumn = originalColumn, originalLine = originalLine, source = source)
  
    __obj.asInstanceOf[MappingItem]
  }
}

