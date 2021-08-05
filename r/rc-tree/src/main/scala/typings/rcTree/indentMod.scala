package typings.rcTree

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indentMod extends Shortcut {
  
  @JSImport("rc-tree/es/Indent", JSImport.Default)
  @js.native
  val default: FC[IndentProps] = js.native
  
  trait IndentProps extends StObject {
    
    var isEnd: js.Array[Boolean]
    
    var isStart: js.Array[Boolean]
    
    var level: Double
    
    var prefixCls: String
  }
  object IndentProps {
    
    inline def apply(isEnd: js.Array[Boolean], isStart: js.Array[Boolean], level: Double, prefixCls: String): IndentProps = {
      val __obj = js.Dynamic.literal(isEnd = isEnd.asInstanceOf[js.Any], isStart = isStart.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndentProps]
    }
    
    extension [Self <: IndentProps](x: Self) {
      
      inline def setIsEnd(value: js.Array[Boolean]): Self = StObject.set(x, "isEnd", value.asInstanceOf[js.Any])
      
      inline def setIsEndVarargs(value: Boolean*): Self = StObject.set(x, "isEnd", js.Array(value :_*))
      
      inline def setIsStart(value: js.Array[Boolean]): Self = StObject.set(x, "isStart", value.asInstanceOf[js.Any])
      
      inline def setIsStartVarargs(value: Boolean*): Self = StObject.set(x, "isStart", js.Array(value :_*))
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[IndentProps]
  
  /* This means you don't have to write `default`, but can instead just say `indentMod.foo` */
  override def _to: FC[IndentProps] = default
}
