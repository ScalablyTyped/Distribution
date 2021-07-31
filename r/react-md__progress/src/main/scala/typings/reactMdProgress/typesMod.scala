package typings.reactMdProgress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait ProgressProps extends StObject {
    
    /**
      * Boolean if the determinate progress versions should animate when the value
      * changes. This should really only be enabled if you aren't getting quick
      * progress updates or the updates happen in chunks.
      */
    var animate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The id for the progress component. This is required for accessibility since
      * the progress will 99% of the time be describing the progress of something
      * else within the page. The element that is loading or tracking progress
      * should also be updated to have `aria-busy="true"` and
      * `aria-describedby="THIS_ID"`.
      */
    var id: String
    
    /**
      * The max value for the progress component. This is used to determine the
      * current progress percentage for screen readers and styles.
      */
    var max: js.UndefOr[Double] = js.undefined
    
    /**
      * The min value for the progress component. This is used to determine the
      * current progress percentage for screen readers and styles.
      */
    var min: js.UndefOr[Double] = js.undefined
    
    /**
      * The current value for the progress component. If this prop is omitted, the
      * progress component will be put in an "indeterminate" state which will just
      * infinitely loop an animation until it is unmounted.
      *
      * This value will be passed down as a percentage based on the `min` and `max`
      * props so that screen readers can be notified of changes.
      */
    var value: js.UndefOr[Double] = js.undefined
  }
  object ProgressProps {
    
    @scala.inline
    def apply(id: String): ProgressProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProgressProps]
    }
    
    @scala.inline
    implicit class ProgressPropsMutableBuilder[Self <: ProgressProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
