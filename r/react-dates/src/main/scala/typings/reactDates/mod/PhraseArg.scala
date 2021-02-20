package typings.reactDates.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhraseArg extends StObject {
  
  var date: String = js.native
}
object PhraseArg {
  
  @scala.inline
  def apply(date: String): PhraseArg = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhraseArg]
  }
  
  @scala.inline
  implicit class PhraseArgMutableBuilder[Self <: PhraseArg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
  }
}
