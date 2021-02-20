package typings.server

import typings.csurf.mod.CookieOptions
import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressSession.mod.SessionOptions
import typings.formidable.mod.Fields
import typings.formidable.mod.Files
import typings.formidable.mod.Part
import typings.node.httpMod.IncomingMessage
import typings.server.anon.Body
import typings.server.anon.Csurf
import typings.server.anon.Level
import typings.server.commonMod.LogLevel
import typings.server.serverBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsMod {
  
  @js.native
  trait CsurfOptions extends StObject {
    
    var cookie: js.UndefOr[CookieOptions | Boolean] = js.native
    
    var ignoreMethods: js.UndefOr[js.Array[String]] = js.native
    
    var sessionKey: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], String]] = js.native
  }
  object CsurfOptions {
    
    @scala.inline
    def apply(): CsurfOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CsurfOptions]
    }
    
    @scala.inline
    implicit class CsurfOptionsMutableBuilder[Self <: CsurfOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCookie(value: CookieOptions | Boolean): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      @scala.inline
      def setIgnoreMethods(value: js.Array[String]): Self = StObject.set(x, "ignoreMethods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreMethodsUndefined: Self = StObject.set(x, "ignoreMethods", js.undefined)
      
      @scala.inline
      def setIgnoreMethodsVarargs(value: String*): Self = StObject.set(x, "ignoreMethods", js.Array(value :_*))
      
      @scala.inline
      def setSessionKey(value: String): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionKeyUndefined: Self = StObject.set(x, "sessionKey", js.undefined)
      
      @scala.inline
      def setValue(value: /* req */ Request_[ParamsDictionary, _, _, Query] => String): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait DataParserOptions extends StObject {
    
    var bytesExpected: Double = js.native
    
    var bytesReceived: Double = js.native
    
    var encoding: String = js.native
    
    def handlePart(part: Part): Unit = js.native
    
    var hash: String | Boolean = js.native
    
    var keepExtensions: Boolean = js.native
    
    var maxFields: Double = js.native
    
    var maxFieldsSize: Double = js.native
    
    var multiples: Boolean = js.native
    
    def onPart(part: Part): Unit = js.native
    
    def parse(req: IncomingMessage): Unit = js.native
    def parse(
      req: IncomingMessage,
      callback: js.Function3[/* err */ js.Any, /* fields */ Fields, /* files */ Files, _]
    ): Unit = js.native
    
    var `type`: String = js.native
    
    var uploadDir: String = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var engine: js.UndefOr[String] = js.native
    
    var env: js.UndefOr[String] = js.native
    
    var favicon: js.UndefOr[String] = js.native
    
    var log: js.UndefOr[LogLevel | Level] = js.native
    
    var parser: js.UndefOr[Body] = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    var public: js.UndefOr[String] = js.native
    
    var secret: js.UndefOr[String] = js.native
    
    var security: js.UndefOr[
        `false` | ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify helmet.IHelmetConfiguration */ js.Any) with Csurf)
      ] = js.native
    
    var session: js.UndefOr[SessionOptions] = js.native
    
    var views: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
      
      @scala.inline
      def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setFavicon(value: String): Self = StObject.set(x, "favicon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFaviconUndefined: Self = StObject.set(x, "favicon", js.undefined)
      
      @scala.inline
      def setLog(value: LogLevel | Level): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      @scala.inline
      def setParser(value: Body): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setPublic(value: String): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
      
      @scala.inline
      def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
      
      @scala.inline
      def setSecurity(
        value: `false` | ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify helmet.IHelmetConfiguration */ js.Any) with Csurf)
      ): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      @scala.inline
      def setSession(value: SessionOptions): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      
      @scala.inline
      def setViews(value: String): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
    }
  }
}
