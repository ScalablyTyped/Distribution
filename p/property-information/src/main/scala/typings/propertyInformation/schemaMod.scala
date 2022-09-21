package typings.propertyInformation

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schemaMod {
  
  @JSImport("property-information/lib/util/schema", "Schema")
  @js.native
  open class Schema protected () extends StObject {
    /**
      * @constructor
      * @param {Properties} property
      * @param {Normal} normal
      * @param {string} [space]
      */
    def this(property: Properties, normal: Normal) = this()
    def this(property: Properties, normal: Normal, space: String) = this()
    
    var normal: Normal = js.native
    
    var property: Properties = js.native
    
    var space: String | Null = js.native
  }
  
  type Info = typings.propertyInformation.infoMod.Info
  
  type Normal = Record[String, String]
  
  type Properties = Record[String, Info]
}
