package typings.promClient.mod

import typings.promClient.mod.Histogram.Internal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prom-client", "Histogram")
@js.native
open class Histogram[T /* <: String */] protected ()
  extends StObject
     with Metric_[T] {
  /**
  	 * @param configuration Configuration when creating the Histogram. Name and Help is mandatory
  	 */
  def this(configuration: HistogramConfiguration[T]) = this()
  
  /**
  	 * Return the child for given labels
  	 * @param labels Object with label keys and values
  	 * @return Configured counter with given labels
  	 */
  def labels(labels: LabelValues[T]): Internal[T] = js.native
  /**
  	 * Return the child for given labels
  	 * @param values Label values
  	 * @return Configured histogram with given labels
  	 */
  def labels(values: String*): Internal[T] = js.native
  
  /**
  	 * Observe value for given labels
  	 * @param labels Object with label keys and values
  	 * @param value The value to observe
  	 */
  def observe(labels: LabelValues[T], value: Double): Unit = js.native
  /**
  	 * Observe value
  	 * @param value The value to observe
  	 */
  def observe(value: Double): Unit = js.native
  
  /**
  	 * Remove metrics for the given label values
  	 * @param labels Object with label keys and values
  	 */
  def remove(labels: LabelValues[T]): Unit = js.native
  /**
  	 * Remove metrics for the given label values
  	 * @param values Label values
  	 */
  def remove(values: String*): Unit = js.native
  
  /**
  	 * Reset histogram values
  	 */
  def reset(): Unit = js.native
  
  /**
  	 * Start a timer. Calling the returned function will observe the duration in
  	 * seconds in the histogram.
  	 * @param labels Object with label keys and values
  	 * @return Function to invoke when timer should be stopped. The value it
  	 * returns is the timed duration.
  	 */
  def startTimer(): js.Function1[/* labels */ js.UndefOr[LabelValues[T]], Double] = js.native
  def startTimer(labels: LabelValues[T]): js.Function1[/* labels */ js.UndefOr[LabelValues[T]], Double] = js.native
  
  /**
  	 * Initialize the metrics for the given combination of labels to zero
  	 */
  def zero(labels: LabelValues[T]): Unit = js.native
}
object Histogram {
  
  trait Config extends StObject {
    
    /**
    		 * Buckets used in the histogram
    		 */
    var buckets: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setBuckets(value: js.Array[Double]): Self = StObject.set(x, "buckets", value.asInstanceOf[js.Any])
      
      inline def setBucketsUndefined: Self = StObject.set(x, "buckets", js.undefined)
      
      inline def setBucketsVarargs(value: Double*): Self = StObject.set(x, "buckets", js.Array(value*))
    }
  }
  
  trait Internal[T /* <: String */] extends StObject {
    
    /**
    		 * Observe value
    		 * @param value The value to observe
    		 */
    def observe(value: Double): Unit
    
    /**
    		 * Start a timer. Calling the returned function will observe the
    		 * duration in seconds in the histogram.
    		 * @param labels Object with label keys and values
    		 * @return Function to invoke when timer should be stopped. The value it
    		 * returns is the timed duration.
    		 */
    def startTimer(): js.Function1[/* labels */ js.UndefOr[LabelValues[T]], Unit]
  }
  object Internal {
    
    inline def apply[T /* <: String */](
      observe: Double => Unit,
      startTimer: () => js.Function1[/* labels */ js.UndefOr[LabelValues[T]], Unit]
    ): Internal[T] = {
      val __obj = js.Dynamic.literal(observe = js.Any.fromFunction1(observe), startTimer = js.Any.fromFunction0(startTimer))
      __obj.asInstanceOf[Internal[T]]
    }
    
    extension [Self <: Internal[?], T /* <: String */](x: Self & Internal[T]) {
      
      inline def setObserve(value: Double => Unit): Self = StObject.set(x, "observe", js.Any.fromFunction1(value))
      
      inline def setStartTimer(value: () => js.Function1[/* labels */ js.UndefOr[LabelValues[T]], Unit]): Self = StObject.set(x, "startTimer", js.Any.fromFunction0(value))
    }
  }
}
