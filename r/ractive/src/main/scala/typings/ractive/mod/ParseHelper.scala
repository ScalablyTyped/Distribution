package typings.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParseHelper extends StObject {
  
  /**
  	 * Retrieves a template string from a script tag with the given id.j
  	 */
  def fromId(id: String): String = js.native
  
  /**
  	 * @returns true if the given value is a parsed template
  	 */
  def isParsed(template: Any): Boolean = js.native
  
  /**
  	 * Parse the given template with Ractive.parse.
  	 */
  def parse(template: String): ParsedTemplate = js.native
  def parse(template: String, opts: ParseOpts): ParsedTemplate = js.native
}
