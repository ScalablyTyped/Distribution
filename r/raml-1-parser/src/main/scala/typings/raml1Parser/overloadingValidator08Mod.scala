package typings.raml1Parser

import org.scalablytyped.runtime.StringDictionary
import typings.raml1Parser.highLevelASTMod.ValidationAcceptor
import typings.raml1Parser.raml08parserMod.ApiImpl
import typings.raml1Parser.raml08parserapiMod.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overloadingValidator08Mod {
  
  @JSImport("raml-1-parser/dist/parser/ast.core/overloadingValidator08", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with OverloadingValidator {
    
    /* CompleteClass */
    override def acceptResource(x: Resource): Unit = js.native
    
    /* protected */ /* CompleteClass */
    var conflicting: StringDictionary[js.Array[Resource]] = js.native
    
    /* protected */ /* CompleteClass */
    var holder: StringDictionary[js.Array[Resource]] = js.native
    
    /* CompleteClass */
    override def validateApi(q: ApiImpl, v: ValidationAcceptor): Unit = js.native
  }
  
  trait OverloadingValidator extends StObject {
    
    def acceptResource(x: Resource): Unit
    
    /* protected */ var conflicting: StringDictionary[js.Array[Resource]]
    
    /* protected */ var holder: StringDictionary[js.Array[Resource]]
    
    def validateApi(q: ApiImpl, v: ValidationAcceptor): Unit
  }
  object OverloadingValidator {
    
    inline def apply(
      acceptResource: Resource => Unit,
      conflicting: StringDictionary[js.Array[Resource]],
      holder: StringDictionary[js.Array[Resource]],
      validateApi: (ApiImpl, ValidationAcceptor) => Unit
    ): OverloadingValidator = {
      val __obj = js.Dynamic.literal(acceptResource = js.Any.fromFunction1(acceptResource), conflicting = conflicting.asInstanceOf[js.Any], holder = holder.asInstanceOf[js.Any], validateApi = js.Any.fromFunction2(validateApi))
      __obj.asInstanceOf[OverloadingValidator]
    }
    
    extension [Self <: OverloadingValidator](x: Self) {
      
      inline def setAcceptResource(value: Resource => Unit): Self = StObject.set(x, "acceptResource", js.Any.fromFunction1(value))
      
      inline def setConflicting(value: StringDictionary[js.Array[Resource]]): Self = StObject.set(x, "conflicting", value.asInstanceOf[js.Any])
      
      inline def setHolder(value: StringDictionary[js.Array[Resource]]): Self = StObject.set(x, "holder", value.asInstanceOf[js.Any])
      
      inline def setValidateApi(value: (ApiImpl, ValidationAcceptor) => Unit): Self = StObject.set(x, "validateApi", js.Any.fromFunction2(value))
    }
  }
}
