package typings.storybookComponents.typesPrettierIndexMod.doc

import typings.storybookComponents.anon.CursorNodeStart
import typings.storybookComponents.typesPrettierIndexMod.Doc_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object printer {
  
  @JSImport("@storybook/components/dist/ts3.9/_modules/@types-prettier-index", "doc.printer")
  @js.native
  val ^ : js.Any = js.native
  
  inline def printDocToString(doc: Doc_, options: Options): CursorNodeStart = (^.asInstanceOf[js.Dynamic].applyDynamic("printDocToString")(doc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CursorNodeStart]
  
  trait Options extends StObject {
    
    var __embeddedInHtml: js.UndefOr[Boolean] = js.undefined
    
    var parentParser: js.UndefOr[String] = js.undefined
    
    /**
      * Specify the line length that the printer will wrap on.
      * @default 80
      */
    var printWidth: Double
    
    /**
      * Specify the number of spaces per indentation-level.
      * @default 2
      */
    var tabWidth: Double
    
    /**
      * Indent lines with tabs instead of spaces
      * @default false
      */
    var useTabs: Boolean
  }
  object Options {
    
    inline def apply(printWidth: Double, tabWidth: Double, useTabs: Boolean): Options = {
      val __obj = js.Dynamic.literal(printWidth = printWidth.asInstanceOf[js.Any], tabWidth = tabWidth.asInstanceOf[js.Any], useTabs = useTabs.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setParentParser(value: String): Self = StObject.set(x, "parentParser", value.asInstanceOf[js.Any])
      
      inline def setParentParserUndefined: Self = StObject.set(x, "parentParser", js.undefined)
      
      inline def setPrintWidth(value: Double): Self = StObject.set(x, "printWidth", value.asInstanceOf[js.Any])
      
      inline def setTabWidth(value: Double): Self = StObject.set(x, "tabWidth", value.asInstanceOf[js.Any])
      
      inline def setUseTabs(value: Boolean): Self = StObject.set(x, "useTabs", value.asInstanceOf[js.Any])
      
      inline def set__embeddedInHtml(value: Boolean): Self = StObject.set(x, "__embeddedInHtml", value.asInstanceOf[js.Any])
      
      inline def set__embeddedInHtmlUndefined: Self = StObject.set(x, "__embeddedInHtml", js.undefined)
    }
  }
}
