package typings.promptSync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Prompt extends js.Object {
  def apply(ask: String): String = js.native
  def apply(ask: String, opts: Option): String = js.native
  def apply(ask: String, value: String): String = js.native
  /**
    * prompt -- sync function for reading user input from stdin
    *  @param {String} ask opening question/statement to prompt for
    *  @param {String} value initial value for the prompt
    *  @param   {Object} opts {
    *   echo: set to a character to be echoed, default is '*'. Use '' for no echo
    *   value: {String} initial value for the prompt
    *   ask: {String} opening question/statement to prompt for, does not override ask param
    *   autocomplete: {StringArray} function({String})
    * }
    *
    * @returns {string} Returns the string input or (if sigint === false)
    *                   null if user terminates with a ^C
    */
  def apply(ask: String, value: String, opts: Option): String = js.native
  def apply(opts: Option): String = js.native
  def hide(ask: String): String = js.native
}

