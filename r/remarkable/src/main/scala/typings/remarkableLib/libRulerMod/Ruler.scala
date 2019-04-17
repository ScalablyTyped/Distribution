package typings
package remarkableLib.libRulerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Ruler is a helper class for building responsibility chains from
  * parse rules. It allows:
  *
  *   - easy stack rules chains
  *   - getting main chain and named chains content (as arrays of functions)
  */
@js.native
trait Ruler[RULE] extends js.Object {
  /**
    * Add a rule to the chain after the given `ruleName`.
    */
  def after(
    afterName: java.lang.String,
    ruleName: java.lang.String,
    fn: RULE,
    options: remarkableLib.libMod.Options
  ): scala.Unit = js.native
  /**
    * Replace the rule `ruleName` with a new rule.
    */
  def at(ruleName: java.lang.String, fn: RULE, options: remarkableLib.libMod.Options): scala.Unit = js.native
  /**
    * Add a rule to the chain before given the `ruleName`.
    */
  def before(
    beforeName: java.lang.String,
    ruleName: java.lang.String,
    fn: RULE,
    options: remarkableLib.libMod.Options
  ): scala.Unit = js.native
  /**
    * Disable a rule or list of rules.
    *
    * @param list Name or array of rule names to disable.
    */
  def disable(list: java.lang.String): scala.Unit = js.native
  def disable(list: js.Array[java.lang.String]): scala.Unit = js.native
  /**
    * Enable a rule or list of rules.
    *
    * @param list Name or array of rule names to enable.
    * @param strict If `true`, all non listed rules will be disabled.
    */
  def enable(list: java.lang.String): scala.Unit = js.native
  def enable(list: java.lang.String, strict: scala.Boolean): scala.Unit = js.native
  def enable(list: js.Array[java.lang.String]): scala.Unit = js.native
  def enable(list: js.Array[java.lang.String], strict: scala.Boolean): scala.Unit = js.native
  /**
    * Get a rules list as an array of functions.
    */
  def getRules(chainName: java.lang.String): js.Array[remarkableLib.libMod.Rule[remarkableLib.libMod.TagToken, java.lang.String]] = js.native
  /**
    * Add a rule to the end of chain.
    */
  def push(ruleName: java.lang.String, fn: RULE, options: remarkableLib.libMod.Options): scala.Unit = js.native
}

