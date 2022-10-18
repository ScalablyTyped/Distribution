package typings.russianNounsJs

import typings.russianNounsJs.srcLemmaMod.Lemma
import typings.russianNounsJs.srcLemmaMod.LemmaOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcStressDictionaryMod {
  
  @JSImport("russian-nouns-js/src/StressDictionary", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with StressDictionary
  
  @js.native
  trait StressDictionary extends StObject {
    
    /**
      * Благодаря этому методу, словарь можно использовать для других целей.
      * Например, если там есть слово, можно посмотреть его род и признаки.
      *
      * @param word Слово, по которому производится поиск.
      * Буква Ё и регистр игнорируются.
      * @returns {Array} Список лемм.
      */
    def find(word: String): js.Array[String] = js.native
    
    /**
      * @param {RussianNouns.Lemma|Object} lemma
      * @param {boolean} fuzzy Если не найдено, игнорировать букву Ё и второстепенные поля у леммы.
      * @returns {*} Строка настроек или undefined.
      */
    def get(lemma: LemmaOptions, fuzzy: Boolean): js.UndefOr[String] = js.native
    def get(lemma: Lemma, fuzzy: Boolean): js.UndefOr[String] = js.native
    
    def hasStressedEndingPlural(lemma: LemmaOptions, grCase: String): js.Array[Boolean] = js.native
    def hasStressedEndingPlural(lemma: Lemma, grCase: String): js.Array[Boolean] = js.native
    
    def hasStressedEndingSingular(lemma: LemmaOptions, grCase: String): js.Array[Boolean] = js.native
    def hasStressedEndingSingular(lemma: Lemma, grCase: String): js.Array[Boolean] = js.native
    
    /**
      * @param {RussianNouns.Lemma|Object} lemma
      * @param {string} settings Строка настроек в формате 1234567-123456.
      * До дефиса — единственное число, после дефиса — множественное.
      * Номер символа — номер падежа в {@link RussianNouns.CASES}.
      * Возможные значения каждого символа:
      * S — ударение только на основу;
      * s — чаще на основу;
      * b — оба варианта употребляются одинаково часто;
      * e — чаще на окончание;
      * E — только на окончание.
      * @throws {RussianNouns.StressDictionaryException}
      */
    def put(lemma: LemmaOptions, settings: String): Unit = js.native
    def put(lemma: Lemma, settings: String): Unit = js.native
    
    def remove(lemma: Lemma): Unit = js.native
    def remove(lemma: LemmaOptions): Unit = js.native
  }
}
