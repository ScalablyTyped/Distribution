package typings.reactQuery.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Entry extends StObject {
  
  var entry: typings.reactQuery.explorerMod.Entry
}
object Entry {
  
  inline def apply(entry: typings.reactQuery.explorerMod.Entry): Entry = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entry]
  }
  
  extension [Self <: Entry](x: Self) {
    
    inline def setEntry(value: typings.reactQuery.explorerMod.Entry): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
  }
}
