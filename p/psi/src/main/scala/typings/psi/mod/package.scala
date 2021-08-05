package typings.psi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def apply(url: java.lang.String): js.Promise[typings.psi.mod.ResponseData] = typings.psi.mod.^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.psi.mod.ResponseData]]
inline def apply(url: java.lang.String, options: typings.psi.mod.Options): js.Promise[typings.psi.mod.ResponseData] = (typings.psi.mod.^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.psi.mod.ResponseData]]

/**
  * Output the formatted report to the terminal.
  */
inline def output(url: java.lang.String): js.Promise[typings.psi.mod.ResponseData] = typings.psi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("output")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.psi.mod.ResponseData]]
inline def output(url: java.lang.String, options: typings.psi.mod.Options): js.Promise[typings.psi.mod.ResponseData] = (typings.psi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("output")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.psi.mod.ResponseData]]
