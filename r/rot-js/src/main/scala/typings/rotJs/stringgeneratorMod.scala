package typings.rotJs

import org.scalablytyped.runtime.StringDictionary
import typings.rotJs.anon.PartialOptionsOrder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringgeneratorMod {
  
  @JSImport("rot-js/lib/stringgenerator", JSImport.Default)
  @js.native
  class default protected () extends StringGenerator {
    def this(options: PartialOptionsOrder) = this()
  }
  
  type Events = StringDictionary[Double]
  
  @js.native
  trait Options extends StObject {
    
    /** Order, default = 3 */
    var order: Double = js.native
    
    /** Prior value, default = 0.001 */
    var prior: Double = js.native
    
    /** Use word mode? */
    var words: Boolean = js.native
  }
  object Options {
    
    @scala.inline
    def apply(order: Double, prior: Double, words: Boolean): Options = {
      val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any], prior = prior.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrior(value: Double): Self = StObject.set(x, "prior", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWords(value: Boolean): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StringGenerator extends StObject {
    
    /**
      * @param {string[]}
      * @returns {string[]}
      */
    def _backoff(context: js.Array[String]): js.Array[String] = js.native
    
    var _boundary: String = js.native
    
    var _data: StringDictionary[Events] = js.native
    
    /**
      * @param {string[]}
      * @returns {string}
      */
    def _join(arr: js.Array[String]): String = js.native
    
    /**
      * @param {string[]} context
      * @param {string} event
      */
    def _observeEvent(context: js.Array[String], event: String): Unit = js.native
    
    var _options: Options = js.native
    
    var _prefix: js.Array[String] = js.native
    
    var _priorValues: StringDictionary[Double] = js.native
    
    /**
      * @param {string[]}
      * @returns {string}
      */
    def _sample(context: js.Array[String]): String = js.native
    
    /**
      * @param {string}
      * @returns {string[]}
      */
    def _split(str: String): js.Array[String] = js.native
    
    var _suffix: String = js.native
    
    /**
      * Remove all learning data
      */
    def clear(): Unit = js.native
    
    /**
      * @returns {string} Generated string
      */
    def generate(): String = js.native
    
    def getStats(): String = js.native
    
    /**
      * Observe (learn) a string from a training set
      */
    def observe(string: String): Unit = js.native
  }
  object StringGenerator {
    
    @scala.inline
    def apply(
      _backoff: js.Array[String] => js.Array[String],
      _boundary: String,
      _data: StringDictionary[Events],
      _join: js.Array[String] => String,
      _observeEvent: (js.Array[String], String) => Unit,
      _options: Options,
      _prefix: js.Array[String],
      _priorValues: StringDictionary[Double],
      _sample: js.Array[String] => String,
      _split: String => js.Array[String],
      _suffix: String,
      clear: () => Unit,
      generate: () => String,
      getStats: () => String,
      observe: String => Unit
    ): StringGenerator = {
      val __obj = js.Dynamic.literal(_backoff = js.Any.fromFunction1(_backoff), _boundary = _boundary.asInstanceOf[js.Any], _data = _data.asInstanceOf[js.Any], _join = js.Any.fromFunction1(_join), _observeEvent = js.Any.fromFunction2(_observeEvent), _options = _options.asInstanceOf[js.Any], _prefix = _prefix.asInstanceOf[js.Any], _priorValues = _priorValues.asInstanceOf[js.Any], _sample = js.Any.fromFunction1(_sample), _split = js.Any.fromFunction1(_split), _suffix = _suffix.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), generate = js.Any.fromFunction0(generate), getStats = js.Any.fromFunction0(getStats), observe = js.Any.fromFunction1(observe))
      __obj.asInstanceOf[StringGenerator]
    }
    
    @scala.inline
    implicit class StringGeneratorMutableBuilder[Self <: StringGenerator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGenerate(value: () => String): Self = StObject.set(x, "generate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetStats(value: () => String): Self = StObject.set(x, "getStats", js.Any.fromFunction0(value))
      
      @scala.inline
      def setObserve(value: String => Unit): Self = StObject.set(x, "observe", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_backoff(value: js.Array[String] => js.Array[String]): Self = StObject.set(x, "_backoff", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_boundary(value: String): Self = StObject.set(x, "_boundary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_data(value: StringDictionary[Events]): Self = StObject.set(x, "_data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_join(value: js.Array[String] => String): Self = StObject.set(x, "_join", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_observeEvent(value: (js.Array[String], String) => Unit): Self = StObject.set(x, "_observeEvent", js.Any.fromFunction2(value))
      
      @scala.inline
      def set_options(value: Options): Self = StObject.set(x, "_options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_prefix(value: js.Array[String]): Self = StObject.set(x, "_prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_prefixVarargs(value: String*): Self = StObject.set(x, "_prefix", js.Array(value :_*))
      
      @scala.inline
      def set_priorValues(value: StringDictionary[Double]): Self = StObject.set(x, "_priorValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_sample(value: js.Array[String] => String): Self = StObject.set(x, "_sample", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_split(value: String => js.Array[String]): Self = StObject.set(x, "_split", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_suffix(value: String): Self = StObject.set(x, "_suffix", value.asInstanceOf[js.Any])
    }
  }
}
