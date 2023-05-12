package typings.russianNounsJs

import typings.russianNounsJs.srcLemmaMod.Lemma
import typings.russianNounsJs.srcLemmaMod.LemmaOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcEngineMod {
  
  @JSImport("russian-nouns-js/src/Engine", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Engine
  
  @js.native
  trait Engine extends StObject {
    
    def decline(lemma: Lemma): js.Array[String] = js.native
    /**
      *
      * @param {RussianNouns.Lemma|Object} lemma Слово в именительном падеже с метаинформацией.
      * @param {string} grammaticalCase Падеж.
      * @param {string} pluralForm Форма во множественном числе.
      * Если указана, результат будет тоже во множественном.
      * У pluralia tantum игнорируется.
      * @returns {Array} Список, т.к. бывают вторые родительный, винительный падежи. Существительные
      * женского рода в творительном могут иметь как окончания -ей -ой, так и -ею -ою.
      * Второй предложный падеж (местный падеж, локатив) не включен в предложный.
      */
    def decline(lemma: LemmaOptions): js.Array[String] = js.native
    def decline(
      lemma: LemmaOptions,
      grammaticalCase: /* import warning: importer.ImportType#apply Failed type conversion: russian-nouns-js.russian-nouns-js/src/Case.Case[keyof russian-nouns-js.russian-nouns-js/src/Case.Case] */ js.Any
    ): js.Array[String] = js.native
    def decline(
      lemma: LemmaOptions,
      grammaticalCase: /* import warning: importer.ImportType#apply Failed type conversion: russian-nouns-js.russian-nouns-js/src/Case.Case[keyof russian-nouns-js.russian-nouns-js/src/Case.Case] */ js.Any,
      pluralForm: String
    ): js.Array[String] = js.native
    def decline(lemma: LemmaOptions, grammaticalCase: Unit, pluralForm: String): js.Array[String] = js.native
    def decline(
      lemma: Lemma,
      grammaticalCase: /* import warning: importer.ImportType#apply Failed type conversion: russian-nouns-js.russian-nouns-js/src/Case.Case[keyof russian-nouns-js.russian-nouns-js/src/Case.Case] */ js.Any
    ): js.Array[String] = js.native
    def decline(
      lemma: Lemma,
      grammaticalCase: /* import warning: importer.ImportType#apply Failed type conversion: russian-nouns-js.russian-nouns-js/src/Case.Case[keyof russian-nouns-js.russian-nouns-js/src/Case.Case] */ js.Any,
      pluralForm: String
    ): js.Array[String] = js.native
    def decline(lemma: Lemma, grammaticalCase: Unit, pluralForm: String): js.Array[String] = js.native
    
    def pluralize(lemma: Lemma): js.Array[String] = js.native
    /**
      * @param {RussianNouns.Lemma|Object} lemma
      * @returns {Array}
      */
    def pluralize(lemma: LemmaOptions): js.Array[String] = js.native
    
    /**
      * @description Словарь ударений. Его можно редактировать в рантайме.
      */
    val sd: typings.russianNounsJs.srcStressDictionaryMod.default = js.native
  }
}
