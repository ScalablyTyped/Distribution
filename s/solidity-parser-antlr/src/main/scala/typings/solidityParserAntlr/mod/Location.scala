package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Location extends StObject {
  
  var end: LineColumn
  
  var start: LineColumn
}
object Location {
  
  @scala.inline
  def apply(end: LineColumn, start: LineColumn): Location = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
  
  @scala.inline
  implicit class LocationMutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: LineColumn): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: LineColumn): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
