package typings.slonik.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type SerializableValueObject = {[x: string] : slonik.slonik.SerializableValueType}
}}}
to avoid circular code involving: 
- slonik.slonik.SerializableValueArray
- slonik.slonik.SerializableValueObject
- slonik.slonik.SerializableValueType
*/
trait SerializableValueObject
  extends StObject
     with /* x */ StringDictionary[SerializableValueType]
object SerializableValueObject {
  
  inline def apply(): SerializableValueObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SerializableValueObject]
  }
}
