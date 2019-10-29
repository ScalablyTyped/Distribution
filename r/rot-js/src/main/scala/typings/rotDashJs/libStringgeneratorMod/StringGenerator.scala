package typings.rotDashJs.libStringgeneratorMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringGenerator extends js.Object {
  var _boundary: String
  var _data: StringDictionary[Events]
  var _options: Options
  var _prefix: js.Array[String]
  var _priorValues: StringDictionary[Double]
  var _suffix: String
  /**
    * @param {string[]}
    * @returns {string[]}
    */
  def _backoff(context: js.Array[String]): js.Array[String]
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
    val __obj = js.Dynamic.literal(_backoff = js.Any.fromFunction1(_backoff), _boundary = _boundary, _data = _data, _join = js.Any.fromFunction1(_join), _observeEvent = js.Any.fromFunction2(_observeEvent), _options = _options, _prefix = _prefix, _priorValues = _priorValues, _sample = js.Any.fromFunction1(_sample), _split = js.Any.fromFunction1(_split), _suffix = _suffix, clear = js.Any.fromFunction0(clear), generate = js.Any.fromFunction0(generate), getStats = js.Any.fromFunction0(getStats), observe = js.Any.fromFunction1(observe))
  
    __obj.asInstanceOf[StringGenerator]
  }
}

