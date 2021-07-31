package typings.sipJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parsed extends StObject {
  
  var parsed: js.UndefOr[js.Any] = js.undefined
  
  var raw: String
}
object Parsed {
  
  @scala.inline
  def apply(raw: String): Parsed = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parsed]
  }
  
  @scala.inline
  implicit class ParsedMutableBuilder[Self <: Parsed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParsed(value: js.Any): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParsedUndefined: Self = StObject.set(x, "parsed", js.undefined)
    
    @scala.inline
    def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
  }
}
