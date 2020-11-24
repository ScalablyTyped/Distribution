package typings.requestPromise.errorsMod

import org.scalablytyped.runtime.Instantiable3
import typings.node.httpMod.IncomingMessage
import typings.requestPromise.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestErrorConstructor
  extends Instantiable3[
      /* cause */ js.Any, 
      /* options */ Options, 
      /* response */ IncomingMessage, 
      RequestError
    ] {
  
  def apply(cause: js.Any, options: Options, response: IncomingMessage): RequestError = js.native
}
