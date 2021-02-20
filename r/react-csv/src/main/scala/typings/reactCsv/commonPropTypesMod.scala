package typings.reactCsv

import typings.react.mod.MouseEventHandler
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonPropTypesMod {
  
  type AsyncClickHandler = js.Function2[
    /* event */ MouseEventHandler[HTMLAnchorElement], 
    /* done */ js.Function1[/* proceed */ js.UndefOr[Boolean], Unit], 
    Unit
  ]
  
  @js.native
  trait CommonPropTypes extends StObject {
    
    var asyncOnClick: js.UndefOr[Boolean] = js.native
    
    var data: String | Data = js.native
    
    var enclosingCharacter: js.UndefOr[String] = js.native
    
    var filename: js.UndefOr[String] = js.native
    
    var headers: js.UndefOr[Headers] = js.native
    
    var onClick: js.UndefOr[SyncClickHandler | AsyncClickHandler] = js.native
    
    var separator: js.UndefOr[String] = js.native
    
    var uFEFF: js.UndefOr[Boolean] = js.native
  }
  object CommonPropTypes {
    
    @scala.inline
    def apply(data: String | Data): CommonPropTypes = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonPropTypes]
    }
    
    @scala.inline
    implicit class CommonPropTypesMutableBuilder[Self <: CommonPropTypes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsyncOnClick(value: Boolean): Self = StObject.set(x, "asyncOnClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncOnClickUndefined: Self = StObject.set(x, "asyncOnClick", js.undefined)
      
      @scala.inline
      def setData(value: String | Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: js.Object*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setEnclosingCharacter(value: String): Self = StObject.set(x, "enclosingCharacter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnclosingCharacterUndefined: Self = StObject.set(x, "enclosingCharacter", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHeadersVarargs(value: (LabelKeyObject | String)*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      @scala.inline
      def setOnClick(value: SyncClickHandler | AsyncClickHandler): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClickFunction1(value: /* event */ MouseEventHandler[HTMLAnchorElement] => Boolean | Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickFunction2(
        value: (/* event */ MouseEventHandler[HTMLAnchorElement], /* done */ js.Function1[/* proceed */ js.UndefOr[Boolean], Unit]) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setUFEFF(value: Boolean): Self = StObject.set(x, "uFEFF", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUFEFFUndefined: Self = StObject.set(x, "uFEFF", js.undefined)
    }
  }
  
  type Data = js.Array[js.Object]
  
  type Headers = js.Array[LabelKeyObject | String]
  
  @js.native
  trait LabelKeyObject extends StObject {
    
    var key: String = js.native
    
    var label: String = js.native
  }
  object LabelKeyObject {
    
    @scala.inline
    def apply(key: String, label: String): LabelKeyObject = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[LabelKeyObject]
    }
    
    @scala.inline
    implicit class LabelKeyObjectMutableBuilder[Self <: LabelKeyObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  type SyncClickHandler = js.Function1[/* event */ MouseEventHandler[HTMLAnchorElement], Boolean | Unit]
}
