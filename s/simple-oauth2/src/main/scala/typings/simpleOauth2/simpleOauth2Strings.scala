package typings.simpleOauth2

import typings.simpleOauth2.mod.TokenType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simpleOauth2Strings {
  
  @js.native
  sealed trait access_token
    extends StObject
       with TokenType
  inline def access_token: access_token = "access_token".asInstanceOf[access_token]
  
  @js.native
  sealed trait body extends StObject
  inline def body: body = "body".asInstanceOf[body]
  
  @js.native
  sealed trait force extends StObject
  inline def force: force = "force".asInstanceOf[force]
  
  @js.native
  sealed trait form extends StObject
  inline def form: form = "form".asInstanceOf[form]
  
  @js.native
  sealed trait header extends StObject
  inline def header: header = "header".asInstanceOf[header]
  
  @js.native
  sealed trait json extends StObject
  inline def json: json = "json".asInstanceOf[json]
  
  @js.native
  sealed trait loose extends StObject
  inline def loose: loose = "loose".asInstanceOf[loose]
  
  @js.native
  sealed trait refresh_token
    extends StObject
       with TokenType
  inline def refresh_token: refresh_token = "refresh_token".asInstanceOf[refresh_token]
  
  @js.native
  sealed trait strict extends StObject
  inline def strict: strict = "strict".asInstanceOf[strict]
}
