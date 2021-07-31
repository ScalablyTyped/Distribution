package typings.storybookClientApi.typesMod

import typings.storybookClientApi.storybookClientApiStrings.boolean
import typings.storybookClientApi.storybookClientApiStrings.function
import typings.storybookClientApi.storybookClientApiStrings.number
import typings.storybookClientApi.storybookClientApiStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SBScalarType
  extends StObject
     with SBBaseType
     with SBType {
  
  var name: boolean | string | number | function
}
object SBScalarType {
  
  @scala.inline
  def apply(name: boolean | string | number | function): SBScalarType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SBScalarType]
  }
  
  @scala.inline
  implicit class SBScalarTypeMutableBuilder[Self <: SBScalarType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: boolean | string | number | function): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
