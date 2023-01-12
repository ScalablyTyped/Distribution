package typings.pugLexer.mod

import typings.pugLexer.anon.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Loc extends StObject {
  
  var end: Column
  
  var start: Column
}
object Loc {
  
  inline def apply(end: Column, start: Column): Loc = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loc]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Loc] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: Column): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Column): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
