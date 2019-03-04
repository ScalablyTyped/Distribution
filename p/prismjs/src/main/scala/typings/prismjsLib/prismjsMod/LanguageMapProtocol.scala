package typings
package prismjsLib.prismjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageMapProtocol extends js.Object {
  /**
    * Extend a language definition
    * @param id The language definition to extend
    * @param redef The new language definition to extend the original
    */
  def extend(id: java.lang.String, redef: LanguageDefinition): LanguageDefinition
  /**
    * Insert a token before another token in a language literal
    * As this needs to recreate the object (we cannot actually insert before keys in object literals),
    * we cannot just provide an object, we need anobject and a key.
    * @param inside The key (or language id) of the parent
    * @param before The key to insert before. If not provided, the function appends instead.
    * @param insert Object with the key/value pairs to insert
    * @param root The object that contains `inside`. If equal to Prism.languages, it can be omitted.
    */
  def insertBefore(
    inside: java.lang.String,
    before: java.lang.String,
    insert: LanguageDefinition,
    root: LanguageDefinition
  ): LanguageDefinition
}

object LanguageMapProtocol {
  @scala.inline
  def apply(
    extend: js.Function2[java.lang.String, LanguageDefinition, LanguageDefinition],
    insertBefore: js.Function4[
      java.lang.String, 
      java.lang.String, 
      LanguageDefinition, 
      LanguageDefinition, 
      LanguageDefinition
    ]
  ): LanguageMapProtocol = {
    val __obj = js.Dynamic.literal(extend = extend, insertBefore = insertBefore)
  
    __obj.asInstanceOf[LanguageMapProtocol]
  }
}

