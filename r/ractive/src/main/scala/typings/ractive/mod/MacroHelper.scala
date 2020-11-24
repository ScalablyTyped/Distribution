package typings.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ractive", "MacroHelper")
@js.native
class MacroHelper () extends ContextHelper {
  
  /**
  	 * Create an alias for the local context of the partial (@local).
  	 * @param name The name to use when creating the alias to @local
  	 */
  def aliasLocal(name: String): Unit = js.native
  /**
  	 * Create an alias to a keypath in the local context of the partial (@local)
  	 * @param reference The keypath to be aliased e.g. foo.bar for @local.foo.bar
  	 * @param name The name to use when created the alias
  	 */
  def aliasLocal(reference: String, name: String): Unit = js.native
  
  var attributes: ValueMap = js.native
  
  var name: String = js.native
  
  var partials: PartialMap = js.native
  
  /**
  	 * Change the template used to render this macro. The old template will be unrenedered and replaced with the given template.
  	 * @param template The new template
  	 */
  def setTemplate(template: Template): Unit = js.native
  
  var template: Template = js.native
}
