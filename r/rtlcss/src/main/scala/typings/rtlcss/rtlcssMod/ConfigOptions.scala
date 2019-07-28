package typings.rtlcss.rtlcssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  /**
    * Applies to CSS rules containing no directional properties,
    * it will update the selector by applying String Map.
    */
  var autoRename: Boolean
  /**
    * Ensures autoRename is applied only if pair exists.
    */
  var autoRenameStrict: Boolean
  /**
    * An object map of disabled plugins directives,
    * where keys are plugin names and value are object
    * hash of disabled directives. e.g. {'rtlcss':{'config':true}}.
    */
  var blacklist: js.Object
  /**
    * Removes directives comments from output CSS.
    */
  var clean: Boolean
  /**
    * Fallback value for String Map options.
    */
  var greedy: Boolean
  /**
    * Applies String Map to URLs. You can also target specific node types using an object literal.
    * e.g. {'atrule': true, 'decl': false}.
    */
  var processUrls: Boolean | js.Object
  /**
    * The default array of String Map.
    */
  var stringMap: js.Array[StringMap]
  /**
    * When enabled, flips background-position expressed in length units using calc.
    */
  var useCalc: Boolean
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
    val __obj = js.Dynamic.literal(autoRename = autoRename, autoRenameStrict = autoRenameStrict, blacklist = blacklist, clean = clean, greedy = greedy, processUrls = processUrls.asInstanceOf[js.Any], stringMap = stringMap, useCalc = useCalc)
  
    __obj.asInstanceOf[ConfigOptions]
  }
}

