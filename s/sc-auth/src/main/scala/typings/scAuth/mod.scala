package typings.scAuth

import typings.jsonwebtoken.mod.Secret
import typings.jsonwebtoken.mod.SignCallback
import typings.jsonwebtoken.mod.SignOptions
import typings.jsonwebtoken.mod.VerifyCallback
import typings.jsonwebtoken.mod.VerifyOptions
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sc-auth", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class AuthEngine () extends SCAuthEngine
  
  @js.native
  trait SCAuthEngine extends js.Object {
    def signToken(token: String, key: Secret): Unit = js.native
    def signToken(token: String, key: Secret, options: SignOptions): Unit = js.native
    def signToken(token: String, key: Secret, options: SignOptions, callback: SignCallback): Unit = js.native
    def signToken(token: js.Object, key: Secret): Unit = js.native
    def signToken(token: js.Object, key: Secret, options: SignOptions): Unit = js.native
    def signToken(token: js.Object, key: Secret, options: SignOptions, callback: SignCallback): Unit = js.native
    def signToken(token: Buffer, key: Secret): Unit = js.native
    def signToken(token: Buffer, key: Secret, options: SignOptions): Unit = js.native
    def signToken(token: Buffer, key: Secret, options: SignOptions, callback: SignCallback): Unit = js.native
    def verifyToken(signedToken: String, key: String): Unit = js.native
    def verifyToken(signedToken: String, key: String, options: VerifyOptions): Unit = js.native
    def verifyToken(signedToken: String, key: String, options: VerifyOptions, callback: VerifyCallback): Unit = js.native
    def verifyToken(signedToken: String, key: Buffer): Unit = js.native
    def verifyToken(signedToken: String, key: Buffer, options: VerifyOptions): Unit = js.native
    def verifyToken(signedToken: String, key: Buffer, options: VerifyOptions, callback: VerifyCallback): Unit = js.native
  }
  
}

