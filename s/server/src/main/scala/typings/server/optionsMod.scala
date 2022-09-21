package typings.server

import typings.csurf.mod.CookieOptions
import typings.express.mod.Request_
import typings.expressSession.mod.SessionOptions
import typings.formidable.mod.Fields
import typings.formidable.mod.Files
import typings.formidable.mod.Part
import typings.node.httpMod.IncomingMessage
import typings.server.anon.Body
import typings.server.anon.Csrf
import typings.server.anon.Level
import typings.server.commonMod.LogLevel
import typings.server.serverBooleans.`false`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsMod {
  
  trait CsurfOptions extends StObject {
    
    var cookie: js.UndefOr[CookieOptions | Boolean] = js.undefined
    
    var ignoreMethods: js.UndefOr[js.Array[String]] = js.undefined
    
    var sessionKey: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[
        js.Function1[
          /* req */ Request_[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ], 
          String
        ]
      ] = js.undefined
  }
  object CsurfOptions {
    
    inline def apply(): CsurfOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CsurfOptions]
    }
    
    extension [Self <: CsurfOptions](x: Self) {
      
      inline def setCookie(value: CookieOptions | Boolean): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      inline def setIgnoreMethods(value: js.Array[String]): Self = StObject.set(x, "ignoreMethods", value.asInstanceOf[js.Any])
      
      inline def setIgnoreMethodsUndefined: Self = StObject.set(x, "ignoreMethods", js.undefined)
      
      inline def setIgnoreMethodsVarargs(value: String*): Self = StObject.set(x, "ignoreMethods", js.Array(value*))
      
      inline def setSessionKey(value: String): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
      
      inline def setSessionKeyUndefined: Self = StObject.set(x, "sessionKey", js.undefined)
      
      inline def setValue(
        value: /* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ] => String
      ): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
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
      callback: js.Function3[/* err */ Any, /* fields */ Fields, /* files */ Files, Any]
    ): Unit = js.native
    
    var `type`: String = js.native
    
    var uploadDir: String = js.native
  }
  
  trait Options extends StObject {
    
    var engine: js.UndefOr[String] = js.undefined
    
    var env: js.UndefOr[String] = js.undefined
    
    var favicon: js.UndefOr[String] = js.undefined
    
    var log: js.UndefOr[LogLevel | Level] = js.undefined
    
    var parser: js.UndefOr[Body] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var public: js.UndefOr[String] = js.undefined
    
    var secret: js.UndefOr[String] = js.undefined
    
    var security: js.UndefOr[
        `false` | ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify helmet.IHelmetConfiguration */ Any) & Csrf)
      ] = js.undefined
    
    var session: js.UndefOr[SessionOptions] = js.undefined
    
    var views: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      inline def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
      
      inline def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setFavicon(value: String): Self = StObject.set(x, "favicon", value.asInstanceOf[js.Any])
      
      inline def setFaviconUndefined: Self = StObject.set(x, "favicon", js.undefined)
      
      inline def setLog(value: LogLevel | Level): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setParser(value: Body): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setPublic(value: String): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      inline def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
      
      inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
      
      inline def setSecurity(
        value: `false` | ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify helmet.IHelmetConfiguration */ Any) & Csrf)
      ): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      inline def setSession(value: SessionOptions): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      
      inline def setViews(value: String): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
      
      inline def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
    }
  }
}
