package typings.restifyErrors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def bunyanSerializer(err: js.Any): js.Any = typings.restifyErrors.mod.^.asInstanceOf[js.Dynamic].applyDynamic("bunyanSerializer")(err.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def makeConstructor(name: java.lang.String): scala.Unit = typings.restifyErrors.mod.^.asInstanceOf[js.Dynamic].applyDynamic("makeConstructor")(name.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def makeConstructor(name: java.lang.String, defaults: js.Any): scala.Unit = (typings.restifyErrors.mod.^.asInstanceOf[js.Dynamic].applyDynamic("makeConstructor")(name.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def makeErrFromCode(statusCode: scala.Double, args: js.Any*): typings.restifyErrors.mod.HttpError = (typings.restifyErrors.mod.^.asInstanceOf[js.Dynamic].applyDynamic("makeErrFromCode")(statusCode.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[typings.restifyErrors.mod.HttpError]
}
