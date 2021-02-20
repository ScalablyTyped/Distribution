package typings.sindresorhusToMilliseconds

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Convert an object of time properties to milliseconds: `{seconds: 2}` → `2000`.
  	@example
  	```
  	import toMilliseconds = require('@sindresorhus/to-milliseconds');
  	toMilliseconds({
  		days: 15,
  		hours: 11,
  		minutes: 23,
  		seconds: 20,
  		milliseconds: 1
  	});
  	//=> 1337000001
  	setTimeout(() => {
  		// …
  	}, toMilliseconds({minutes: 2}));
  	```
  	*/
  @JSImport("@sindresorhus/to-milliseconds", JSImport.Namespace)
  @js.native
  def apply(timeDescriptor: TimeDescriptor): Double = js.native
  
  @JSImport("@sindresorhus/to-milliseconds", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: remove this for next major version
  @JSImport("@sindresorhus/to-milliseconds", "default")
  @js.native
  def default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof toMilliseconds */ js.Any = js.native
  @scala.inline
  def default_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof toMilliseconds */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  @js.native
  trait TimeDescriptor extends StObject {
    
    val days: js.UndefOr[Double] = js.native
    
    val hours: js.UndefOr[Double] = js.native
    
    val microseconds: js.UndefOr[Double] = js.native
    
    val milliseconds: js.UndefOr[Double] = js.native
    
    val minutes: js.UndefOr[Double] = js.native
    
    val nanoseconds: js.UndefOr[Double] = js.native
    
    val seconds: js.UndefOr[Double] = js.native
  }
  object TimeDescriptor {
    
    @scala.inline
    def apply(): TimeDescriptor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimeDescriptor]
    }
    
    @scala.inline
    implicit class TimeDescriptorMutableBuilder[Self <: TimeDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDays(value: Double): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDaysUndefined: Self = StObject.set(x, "days", js.undefined)
      
      @scala.inline
      def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoursUndefined: Self = StObject.set(x, "hours", js.undefined)
      
      @scala.inline
      def setMicroseconds(value: Double): Self = StObject.set(x, "microseconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMicrosecondsUndefined: Self = StObject.set(x, "microseconds", js.undefined)
      
      @scala.inline
      def setMilliseconds(value: Double): Self = StObject.set(x, "milliseconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMillisecondsUndefined: Self = StObject.set(x, "milliseconds", js.undefined)
      
      @scala.inline
      def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
      
      @scala.inline
      def setNanoseconds(value: Double): Self = StObject.set(x, "nanoseconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNanosecondsUndefined: Self = StObject.set(x, "nanoseconds", js.undefined)
      
      @scala.inline
      def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
    }
  }
}
