package typings.remarkable.rulerMod

import typings.remarkable.libMod.Options
import typings.remarkable.libMod.Rule
import typings.remarkable.libMod.TagToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def after(afterName: String, ruleName: String, fn: RULE, options: Options): Unit = js.native
  
  /**
    * Replace the rule `ruleName` with a new rule.
    */
  def at(ruleName: String, fn: RULE, options: Options): Unit = js.native
  
  /**
    * Add a rule to the chain before given the `ruleName`.
    */
  def before(beforeName: String, ruleName: String, fn: RULE, options: Options): Unit = js.native
  
  /**
    * Disable a rule or list of rules.
    *
    * @param list Name or array of rule names to disable.
    */
  def disable(list: String): Unit = js.native
  def disable(list: js.Array[String]): Unit = js.native
  
  /**
    * Enable a rule or list of rules.
    *
    * @param list Name or array of rule names to enable.
    * @param strict If `true`, all non listed rules will be disabled.
    */
  def enable(list: String): Unit = js.native
  def enable(list: String, strict: Boolean): Unit = js.native
  def enable(list: js.Array[String]): Unit = js.native
  def enable(list: js.Array[String], strict: Boolean): Unit = js.native
  
  /**
    * Get a rules list as an array of functions.
    */
  def getRules(chainName: String): js.Array[Rule[TagToken, String]] = js.native
  
  /**
    * Add a rule to the end of chain.
    */
  def push(ruleName: String, fn: RULE, options: Options): Unit = js.native
}
