package typings.showdown.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait RegexReplaceExtension extends Extension_ {
  
  /**
    * Should be either a string or a RegExp object.
    *
    * Keep in mind that, if a string is used, it will automatically be given a g modifier,
    * that is, it is assumed to be a global replacement.
    */
  var regex: js.UndefOr[String | RegExp] = js.native
  
  /**
    * Can be either a string or a function. If replace is a string,
    * it can use the $1 syntax for group substitution,
    * exactly as if it were making use of string.replace (internally it does this actually).
    */
  var replace: js.UndefOr[js.Any] = js.native
}
object RegexReplaceExtension {
  
  @scala.inline
  def apply(`type`: String): RegexReplaceExtension = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegexReplaceExtension]
  }
  
  @scala.inline
  implicit class RegexReplaceExtensionOps[Self <: RegexReplaceExtension] (val x: Self) extends AnyVal {
    
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
    def setRegex(value: String | RegExp): Self = this.set("regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegex: Self = this.set("regex", js.undefined)
    
    @scala.inline
    def setReplace(value: js.Any): Self = this.set("replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplace: Self = this.set("replace", js.undefined)
  }
}
