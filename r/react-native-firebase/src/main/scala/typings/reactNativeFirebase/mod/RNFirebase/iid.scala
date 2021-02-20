package typings.reactNativeFirebase.mod.RNFirebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iid {
  
  @js.native
  trait InstanceId extends StObject {
    
    def delete(): js.Promise[Unit] = js.native
    
    def deleteToken(): js.Promise[Unit] = js.native
    def deleteToken(authorizedEntity: js.UndefOr[scala.Nothing], scope: String): js.Promise[Unit] = js.native
    def deleteToken(authorizedEntity: String): js.Promise[Unit] = js.native
    def deleteToken(authorizedEntity: String, scope: String): js.Promise[Unit] = js.native
    
    def get(): js.Promise[String] = js.native
    
    def getToken(): js.Promise[String] = js.native
    def getToken(authorizedEntity: js.UndefOr[scala.Nothing], scope: String): js.Promise[String] = js.native
    def getToken(authorizedEntity: String): js.Promise[String] = js.native
    def getToken(authorizedEntity: String, scope: String): js.Promise[String] = js.native
  }
}
