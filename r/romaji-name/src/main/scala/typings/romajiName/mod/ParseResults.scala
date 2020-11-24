package typings.romajiName.mod

import typings.romajiName.romajiNameBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParseResults extends js.Object {
  
  /**
    *  If the name includes some sort of "After" or "In the style of" or similar prefix then this will be true.
    */
  var after: js.UndefOr[Boolean] = js.native
  
  /**
    * The full name, in ascii text, including the generation.
    * This is a proper ascii representation of the name (with long vowels converted from "ō" into "oo", for example).
    * Example: "Nakamura Gakuryoo II".
    */
  var ascii: js.UndefOr[String] = js.native
  
  /**
    * If the name includes a prefix like "Attributed to" then this will be true.
    */
  var attributed: js.UndefOr[Boolean] = js.native
  
  /**
    * A number representing the generation of the name. For example "John Smith II" would have a generation of 2.
    */
  var generation: js.UndefOr[Double] = js.native
  
  /**
    * A string of the Romaji form of the given name. (Will only exist if a Romaji form was originally provided.)
    */
  var given: js.UndefOr[String] = js.native
  
  /**
    * A string of the Kana form of the given name.
    * (Will only exist if a Romaji form was originally provided and if the locale is "ja".)
    */
  var given_kana: js.UndefOr[String] = js.native
  
  /**
    * A string of the Kanji form of the given name. (Will only exist if a Kanji form was originally provided.)
    */
  var given_kanji: js.UndefOr[String] = js.native
  
  /**
    * The full name, in kana, without the generation. For example: "なかむらがくりょう".
    */
  var kana: js.UndefOr[String] = js.native
  
  /**
    * The full name, in kanji, including the generation. For example: "戯画堂芦幸 2世".
    */
  var kanji: js.UndefOr[String] = js.native
  
  /**
    * A guess at the locale of the name. Only two values exist: "ja" and "".
    * Note that just because "ja" was returned it does not guarantee that the person is actually Japanese,
    * just that the name looks to be Japanese-like (for example: Some Chinese names also return "ja").
    */
  var locale: Locale = js.native
  
  /**
    * A string of the Romaji form of the middlename.
    */
  var middle: js.UndefOr[String] = js.native
  
  /**
    * The full name, in properly-stressed romaji, including the generation. For example: "Nakamura Gakuryō II".
    */
  var name: String = js.native
  
  /**
    * The original string that was passed in to parseName.
    */
  var original: String = js.native
  
  /**
    * The full name, in plain text, including the generation.
    * This is the same as the name property but with all stress formatting stripped from it.
    * This could be useful to use in the generation of a URL slug, or some such. It should never be displayed to an end-user as it will almost always be incorrect.
    * Example: "Nakamura Gakuryo II".
    */
  var plain: String = js.native
  
  /**
    * If the name includes a prefix like "School of", "Pupil of", or similar then this will be true.
    */
  var school: js.UndefOr[Boolean] = js.native
  
  /**
    * An object holding the settings that were passed in to the parseName method.
    */
  var settings: js.UndefOr[ParseOptions] = js.native
  
  /**
    * A string of the Romaji form of the surname.
    * (Will only exist if a Romaji form was originally provided.)
    */
  var surname: js.UndefOr[String] = js.native
  
  /**
    * A string of the Kana form of the surname.
    * (Will only exist if a Romaji form was originally provided and if the locale is "ja".)
    */
  var surname_kana: js.UndefOr[String] = js.native
  
  /**
    * A string of the Kanji form of the surname. (Will only exist if a Kanji form was originally provided.)
    */
  var surname_kanji: js.UndefOr[String] = js.native
  
  /**
    * If the name is a representation of an unknown individual (e.g. it's the string "Unknown", "Not known", or many of the other variations)
    * then this property will exist and be true.
    */
  var unknown: js.UndefOr[`true`] = js.native
}
object ParseResults {
  
  @scala.inline
  def apply(locale: Locale, name: String, original: String, plain: String): ParseResults = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], plain = plain.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseResults]
  }
  
  @scala.inline
  implicit class ParseResultsOps[Self <: ParseResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLocale(value: Locale): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginal(value: String): Self = this.set("original", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlain(value: String): Self = this.set("plain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfter(value: Boolean): Self = this.set("after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    
    @scala.inline
    def setAscii(value: String): Self = this.set("ascii", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAscii: Self = this.set("ascii", js.undefined)
    
    @scala.inline
    def setAttributed(value: Boolean): Self = this.set("attributed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributed: Self = this.set("attributed", js.undefined)
    
    @scala.inline
    def setGeneration(value: Double): Self = this.set("generation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeneration: Self = this.set("generation", js.undefined)
    
    @scala.inline
    def setGiven(value: String): Self = this.set("given", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGiven: Self = this.set("given", js.undefined)
    
    @scala.inline
    def setGiven_kana(value: String): Self = this.set("given_kana", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGiven_kana: Self = this.set("given_kana", js.undefined)
    
    @scala.inline
    def setGiven_kanji(value: String): Self = this.set("given_kanji", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGiven_kanji: Self = this.set("given_kanji", js.undefined)
    
    @scala.inline
    def setKana(value: String): Self = this.set("kana", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKana: Self = this.set("kana", js.undefined)
    
    @scala.inline
    def setKanji(value: String): Self = this.set("kanji", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKanji: Self = this.set("kanji", js.undefined)
    
    @scala.inline
    def setMiddle(value: String): Self = this.set("middle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMiddle: Self = this.set("middle", js.undefined)
    
    @scala.inline
    def setSchool(value: Boolean): Self = this.set("school", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchool: Self = this.set("school", js.undefined)
    
    @scala.inline
    def setSettings(value: ParseOptions): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
    
    @scala.inline
    def setSurname(value: String): Self = this.set("surname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSurname: Self = this.set("surname", js.undefined)
    
    @scala.inline
    def setSurname_kana(value: String): Self = this.set("surname_kana", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSurname_kana: Self = this.set("surname_kana", js.undefined)
    
    @scala.inline
    def setSurname_kanji(value: String): Self = this.set("surname_kanji", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSurname_kanji: Self = this.set("surname_kanji", js.undefined)
    
    @scala.inline
    def setUnknown(value: `true`): Self = this.set("unknown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnknown: Self = this.set("unknown", js.undefined)
  }
}
