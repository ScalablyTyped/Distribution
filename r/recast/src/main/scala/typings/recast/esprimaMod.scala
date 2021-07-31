package typings.recast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esprimaMod {
  
  @JSImport("recast/parsers/esprima", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def parse(source: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def parse(source: String, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
