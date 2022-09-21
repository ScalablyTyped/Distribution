package typings.promisifySupertest

import typings.express.mod.Express
import typings.superagent.mod.SuperAgent
import typings.superagent.mod.SuperAgentRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(app: Express): SuperTest = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[SuperTest]
  
  @JSImport("promisify-supertest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def agent(): SuperTest = ^.asInstanceOf[js.Dynamic].applyDynamic("agent")().asInstanceOf[SuperTest]
  inline def agent(app: Any): SuperTest = ^.asInstanceOf[js.Dynamic].applyDynamic("agent")(app.asInstanceOf[js.Any]).asInstanceOf[SuperTest]
  
  type CallbackHandler = js.Function2[/* err */ Any, /* res */ Response, Unit]
  
  type Response = typings.superagent.mod.Response
  
  type SuperTest = SuperAgent[Test]
  
  @js.native
  trait Test extends SuperAgentRequest {
    
    def expect(body: String): this.type = js.native
    def expect(body: String, callback: CallbackHandler): this.type = js.native
    def expect(body: js.Object): this.type = js.native
    def expect(body: js.Object, callback: CallbackHandler): this.type = js.native
    def expect(body: js.RegExp): this.type = js.native
    def expect(body: js.RegExp, callback: CallbackHandler): this.type = js.native
    def expect(checker: js.Function1[/* res */ Response, Any]): this.type = js.native
    def expect(field: String, `val`: String): this.type = js.native
    def expect(field: String, `val`: String, callback: CallbackHandler): this.type = js.native
    def expect(field: String, `val`: js.RegExp): this.type = js.native
    def expect(field: String, `val`: js.RegExp, callback: CallbackHandler): this.type = js.native
    def expect(status: Double): this.type = js.native
    def expect(status: Double, body: String): this.type = js.native
    def expect(status: Double, body: String, callback: CallbackHandler): this.type = js.native
    def expect(status: Double, callback: CallbackHandler): this.type = js.native
    
    def serverAddress(app: Any, path: String): String = js.native
  }
}
