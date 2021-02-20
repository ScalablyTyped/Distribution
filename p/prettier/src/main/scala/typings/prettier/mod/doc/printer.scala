package typings.prettier.mod.doc

import typings.prettier.anon.CursorNodeStart
import typings.prettier.mod.Doc_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object printer {
  
  @JSImport("prettier", "doc.printer.printDocToString")
  @js.native
  def printDocToString(doc: Doc_, options: Options): CursorNodeStart = js.native
  
  @js.native
  trait Options extends StObject {
    
    var embeddedInHtml: Boolean = js.native
    
    var parentParser: js.UndefOr[String] = js.native
    
    /**
      * Specify the line length that the printer will wrap on.
      * @default 80
      */
    var printWidth: Double = js.native
    
    /**
      * Specify the number of spaces per indentation-level.
      * @default 2
      */
    var tabWidth: Double = js.native
    
    /**
      * Indent lines with tabs instead of spaces
      * @default false
      */
    var useTabs: Boolean = js.native
  }
  object Options {
    
    @scala.inline
    def apply(embeddedInHtml: Boolean, printWidth: Double, tabWidth: Double, useTabs: Boolean): Options = {
      val __obj = js.Dynamic.literal(embeddedInHtml = embeddedInHtml.asInstanceOf[js.Any], printWidth = printWidth.asInstanceOf[js.Any], tabWidth = tabWidth.asInstanceOf[js.Any], useTabs = useTabs.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmbeddedInHtml(value: Boolean): Self = StObject.set(x, "embeddedInHtml", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentParser(value: String): Self = StObject.set(x, "parentParser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentParserUndefined: Self = StObject.set(x, "parentParser", js.undefined)
      
      @scala.inline
      def setPrintWidth(value: Double): Self = StObject.set(x, "printWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabWidth(value: Double): Self = StObject.set(x, "tabWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseTabs(value: Boolean): Self = StObject.set(x, "useTabs", value.asInstanceOf[js.Any])
    }
  }
}
