package typings.sourceMap.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MappingItem extends StObject {
  
  var generatedColumn: Double = js.native
  
  var generatedLine: Double = js.native
  
  var name: String = js.native
  
  var originalColumn: Double = js.native
  
  var originalLine: Double = js.native
  
  var source: String = js.native
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
  
  @scala.inline
  implicit class MappingItemMutableBuilder[Self <: MappingItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeneratedColumn(value: Double): Self = StObject.set(x, "generatedColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeneratedLine(value: Double): Self = StObject.set(x, "generatedLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalColumn(value: Double): Self = StObject.set(x, "originalColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalLine(value: Double): Self = StObject.set(x, "originalLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
