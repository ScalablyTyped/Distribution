package typings.promClient.mod

import typings.promClient.mod.Summary.Internal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prom-client", "Summary")
@js.native
class Summary[T /* <: String */] protected ()
  extends StObject
     with Metric_[T] {
  /**
  	 * @param configuration Configuration when creating Summary metric. Name and Help is mandatory
  	 */
  def this(configuration: SummaryConfiguration[T]) = this()
  
  /**
  	 * Return the child for given labels
  	 * @param values Label values
  	 * @return Configured summary with given labels
  	 */
  def labels(values: String*): Internal[T] = js.native
  
  /**
  	 * Observe value for given labels
  	 * @param labels Object with label keys and values
  	 * @param value Value to observe
  	 */
  def observe(labels: LabelValues[T], value: Double): Unit = js.native
  /**
  	 * Observe value in summary
  	 * @param value The value to observe
  	 */
  def observe(value: Double): Unit = js.native
  
  /**
  	 * Remove metrics for the given label values
  	 * @param values Label values
  	 */
  def remove(values: String*): Unit = js.native
  
  /**
  	 * Reset all values in the summary
  	 */
  def reset(): Unit = js.native
  
  /**
  	 * Start a timer where the value in seconds will observed
  	 * @param labels Object with label keys and values
  	 * @return Function to invoke when timer should be stopped
  	 */
  def startTimer(): js.Function1[/* labels */ js.UndefOr[LabelValues[T]], Unit] = js.native
  def startTimer(labels: LabelValues[T]): js.Function1[/* labels */ js.UndefOr[LabelValues[T]], Unit] = js.native
}
object Summary {
  
  trait Config extends StObject {
    
    /**
    		 * Configurable percentiles, values should never be greater than 1
    		 */
    var percentiles: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object Config {
    
    @scala.inline
    def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPercentiles(value: js.Array[Double]): Self = StObject.set(x, "percentiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentilesUndefined: Self = StObject.set(x, "percentiles", js.undefined)
      
      @scala.inline
      def setPercentilesVarargs(value: Double*): Self = StObject.set(x, "percentiles", js.Array(value :_*))
    }
  }
  
  trait Internal[T /* <: String */] extends StObject {
    
    /**
    		 * Observe value in summary
    		 * @param value The value to observe
    		 */
    def observe(value: Double): Unit
    
    /**
    		 * Start a timer where the value in seconds will observed
    		 * @param labels Object with label keys and values
    		 * @return Function to invoke when timer should be stopped
    		 */
    def startTimer(): js.Function1[/* labels */ js.UndefOr[LabelValues[T]], Unit]
  }
  object Internal {
    
    @scala.inline
    def apply[T /* <: String */](
      observe: Double => Unit,
      startTimer: () => js.Function1[/* labels */ js.UndefOr[LabelValues[T]], Unit]
    ): Internal[T] = {
      val __obj = js.Dynamic.literal(observe = js.Any.fromFunction1(observe), startTimer = js.Any.fromFunction0(startTimer))
      __obj.asInstanceOf[Internal[T]]
    }
    
    @scala.inline
    implicit class InternalMutableBuilder[Self <: Internal[?], T /* <: String */] (val x: Self & Internal[T]) extends AnyVal {
      
      @scala.inline
      def setObserve(value: Double => Unit): Self = StObject.set(x, "observe", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartTimer(value: () => js.Function1[/* labels */ js.UndefOr[LabelValues[T]], Unit]): Self = StObject.set(x, "startTimer", js.Any.fromFunction0(value))
    }
  }
}
