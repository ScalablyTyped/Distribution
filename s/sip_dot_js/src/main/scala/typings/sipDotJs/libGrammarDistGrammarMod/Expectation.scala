package typings.sipDotJs.libGrammarDistGrammarMod

import typings.sipDotJs.sipDotJsStrings.`class`
import typings.sipDotJs.sipDotJsStrings.any
import typings.sipDotJs.sipDotJsStrings.end
import typings.sipDotJs.sipDotJsStrings.literal
import typings.sipDotJs.sipDotJsStrings.other
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.sipDotJs.libGrammarDistGrammarMod.ILiteralExpectation
  - typings.sipDotJs.libGrammarDistGrammarMod.IClassExpectation
  - typings.sipDotJs.libGrammarDistGrammarMod.IAnyExpectation
  - typings.sipDotJs.libGrammarDistGrammarMod.IEndExpectation
  - typings.sipDotJs.libGrammarDistGrammarMod.IOtherExpectation
*/
trait Expectation extends js.Object

object Expectation {
  @scala.inline
  def IOtherExpectation(description: String, `type`: other): Expectation = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expectation]
  }
  @scala.inline
  def IEndExpectation(`type`: end): Expectation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expectation]
  }
  @scala.inline
  def ILiteralExpectation(ignoreCase: Boolean, text: String, `type`: literal): Expectation = {
    val __obj = js.Dynamic.literal(ignoreCase = ignoreCase.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expectation]
  }
  @scala.inline
  def IAnyExpectation(`type`: any): Expectation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expectation]
  }
  @scala.inline
  def IClassExpectation(ignoreCase: Boolean, inverted: Boolean, parts: IClassParts, `type`: `class`): Expectation = {
    val __obj = js.Dynamic.literal(ignoreCase = ignoreCase.asInstanceOf[js.Any], inverted = inverted.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expectation]
  }
}

