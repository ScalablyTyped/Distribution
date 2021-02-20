package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.graph
import typings.sparqljs.sparqljsStrings.group
import typings.sparqljs.sparqljsStrings.minus
import typings.sparqljs.sparqljsStrings.optional
import typings.sparqljs.sparqljsStrings.service
import typings.sparqljs.sparqljsStrings.union
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.sparqljs.mod.OptionalPattern
  - typings.sparqljs.mod.UnionPattern
  - typings.sparqljs.mod.GroupPattern
  - typings.sparqljs.mod.GraphPattern
  - typings.sparqljs.mod.MinusPattern
  - typings.sparqljs.mod.ServicePattern
*/
trait BlockPattern extends Pattern
object BlockPattern {
  
  @scala.inline
  def GraphPattern(name: IriTerm, patterns: js.Array[Pattern], `type`: graph): typings.sparqljs.mod.GraphPattern = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sparqljs.mod.GraphPattern]
  }
  
  @scala.inline
  def GroupPattern(patterns: js.Array[Pattern], `type`: group): typings.sparqljs.mod.GroupPattern = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sparqljs.mod.GroupPattern]
  }
  
  @scala.inline
  def MinusPattern(patterns: js.Array[Pattern], `type`: minus): typings.sparqljs.mod.MinusPattern = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sparqljs.mod.MinusPattern]
  }
  
  @scala.inline
  def OptionalPattern(patterns: js.Array[Pattern], `type`: optional): typings.sparqljs.mod.OptionalPattern = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sparqljs.mod.OptionalPattern]
  }
  
  @scala.inline
  def ServicePattern(name: IriTerm, patterns: js.Array[Pattern], silent: Boolean, `type`: service): typings.sparqljs.mod.ServicePattern = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sparqljs.mod.ServicePattern]
  }
  
  @scala.inline
  def UnionPattern(patterns: js.Array[Pattern], `type`: union): typings.sparqljs.mod.UnionPattern = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sparqljs.mod.UnionPattern]
  }
}
