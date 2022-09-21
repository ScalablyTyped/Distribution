package typings.psi.mod

import typings.psi.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def apply(url: String): js.Promise[ResponseData] = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResponseData]]
inline def apply(url: String, options: Options): js.Promise[ResponseData] = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseData]]

/**
  * Output the formatted report to the terminal.
  */
inline def output(url: String): js.Promise[ResponseData] = ^.asInstanceOf[js.Dynamic].applyDynamic("output")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResponseData]]
inline def output(url: String, options: Options): js.Promise[ResponseData] = (^.asInstanceOf[js.Dynamic].applyDynamic("output")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseData]]
