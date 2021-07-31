package typings.reactAsync.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictmeta
  extends StObject
     with /* prop */ StringDictionary[js.Any] {
  
  var counter: Double
}
object Dictmeta {
  
  @scala.inline
  def apply(counter: Double): Dictmeta = {
    val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictmeta]
  }
  
  @scala.inline
  implicit class DictmetaMutableBuilder[Self <: Dictmeta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCounter(value: Double): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
  }
}
