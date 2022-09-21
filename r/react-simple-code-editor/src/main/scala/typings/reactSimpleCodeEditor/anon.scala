package typings.reactSimpleCodeEditor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bottom[T] extends StObject {
    
    var bottom: js.UndefOr[T] = js.undefined
    
    var left: js.UndefOr[T] = js.undefined
    
    var right: js.UndefOr[T] = js.undefined
    
    var top: js.UndefOr[T] = js.undefined
  }
  object Bottom {
    
    inline def apply[T](): Bottom[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bottom[T]]
    }
    
    extension [Self <: Bottom[?], T](x: Self & Bottom[T]) {
      
      inline def setBottom(value: T): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setLeft(value: T): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: T): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTop(value: T): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  trait Capture extends StObject {
    
    var capture: Boolean
  }
  object Capture {
    
    inline def apply(capture: Boolean): Capture = {
      val __obj = js.Dynamic.literal(capture = capture.asInstanceOf[js.Any])
      __obj.asInstanceOf[Capture]
    }
    
    extension [Self <: Capture](x: Self) {
      
      inline def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    }
  }
  
  trait History extends StObject {
    
    var history: typings.reactSimpleCodeEditor.mod.History
  }
  object History {
    
    inline def apply(history: typings.reactSimpleCodeEditor.mod.History): History = {
      val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any])
      __obj.asInstanceOf[History]
    }
    
    extension [Self <: History](x: Self) {
      
      inline def setHistory(value: typings.reactSimpleCodeEditor.mod.History): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    }
  }
  
  trait IgnoreTabKey extends StObject {
    
    var ignoreTabKey: Boolean
    
    var insertSpaces: Boolean
    
    var padding: Double
    
    var tabSize: Double
  }
  object IgnoreTabKey {
    
    inline def apply(ignoreTabKey: Boolean, insertSpaces: Boolean, padding: Double, tabSize: Double): IgnoreTabKey = {
      val __obj = js.Dynamic.literal(ignoreTabKey = ignoreTabKey.asInstanceOf[js.Any], insertSpaces = insertSpaces.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], tabSize = tabSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[IgnoreTabKey]
    }
    
    extension [Self <: IgnoreTabKey](x: Self) {
      
      inline def setIgnoreTabKey(value: Boolean): Self = StObject.set(x, "ignoreTabKey", value.asInstanceOf[js.Any])
      
      inline def setInsertSpaces(value: Boolean): Self = StObject.set(x, "insertSpaces", value.asInstanceOf[js.Any])
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setTabSize(value: Double): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined react-simple-code-editor.react-simple-code-editor.Record & {  timestamp :number} */
  trait Recordtimestampnumber extends StObject {
    
    var selectionEnd: Double
    
    var selectionStart: Double
    
    var timestamp: Double
    
    var value: String
  }
  object Recordtimestampnumber {
    
    inline def apply(selectionEnd: Double, selectionStart: Double, timestamp: Double, value: String): Recordtimestampnumber = {
      val __obj = js.Dynamic.literal(selectionEnd = selectionEnd.asInstanceOf[js.Any], selectionStart = selectionStart.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Recordtimestampnumber]
    }
    
    extension [Self <: Recordtimestampnumber](x: Self) {
      
      inline def setSelectionEnd(value: Double): Self = StObject.set(x, "selectionEnd", value.asInstanceOf[js.Any])
      
      inline def setSelectionStart(value: Double): Self = StObject.set(x, "selectionStart", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
