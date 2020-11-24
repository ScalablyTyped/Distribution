package typings.rascal.mod

import org.scalablytyped.runtime.StringDictionary
import typings.rascal.anon.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Redelivery extends js.Object {
  
  var counters: js.UndefOr[StringDictionary[Size]] = js.native
}
object Redelivery {
  
  @scala.inline
  def apply(): Redelivery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Redelivery]
  }
  
  @scala.inline
  implicit class RedeliveryOps[Self <: Redelivery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCounters(value: StringDictionary[Size]): Self = this.set("counters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCounters: Self = this.set("counters", js.undefined)
  }
}
