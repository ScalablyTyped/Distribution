package typings.rotJs.stringgeneratorMod

import org.scalablytyped.runtime.StringDictionary
import typings.rotJs.anon.PartialOptionsOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js/lib/stringgenerator", JSImport.Default)
@js.native
class default protected () extends StringGenerator {
  def this(options: PartialOptionsOrder) = this()
  /* CompleteClass */
  override var _boundary: String = js.native
  /* CompleteClass */
  override var _data: StringDictionary[Events] = js.native
  /* CompleteClass */
  override var _options: Options = js.native
  /* CompleteClass */
  override var _prefix: js.Array[String] = js.native
  /* CompleteClass */
  override var _priorValues: StringDictionary[Double] = js.native
  /* CompleteClass */
  override var _suffix: String = js.native
  /**
    * @param {string[]}
    * @returns {string[]}
    */
  /* CompleteClass */
  override def _backoff(context: js.Array[String]): js.Array[String] = js.native
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

