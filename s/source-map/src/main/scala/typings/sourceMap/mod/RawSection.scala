package typings.sourceMap.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RawSection extends StObject {
  
  var map: RawSourceMap = js.native
  
  var offset: Position = js.native
}
object RawSection {
  
  @scala.inline
  def apply(map: RawSourceMap, offset: Position): RawSection = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawSection]
  }
  
  @scala.inline
  implicit class RawSectionMutableBuilder[Self <: RawSection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMap(value: RawSourceMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Position): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
