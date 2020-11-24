package typings.reactMdProgress.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressProps extends js.Object {
  
  /**
    * Boolean if the determinate progress versions should animate when the value
    * changes. This should really only be enabled if you aren't getting quick
    * progress updates or the updates happen in chunks.
    */
  var animate: js.UndefOr[Boolean] = js.native
  
  /**
    * The id for the progress component. This is required for accessibility since
    * the progress will 99% of the time be describing the progress of something
    * else within the page. The element that is loading or tracking progress
    * should also be updated to have `aria-busy="true"` and
    * `aria-describedby="THIS_ID"`.
    */
  var id: String = js.native
  
  /**
    * The max value for the progress component. This is used to determine the
    * current progress percentage for screen readers and styles.
    */
  var max: js.UndefOr[Double] = js.native
  
  /**
    * The min value for the progress component. This is used to determine the
    * current progress percentage for screen readers and styles.
    */
  var min: js.UndefOr[Double] = js.native
  
  /**
    * The current value for the progress component. If this prop is omitted, the
    * progress component will be put in an "indeterminate" state which will just
    * infinitely loop an animation until it is unmounted.
    *
    * This value will be passed down as a percentage based on the `min` and `max`
    * props so that screen readers can be notified of changes.
    */
  var value: js.UndefOr[Double] = js.native
}
object ProgressProps {
  
  @scala.inline
  def apply(id: String): ProgressProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressProps]
  }
  
  @scala.inline
  implicit class ProgressPropsOps[Self <: ProgressProps] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
