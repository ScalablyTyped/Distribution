package typings.reservedDashWords

import org.scalablytyped.runtime.StringDictionary
import typings.reservedDashWords.reservedDashWordsMod.Dialect
import typings.reservedDashWords.reservedDashWordsMod.Keywords
import typings.reservedDashWords.reservedDashWordsNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("reserved-words", JSImport.Namespace)
@js.native
object reservedDashWordsMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.reservedDashWords.reservedDashWordsStrings.es3
    - typings.reservedDashWords.reservedDashWordsNumbers.`3`
    - typings.reservedDashWords.reservedDashWordsStrings.es5
    - typings.reservedDashWords.reservedDashWordsNumbers.`5`
    - typings.reservedDashWords.reservedDashWordsStrings.es2015
    - typings.reservedDashWords.reservedDashWordsNumbers.`6`
    - typings.reservedDashWords.reservedDashWordsStrings.es7
    - typings.reservedDashWords.reservedDashWordsNumbers.`7`
    - typings.reservedDashWords.reservedDashWordsStrings.es6
    - typings.reservedDashWords.reservedDashWordsStrings.next
  */
  trait Dialect extends js.Object
  
  val KEYWORDS: Keywords = js.native
  def check(word: String): Boolean = js.native
  def check(word: String, dialect: Dialect): Boolean = js.native
  def check(word: String, dialect: Dialect, strict: Boolean): Boolean = js.native
  type Keywords = StringDictionary[StringDictionary[`true`]]
}

