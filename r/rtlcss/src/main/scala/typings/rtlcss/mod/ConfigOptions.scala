package typings.rtlcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigOptions extends js.Object {
  /**
    * Applies to CSS rules containing no directional properties,
    * it will update the selector by applying String Map.
    */
  var autoRename: Boolean = js.native
  /**
    * Ensures autoRename is applied only if pair exists.
    */
  var autoRenameStrict: Boolean = js.native
  /**
    * An object map of disabled plugins directives,
    * where keys are plugin names and value are object
    * hash of disabled directives. e.g. {'rtlcss':{'config':true}}.
    */
  var blacklist: js.Object = js.native
  /**
    * Removes directives comments from output CSS.
    */
  var clean: Boolean = js.native
  /**
    * Fallback value for String Map options.
    */
  var greedy: Boolean = js.native
  /**
    * Applies String Map to URLs. You can also target specific node types using an object literal.
    * e.g. {'atrule': true, 'decl': false}.
    */
  var processUrls: Boolean | js.Object = js.native
  /**
    * The default array of String Map.
    */
  var stringMap: js.Array[StringMap] = js.native
  /**
    * When enabled, flips background-position expressed in length units using calc.
    */
  var useCalc: Boolean = js.native
}

object ConfigOptions {
  @scala.inline
  def apply(
    autoRename: Boolean,
    autoRenameStrict: Boolean,
    blacklist: js.Object,
    clean: Boolean,
    greedy: Boolean,
    processUrls: Boolean | js.Object,
    stringMap: js.Array[StringMap],
    useCalc: Boolean
  ): ConfigOptions = {
    val __obj = js.Dynamic.literal(autoRename = autoRename.asInstanceOf[js.Any], autoRenameStrict = autoRenameStrict.asInstanceOf[js.Any], blacklist = blacklist.asInstanceOf[js.Any], clean = clean.asInstanceOf[js.Any], greedy = greedy.asInstanceOf[js.Any], processUrls = processUrls.asInstanceOf[js.Any], stringMap = stringMap.asInstanceOf[js.Any], useCalc = useCalc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
  @scala.inline
  implicit class ConfigOptionsOps[Self <: ConfigOptions] (val x: Self) extends AnyVal {
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
    def setAutoRename(value: Boolean): Self = this.set("autoRename", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoRenameStrict(value: Boolean): Self = this.set("autoRenameStrict", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlacklist(value: js.Object): Self = this.set("blacklist", value.asInstanceOf[js.Any])
    @scala.inline
    def setClean(value: Boolean): Self = this.set("clean", value.asInstanceOf[js.Any])
    @scala.inline
    def setGreedy(value: Boolean): Self = this.set("greedy", value.asInstanceOf[js.Any])
    @scala.inline
    def setProcessUrls(value: Boolean | js.Object): Self = this.set("processUrls", value.asInstanceOf[js.Any])
    @scala.inline
    def setStringMapVarargs(value: StringMap*): Self = this.set("stringMap", js.Array(value :_*))
    @scala.inline
    def setStringMap(value: js.Array[StringMap]): Self = this.set("stringMap", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseCalc(value: Boolean): Self = this.set("useCalc", value.asInstanceOf[js.Any])
  }
  
}

