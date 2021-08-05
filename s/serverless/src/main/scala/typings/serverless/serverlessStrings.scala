package typings.serverless

import typings.serverless.validateMod.HttpMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverlessStrings {
  
  @js.native
  sealed trait Allow extends StObject
  inline def Allow: Allow = "Allow".asInstanceOf[Allow]
  
  @js.native
  sealed trait Deny extends StObject
  inline def Deny: Deny = "Deny".asInstanceOf[Deny]
  
  @js.native
  sealed trait any
    extends StObject
       with HttpMethod
  inline def any: any = "any".asInstanceOf[any]
  
  @js.native
  sealed trait aws extends StObject
  inline def aws: aws = "aws".asInstanceOf[aws]
  
  @js.native
  sealed trait cognito extends StObject
  inline def cognito: cognito = "cognito".asInstanceOf[cognito]
  
  @js.native
  sealed trait delete
    extends StObject
       with HttpMethod
  inline def delete: delete = "delete".asInstanceOf[delete]
  
  @js.native
  sealed trait edge extends StObject
  inline def edge: edge = "edge".asInstanceOf[edge]
  
  @js.native
  sealed trait get
    extends StObject
       with HttpMethod
  inline def get: get = "get".asInstanceOf[get]
  
  @js.native
  sealed trait head
    extends StObject
       with HttpMethod
  inline def head: head = "head".asInstanceOf[head]
  
  @js.native
  sealed trait lambda extends StObject
  inline def lambda: lambda = "lambda".asInstanceOf[lambda]
  
  @js.native
  sealed trait mock extends StObject
  inline def mock: mock = "mock".asInstanceOf[mock]
  
  @js.native
  sealed trait oidc extends StObject
  inline def oidc: oidc = "oidc".asInstanceOf[oidc]
  
  @js.native
  sealed trait options
    extends StObject
       with HttpMethod
  inline def options: options = "options".asInstanceOf[options]
  
  @js.native
  sealed trait patch
    extends StObject
       with HttpMethod
  inline def patch: patch = "patch".asInstanceOf[patch]
  
  @js.native
  sealed trait post
    extends StObject
       with HttpMethod
  inline def post: post = "post".asInstanceOf[post]
  
  @js.native
  sealed trait `private` extends StObject
  inline def `private`: `private` = "private".asInstanceOf[`private`]
  
  @js.native
  sealed trait put
    extends StObject
       with HttpMethod
  inline def put: put = "put".asInstanceOf[put]
  
  @js.native
  sealed trait regional extends StObject
  inline def regional: regional = "regional".asInstanceOf[regional]
}
