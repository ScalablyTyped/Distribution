package typings
package riotLib.riotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Util extends js.Object {
  /**
       * Series of helper functions needed for type checking
       */
  var check: CheckUtil = js.native
  /**
       * Series of utility functions to query and update DOM nodes
       */
  var dom: DOMUtil = js.native
  /**
       * Generic helper functions
       */
  var misc: MiscUtil = js.native
  /**
       * Object used to append and create custom tags css
       */
  var styleManager: StyleManager = js.native
  /**
       * Methods for managing all the riot tags instances
       */
  var tags: TagsUtil = js.native
  /**
       * Reference to the internal riot template engine
       */
  @JSName("tmpl")
  var tmpl_Original: Tmpl = js.native
  /**
       * Internal riot tags cache
       */
  var vdom: js.Array[TagInstance] = js.native
  /**
       * Reference to the internal riot template engine
       */
  def tmpl(expression: java.lang.String): js.Any = js.native
  /**
       * Reference to the internal riot template engine
       */
  def tmpl(expression: java.lang.String, data: js.Any): js.Any = js.native
}

