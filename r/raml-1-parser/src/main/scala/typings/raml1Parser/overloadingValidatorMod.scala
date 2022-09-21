package typings.raml1Parser

import org.scalablytyped.runtime.StringDictionary
import typings.raml1Parser.highLevelASTMod.ValidationAcceptor
import typings.raml1Parser.raml08parserapiMod.Api
import typings.raml1Parser.raml08parserapiMod.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overloadingValidatorMod {
  
  @JSImport("raml-1-parser/dist/parser/ast.core/overloadingValidator", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with OverloadingValidator
  
  @js.native
  trait OverloadingValidator extends StObject {
    
    def acceptResource(resource: Resource): Unit = js.native
    def acceptResource(resource: typings.raml1Parser.raml10parserapiMod.Resource): Unit = js.native
    
    /* protected */ var conflictingUriToResources: StringDictionary[js.Array[typings.raml1Parser.raml10parserapiMod.Resource | Resource]] = js.native
    
    /* protected */ var uriToResources: StringDictionary[js.Array[typings.raml1Parser.raml10parserapiMod.Resource | Resource]] = js.native
    
    def validateApi(api: Api, acceptor: ValidationAcceptor): Unit = js.native
    def validateApi(api: typings.raml1Parser.raml10parserapiMod.Api, acceptor: ValidationAcceptor): Unit = js.native
  }
}
