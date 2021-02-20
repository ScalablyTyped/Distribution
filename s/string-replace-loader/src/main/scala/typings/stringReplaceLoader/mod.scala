package typings.stringReplaceLoader

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.stringReplaceLoader.mod.ReplaceEntry
    - typings.stringReplaceLoader.mod.ReplaceEntries
  */
  trait Options extends StObject
  object Options {
    
    @scala.inline
    def ReplaceEntries(multiple: js.Array[ReplaceEntry]): typings.stringReplaceLoader.mod.ReplaceEntries = {
      val __obj = js.Dynamic.literal(multiple = multiple.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.stringReplaceLoader.mod.ReplaceEntries]
    }
    
    @scala.inline
    def ReplaceEntry(replace: String | ReplaceCallback, search: String | RegExp): typings.stringReplaceLoader.mod.ReplaceEntry = {
      val __obj = js.Dynamic.literal(replace = replace.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.stringReplaceLoader.mod.ReplaceEntry]
    }
  }
  
  type ReplaceCallback = js.Function2[/* substring */ String, /* repeated */ js.Any, String]
  
  @js.native
  trait ReplaceEntries extends Options {
    
    var multiple: js.Array[ReplaceEntry] = js.native
  }
  object ReplaceEntries {
    
    @scala.inline
    def apply(multiple: js.Array[ReplaceEntry]): ReplaceEntries = {
      val __obj = js.Dynamic.literal(multiple = multiple.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplaceEntries]
    }
    
    @scala.inline
    implicit class ReplaceEntriesMutableBuilder[Self <: ReplaceEntries] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMultiple(value: js.Array[ReplaceEntry]): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleVarargs(value: ReplaceEntry*): Self = StObject.set(x, "multiple", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ReplaceEntry extends Options {
    
    var flags: js.UndefOr[String] = js.native
    
    var replace: String | ReplaceCallback = js.native
    
    var search: String | RegExp = js.native
    
    var strict: js.UndefOr[Boolean] = js.native
  }
  object ReplaceEntry {
    
    @scala.inline
    def apply(replace: String | ReplaceCallback, search: String | RegExp): ReplaceEntry = {
      val __obj = js.Dynamic.literal(replace = replace.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplaceEntry]
    }
    
    @scala.inline
    implicit class ReplaceEntryMutableBuilder[Self <: ReplaceEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      @scala.inline
      def setReplace(value: String | ReplaceCallback): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceFunction2(value: (/* substring */ String, /* repeated */ js.Any) => String): Self = StObject.set(x, "replace", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSearch(value: String | RegExp): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
}
