package typings.restify.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def createServer(): typings.restify.mod.Server = typings.restify.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[typings.restify.mod.Server]
inline def createServer(options: typings.restify.mod.ServerOptions): typings.restify.mod.Server = typings.restify.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[typings.restify.mod.Server]

inline def formatters: typings.restify.mod.Formatters_ = typings.restify.mod.^.asInstanceOf[js.Dynamic].selectDynamic("formatters").asInstanceOf[typings.restify.mod.Formatters_]

type FindRouteCallback = js.Function3[
/* err */ typings.std.Error, 
/* route */ js.UndefOr[typings.restify.mod.Route], 
/* params */ js.UndefOr[js.Any], 
scala.Unit]

type Formatter = js.Function3[
/* req */ typings.restify.mod.Request, 
/* res */ typings.restify.mod.Response, 
/* body */ js.Any, 
java.lang.String | typings.node.Buffer | scala.Null]

type Formatters_ = org.scalablytyped.runtime.StringDictionary[typings.restify.mod.Formatter]

type Next = js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]

type RequestHandler = js.Function3[
/* req */ typings.restify.mod.Request, 
/* res */ typings.restify.mod.Response, 
/* next */ typings.restify.mod.Next, 
js.Any]

type RequestHandlerType = typings.restify.mod.RequestHandler | js.Array[typings.restify.mod.RequestHandler]
