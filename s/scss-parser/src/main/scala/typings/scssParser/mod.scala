package typings.scssParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("scss-parser", "parse")
  @js.native
  def parse(css: String): Node = js.native
  
  @JSImport("scss-parser", "stringify")
  @js.native
  def stringify(node: Node): String = js.native
  
  @js.native
  trait InputStreamPosition extends StObject {
    
    var column: Double = js.native
    
    var cursor: Double = js.native
    
    var line: Double = js.native
  }
  object InputStreamPosition {
    
    @scala.inline
    def apply(column: Double, cursor: Double, line: Double): InputStreamPosition = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputStreamPosition]
    }
    
    @scala.inline
    implicit class InputStreamPositionMutableBuilder[Self <: InputStreamPosition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursor(value: Double): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Node extends StObject {
    
    var end: js.UndefOr[InputStreamPosition] = js.native
    
    var start: js.UndefOr[InputStreamPosition] = js.native
    
    var `type`: String = js.native
    
    var value: String | js.Array[Node] = js.native
  }
  object Node {
    
    @scala.inline
    def apply(`type`: String, value: String | js.Array[Node]): Node = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node]
    }
    
    @scala.inline
    implicit class NodeMutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: InputStreamPosition): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setStart(value: InputStreamPosition): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String | js.Array[Node]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueVarargs(value: Node*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
}
