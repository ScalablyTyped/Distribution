package typings.ramlTypesystem

import org.scalablytyped.runtime.StringDictionary
import typings.ramlTypesystem.distSrcTypesystemMod.AbstractType
import typings.ramlTypesystem.ramlTypesystemStrings.`object`
import typings.ramlTypesystem.ramlTypesystemStrings.array
import typings.ramlTypesystem.ramlTypesystemStrings.boolean
import typings.ramlTypesystem.ramlTypesystemStrings.number
import typings.ramlTypesystem.ramlTypesystemStrings.string
import typings.ramlTypesystem.ramlTypesystemStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcJsonSchemaWriterMod {
  
  @JSImport("raml-typesystem/dist/src/jsonSchemaWriter", "SchemaWriter")
  @js.native
  open class SchemaWriter () extends StObject {
    
    def generateRef(t: AbstractType): Any = js.native
    
    def getResult(): Any = js.native
    
    def getType(t: AbstractType): `object` | unknown | string | number | boolean | array = js.native
    
    var map: StringDictionary[String] = js.native
    
    def options(allOptions: js.Array[AbstractType], noBuiltIn: Boolean): js.Array[Any] = js.native
    
    var root: Any = js.native
    
    def store(t: AbstractType): Any = js.native
  }
}
