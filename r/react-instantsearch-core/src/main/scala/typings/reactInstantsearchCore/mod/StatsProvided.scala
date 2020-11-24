package typings.reactInstantsearchCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatsProvided extends js.Object {
  
  var nbHits: Double = js.native
  
  var processingTimeMS: Double = js.native
}
object StatsProvided {
  
  @scala.inline
  def apply(nbHits: Double, processingTimeMS: Double): StatsProvided = {
    val __obj = js.Dynamic.literal(nbHits = nbHits.asInstanceOf[js.Any], processingTimeMS = processingTimeMS.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatsProvided]
  }
  
  @scala.inline
  implicit class StatsProvidedOps[Self <: StatsProvided] (val x: Self) extends AnyVal {
    
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
    def setNbHits(value: Double): Self = this.set("nbHits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingTimeMS(value: Double): Self = this.set("processingTimeMS", value.asInstanceOf[js.Any])
  }
}
