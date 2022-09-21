package typings.rotJs

import org.scalablytyped.runtime.StringDictionary
import typings.rotJs.anon.PartialOptionsOrder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringgeneratorMod {
  
  @JSImport("rot-js/lib/stringgenerator", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with StringGenerator {
    def this(options: PartialOptionsOrder) = this()
    
    /**
      * @param {string[]}
      * @returns {string[]}
      */
    /* CompleteClass */
    override def _backoff(context: js.Array[String]): js.Array[String] = js.native
    
    /* CompleteClass */
    var _boundary: String = js.native
    
    /* CompleteClass */
    var _data: StringDictionary[Events] = js.native
    
    /**
      * @param {string[]}
      * @returns {string}
      */
    /* CompleteClass */
    override def _join(arr: js.Array[String]): String = js.native
    
    /**
      * @param {string[]} context
      * @param {string} event
      */
    /* CompleteClass */
    override def _observeEvent(context: js.Array[String], event: String): Unit = js.native
    
    /* CompleteClass */
    var _options: Options = js.native
    
    /* CompleteClass */
    var _prefix: js.Array[String] = js.native
    
    /* CompleteClass */
    var _priorValues: StringDictionary[Double] = js.native
    
    /**
      * @param {string[]}
      * @returns {string}
      */
    /* CompleteClass */
    override def _sample(context: js.Array[String]): String = js.native
    
    /**
      * @param {string}
      * @returns {string[]}
      */
    /* CompleteClass */
    override def _split(str: String): js.Array[String] = js.native
    
    /* CompleteClass */
    var _suffix: String = js.native
    
    /**
      * Remove all learning data
      */
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /**
      * @returns {string} Generated string
      */
    /* CompleteClass */
    override def generate(): String = js.native
    
    /* CompleteClass */
    override def getStats(): String = js.native
    
    /**
      * Observe (learn) a string from a training set
      */
    /* CompleteClass */
    override def observe(string: String): Unit = js.native
  }
  
  type Events = StringDictionary[Double]
  
  trait Options extends StObject {
    
    /** Order, default = 3 */
    var order: Double
    
    /** Prior value, default = 0.001 */
    var prior: Double
    
    /** Use word mode? */
    var words: Boolean
  }
  object Options {
    
    inline def apply(order: Double, prior: Double, words: Boolean): Options = {
      val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any], prior = prior.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setPrior(value: Double): Self = StObject.set(x, "prior", value.asInstanceOf[js.Any])
      
      inline def setWords(value: Boolean): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
    }
  }
  
  trait StringGenerator extends StObject {
    
    /**
      * @param {string[]}
      * @returns {string[]}
      */
    def _backoff(context: js.Array[String]): js.Array[String]
    
    var _boundary: String
    
    var _data: StringDictionary[Events]
    
    /**
      * @param {string[]}
      * @returns {string}
      */
    def _join(arr: js.Array[String]): String
    
    /**
      * @param {string[]} context
      * @param {string} event
      */
    def _observeEvent(context: js.Array[String], event: String): Unit
    
    var _options: Options
    
    var _prefix: js.Array[String]
    
    var _priorValues: StringDictionary[Double]
    
    /**
      * @param {string[]}
      * @returns {string}
      */
    def _sample(context: js.Array[String]): String
    
    /**
      * @param {string}
      * @returns {string[]}
      */
    def _split(str: String): js.Array[String]
    
    var _suffix: String
    
    /**
      * Remove all learning data
      */
    def clear(): Unit
    
    /**
      * @returns {string} Generated string
      */
    def generate(): String
    
    def getStats(): String
    
    /**
      * Observe (learn) a string from a training set
      */
    def observe(string: String): Unit
  }
  object StringGenerator {
    
    inline def apply(
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
    
    extension [Self <: StringGenerator](x: Self) {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setGenerate(value: () => String): Self = StObject.set(x, "generate", js.Any.fromFunction0(value))
      
      inline def setGetStats(value: () => String): Self = StObject.set(x, "getStats", js.Any.fromFunction0(value))
      
      inline def setObserve(value: String => Unit): Self = StObject.set(x, "observe", js.Any.fromFunction1(value))
      
      inline def set_backoff(value: js.Array[String] => js.Array[String]): Self = StObject.set(x, "_backoff", js.Any.fromFunction1(value))
      
      inline def set_boundary(value: String): Self = StObject.set(x, "_boundary", value.asInstanceOf[js.Any])
      
      inline def set_data(value: StringDictionary[Events]): Self = StObject.set(x, "_data", value.asInstanceOf[js.Any])
      
      inline def set_join(value: js.Array[String] => String): Self = StObject.set(x, "_join", js.Any.fromFunction1(value))
      
      inline def set_observeEvent(value: (js.Array[String], String) => Unit): Self = StObject.set(x, "_observeEvent", js.Any.fromFunction2(value))
      
      inline def set_options(value: Options): Self = StObject.set(x, "_options", value.asInstanceOf[js.Any])
      
      inline def set_prefix(value: js.Array[String]): Self = StObject.set(x, "_prefix", value.asInstanceOf[js.Any])
      
      inline def set_prefixVarargs(value: String*): Self = StObject.set(x, "_prefix", js.Array(value*))
      
      inline def set_priorValues(value: StringDictionary[Double]): Self = StObject.set(x, "_priorValues", value.asInstanceOf[js.Any])
      
      inline def set_sample(value: js.Array[String] => String): Self = StObject.set(x, "_sample", js.Any.fromFunction1(value))
      
      inline def set_split(value: String => js.Array[String]): Self = StObject.set(x, "_split", js.Any.fromFunction1(value))
      
      inline def set_suffix(value: String): Self = StObject.set(x, "_suffix", value.asInstanceOf[js.Any])
    }
  }
}
