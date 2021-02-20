package typings.reservedWords

import org.scalablytyped.runtime.StringDictionary
import typings.reservedWords.reservedWordsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("reserved-words", "KEYWORDS")
  @js.native
  val KEYWORDS_ : Keywords = js.native
  
  @JSImport("reserved-words", "check")
  @js.native
  def check(word: String): Boolean = js.native
  @JSImport("reserved-words", "check")
  @js.native
  def check(word: String, dialect: js.UndefOr[scala.Nothing], strict: Boolean): Boolean = js.native
  @JSImport("reserved-words", "check")
  @js.native
  def check(word: String, dialect: Dialect): Boolean = js.native
  @JSImport("reserved-words", "check")
  @js.native
  def check(word: String, dialect: Dialect, strict: Boolean): Boolean = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.reservedWords.reservedWordsNumbers.`3`
    - typings.reservedWords.reservedWordsNumbers.`5`
    - typings.reservedWords.reservedWordsNumbers.`6`
    - typings.reservedWords.reservedWordsNumbers.`7`
    - typings.reservedWords.reservedWordsStrings.es3
    - typings.reservedWords.reservedWordsStrings.es5
    - typings.reservedWords.reservedWordsStrings.es2015
    - typings.reservedWords.reservedWordsStrings.es7
    - typings.reservedWords.reservedWordsStrings.es6
    - typings.reservedWords.reservedWordsStrings.next
  */
  trait Dialect extends StObject
  object Dialect {
    
    @scala.inline
    def `3`: typings.reservedWords.reservedWordsNumbers.`3` = 3.asInstanceOf[typings.reservedWords.reservedWordsNumbers.`3`]
    
    @scala.inline
    def `5`: typings.reservedWords.reservedWordsNumbers.`5` = 5.asInstanceOf[typings.reservedWords.reservedWordsNumbers.`5`]
    
    @scala.inline
    def `6`: typings.reservedWords.reservedWordsNumbers.`6` = 6.asInstanceOf[typings.reservedWords.reservedWordsNumbers.`6`]
    
    @scala.inline
    def `7`: typings.reservedWords.reservedWordsNumbers.`7` = 7.asInstanceOf[typings.reservedWords.reservedWordsNumbers.`7`]
    
    @scala.inline
    def es2015: typings.reservedWords.reservedWordsStrings.es2015 = "es2015".asInstanceOf[typings.reservedWords.reservedWordsStrings.es2015]
    
    @scala.inline
    def es3: typings.reservedWords.reservedWordsStrings.es3 = "es3".asInstanceOf[typings.reservedWords.reservedWordsStrings.es3]
    
    @scala.inline
    def es5: typings.reservedWords.reservedWordsStrings.es5 = "es5".asInstanceOf[typings.reservedWords.reservedWordsStrings.es5]
    
    @scala.inline
    def es6: typings.reservedWords.reservedWordsStrings.es6 = "es6".asInstanceOf[typings.reservedWords.reservedWordsStrings.es6]
    
    @scala.inline
    def es7: typings.reservedWords.reservedWordsStrings.es7 = "es7".asInstanceOf[typings.reservedWords.reservedWordsStrings.es7]
    
    @scala.inline
    def next: typings.reservedWords.reservedWordsStrings.next = "next".asInstanceOf[typings.reservedWords.reservedWordsStrings.next]
  }
  
  type Keywords = StringDictionary[StringDictionary[`true`]]
}
