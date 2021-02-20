package typings.promisifySupertest

import typings.express.mod.Express
import typings.std.RegExp
import typings.superagent.mod.SuperAgent
import typings.superagent.mod.SuperAgentRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("promisify-supertest", JSImport.Namespace)
  @js.native
  def apply(app: Express): SuperTest = js.native
  
  @JSImport("promisify-supertest", "agent")
  @js.native
  def agent(): SuperTest = js.native
  @JSImport("promisify-supertest", "agent")
  @js.native
  def agent(app: js.Any): SuperTest = js.native
  
  type CallbackHandler = js.Function2[/* err */ js.Any, /* res */ Response, Unit]
  
  type Response = typings.superagent.mod.Response
  
  type SuperTest = SuperAgent[Test]
  
  @js.native
  trait Test extends SuperAgentRequest {
    
    def expect(body: String): this.type = js.native
    def expect(body: String, callback: CallbackHandler): this.type = js.native
    def expect(body: js.Object): this.type = js.native
    def expect(body: js.Object, callback: CallbackHandler): this.type = js.native
    def expect(body: RegExp): this.type = js.native
    def expect(body: RegExp, callback: CallbackHandler): this.type = js.native
    def expect(checker: js.Function1[/* res */ Response, _]): this.type = js.native
    def expect(field: String, `val`: String): this.type = js.native
    def expect(field: String, `val`: String, callback: CallbackHandler): this.type = js.native
    def expect(field: String, `val`: RegExp): this.type = js.native
    def expect(field: String, `val`: RegExp, callback: CallbackHandler): this.type = js.native
    def expect(status: Double): this.type = js.native
    def expect(status: Double, body: String): this.type = js.native
    def expect(status: Double, body: String, callback: CallbackHandler): this.type = js.native
    def expect(status: Double, callback: CallbackHandler): this.type = js.native
    
    def serverAddress(app: js.Any, path: String): String = js.native
  }
}
