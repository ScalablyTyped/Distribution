package typings.showdown.showdownMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Regex/replace style extensions are very similar to javascript's string.replace function.
  * Two properties are given, `regex` and `replace`.
  * 
  * @example
  * ```ts
  * let myExt: RegexReplaceExtension = {
  *   type: 'lang',
  *   regex: /markdown/g,
  *   replace: 'showdown'
  * };
  * ```
  */
trait RegexReplaceExtension extends Extension {
  /**
    * Should be either a string or a RegExp object.
    *
    * Keep in mind that, if a string is used, it will automatically be given a g modifier,
    * that is, it is assumed to be a global replacement.
    */
  var regex: js.UndefOr[String | RegExp] = js.undefined
  /**
    * Can be either a string or a function. If replace is a string,
    * it can use the $1 syntax for group substitution,
    * exactly as if it were making use of string.replace (internally it does this actually).
    */
  var replace: js.UndefOr[js.Any] = js.undefined
}

object RegexReplaceExtension {
  @scala.inline
  def apply(
    `type`: String,
    listeners: StringDictionary[EventListener] = null,
    regex: String | RegExp = null,
    replace: js.Any = null
  ): RegexReplaceExtension = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    if (replace != null) __obj.updateDynamic("replace")(replace.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegexReplaceExtension]
  }
}

