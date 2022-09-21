package typings.restify.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import typings.restify.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def createServer(): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[Server]
inline def createServer(options: ServerOptions): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[Server]

inline def formatters: Formatters_ = ^.asInstanceOf[js.Dynamic].selectDynamic("formatters").asInstanceOf[Formatters_]

type FindRouteCallback = js.Function3[/* err */ js.Error, /* route */ js.UndefOr[Route], /* params */ js.UndefOr[Any], Unit]

type Formatter = js.Function3[/* req */ Request, /* res */ Response, /* body */ Any, String | Buffer | Null]

type Formatters_ = StringDictionary[Formatter]

type Next = js.Function1[/* err */ js.UndefOr[Any], Unit]

type RequestHandler = js.Function3[/* req */ Request, /* res */ Response, /* next */ Next, Any]

type RequestHandlerType = RequestHandler | js.Array[RequestHandler]
