package typings.reactAddonsPerf.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Measurements extends js.Object {
  
  var counts: NumericPerfContext = js.native
  
  var displayNames: StringDictionary[ComponentPerfContext] = js.native
  
  var exclusive: NumericPerfContext = js.native
  
  var inclusive: NumericPerfContext = js.native
  
  var render: NumericPerfContext = js.native
  
  var totalTime: Double = js.native
  
  var writes: NumericPerfContext = js.native
}
object Measurements {
  
  @scala.inline
  def apply(
    counts: NumericPerfContext,
    displayNames: StringDictionary[ComponentPerfContext],
    exclusive: NumericPerfContext,
    inclusive: NumericPerfContext,
    render: NumericPerfContext,
    totalTime: Double,
    writes: NumericPerfContext
  ): Measurements = {
    val __obj = js.Dynamic.literal(counts = counts.asInstanceOf[js.Any], displayNames = displayNames.asInstanceOf[js.Any], exclusive = exclusive.asInstanceOf[js.Any], inclusive = inclusive.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any], totalTime = totalTime.asInstanceOf[js.Any], writes = writes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Measurements]
  }
  
  @scala.inline
  implicit class MeasurementsOps[Self <: Measurements] (val x: Self) extends AnyVal {
    
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
    def setCounts(value: NumericPerfContext): Self = this.set("counts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNames(value: StringDictionary[ComponentPerfContext]): Self = this.set("displayNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusive(value: NumericPerfContext): Self = this.set("exclusive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclusive(value: NumericPerfContext): Self = this.set("inclusive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRender(value: NumericPerfContext): Self = this.set("render", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalTime(value: Double): Self = this.set("totalTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrites(value: NumericPerfContext): Self = this.set("writes", value.asInstanceOf[js.Any])
  }
}
