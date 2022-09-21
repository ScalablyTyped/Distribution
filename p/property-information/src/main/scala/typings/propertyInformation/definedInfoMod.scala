package typings.propertyInformation

import typings.propertyInformation.infoMod.Info
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object definedInfoMod {
  
  @JSImport("property-information/lib/util/defined-info", "DefinedInfo")
  @js.native
  open class DefinedInfo protected () extends Info {
    /**
      * @constructor
      * @param {string} property
      * @param {string} attribute
      * @param {number|null} [mask]
      * @param {string} [space]
      */
    def this(property: String, attribute: String) = this()
    def this(property: String, attribute: String, mask: Double) = this()
    def this(property: String, attribute: String, mask: Double, space: String) = this()
    def this(property: String, attribute: String, mask: Null, space: String) = this()
    def this(property: String, attribute: String, mask: Unit, space: String) = this()
  }
}
