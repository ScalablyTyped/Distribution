package typings.propertyInformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object infoMod {
  
  @JSImport("property-information/lib/util/info", "Info")
  @js.native
  open class Info protected () extends StObject {
    /**
      * @constructor
      * @param {string} property
      * @param {string} attribute
      */
    def this(property: String, attribute: String) = this()
    
    /** @type {string} */
    var attribute: String = js.native
    
    var boolean: Boolean = js.native
    
    var booleanish: Boolean = js.native
    
    var commaOrSpaceSeparated: Boolean = js.native
    
    var commaSeparated: Boolean = js.native
    
    var defined: Boolean = js.native
    
    var mustUseProperty: Boolean = js.native
    
    var number: Boolean = js.native
    
    var overloadedBoolean: Boolean = js.native
    
    /** @type {string} */
    var property: String = js.native
    
    /** @type {string|null} */
    var space: String | Null = js.native
    
    var spaceSeparated: Boolean = js.native
  }
}
