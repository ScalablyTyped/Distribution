package typings.stringReplaceLoader

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.stringReplaceLoader.mod.ReplaceEntry
    - typings.stringReplaceLoader.mod.ReplaceEntries
  */
  trait Options extends StObject
  object Options {
    
    inline def ReplaceEntries(multiple: js.Array[ReplaceEntry]): typings.stringReplaceLoader.mod.ReplaceEntries = {
      val __obj = js.Dynamic.literal(multiple = multiple.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.stringReplaceLoader.mod.ReplaceEntries]
    }
    
    inline def ReplaceEntry(replace: String | ReplaceCallback, search: String | RegExp): typings.stringReplaceLoader.mod.ReplaceEntry = {
      val __obj = js.Dynamic.literal(replace = replace.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.stringReplaceLoader.mod.ReplaceEntry]
    }
  }
  
  type ReplaceCallback = js.Function2[/* substring */ String, /* repeated */ js.Any, String]
  
  trait ReplaceEntries
    extends StObject
       with Options {
    
    var multiple: js.Array[ReplaceEntry]
  }
  object ReplaceEntries {
    
    inline def apply(multiple: js.Array[ReplaceEntry]): ReplaceEntries = {
      val __obj = js.Dynamic.literal(multiple = multiple.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplaceEntries]
    }
    
    extension [Self <: ReplaceEntries](x: Self) {
      
      inline def setMultiple(value: js.Array[ReplaceEntry]): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleVarargs(value: ReplaceEntry*): Self = StObject.set(x, "multiple", js.Array(value :_*))
    }
  }
  
  trait ReplaceEntry
    extends StObject
       with Options {
    
    var flags: js.UndefOr[String] = js.undefined
    
    var replace: String | ReplaceCallback
    
    var search: String | RegExp
    
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object ReplaceEntry {
    
    inline def apply(replace: String | ReplaceCallback, search: String | RegExp): ReplaceEntry = {
      val __obj = js.Dynamic.literal(replace = replace.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplaceEntry]
    }
    
    extension [Self <: ReplaceEntry](x: Self) {
      
      inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setReplace(value: String | ReplaceCallback): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceFunction2(value: (/* substring */ String, /* repeated */ js.Any) => String): Self = StObject.set(x, "replace", js.Any.fromFunction2(value))
      
      inline def setSearch(value: String | RegExp): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
}
