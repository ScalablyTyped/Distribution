package typings.rcTree.anon

import typings.rcTree.rcTreeInts.`-1`
import typings.rcTree.rcTreeInts.`0`
import typings.rcTree.rcTreeInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropPosition extends StObject {
  
  var direction: typings.rcTree.interfaceMod.Direction
  
  var dropLevelOffset: Double
  
  var dropPosition: `-1` | `0` | `1`
  
  var indent: Any
  
  var prefixCls: Any
}
object DropPosition {
  
  inline def apply(dropLevelOffset: Double, dropPosition: `-1` | `0` | `1`, indent: Any, prefixCls: Any): DropPosition = {
    val __obj = js.Dynamic.literal(dropLevelOffset = dropLevelOffset.asInstanceOf[js.Any], dropPosition = dropPosition.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropPosition]
  }
  
  extension [Self <: DropPosition](x: Self) {
    
    inline def setDirection(value: typings.rcTree.interfaceMod.Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setDropLevelOffset(value: Double): Self = StObject.set(x, "dropLevelOffset", value.asInstanceOf[js.Any])
    
    inline def setDropPosition(value: `-1` | `0` | `1`): Self = StObject.set(x, "dropPosition", value.asInstanceOf[js.Any])
    
    inline def setIndent(value: Any): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    inline def setPrefixCls(value: Any): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
  }
}
