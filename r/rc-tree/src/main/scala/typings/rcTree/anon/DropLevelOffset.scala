package typings.rcTree.anon

import typings.rcTree.rcTreeInts.`-1`
import typings.rcTree.rcTreeInts.`0`
import typings.rcTree.rcTreeInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropLevelOffset extends StObject {
  
  var dropLevelOffset: Double
  
  var dropPosition: `-1` | `0` | `1`
  
  var indent: Double
}
object DropLevelOffset {
  
  inline def apply(dropLevelOffset: Double, dropPosition: `-1` | `0` | `1`, indent: Double): DropLevelOffset = {
    val __obj = js.Dynamic.literal(dropLevelOffset = dropLevelOffset.asInstanceOf[js.Any], dropPosition = dropPosition.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropLevelOffset]
  }
  
  extension [Self <: DropLevelOffset](x: Self) {
    
    inline def setDropLevelOffset(value: Double): Self = StObject.set(x, "dropLevelOffset", value.asInstanceOf[js.Any])
    
    inline def setDropPosition(value: `-1` | `0` | `1`): Self = StObject.set(x, "dropPosition", value.asInstanceOf[js.Any])
    
    inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
  }
}
