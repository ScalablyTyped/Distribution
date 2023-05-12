package typings.storybookCsf.mod

import typings.storybookCsf.storybookCsfStrings.boolean
import typings.storybookCsf.storybookCsfStrings.function
import typings.storybookCsf.storybookCsfStrings.number
import typings.storybookCsf.storybookCsfStrings.string
import typings.storybookCsf.storybookCsfStrings.symbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SBScalarType
  extends StObject
     with SBBaseType
     with SBType {
  
  var name: boolean | string | number | function | symbol
}
object SBScalarType {
  
  inline def apply(name: boolean | string | number | function | symbol): SBScalarType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SBScalarType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SBScalarType] (val x: Self) extends AnyVal {
    
    inline def setName(value: boolean | string | number | function | symbol): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
