package typings.showdown

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Codeblock extends StObject {
    
    var codeblock: js.UndefOr[String] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
  }
  object Codeblock {
    
    @scala.inline
    def apply(): Codeblock = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Codeblock]
    }
    
    @scala.inline
    implicit class CodeblockMutableBuilder[Self <: Codeblock] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCodeblock(value: String): Self = StObject.set(x, "codeblock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeblockUndefined: Self = StObject.set(x, "codeblock", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait Format extends StObject {
    
    var format: js.UndefOr[String] = js.undefined
    
    var parsed: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var raw: js.UndefOr[String] = js.undefined
  }
  object Format {
    
    @scala.inline
    def apply(): Format = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Format]
    }
    
    @scala.inline
    implicit class FormatMutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setParsed(value: StringDictionary[String]): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParsedUndefined: Self = StObject.set(x, "parsed", js.undefined)
      
      @scala.inline
      def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    }
  }
  
  trait Height extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object Height {
    
    @scala.inline
    def apply(): Height = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
