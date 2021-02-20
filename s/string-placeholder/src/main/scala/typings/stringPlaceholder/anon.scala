package typings.stringPlaceholder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<string-placeholder.string-placeholder.Options> */
  @js.native
  trait ReadonlyOptions extends StObject {
    
    val after: js.UndefOr[String] = js.native
    
    val before: js.UndefOr[String] = js.native
    
    val clean: js.UndefOr[Boolean] = js.native
    
    val escape: js.UndefOr[String] = js.native
  }
  object ReadonlyOptions {
    
    @scala.inline
    def apply(): ReadonlyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyOptions]
    }
    
    @scala.inline
    implicit class ReadonlyOptionsMutableBuilder[Self <: ReadonlyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      @scala.inline
      def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      @scala.inline
      def setClean(value: Boolean): Self = StObject.set(x, "clean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCleanUndefined: Self = StObject.set(x, "clean", js.undefined)
      
      @scala.inline
      def setEscape(value: String): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
    }
  }
}
