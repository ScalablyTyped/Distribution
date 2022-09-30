package typings.restifyErrors.mod

import typings.restifyErrors.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def bunyanSerializer(err: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("bunyanSerializer")(err.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def makeConstructor(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("makeConstructor")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def makeConstructor(name: String, defaults: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("makeConstructor")(name.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def makeErrFromCode(statusCode: Double, args: Any*): HttpError = ^.asInstanceOf[js.Dynamic].applyDynamic("makeErrFromCode")(scala.List(statusCode.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[HttpError]
