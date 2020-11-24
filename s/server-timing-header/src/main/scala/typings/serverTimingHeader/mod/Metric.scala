package typings.serverTimingHeader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * object that contain metric information
  */
@js.native
trait Metric extends js.Object {
  
  /** metric description */
  var description: String = js.native
  
  /** time in milliseconds, if not undefined method will just return durations */
  var duration: Double = js.native
  
  /** start time [seconds, nanoseconds], if undefined, initialization time will be used */
  var from: js.Tuple2[Double, Double] = js.native
  
  /** metric name */
  var name: String = js.native
  
  /**  end time [seconds, nanoseconds], if undefined, current timestamp will be used */
  var to: js.Tuple2[Double, Double] = js.native
}
object Metric {
  
  @scala.inline
  def apply(
    description: String,
    duration: Double,
    from: js.Tuple2[Double, Double],
    name: String,
    to: js.Tuple2[Double, Double]
  ): Metric = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metric]
  }
  
  @scala.inline
  implicit class MetricOps[Self <: Metric] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: js.Tuple2[Double, Double]): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: js.Tuple2[Double, Double]): Self = this.set("to", value.asInstanceOf[js.Any])
  }
}
