package typings.reactCsv

import typings.react.mod.MouseEventHandler
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonPropTypesMod {
  
  type AsyncClickHandler = js.Function2[
    /* event */ MouseEventHandler[HTMLAnchorElement], 
    /* done */ js.Function1[/* proceed */ js.UndefOr[Boolean], Unit], 
    Unit
  ]
  
  trait CommonPropTypes extends StObject {
    
    var asyncOnClick: js.UndefOr[Boolean] = js.undefined
    
    var data: String | Data | (js.Function0[String | Data])
    
    var enclosingCharacter: js.UndefOr[String] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
    
    var headers: js.UndefOr[Headers] = js.undefined
    
    var onClick: js.UndefOr[SyncClickHandler | AsyncClickHandler] = js.undefined
    
    var separator: js.UndefOr[String] = js.undefined
    
    var uFEFF: js.UndefOr[Boolean] = js.undefined
  }
  object CommonPropTypes {
    
    inline def apply(data: String | Data | (js.Function0[String | Data])): CommonPropTypes = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonPropTypes]
    }
    
    extension [Self <: CommonPropTypes](x: Self) {
      
      inline def setAsyncOnClick(value: Boolean): Self = StObject.set(x, "asyncOnClick", value.asInstanceOf[js.Any])
      
      inline def setAsyncOnClickUndefined: Self = StObject.set(x, "asyncOnClick", js.undefined)
      
      inline def setData(value: String | Data | (js.Function0[String | Data])): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataFunction0(value: () => String | Data): Self = StObject.set(x, "data", js.Any.fromFunction0(value))
      
      inline def setDataVarargs(value: js.Object*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setEnclosingCharacter(value: String): Self = StObject.set(x, "enclosingCharacter", value.asInstanceOf[js.Any])
      
      inline def setEnclosingCharacterUndefined: Self = StObject.set(x, "enclosingCharacter", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: (LabelKeyObject | String)*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setOnClick(value: SyncClickHandler | AsyncClickHandler): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
      
      inline def setOnClickFunction1(value: /* event */ MouseEventHandler[HTMLAnchorElement] => Boolean | Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickFunction2(
        value: (/* event */ MouseEventHandler[HTMLAnchorElement], /* done */ js.Function1[/* proceed */ js.UndefOr[Boolean], Unit]) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setUFEFF(value: Boolean): Self = StObject.set(x, "uFEFF", value.asInstanceOf[js.Any])
      
      inline def setUFEFFUndefined: Self = StObject.set(x, "uFEFF", js.undefined)
    }
  }
  
  type Data = js.Array[js.Object]
  
  type Headers = js.Array[LabelKeyObject | String]
  
  trait LabelKeyObject extends StObject {
    
    var key: String
    
    var label: String
  }
  object LabelKeyObject {
    
    inline def apply(key: String, label: String): LabelKeyObject = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[LabelKeyObject]
    }
    
    extension [Self <: LabelKeyObject](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  type SyncClickHandler = js.Function1[/* event */ MouseEventHandler[HTMLAnchorElement], Boolean | Unit]
}
