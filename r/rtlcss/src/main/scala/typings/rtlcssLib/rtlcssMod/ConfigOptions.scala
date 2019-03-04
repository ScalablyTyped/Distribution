package typings
package rtlcssLib.rtlcssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  /**
    * Applies to CSS rules containing no directional properties,
    * it will update the selector by applying String Map.
    */
  var autoRename: scala.Boolean
  /**
    * Ensures autoRename is applied only if pair exists.
    */
  var autoRenameStrict: scala.Boolean
  /**
    * An object map of disabled plugins directives,
    * where keys are plugin names and value are object
    * hash of disabled directives. e.g. {'rtlcss':{'config':true}}.
    */
  var blacklist: js.Object
  /**
    * Removes directives comments from output CSS.
    */
  var clean: scala.Boolean
  /**
    * Fallback value for String Map options.
    */
  var greedy: scala.Boolean
  /**
    * Applies String Map to URLs. You can also target specific node types using an object literal.
    * e.g. {'atrule': true, 'decl': false}.
    */
  var processUrls: scala.Boolean | js.Object
  /**
    * The default array of String Map.
    */
  var stringMap: js.Array[StringMap]
  /**
    * When enabled, flips background-position expressed in length units using calc.
    */
  var useCalc: scala.Boolean
}

object ConfigOptions {
  @scala.inline
  def apply(
    autoRename: scala.Boolean,
    autoRenameStrict: scala.Boolean,
    blacklist: js.Object,
    clean: scala.Boolean,
    greedy: scala.Boolean,
    processUrls: scala.Boolean | js.Object,
    stringMap: js.Array[StringMap],
    useCalc: scala.Boolean
  ): ConfigOptions = {
    val __obj = js.Dynamic.literal(autoRename = autoRename, autoRenameStrict = autoRenameStrict, blacklist = blacklist, clean = clean, greedy = greedy, processUrls = processUrls.asInstanceOf[js.Any], stringMap = stringMap, useCalc = useCalc)
  
    __obj.asInstanceOf[ConfigOptions]
  }
}

