package typings.smithyProtocolHttp

import typings.smithyTypes.distTypesHttpMod.FieldOptions
import typings.smithyTypes.distTypesHttpMod.FieldPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFieldMod {
  
  @JSImport("@smithy/protocol-http/dist-types/Field", "Field")
  @js.native
  open class Field protected () extends StObject {
    def this(param0: FieldOptions) = this()
    
    /**
      * Appends a value to the field.
      *
      * @param value The value to append.
      */
    def add(value: String): Unit = js.native
    
    /**
      * Get string values as a list
      *
      * @returns Values in {@link Field} as a list.
      */
    def get(): js.Array[String] = js.native
    
    val kind: FieldPosition = js.native
    
    val name: String = js.native
    
    /**
      * Remove all matching entries from list.
      *
      * @param value Value to remove.
      */
    def remove(value: String): Unit = js.native
    
    /**
      * Overwrite existing field values.
      *
      * @param values The new field values.
      */
    def set(values: js.Array[String]): Unit = js.native
    
    var values: js.Array[String] = js.native
  }
}
