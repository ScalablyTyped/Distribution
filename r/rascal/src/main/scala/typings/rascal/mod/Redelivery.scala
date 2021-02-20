package typings.rascal.mod

import org.scalablytyped.runtime.StringDictionary
import typings.rascal.anon.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Redelivery extends StObject {
  
  var counters: js.UndefOr[StringDictionary[Size]] = js.native
}
object Redelivery {
  
  @scala.inline
  def apply(): Redelivery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Redelivery]
  }
  
  @scala.inline
  implicit class RedeliveryMutableBuilder[Self <: Redelivery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCounters(value: StringDictionary[Size]): Self = StObject.set(x, "counters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountersUndefined: Self = StObject.set(x, "counters", js.undefined)
  }
}
